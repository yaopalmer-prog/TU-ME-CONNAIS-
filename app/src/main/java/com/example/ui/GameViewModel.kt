package com.example.ui

import android.app.Application
import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.localization.Translations
import com.example.data.model.ActiveGameState
import com.example.data.model.Difficulty
import com.example.data.model.GameConfig
import com.example.data.model.GameMode
import com.example.data.model.Language
import com.example.data.model.OnlineRoom
import com.example.data.model.PlayStep
import com.example.data.model.PlayerStats
import com.example.data.model.QuestionHistoryItem
import com.example.data.model.UserProfile
import com.example.data.online.OnlineRoomManager
import com.example.data.repository.QuestionRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.util.Locale

enum class CurrentScreen {
    HOME,
    SETUP,
    ONLINE_LOBBY,
    PLAYING,
    RESULTS
}

data class UiState(
    val currentScreen: CurrentScreen = CurrentScreen.HOME,
    val language: Language = Language.FR,
    val showHowToPlayDialog: Boolean = false,
    val showLanguageDialog: Boolean = false,
    val showAuthDialog: Boolean = false,
    val showQuitConfirmDialog: Boolean = false,
    val isOnlineMode: Boolean = false,
    val userProfile: UserProfile = UserProfile(),
    val config: GameConfig = GameConfig(),
    val activeGame: ActiveGameState? = null,
    val errorMessage: String? = null
)

class GameViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = QuestionRepository()
    private val prefs = application.getSharedPreferences("tu_me_connais_prefs", Context.MODE_PRIVATE)
    val roomManager = OnlineRoomManager(application.applicationContext)

    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    val onlineRoom: StateFlow<OnlineRoom?> = roomManager.currentRoom
    val liveNotification: StateFlow<String?> = roomManager.liveNotification

    init {
        loadPreferences()
    }

    private fun loadPreferences() {
        val savedLangCode = prefs.getString("selected_language", null)
        val initialLanguage = if (savedLangCode != null) {
            Language.fromCode(savedLangCode)
        } else {
            val systemLang = Locale.getDefault().language
            Language.fromCode(systemLang)
        }

        val savedP1 = prefs.getString("player1_name", "Joueur 1") ?: "Joueur 1"
        val savedP2 = prefs.getString("player2_name", "Joueur 2") ?: "Joueur 2"
        val savedAvatar = prefs.getString("user_avatar", "🦊") ?: "🦊"
        val savedDisplayName = prefs.getString("user_display_name", savedP1) ?: savedP1

        val initialProfile = UserProfile(
            displayName = savedDisplayName,
            avatarEmoji = savedAvatar,
            isGuest = true
        )

        _uiState.update { current ->
            current.copy(
                language = initialLanguage,
                userProfile = initialProfile,
                config = current.config.copy(
                    player1Name = savedP1,
                    player2Name = savedP2,
                    language = initialLanguage
                )
            )
        }
    }

    fun setLanguage(language: Language) {
        prefs.edit().putString("selected_language", language.code).apply()
        _uiState.update { current ->
            current.copy(
                language = language,
                showLanguageDialog = false,
                config = current.config.copy(language = language),
                activeGame = current.activeGame?.copy(
                    config = current.activeGame.config.copy(language = language)
                )
            )
        }
    }

    fun openLanguageDialog() {
        _uiState.update { it.copy(showLanguageDialog = true) }
    }

    fun closeLanguageDialog() {
        _uiState.update { it.copy(showLanguageDialog = false) }
    }

    fun openHowToPlay() {
        _uiState.update { it.copy(showHowToPlayDialog = true) }
    }

    fun closeHowToPlay() {
        _uiState.update { it.copy(showHowToPlayDialog = false) }
    }

    fun openAuthDialog() {
        _uiState.update { it.copy(showAuthDialog = true) }
    }

    fun closeAuthDialog() {
        _uiState.update { it.copy(showAuthDialog = false) }
    }

    fun updateProfile(profile: UserProfile) {
        prefs.edit()
            .putString("user_display_name", profile.displayName)
            .putString("user_avatar", profile.avatarEmoji)
            .apply()

        _uiState.update { current ->
            current.copy(
                userProfile = profile,
                showAuthDialog = false,
                config = current.config.copy(player1Name = profile.displayName)
            )
        }
    }

    fun navigateTo(screen: CurrentScreen) {
        _uiState.update { it.copy(currentScreen = screen, errorMessage = null) }
    }

    fun selectMode(mode: GameMode) {
        _uiState.update {
            it.copy(
                config = it.config.copy(mode = mode),
                currentScreen = CurrentScreen.SETUP
            )
        }
    }

    fun updatePlayer1Name(name: String) {
        _uiState.update {
            it.copy(
                config = it.config.copy(player1Name = name),
                errorMessage = null
            )
        }
    }

    fun updatePlayer2Name(name: String) {
        _uiState.update {
            it.copy(
                config = it.config.copy(player2Name = name),
                errorMessage = null
            )
        }
    }

    fun updateDifficulty(difficulty: Difficulty) {
        _uiState.update { it.copy(config = it.config.copy(difficulty = difficulty)) }
    }

    fun updateQuestionCount(count: Int) {
        _uiState.update { it.copy(config = it.config.copy(questionCount = count)) }
    }

    fun toggleShuffle(shuffle: Boolean) {
        _uiState.update { it.copy(config = it.config.copy(shuffle = shuffle)) }
    }

    // --- Online Multiplayer Actions ---
    fun openOnlineLobby() {
        _uiState.update { it.copy(currentScreen = CurrentScreen.ONLINE_LOBBY, isOnlineMode = true) }
    }

    fun createOnlineRoom() {
        val host = _uiState.value.userProfile
        val config = _uiState.value.config
        roomManager.createRoom(host, config)
    }

    fun joinOnlineRoom(code: String) {
        val guest = _uiState.value.userProfile
        val success = roomManager.joinRoom(code, guest)
        if (success) {
            val room = roomManager.currentRoom.value
            if (room != null) {
                _uiState.update {
                    it.copy(
                        config = it.config.copy(
                            player1Name = room.hostPlayer.displayName,
                            player2Name = guest.displayName
                        )
                    )
                }
            }
        }
    }

    fun startOnlineGame() {
        val room = roomManager.startOnlineGame() ?: return
        val questions = repository.getQuestionsForGame(
            mode = room.gameConfig.mode,
            difficulty = room.gameConfig.difficulty,
            count = room.gameConfig.questionCount,
            shuffle = room.gameConfig.shuffle
        )

        val initialGameState = ActiveGameState(
            config = room.gameConfig.copy(
                player1Name = room.hostPlayer.displayName,
                player2Name = room.guestPlayer?.displayName ?: "Joueur 2"
            ),
            questions = questions,
            currentQuestionIndex = 0,
            currentStep = PlayStep.GUESSING,
            player1Stats = PlayerStats(),
            player2Stats = PlayerStats(),
            currentGuessAnswer = "",
            currentExplanation = "",
            isProcessingValidation = false,
            history = emptyList()
        )

        _uiState.update {
            it.copy(
                isOnlineMode = true,
                activeGame = initialGameState,
                currentScreen = CurrentScreen.PLAYING,
                errorMessage = null
            )
        }
    }

    fun copyInviteLink() {
        val room = roomManager.currentRoom.value ?: return
        roomManager.copyInviteLink(room)
    }

    fun shareWhatsApp() {
        val room = roomManager.currentRoom.value ?: return
        roomManager.shareViaWhatsApp(room)
    }

    fun shareSms() {
        val room = roomManager.currentRoom.value ?: return
        roomManager.shareViaSms(room)
    }

    fun shareStandard() {
        val room = roomManager.currentRoom.value ?: return
        roomManager.shareStandard(room)
    }

    // --- Standard Game Actions ---
    fun startGame() {
        val config = _uiState.value.config
        val p1 = config.player1Name.trim()
        val p2 = config.player2Name.trim()

        if (p1.isEmpty() || p2.isEmpty()) {
            _uiState.update {
                it.copy(errorMessage = Translations.errorMissingNames(it.language))
            }
            return
        }

        prefs.edit()
            .putString("player1_name", p1)
            .putString("player2_name", p2)
            .apply()

        val questions = repository.getQuestionsForGame(
            mode = config.mode,
            difficulty = config.difficulty,
            count = config.questionCount,
            shuffle = config.shuffle
        )

        val initialGameState = ActiveGameState(
            config = config.copy(player1Name = p1, player2Name = p2),
            questions = questions,
            currentQuestionIndex = 0,
            currentStep = PlayStep.GUESSING,
            player1Stats = PlayerStats(),
            player2Stats = PlayerStats(),
            currentGuessAnswer = "",
            currentExplanation = "",
            isProcessingValidation = false,
            history = emptyList()
        )

        _uiState.update {
            it.copy(
                isOnlineMode = false,
                activeGame = initialGameState,
                currentScreen = CurrentScreen.PLAYING,
                errorMessage = null
            )
        }
    }

    fun updateGuessAnswer(answer: String) {
        _uiState.update { current ->
            current.copy(
                activeGame = current.activeGame?.copy(currentGuessAnswer = answer)
            )
        }
    }

    fun submitGuess() {
        val active = _uiState.value.activeGame ?: return
        val answer = active.currentGuessAnswer.trim()
        if (answer.isEmpty()) return

        if (_uiState.value.isOnlineMode) {
            roomManager.sendGuessAnswer(answer, active.currentGuesserName)
        }

        // Transition to handover screen with the answer guaranteed saved
        _uiState.update { current ->
            current.copy(
                activeGame = current.activeGame?.copy(
                    currentGuessAnswer = answer,
                    currentStep = PlayStep.HANDOVER
                )
            )
        }
    }

    fun skipQuestion() {
        val active = _uiState.value.activeGame ?: return
        val question = active.currentQuestion ?: return

        val isP1 = active.isPlayer1Turn
        val updatedP1Stats = if (isP1) {
            active.player1Stats.copy(
                skippedCount = active.player1Stats.skippedCount + 1,
                currentStreak = 0
            )
        } else active.player1Stats

        val updatedP2Stats = if (!isP1) {
            active.player2Stats.copy(
                skippedCount = active.player2Stats.skippedCount + 1,
                currentStreak = 0
            )
        } else active.player2Stats

        val historyItem = QuestionHistoryItem(
            question = question,
            guesserName = active.currentGuesserName,
            subjectName = active.currentSubjectName,
            givenAnswer = "(Question passée)",
            isSkipped = true,
            isCorrect = false,
            pointsAwarded = 0
        )

        advanceToNextQuestion(
            p1Stats = updatedP1Stats,
            p2Stats = updatedP2Stats,
            historyItem = historyItem,
            awardedPoints = 0,
            isStreakBonus = false
        )
    }

    fun onSubjectReadyToValidate() {
        _uiState.update { current ->
            current.copy(
                activeGame = current.activeGame?.copy(
                    currentStep = PlayStep.VALIDATING,
                    isProcessingValidation = false
                )
            )
        }
    }

    fun updateExplanation(explanation: String) {
        _uiState.update { current ->
            current.copy(
                activeGame = current.activeGame?.copy(currentExplanation = explanation)
            )
        }
    }

    fun validateAnswer(isCorrect: Boolean) {
        val active = _uiState.value.activeGame ?: return
        if (active.isProcessingValidation) return

        val question = active.currentQuestion ?: return
        val isP1 = active.isPlayer1Turn
        val currentStats = if (isP1) active.player1Stats else active.player2Stats

        var points = 0
        var bonusAwarded = false
        val newStreak: Int
        val newScore: Int
        val newCorrect: Int
        val newIncorrect: Int
        val newBonusCount: Int

        if (isCorrect) {
            triggerHapticFeedback(true)
            points = 10
            newCorrect = currentStats.correctCount + 1
            newIncorrect = currentStats.incorrectCount
            newStreak = currentStats.currentStreak + 1
            val isMultipleOfFive = (newStreak % 5 == 0)
            if (isMultipleOfFive) {
                points += 5
                bonusAwarded = true
            }
            newBonusCount = if (isMultipleOfFive) currentStats.streakBonusPoints + 5 else currentStats.streakBonusPoints
            newScore = currentStats.score + points
        } else {
            triggerHapticFeedback(false)
            newCorrect = currentStats.correctCount
            newIncorrect = currentStats.incorrectCount + 1
            newStreak = 0
            newScore = currentStats.score
            newBonusCount = currentStats.streakBonusPoints
        }

        val updatedHighestStreak = maxOf(currentStats.highestStreak, newStreak)

        val updatedStats = currentStats.copy(
            score = newScore,
            correctCount = newCorrect,
            incorrectCount = newIncorrect,
            currentStreak = newStreak,
            highestStreak = updatedHighestStreak,
            streakBonusPoints = newBonusCount
        )

        val updatedP1 = if (isP1) updatedStats else active.player1Stats
        val updatedP2 = if (!isP1) updatedStats else active.player2Stats

        val historyItem = QuestionHistoryItem(
            question = question,
            guesserName = active.currentGuesserName,
            subjectName = active.currentSubjectName,
            givenAnswer = active.currentGuessAnswer,
            isSkipped = false,
            isCorrect = isCorrect,
            actualAnswerExplanation = active.currentExplanation,
            pointsAwarded = points,
            triggeredStreakBonus = bonusAwarded
        )

        if (_uiState.value.isOnlineMode) {
            roomManager.sendValidation(isCorrect, active.currentSubjectName)
        }

        _uiState.update { current ->
            current.copy(
                activeGame = current.activeGame?.copy(
                    isProcessingValidation = true,
                    currentStep = PlayStep.FEEDBACK,
                    player1Stats = updatedP1,
                    player2Stats = updatedP2,
                    lastAwardedPoints = points,
                    lastWasStreakBonus = bonusAwarded,
                    history = current.activeGame.history + historyItem
                )
            )
        }
    }

    fun proceedToNextQuestion() {
        val active = _uiState.value.activeGame ?: return
        val nextIndex = active.currentQuestionIndex + 1

        if (nextIndex >= active.questions.size) {
            _uiState.update { current ->
                current.copy(currentScreen = CurrentScreen.RESULTS)
            }
        } else {
            _uiState.update { current ->
                current.copy(
                    activeGame = current.activeGame?.copy(
                        currentQuestionIndex = nextIndex,
                        currentStep = PlayStep.GUESSING,
                        currentGuessAnswer = "",
                        currentExplanation = "",
                        isProcessingValidation = false,
                        lastAwardedPoints = 0,
                        lastWasStreakBonus = false
                    )
                )
            }
        }
    }

    private fun advanceToNextQuestion(
        p1Stats: PlayerStats,
        p2Stats: PlayerStats,
        historyItem: QuestionHistoryItem,
        awardedPoints: Int,
        isStreakBonus: Boolean
    ) {
        val active = _uiState.value.activeGame ?: return
        val nextIndex = active.currentQuestionIndex + 1

        if (nextIndex >= active.questions.size) {
            _uiState.update { current ->
                current.copy(
                    currentScreen = CurrentScreen.RESULTS,
                    activeGame = current.activeGame?.copy(
                        player1Stats = p1Stats,
                        player2Stats = p2Stats,
                        history = current.activeGame.history + historyItem
                    )
                )
            }
        } else {
            _uiState.update { current ->
                current.copy(
                    activeGame = current.activeGame?.copy(
                        currentQuestionIndex = nextIndex,
                        currentStep = PlayStep.GUESSING,
                        player1Stats = p1Stats,
                        player2Stats = p2Stats,
                        currentGuessAnswer = "",
                        currentExplanation = "",
                        isProcessingValidation = false,
                        lastAwardedPoints = awardedPoints,
                        lastWasStreakBonus = isStreakBonus,
                        history = current.activeGame.history + historyItem
                    )
                )
            }
        }
    }

    fun replayGame() {
        if (_uiState.value.isOnlineMode) {
            startOnlineGame()
        } else {
            startGame()
        }
    }

    fun requestQuitGame() {
        _uiState.update { it.copy(showQuitConfirmDialog = true) }
    }

    fun dismissQuitGame() {
        _uiState.update { it.copy(showQuitConfirmDialog = false) }
    }

    fun confirmQuitGame() {
        roomManager.leaveRoom()
        _uiState.update {
            it.copy(
                showQuitConfirmDialog = false,
                currentScreen = CurrentScreen.HOME,
                activeGame = null,
                isOnlineMode = false
            )
        }
    }

    fun getShareSummaryText(): String {
        val state = _uiState.value
        val game = state.activeGame ?: return ""
        val lang = state.language
        val p1 = game.config.player1Name
        val p2 = game.config.player2Name
        val s1 = game.player1Stats
        val s2 = game.player2Stats

        val totalValidated = s1.totalValidated + s2.totalValidated
        val totalCorrect = s1.correctCount + s2.correctCount
        val overallPct = if (totalValidated > 0) ((totalCorrect.toDouble() / totalValidated) * 100).toInt() else 0
        val verdict = Translations.verdictComment(overallPct, totalValidated > 0, lang)

        return """
            🎮 ${Translations.appTitle(lang)}
            
            👑 $p1: ${Translations.scorePoints(s1.score, lang)} (${s1.accuracyPercentage}% ${Translations.statAccuracy(lang)})
            👑 $p2: ${Translations.scorePoints(s2.score, lang)} (${s2.accuracyPercentage}% ${Translations.statAccuracy(lang)})
            
            🏆 ${Translations.verdictTitle(lang)}:
            « $verdict »
            
            ${Translations.appSlogan(lang)}
        """.trimIndent()
    }

    private fun triggerHapticFeedback(isPositive: Boolean) {
        viewModelScope.launch {
            try {
                val context = getApplication<Application>().applicationContext
                val vibrator = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                    val manager = context.getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as? VibratorManager
                    manager?.defaultVibrator
                } else {
                    @Suppress("DEPRECATION")
                    context.getSystemService(Context.VIBRATOR_SERVICE) as? Vibrator
                }

                vibrator?.let { v ->
                    if (v.hasVibrator()) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            val effect = if (isPositive) {
                                VibrationEffect.createOneShot(40, VibrationEffect.DEFAULT_AMPLITUDE)
                            } else {
                                VibrationEffect.createWaveform(longArrayOf(0, 30, 40, 30), -1)
                            }
                            v.vibrate(effect)
                        } else {
                            @Suppress("DEPRECATION")
                            v.vibrate(if (isPositive) 40 else 80)
                        }
                    }
                }
            } catch (_: Exception) {
                // Ignore gracefully
            }
        }
    }
}

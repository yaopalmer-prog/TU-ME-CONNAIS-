package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ui.CurrentScreen
import com.example.ui.GameViewModel
import com.example.ui.dialogs.AuthDialog
import com.example.ui.dialogs.HowToPlayDialog
import com.example.ui.dialogs.LanguageDialog
import com.example.ui.screens.GamePlayScreen
import com.example.ui.screens.HomeScreen
import com.example.ui.screens.OnlineLobbyScreen
import com.example.ui.screens.ResultScreen
import com.example.ui.screens.SetupScreen
import com.example.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                MainApp()
            }
        }
    }
}

@Composable
fun MainApp(viewModel: GameViewModel = viewModel()) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val onlineRoom by viewModel.onlineRoom.collectAsStateWithLifecycle()
    val liveNotification by viewModel.liveNotification.collectAsStateWithLifecycle()

    val isRtl = uiState.language.isRtl
    val layoutDirection = if (isRtl) LayoutDirection.Rtl else LayoutDirection.Ltr

    CompositionLocalProvider(LocalLayoutDirection provides layoutDirection) {
        Surface(modifier = Modifier.fillMaxSize()) {
            when (uiState.currentScreen) {
                CurrentScreen.HOME -> {
                    HomeScreen(
                        language = uiState.language,
                        userProfile = uiState.userProfile,
                        onPlayClick = { viewModel.navigateTo(CurrentScreen.SETUP) },
                        onOnlinePlayClick = { viewModel.openOnlineLobby() },
                        onProfileClick = { viewModel.openAuthDialog() },
                        onSelectMode = { mode -> viewModel.selectMode(mode) },
                        onHowToPlayClick = { viewModel.openHowToPlay() },
                        onLanguageClick = { viewModel.openLanguageDialog() }
                    )
                }
                CurrentScreen.SETUP -> {
                    SetupScreen(
                        config = uiState.config,
                        language = uiState.language,
                        errorMessage = uiState.errorMessage,
                        onBackClick = { viewModel.navigateTo(CurrentScreen.HOME) },
                        onPlayer1Change = { viewModel.updatePlayer1Name(it) },
                        onPlayer2Change = { viewModel.updatePlayer2Name(it) },
                        onModeSelect = { viewModel.updatePlayer1Name(uiState.config.player1Name); viewModel.selectMode(it) },
                        onDifficultySelect = { viewModel.updateDifficulty(it) },
                        onQuestionCountSelect = { viewModel.updateQuestionCount(it) },
                        onShuffleToggle = { viewModel.toggleShuffle(it) },
                        onStartGame = { viewModel.startGame() }
                    )
                }
                CurrentScreen.ONLINE_LOBBY -> {
                    OnlineLobbyScreen(
                        currentRoom = onlineRoom,
                        userProfile = uiState.userProfile,
                        onBackClick = { viewModel.navigateTo(CurrentScreen.HOME) },
                        onCreateRoom = { viewModel.createOnlineRoom() },
                        onJoinRoom = { code -> viewModel.joinOnlineRoom(code) },
                        onCopyLink = { viewModel.copyInviteLink() },
                        onShareWhatsApp = { viewModel.shareWhatsApp() },
                        onShareSms = { viewModel.shareSms() },
                        onShareStandard = { viewModel.shareStandard() },
                        onStartGame = { viewModel.startOnlineGame() }
                    )
                }
                CurrentScreen.PLAYING -> {
                    val game = uiState.activeGame
                    if (game != null) {
                        GamePlayScreen(
                            gameState = game,
                            language = uiState.language,
                            showQuitDialog = uiState.showQuitConfirmDialog,
                            liveNotification = liveNotification,
                            onRequestQuit = { viewModel.requestQuitGame() },
                            onDismissQuit = { viewModel.dismissQuitGame() },
                            onConfirmQuit = { viewModel.confirmQuitGame() },
                            onAnswerChange = { viewModel.updateGuessAnswer(it) },
                            onSubmitGuess = { viewModel.submitGuess() },
                            onSkipQuestion = { viewModel.skipQuestion() },
                            onSubjectReady = { viewModel.onSubjectReadyToValidate() },
                            onExplanationChange = { viewModel.updateExplanation(it) },
                            onValidateAnswer = { isCorrect -> viewModel.validateAnswer(isCorrect) },
                            onProceedNext = { viewModel.proceedToNextQuestion() }
                        )
                    } else {
                        viewModel.navigateTo(CurrentScreen.HOME)
                    }
                }
                CurrentScreen.RESULTS -> {
                    val game = uiState.activeGame
                    if (game != null) {
                        ResultScreen(
                            gameState = game,
                            language = uiState.language,
                            onReplay = { viewModel.replayGame() },
                            onChangeMode = { viewModel.navigateTo(CurrentScreen.SETUP) },
                            onHome = { viewModel.navigateTo(CurrentScreen.HOME) },
                            getShareText = { viewModel.getShareSummaryText() }
                        )
                    } else {
                        viewModel.navigateTo(CurrentScreen.HOME)
                    }
                }
            }

            // Dialogs
            if (uiState.showHowToPlayDialog) {
                HowToPlayDialog(
                    language = uiState.language,
                    onDismiss = { viewModel.closeHowToPlay() }
                )
            }

            if (uiState.showLanguageDialog) {
                LanguageDialog(
                    currentLanguage = uiState.language,
                    onSelectLanguage = { lang -> viewModel.setLanguage(lang) },
                    onDismiss = { viewModel.closeLanguageDialog() }
                )
            }

            if (uiState.showAuthDialog) {
                AuthDialog(
                    currentProfile = uiState.userProfile,
                    onSaveProfile = { profile -> viewModel.updateProfile(profile) },
                    onDismiss = { viewModel.closeAuthDialog() }
                )
            }
        }
    }
}

package com.example.data.model

enum class PlayStep {
    GUESSING,    // Guesser is answering question about Subject
    HANDOVER,    // Pass phone to Subject so Guesser doesn't see validation or Subject doesn't peek early
    VALIDATING,  // Subject checks Guesser's answer: Correct or Incorrect?
    FEEDBACK     // Quick result animation and streak update before next turn
}

data class PlayerStats(
    val score: Int = 0,
    val correctCount: Int = 0,
    val incorrectCount: Int = 0,
    val skippedCount: Int = 0,
    val currentStreak: Int = 0,
    val highestStreak: Int = 0,
    val streakBonusPoints: Int = 0
) {
    val totalValidated: Int get() = correctCount + incorrectCount
    
    val accuracyPercentage: Int
        get() = if (totalValidated > 0) {
            ((correctCount.toDouble() / totalValidated) * 100).toInt()
        } else {
            0
        }
}

data class QuestionHistoryItem(
    val question: Question,
    val guesserName: String,
    val subjectName: String,
    val givenAnswer: String,
    val isSkipped: Boolean,
    val isCorrect: Boolean,
    val actualAnswerExplanation: String = "",
    val pointsAwarded: Int = 0,
    val triggeredStreakBonus: Boolean = false
)

data class GameConfig(
    val player1Name: String = "Joueur 1",
    val player2Name: String = "Joueur 2",
    val mode: GameMode = GameMode.COUPLE,
    val difficulty: Difficulty = Difficulty.MEDIUM,
    val questionCount: Int = 20,
    val shuffle: Boolean = true,
    val language: Language = Language.FR
)

data class ActiveGameState(
    val config: GameConfig,
    val questions: List<Question>,
    val currentQuestionIndex: Int = 0,
    val currentStep: PlayStep = PlayStep.GUESSING,
    val player1Stats: PlayerStats = PlayerStats(),
    val player2Stats: PlayerStats = PlayerStats(),
    val currentGuessAnswer: String = "",
    val currentExplanation: String = "",
    val lastAwardedPoints: Int = 0,
    val lastWasStreakBonus: Boolean = false,
    val isProcessingValidation: Boolean = false,
    val history: List<QuestionHistoryItem> = emptyList()
) {
    // Guesser alternates: Even index -> Player 1 guesses about Player 2; Odd index -> Player 2 guesses about Player 1
    val isPlayer1Turn: Boolean get() = (currentQuestionIndex % 2 == 0)

    val currentGuesserName: String
        get() = if (isPlayer1Turn) config.player1Name else config.player2Name

    val currentSubjectName: String
        get() = if (isPlayer1Turn) config.player2Name else config.player1Name

    val currentGuesserStats: PlayerStats
        get() = if (isPlayer1Turn) player1Stats else player2Stats

    val currentQuestion: Question?
        get() = questions.getOrNull(currentQuestionIndex)

    val isFinished: Boolean
        get() = currentQuestionIndex >= questions.size
}

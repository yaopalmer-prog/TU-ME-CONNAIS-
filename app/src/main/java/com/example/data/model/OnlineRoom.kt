package com.example.data.model

enum class RoomStatus {
    WAITING_FOR_PLAYER,
    READY_TO_START,
    PLAYING,
    FINISHED
}

data class OnlineRoom(
    val roomCode: String, // e.g. "5892"
    val inviteUrl: String, // e.g. "https://tumeconnais.app/join?code=5892"
    val hostPlayer: UserProfile,
    val guestPlayer: UserProfile? = null,
    val gameConfig: GameConfig,
    val isGameStarted: Boolean = false,
    val currentTurnPlayerId: String = "",
    val lastActionNotification: String? = null,
    val currentQuestionIndex: Int = 0,
    val currentGuessAnswer: String = "",
    val status: RoomStatus = RoomStatus.WAITING_FOR_PLAYER
)

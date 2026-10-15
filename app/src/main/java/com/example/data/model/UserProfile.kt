package com.example.data.model

data class UserProfile(
    val id: String = "user_${System.currentTimeMillis()}",
    val displayName: String = "Joueur",
    val email: String? = null,
    val avatarEmoji: String = "🦊",
    val statusText: String = "Prêt à jouer ! ❤️",
    val isGuest: Boolean = true,
    val authProvider: String = "guest" // "google", "email", "guest"
) {
    companion object {
        val AVATAR_OPTIONS = listOf("🦊", "🐱", "🐼", "🦁", "🦄", "🚀", "👑", "⭐", "🔥", "💖", "🎮", "🌈")
    }
}

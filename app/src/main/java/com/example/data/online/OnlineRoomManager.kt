package com.example.data.online

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import com.example.data.model.GameConfig
import com.example.data.model.OnlineRoom
import com.example.data.model.RoomStatus
import com.example.data.model.UserProfile
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlin.random.Random

class OnlineRoomManager(private val context: Context) {

    private val _currentRoom = MutableStateFlow<OnlineRoom?>(null)
    val currentRoom: StateFlow<OnlineRoom?> = _currentRoom.asStateFlow()

    private val _liveNotification = MutableStateFlow<String?>(null)
    val liveNotification: StateFlow<String?> = _liveNotification.asStateFlow()

    fun createRoom(host: UserProfile, config: GameConfig): OnlineRoom {
        val code = "%04d".format(Random.nextInt(1000, 9999))
        val inviteUrl = "https://tumeconnais.app/join?code=$code"
        val room = OnlineRoom(
            roomCode = code,
            inviteUrl = inviteUrl,
            hostPlayer = host,
            guestPlayer = null,
            gameConfig = config,
            currentTurnPlayerId = host.id,
            status = RoomStatus.WAITING_FOR_PLAYER
        )
        _currentRoom.value = room
        _liveNotification.value = "Salon #$code créé. Partagez le lien avec votre ami !"
        return room
    }

    fun joinRoom(code: String, guest: UserProfile): Boolean {
        val cleanCode = code.replace("#", "").trim()
        val room = _currentRoom.value

        if (room != null && room.roomCode == cleanCode) {
            val updated = room.copy(
                guestPlayer = guest,
                status = RoomStatus.READY_TO_START
            )
            _currentRoom.value = updated
            _liveNotification.value = "${guest.displayName} a rejoint le salon !"
            return true
        } else {
            // Create or simulate joined room with given code
            val fakeHost = UserProfile(
                id = "host_$cleanCode",
                displayName = "Ami(e)",
                avatarEmoji = "🐱",
                statusText = "Connecté(e) en ligne 🟢",
                isGuest = false
            )
            val newRoom = OnlineRoom(
                roomCode = cleanCode,
                inviteUrl = "https://tumeconnais.app/join?code=$cleanCode",
                hostPlayer = fakeHost,
                guestPlayer = guest,
                gameConfig = GameConfig(
                    player1Name = fakeHost.displayName,
                    player2Name = guest.displayName
                ),
                currentTurnPlayerId = fakeHost.id,
                status = RoomStatus.READY_TO_START
            )
            _currentRoom.value = newRoom
            _liveNotification.value = "Vous avez rejoint le salon #$cleanCode !"
            return true
        }
    }

    fun startOnlineGame(): OnlineRoom? {
        val room = _currentRoom.value ?: return null
        val updated = room.copy(
            isGameStarted = true,
            status = RoomStatus.PLAYING
        )
        _currentRoom.value = updated
        _liveNotification.value = "La partie à distance commence ! Bonne chance !"
        return updated
    }

    fun sendGuessAnswer(answer: String, playerName: String) {
        val room = _currentRoom.value ?: return
        val updated = room.copy(
            currentGuessAnswer = answer,
            lastActionNotification = "$playerName a validé sa réponse !"
        )
        _currentRoom.value = updated
        _liveNotification.value = "$playerName a validé sa réponse ! En attente de vérification..."
    }

    fun sendValidation(isCorrect: Boolean, validatorName: String) {
        val room = _currentRoom.value ?: return
        val msg = if (isCorrect) {
            "$validatorName a confirmé : Bonne réponse ! (+10 pts) 🎉"
        } else {
            "$validatorName a indiqué que la réponse était incorrecte ❌"
        }
        val updated = room.copy(
            lastActionNotification = msg
        )
        _currentRoom.value = updated
        _liveNotification.value = msg
    }

    fun clearNotification() {
        _liveNotification.value = null
    }

    fun copyInviteLink(room: OnlineRoom) {
        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("Lien de jeu Tu Me Connais", room.inviteUrl)
        clipboard.setPrimaryClip(clip)
        _liveNotification.value = "Lien copié dans le presse-papier !"
    }

    fun shareViaWhatsApp(room: OnlineRoom) {
        val text = "Rejoins ma partie sur « Tu me connais vraiment ? ❤️ » ! Code du salon : #${room.roomCode}\nClique ici pour rejoindre : ${room.inviteUrl}"
        try {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("whatsapp://send?text=" + Uri.encode(text))
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            context.startActivity(intent)
        } catch (_: Exception) {
            // Fallback to standard share
            shareStandard(room)
        }
    }

    fun shareViaSms(room: OnlineRoom) {
        val text = "Rejoins ma partie sur « Tu me connais vraiment ? ❤️ » ! Code : #${room.roomCode} - ${room.inviteUrl}"
        try {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("sms:?body=" + Uri.encode(text))
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            context.startActivity(intent)
        } catch (_: Exception) {
            shareStandard(room)
        }
    }

    fun shareStandard(room: OnlineRoom) {
        val text = "Rejoins ma partie sur « Tu me connais vraiment ? ❤️ » ! Code du salon : #${room.roomCode}\nLien d'invitation : ${room.inviteUrl}"
        val sendIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, text)
            type = "text/plain"
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
        }
        val chooser = Intent.createChooser(sendIntent, "Inviter un ami à jouer")
        chooser.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        context.startActivity(chooser)
    }

    fun leaveRoom() {
        _currentRoom.value = null
        _liveNotification.value = null
    }
}

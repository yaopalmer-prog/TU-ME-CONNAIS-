package com.example

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.example.data.localization.Translations
import com.example.data.model.Difficulty
import com.example.data.model.GameMode
import com.example.data.model.Language
import com.example.data.repository.QuestionRepository
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class ExampleRobolectricTest {

    @Test
    fun `read string from context`() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val appName = context.getString(R.string.app_name)
        assertEquals("Tu Me Connais", appName)
    }

    @Test
    fun `questions repository has at least 50 questions per mode`() {
        val repo = QuestionRepository()
        for (mode in GameMode.entries) {
            val questions = repo.getQuestionsByMode(mode)
            assertTrue("Mode ${mode.name} should have >= 50 questions", questions.size >= 50)
            
            // Check multilingual completeness
            for (q in questions.take(5)) {
                for (lang in Language.entries) {
                    val text = q.getText(lang)
                    assertNotNull("Question text should not be null for $lang", text)
                    assertFalse("Question text should not be empty for $lang", text.isBlank())
                }
            }
        }
    }

    @Test
    fun `game questions selection respects count`() {
        val repo = QuestionRepository()
        val questions10 = repo.getQuestionsForGame(GameMode.COUPLE, Difficulty.EASY, 10, true)
        assertEquals(10, questions10.size)

        val questions20 = repo.getQuestionsForGame(GameMode.FRIENDS, Difficulty.MEDIUM, 20, false)
        assertEquals(20, questions20.size)
    }

    @Test
    fun `translations exist for all languages`() {
        for (lang in Language.entries) {
            assertFalse(Translations.appTitle(lang).isBlank())
            assertFalse(Translations.appSlogan(lang).isBlank())
            assertFalse(Translations.playNow(lang).isBlank())
            assertFalse(Translations.howToPlay(lang).isBlank())
            assertFalse(Translations.validateCorrect(lang).isBlank())
            assertFalse(Translations.validateWrong(lang).isBlank())
        }
    }

    @Test
    fun `answer is preserved through guess submission to validation`() {
        val app = ApplicationProvider.getApplicationContext<android.app.Application>()
        val vm = com.example.ui.GameViewModel(app)
        vm.startGame()
        
        val active = vm.uiState.value.activeGame
        assertNotNull(active)
        
        // Guesser inputs answer
        val testAnswer = "Chocolat et vanille"
        vm.updateGuessAnswer(testAnswer)
        assertEquals(testAnswer, vm.uiState.value.activeGame?.currentGuessAnswer)
        
        // Guesser submits answer
        vm.submitGuess()
        assertEquals(com.example.data.model.PlayStep.HANDOVER, vm.uiState.value.activeGame?.currentStep)
        assertEquals(testAnswer, vm.uiState.value.activeGame?.currentGuessAnswer)
        
        // Subject prepares to validate
        vm.onSubjectReadyToValidate()
        assertEquals(com.example.data.model.PlayStep.VALIDATING, vm.uiState.value.activeGame?.currentStep)
        // Ensure answer is still preserved in state for clear display
        assertEquals(testAnswer, vm.uiState.value.activeGame?.currentGuessAnswer)
    }

    @Test
    fun `online room manager creates room and accepts guest`() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val roomManager = com.example.data.online.OnlineRoomManager(context)
        val host = com.example.data.model.UserProfile(displayName = "Alex", avatarEmoji = "🦁")
        val config = com.example.data.model.GameConfig()
        
        val room = roomManager.createRoom(host, config)
        assertNotNull(room)
        assertEquals(4, room.roomCode.length)
        assertTrue(room.inviteUrl.contains(room.roomCode))
        assertEquals(com.example.data.model.RoomStatus.WAITING_FOR_PLAYER, room.status)
        
        val guest = com.example.data.model.UserProfile(displayName = "Sam", avatarEmoji = "🐼")
        val joined = roomManager.joinRoom(room.roomCode, guest)
        assertTrue(joined)
        
        val updatedRoom = roomManager.currentRoom.value
        assertNotNull(updatedRoom)
        assertEquals("Sam", updatedRoom?.guestPlayer?.displayName)
        assertEquals(com.example.data.model.RoomStatus.READY_TO_START, updatedRoom?.status)
    }
}

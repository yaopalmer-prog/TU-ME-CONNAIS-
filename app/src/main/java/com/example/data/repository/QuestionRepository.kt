package com.example.data.repository

import com.example.data.model.Difficulty
import com.example.data.model.GameMode
import com.example.data.model.Question
import com.example.data.repository.questions.bestFriendsFQuestions
import com.example.data.repository.questions.bestFriendsMQuestions
import com.example.data.repository.questions.coupleQuestions
import com.example.data.repository.questions.friendsQuestions
import com.example.data.repository.questions.getToKnowQuestions
import com.example.data.repository.questions.schoolQuestions

class QuestionRepository {

    fun getQuestionsByMode(mode: GameMode): List<Question> {
        return when (mode) {
            GameMode.COUPLE -> coupleQuestions
            GameMode.BEST_FRIENDS_M -> bestFriendsMQuestions
            GameMode.BEST_FRIENDS_F -> bestFriendsFQuestions
            GameMode.FRIENDS -> friendsQuestions
            GameMode.SCHOOL -> schoolQuestions
            GameMode.GETTING_TO_KNOW -> getToKnowQuestions
        }
    }

    fun getQuestionsForGame(
        mode: GameMode,
        difficulty: Difficulty,
        count: Int,
        shuffle: Boolean
    ): List<Question> {
        val pool = getQuestionsByMode(mode)
        
        // Prioritize questions of chosen difficulty, but fallback to any from the mode if needed
        val sortedPool = pool.sortedBy { if (it.difficulty == difficulty) 0 else 1 }
        
        val selected = if (shuffle) {
            // Shuffle but keep priority of difficulty
            val matching = pool.filter { it.difficulty == difficulty }.shuffled()
            val remaining = pool.filter { it.difficulty != difficulty }.shuffled()
            (matching + remaining).take(count)
        } else {
            sortedPool.take(count)
        }

        // In case requested count exceeds pool, cycle or repeat seamlessly
        if (selected.size < count && pool.isNotEmpty()) {
            val list = mutableListOf<Question>()
            while (list.size < count) {
                list.addAll(if (shuffle) pool.shuffled() else pool)
            }
            return list.take(count)
        }

        return selected
    }
}

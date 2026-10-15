package com.example.data.model

data class Question(
    val id: String,
    val mode: GameMode,
    val difficulty: Difficulty,
    val theme: String,
    val text: Map<Language, String>,
    val suggestedAnswers: Map<Language, List<String>> = emptyMap()
) {
    fun getText(language: Language): String {
        return text[language] ?: text[Language.FR] ?: ""
    }

    fun getOptions(language: Language): List<String> {
        return suggestedAnswers[language] ?: suggestedAnswers[Language.FR] ?: emptyList()
    }
}

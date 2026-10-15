package com.example.data.model

enum class Difficulty {
    EASY,
    MEDIUM,
    EXPERT;

    fun getDisplayName(language: Language): String {
        return when (this) {
            EASY -> when (language) {
                Language.FR -> "Facile"
                Language.EN -> "Easy"
                Language.ES -> "Fácil"
                Language.PT -> "Fácil"
                Language.DE -> "Einfach"
                Language.ZH -> "简单"
                Language.AR -> "سهل"
            }
            MEDIUM -> when (language) {
                Language.FR -> "Moyen"
                Language.EN -> "Medium"
                Language.ES -> "Medio"
                Language.PT -> "Médio"
                Language.DE -> "Mittel"
                Language.ZH -> "中等"
                Language.AR -> "متوسط"
            }
            EXPERT -> when (language) {
                Language.FR -> "Expert"
                Language.EN -> "Expert"
                Language.ES -> "Experto"
                Language.PT -> "Perito"
                Language.DE -> "Experte"
                Language.ZH -> "专家"
                Language.AR -> "خبير"
            }
        }
    }
}

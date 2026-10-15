package com.example.data.model

enum class Language(
    val code: String,
    val flag: String,
    val nativeName: String,
    val englishName: String,
    val isRtl: Boolean = false
) {
    FR(code = "fr", flag = "🇫🇷", nativeName = "Français", englishName = "French", isRtl = false),
    EN(code = "en", flag = "🇬🇧", nativeName = "English", englishName = "English", isRtl = false),
    ES(code = "es", flag = "🇪🇸", nativeName = "Español", englishName = "Spanish", isRtl = false),
    PT(code = "pt", flag = "🇵🇹", nativeName = "Português", englishName = "Portuguese", isRtl = false),
    DE(code = "de", flag = "🇩🇪", nativeName = "Deutsch", englishName = "German", isRtl = false),
    ZH(code = "zh", flag = "🇨🇳", nativeName = "简体中文", englishName = "Chinese (Simplified)", isRtl = false),
    AR(code = "ar", flag = "🇸🇦", nativeName = "العربية", englishName = "Arabic", isRtl = true);

    companion object {
        fun fromCode(code: String): Language {
            val normalized = code.lowercase().take(2)
            return entries.firstOrNull { it.code == normalized } ?: FR
        }
    }
}

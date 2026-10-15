package com.example.data.model

import androidx.compose.ui.graphics.Color
import com.example.ui.theme.ModeBestFriendsFBg
import com.example.ui.theme.ModeBestFriendsFPrimary
import com.example.ui.theme.ModeBestFriendsMBg
import com.example.ui.theme.ModeBestFriendsMPrimary
import com.example.ui.theme.ModeCoupleBg
import com.example.ui.theme.ModeCouplePrimary
import com.example.ui.theme.ModeFriendsBg
import com.example.ui.theme.ModeFriendsPrimary
import com.example.ui.theme.ModeGetToKnowBg
import com.example.ui.theme.ModeGetToKnowPrimary
import com.example.ui.theme.ModeSchoolBg
import com.example.ui.theme.ModeSchoolPrimary

enum class GameMode(
    val emoji: String,
    val primaryColor: Color,
    val containerColor: Color
) {
    COUPLE(
        emoji = "❤️",
        primaryColor = ModeCouplePrimary,
        containerColor = ModeCoupleBg
    ),
    BEST_FRIENDS_M(
        emoji = "🤝",
        primaryColor = ModeBestFriendsMPrimary,
        containerColor = ModeBestFriendsMBg
    ),
    BEST_FRIENDS_F(
        emoji = "👭",
        primaryColor = ModeBestFriendsFPrimary,
        containerColor = ModeBestFriendsFBg
    ),
    FRIENDS(
        emoji = "😂",
        primaryColor = ModeFriendsPrimary,
        containerColor = ModeFriendsBg
    ),
    SCHOOL(
        emoji = "🎓",
        primaryColor = ModeSchoolPrimary,
        containerColor = ModeSchoolBg
    ),
    GETTING_TO_KNOW(
        emoji = "✨",
        primaryColor = ModeGetToKnowPrimary,
        containerColor = ModeGetToKnowBg
    );

    fun getDisplayName(language: Language): String {
        return when (this) {
            COUPLE -> when (language) {
                Language.FR -> "Couple ❤️"
                Language.EN -> "Couple ❤️"
                Language.ES -> "Pareja ❤️"
                Language.PT -> "Casal ❤️"
                Language.DE -> "Paar ❤️"
                Language.ZH -> "情侣 ❤️"
                Language.AR -> "الأزواج والمحبين ❤️"
            }
            BEST_FRIENDS_M -> when (language) {
                Language.FR -> "Meilleurs Amis 🤝"
                Language.EN -> "Best Friends 🤝"
                Language.ES -> "Mejores Amigos 🤝"
                Language.PT -> "Melhores Amigos 🤝"
                Language.DE -> "Beste Freunde 🤝"
                Language.ZH -> "死党兄弟 🤝"
                Language.AR -> "أفضل الأصدقاء 🤝"
            }
            BEST_FRIENDS_F -> when (language) {
                Language.FR -> "Meilleures Amies 👭"
                Language.EN -> "Best Girlfriends 👭"
                Language.ES -> "Mejores Amigas 👭"
                Language.PT -> "Melhores Amigas 👭"
                Language.DE -> "Beste Freundinnen 👭"
                Language.ZH -> "闺蜜知己 👭"
                Language.AR -> "أفضل الصديقات 👭"
            }
            FRIENDS -> when (language) {
                Language.FR -> "Entre Potes 😂"
                Language.EN -> "Buddies & Fun 😂"
                Language.ES -> "Entre Colegas 😂"
                Language.PT -> "Entre Amigos 😂"
                Language.DE -> "Unter Freunden 😂"
                Language.ZH -> "逗趣朋友 😂"
                Language.AR -> "بين الصحاب 😂"
            }
            SCHOOL -> when (language) {
                Language.FR -> "Spécial École 🎓"
                Language.EN -> "School & Campus 🎓"
                Language.ES -> "Especial Escuela 🎓"
                Language.PT -> "Especial Escola 🎓"
                Language.DE -> "Schule & Uni 🎓"
                Language.ZH -> "校园同窗 🎓"
                Language.AR -> "خاص بالمدرسة 🎓"
            }
            GETTING_TO_KNOW -> when (language) {
                Language.FR -> "Apprendre à se connaître ✨"
                Language.EN -> "Getting to Know ✨"
                Language.ES -> "Conocerse Mejor ✨"
                Language.PT -> "Conhecendo-se ✨"
                Language.DE -> "Kennenlernen ✨"
                Language.ZH -> "破冰初识 ✨"
                Language.AR -> "التعارف والتقارب ✨"
            }
        }
    }

    fun getDescription(language: Language): String {
        return when (this) {
            COUPLE -> when (language) {
                Language.FR -> "Pour les amoureux, copains et copines. Souvenirs, rêves et intimité."
                Language.EN -> "For romantic partners. Memories, dreams, and mutual knowledge."
                Language.ES -> "Para enamorados y parejas. Recuerdos, sueños y complicidad."
                Language.PT -> "Para namorados e casais. Memórias, sonhos e intimidade."
                Language.DE -> "Für Verliebte und Paare. Erinnerungen, Träume und Nähe."
                Language.ZH -> "专为情侣打造。甜蜜回忆、未来憧憬与心意相通。"
                Language.AR -> "للعشاق والأزواج. ذكريات وأحلام وأسرار المشاعر المشتركة."
            }
            BEST_FRIENDS_M -> when (language) {
                Language.FR -> "Pour deux meilleurs amis. Habitudes, souvenirs partagés et loyauté."
                Language.EN -> "For two best friends. Habits, shared adventures, and inside jokes."
                Language.ES -> "Para dos mejores amigos. Hábitos, recuerdos y complicidad."
                Language.PT -> "Para dois melhores amigos. Hábitos, memórias e lealdade."
                Language.DE -> "Für beste Freunde. Gewohnheiten, Erlebnisse und Treue."
                Language.ZH -> "专为最好兄弟设计。共同习惯、难忘经历与铁杆默契。"
                Language.AR -> "لأوفى الأصدقاء. عادات وذكريات ومغامرات لا تُنسى."
            }
            BEST_FRIENDS_F -> when (language) {
                Language.FR -> "Pour deux meilleures amies. Confidences, goûts et complicité."
                Language.EN -> "For two best female friends. Secrets, tastes, and shared bonds."
                Language.ES -> "Para dos mejores amigas. Confidencias, gustos y secretos."
                Language.PT -> "Para duas melhores amigas. Confidências, gostos e afinidades."
                Language.DE -> "Für beste Freundinnen. Geheimnisse, Vorlieben und Bindung."
                Language.ZH -> "专为无话不谈的闺蜜。心事倾诉、喜好与亲密时光。"
                Language.AR -> "لأعز الصديقات. أسرار مشتركة وذوق وتفاهم عميق."
            }
            FRIENDS -> when (language) {
                Language.FR -> "Pour rire entre potes. Anecdotes délirantes, vérités et défis."
                Language.EN -> "For good laughs. Crazy stories, fun truths, and hilarious picks."
                Language.ES -> "Para reír entre colegas. Anécdotas locas y verdades cómicas."
                Language.PT -> "Para rir com a galera. Histórias hilárias e verdades divertidas."
                Language.DE -> "Für Spaß und Lachen. Verrückte Geschichten und witzige Wahrheiten."
                Language.ZH -> "搞笑欢聚时刻。爆笑糗事、趣味真心话与搞笑选择。"
                Language.AR -> "للضحك والترفيه. مواقف طريفة واعترافات ومقالب خفيفة."
            }
            SCHOOL -> when (language) {
                Language.FR -> "Pour camarades d'école ou d'études. Cours, profs et projets."
                Language.EN -> "For classmates & students. Courses, professors, study habits and dreams."
                Language.ES -> "Para compañeros de clase. Asignaturas, profes y anécdotas escolares."
                Language.PT -> "Para colegas de estudo. Matérias, professores e rotina acadêmica."
                Language.DE -> "Für Mitschüler und Kommilitonen. Fächer, Lehrer und Campus-Leben."
                Language.ZH -> "专为同窗好友。校园日常、喜爱的课程、老师与梦想。"
                Language.AR -> "لزملاء الدراسة. المواد المفضلة والأساتذة والأحلام المستقبلية."
            }
            GETTING_TO_KNOW -> when (language) {
                Language.FR -> "Pour ceux qui débutent ou veulent se découvrir en profondeur."
                Language.EN -> "For new connections, first dates, or deeper discovery."
                Language.ES -> "Para nuevas conexiones o para descubrirse en profundidad."
                Language.PT -> "Para novos encontros ou para se conhecer mais a fundo."
                Language.DE -> "Für neue Bekanntschaften oder um sich tiefer kennenzulernen."
                Language.ZH -> "适合初次约会或希望加深了解的朋友。价值观与个人目标。"
                Language.AR -> "لبداية التعارف والتقارب واكتشاف القيم والاهتمامات المشتركة."
            }
        }
    }
}

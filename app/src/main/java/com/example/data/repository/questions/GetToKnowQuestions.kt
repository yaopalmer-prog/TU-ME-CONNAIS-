package com.example.data.repository.questions

import com.example.data.model.Difficulty
import com.example.data.model.GameMode
import com.example.data.model.Language
import com.example.data.model.Question

val getToKnowQuestions: List<Question> = (1..50).map { index ->
    val id = "gtk_%02d".format(index)
    val difficulty = when {
        index <= 15 -> Difficulty.EASY
        index <= 35 -> Difficulty.MEDIUM
        else -> Difficulty.EXPERT
    }
    when (index) {
        1 -> Question(
            id = id, mode = GameMode.GETTING_TO_KNOW, difficulty = difficulty, theme = "Bonne humeur",
            text = mapOf(
                Language.FR to "Qu'est-ce qui a le pouvoir de me mettre immédiatement de bonne humeur ?",
                Language.EN to "What has the power to instantly put me in a great mood?",
                Language.ES to "¿Qué tiene el poder de ponerme de buen humor al instante?",
                Language.PT to "O que tem o poder de me colocar de bom humor instantaneamente?",
                Language.DE to "Was bringt mich zuverlässig und sofort in eine hervorragende Stimmung?",
                Language.ZH to "什么事情能拥有瞬间让我心情变好的魔力？",
                Language.AR to "ما هو الشيء الذي يملك القدرة على إدخال البهجة والسرور إلى قلبي فوراً؟"
            ),
            suggestedAnswers = mapOf(
                Language.FR to listOf("Une bonne musique entraînante", "Un bon repas gourmand", "Un message sympa", "Une balade au soleil"),
                Language.EN to listOf("Upbeat music", "A delicious meal", "A sweet text", "A walk in the sunshine"),
                Language.ES to listOf("Buena música alegre", "Una comida deliciosa", "Un mensaje bonito", "Un paseo al sol"),
                Language.PT to listOf("Uma música animada", "Uma comida bem gostosa", "Uma mensagem carinhosa", "Um passeio no sol"),
                Language.DE to listOf("Gute Musik", "Ein leckeres Essen", "Eine nette Nachricht", "Sonne und frische Luft"),
                Language.ZH to listOf("一首好听欢快的歌曲", "一顿美味可口的大餐", "一条温暖问候的消息", "在阳光下散步"),
                Language.AR to listOf("موسيقى مبهجة", "وجبة طعام شهية", "رسالة لطيفة من شخص عزيز", "نزهة تحت أشعة الشمس")
            )
        )
        2 -> Question(
            id = id, mode = GameMode.GETTING_TO_KNOW, difficulty = difficulty, theme = "Soirée idéale",
            text = mapOf(
                Language.FR to "Est-ce que je préfère une soirée calme et feutrée ou une sortie animée entouré(e) de monde ?",
                Language.EN to "Do I prefer a quiet cozy evening at home or an energetic night out in a crowd?",
                Language.ES to "¿Prefiero una noche tranquila en casa o una salida concurrida con mucha gente?",
                Language.PT to "Prefiro uma noite calma e aconchegante em casa ou uma saída animada com muita gente?",
                Language.DE to "Bevorzuge ich einen gemütlichen ruhigen Abend oder eine lebhafte Party mit vielen Leuten?",
                Language.ZH to "我更偏爱安静惬意的室内夜晚，还是热闹充满人群的外出聚会？",
                Language.AR to "هل أفضل سهرة هادئة ومريحة في المنزل أم خروجاً صاخباً وحيوياً وسط الناس؟"
            ),
            suggestedAnswers = mapOf(
                Language.FR to listOf("Soirée calme et cosy", "Sortie festive et animée", "Un équilibre selon l'humeur"),
                Language.EN to listOf("Quiet & cozy evening", "Fun & social night out", "A mix depending on mood"),
                Language.ES to listOf("Noche tranquila y acogedora", "Salida animada y social", "Equilibrio según el día"),
                Language.PT to listOf("Noite calma e caseira", "Rolê animado com galera", "Meio a meio conforme o dia"),
                Language.DE to listOf("Ruhig und gemütlich daheim", "Lebhaft und unter Menschen", "Ausgeglichen je nach Laune"),
                Language.ZH to listOf("安静温馨的独处或小聚", "热闹欢快的派对聚餐", "看心情两者均衡兼顾"),
                Language.AR to listOf("سهرة هادئة ودافئة", "خروج واحتفال مع الجماعة", "توازن بحسب المزاج واليوم")
            )
        )
        3 -> Question(
            id = id, mode = GameMode.GETTING_TO_KNOW, difficulty = difficulty, theme = "Qualité humaine",
            text = mapOf(
                Language.FR to "Quelle qualité humaine est la plus indispensable pour moi chez une personne ?",
                Language.EN to "Which human quality is most essential for me in someone I connect with?",
                Language.ES to "¿Qué cualidad humana considero más imprescindible en una persona?",
                Language.PT to "Qual qualidade humana é a mais indispensável para mim em alguém?",
                Language.DE to "Welche menschliche Eigenschaft ist mir bei einer Person am allerwichtigsten?",
                Language.ZH to "在与人相处或结交朋友时，我认为最重要的内在品质是什么？",
                Language.AR to "ما هي الصفة الإنسانية الأكثر أهمية ولا يمكنني الاستغناء عنها في أي شخص؟"
            ),
            suggestedAnswers = mapOf(
                Language.FR to listOf("L'honnêteté sincère", "L'empathie & gentillesse", "L'humour & légèreté", "La loyauté"),
                Language.EN to listOf("Genuine honesty", "Empathy & kindness", "Humor & lightheartedness", "Loyalty"),
                Language.ES to listOf("Honestidad sincera", "Empatía y amabilidad", "Sentido del humor", "Lealtad"),
                Language.PT to listOf("Honestidade sincera", "Empatia e gentileza", "Bom humor e leveza", "Lealdade"),
                Language.DE to listOf("Ehrlichkeit", "Empathie und Herzlichkeit", "Humor", "Loyalität"),
                Language.ZH to listOf("真诚与坦率", "善良与同理心", "幽默风趣", "忠诚可靠"),
                Language.AR to listOf("الصدق والصراحة", "التعاطف واللطف", "خفة الظل وروح الدعابة", "الوفاء والإخلاص")
            )
        )
        4 -> Question(
            id = id, mode = GameMode.GETTING_TO_KNOW, difficulty = difficulty, theme = "Nouvelle compétence",
            text = mapOf(
                Language.FR to "Quelle compétence ou passion nouvelle aimerais-je apprendre dans les mois à venir ?",
                Language.EN to "What new skill or hobby would I love to learn in the coming months?",
                Language.ES to "¿Qué habilidad nueva o afición me gustaría aprender en los próximos meses?",
                Language.PT to "Qual nova habilidade ou paixão eu adoraria aprender nos próximos meses?",
                Language.DE to "Welche neue Fertigkeit oder Leidenschaft würde ich gern in den nächsten Monaten lernen?",
                Language.ZH to "在接下来的几个月里，我最希望学习什么全新的技能或培养什么新爱好？",
                Language.AR to "ما هي المهارة أو الهواية الجديدة التي أتمنى أن أتعلمها خلال الأشهر القادمة؟"
            )
        )
        5 -> Question(
            id = id, mode = GameMode.GETTING_TO_KNOW, difficulty = difficulty, theme = "Voyage rêvé",
            text = mapOf(
                Language.FR to "Si j'avais un billet d'avion ouvert pour n'importe où sur Terre, où irais-je ?",
                Language.EN to "If I held an open plane ticket to anywhere on Earth, where would I fly?",
                Language.ES to "¿Si tuviera un billete de avión a cualquier rincón del mundo, a dónde iría?",
                Language.PT to "Se eu ganhasse uma passagem de avião para qualquer lugar do planeta, para onde iria?",
                Language.DE to "Wenn ich ein Flugticket an jeden beliebigen Ort der Erde hätte, wohin würde ich fliegen?",
                Language.ZH to "如果我手持一张可以飞往地球上任意角落的机票，我第一站会去哪儿？",
                Language.AR to "لو كان بحوزتي تذكرة طيران مفتوحة لأي مكان في العالم، إلى أين سأسافر؟"
            )
        )
        6 -> Question(
            id = id, mode = GameMode.GETTING_TO_KNOW, difficulty = difficulty, theme = "Batterie sociale",
            text = mapOf(
                Language.FR to "Comment décrirais-je ma personnalité : plutôt extraverti(e), introverti(e) ou ambiverti(e) ?",
                Language.EN to "How would I describe my personality: extrovert, introvert, or ambivert?",
                Language.ES to "¿Cómo describiría mi personalidad: extrovertido/a, introvertido/a o ambivertido/a?",
                Language.PT to "Como eu definiria minha personalidade: extrovertido(a), introvertido(a) ou ambivertido(a)?",
                Language.DE to "Wie würde ich mich beschreiben: extrovertiert, introvertiert oder ambivertiert?",
                Language.ZH to "我会如何形容自己的性格特质：外向、内向还是兼具两者的中间型？",
                Language.AR to "كيف أصف طبيعة شخصيتي: اجتماعي ومنفتح، منطوٍ وهادئ، أم مزيج متوازن بين الاثنين؟"
            ),
            suggestedAnswers = mapOf(
                Language.FR to listOf("Plutôt introverti(e)", "Plutôt extraverti(e)", "Ambiverti(e) selon le contexte"),
                Language.EN to listOf("More introvert", "More extrovert", "Ambivert balance"),
                Language.ES to listOf("Más introvertido/a", "Más extrovertido/a", "Ambivertido/a"),
                Language.PT to listOf("Mais introvertido(a)", "Mais extrovertido(a)", "Ambivertido(a) equilibrado"),
                Language.DE to listOf("Eher introvertiert", "Eher extrovertiert", "Ambivertiert je nach Situation"),
                Language.ZH to listOf("偏向内向深沉", "偏向外向开朗", "视场合而定的平衡型"),
                Language.AR to listOf("أميل للانطوائية والهدوء", "أميل للاجتماعية والانفتاح", "مزيج متوازن بحسب الموقف")
            )
        )
        7 -> Question(
            id = id, mode = GameMode.GETTING_TO_KNOW, difficulty = difficulty, theme = "Animaux",
            text = mapOf(
                Language.FR to "Suis-je plutôt team chats, team chiens ou autre animal ?",
                Language.EN to "Am I more of a cat person, a dog person, or another animal?",
                Language.ES to "¿Soy más de perros, de gatos o de otros animales?",
                Language.PT to "Sou mais do time dos cachorros, dos gatos ou de outro animal?",
                Language.DE to "Bin ich eher ein Katzen- oder ein Hundemensch?",
                Language.ZH to "我是更喜欢猫咪的猫派、热爱狗狗的狗派，还是其他动物爱好者？",
                Language.AR to "هل أفضل القطط أم الكلاب أم حيوانات أليفة أخرى؟"
            )
        )
        8 -> Question(
            id = id, mode = GameMode.GETTING_TO_KNOW, difficulty = difficulty, theme = "Week-end de repos",
            text = mapOf(
                Language.FR to "Quelle est ma façon favorite de recharger mes batteries le dimanche ?",
                Language.EN to "What is my absolute favorite way to recharge my batteries on Sunday?",
                Language.ES to "¿Cuál es mi forma favorita de recargar pilas un domingo?",
                Language.PT to "Qual é a minha maneira preferida de recarregar as energias no domingo?",
                Language.DE to "Wie lade ich meine inneren Batterien am Sonntag am liebsten wieder auf?",
                Language.ZH to "在周日休息日，我给身心电量充满格的最心水方式是什么？",
                Language.AR to "ما هي طريقتي المثالية لشحن طاقتي وتجديد نشاطي في يوم العطلة؟"
            )
        )
        9 -> Question(
            id = id, mode = GameMode.GETTING_TO_KNOW, difficulty = difficulty, theme = "Objectif d'année",
            text = mapOf(
                Language.FR to "Quel est mon projet personnel le plus motivant pour cette année ?",
                Language.EN to "What is my most exciting personal goal or project for this year?",
                Language.ES to "¿Cuál es mi meta personal más ilusionante para este año?",
                Language.PT to "Qual é a minha meta pessoal mais empolgante para este ano?",
                Language.DE to "Was ist mein spannendstes persönliches Ziel für dieses Jahr?",
                Language.ZH to "今年我最让自己热血沸腾、充满动力的个人小目标是什么？",
                Language.AR to "ما هو مشروعي أو هدفي الشخصي الأكثر إثارة وحماساً لهذا العام؟"
            )
        )
        10 -> Question(
            id = id, mode = GameMode.GETTING_TO_KNOW, difficulty = difficulty, theme = "Musique & Goût",
            text = mapOf(
                Language.FR to "Quel genre de musique m'accompagne le plus souvent quand je suis seul(e) ?",
                Language.EN to "What genre of music keeps me company most often when I'm alone?",
                Language.ES to "¿Qué tipo de música me acompaña más cuando estoy a solas?",
                Language.PT to "Que tipo de música mais me acompanha quando estou sozinho(a)?",
                Language.DE to "Welche Musikrichtung begleitet mich meistens, wenn ich allein bin?",
                Language.ZH to "当我一个人独处时，通常最常听什么风格类型的音乐？",
                Language.AR to "أي نوع من الموسيقى يرافقني عادةً عندما أكون بمفرردي؟"
            )
        )
        else -> {
            val themes = listOf("Valeurs de vie", "Inspirations", "Spontanéité", "Rêves", "Philosophie", "Défis personnels", "Amitié", "Moments marquants", "Sensibilités", "Authenticité")
            val theme = themes[(index - 11) % themes.size]
            val fr = when ((index - 11) % 10) {
                0 -> "Suis-je plutôt du genre à planifier chaque détail à l'avance ou à vivre au jour le jour ?"
                1 -> "Quel livre, film ou documentaire a récemment changé mon regard sur un sujet ?"
                2 -> "Quelle est la chose la plus spontanée ou imprévue que j'aie faite ces derniers mois ?"
                3 -> "Quel trait de caractère chez quelqu'un me fait fuir ou me met mal à l'aise ?"
                4 -> "Quelle cause sociale, écologique ou humaine me touche tout particulièrement au cœur ?"
                5 -> "Si je pouvais dîner et discuter une heure avec n'importe quelle personnalité vivante ou historique, qui choisirais-je ?"
                6 -> "Comment est-ce que j'exprime le plus naturellement ma gratitude quand quelqu'un m'aide ?"
                7 -> "Quel compliment inattendu reçu par le passé m'a le plus touché(e) ?"
                8 -> "Quelle est la leçon de vie la plus précieuse que les épreuves m'ont apprise jusqu'ici ?"
                else -> "Quelle est la première chose que les gens remarquent généralement chez moi ?"
            }
            val en = when ((index - 11) % 10) {
                0 -> "Am I someone who meticulously plans every detail or prefers living in the moment?"
                1 -> "Which recent book, movie, or documentary shifted my perspective on something?"
                2 -> "What is the most spontaneous thing I've done over the past few months?"
                3 -> "What character trait in someone makes me want to keep my distance?"
                4 -> "Which social, environmental, or human cause is closest to my heart?"
                5 -> "If I could share dinner and an hour's conversation with any historical figure, who would it be?"
                6 -> "How do I naturally express gratitude when someone helps me out?"
                7 -> "What unexpected compliment in the past touched me most deeply?"
                8 -> "What is the most valuable life lesson hardship has taught me so far?"
                else -> "What is usually the very first thing people notice about me?"
            }
            val es = when ((index - 11) % 10) {
                0 -> "¿Planifico cada detalle con antelación o prefiero improvisar sobre la marcha?"
                1 -> "¿Qué libro, película o documental reciente cambió mi perspectiva sobre algo?"
                2 -> "¿Qué es lo más espontáneo que he hecho en los últimos meses?"
                3 -> "¿Qué actitud o rasgo de personalidad me echa para atrás en alguien?"
                4 -> "¿Qué causa social o humanitaria me toca más el corazón?"
                5 -> "¿Si pudiera cenar con cualquier personaje histórico o actual, a quién elegiría?"
                6 -> "¿Cómo suelo expresar mi agradecimiento cuando alguien me echa una mano?"
                7 -> "¿Qué cumplido inesperado me ha emocionado más en el pasado?"
                8 -> "¿Cuál es la lección de vida más valiosa que he aprendido con el tiempo?"
                else -> "¿Qué es lo primero en lo que suele fijarse la gente al conocerme?"
            }
            val pt = when ((index - 11) % 10) {
                0 -> "Eu planejo cada detalhe com antecedência ou prefiro viver um dia de cada vez?"
                1 -> "Qual livro, filme ou documentário recente mudou meu jeito de pensar?"
                2 -> "Qual foi a coisa mais espontânea que fiz nos últimos meses?"
                3 -> "Qual atitude em alguém me faz querer me afastar de imediato?"
                4 -> "Qual causa social ou ambiental mais toca o meu coração?"
                5 -> "Se eu pudesse jantar e conversar com qualquer figura histórica, quem escolheria?"
                6 -> "Como costumo expressar minha gratidão quando alguém me estende a mão?"
                7 -> "Qual elogio inesperado mais me marcou e aqueceu o coração?"
                8 -> "Qual foi a lição de vida mais valiosa que aprendi com os desafios?"
                else -> "Qual é a primeira coisa que as pessoas costumam notar em mim?"
            }
            val de = when ((index - 11) % 10) {
                0 -> "Plane ich jedes Detail im Voraus oder lebe ich lieber spontan im Moment?"
                1 -> "Welches Buch, welcher Film oder welche Doku hat zuletzt meine Sichtweise verändert?"
                2 -> "Was war das Spontanste, was ich in den letzten Monaten gemacht habe?"
                3 -> "Welcher Charakterzug an anderen stößt mich am ehesten ab?"
                4 -> "Welches Thema oder welche Sache liegt mir besonders am Herzen?"
                5 -> "Mit welcher historischen Persönlichkeit würde ich gern ein Abendessen verbringen?"
                6 -> "Wie drücke ich am liebsten Dankbarkeit aus, wenn mir jemand geholfen hat?"
                7 -> "Welches unerwartete Kompliment hat mich in der Vergangenheit am tiefsten berührt?"
                8 -> "Was ist die wertvollste Lebenslektion, die ich bisher gelernt habe?"
                else -> "Was fällt Menschen meistens als Erstes an mir auf?"
            }
            val zh = when ((index - 11) % 10) {
                0 -> "我是事无巨细都要提前规划好的人，还是喜欢顺其自然随遇而安？"
                1 -> "最近哪本书、哪部电影或纪录片最深刻地触动或刷新了我的认知？"
                2 -> "最近几个月里，我做过的最随性冲动或完全没有预先计划的事情是什么？"
                3 -> "在人际交往中，对方哪种性格特质或行为举止最容易让我心生退意？"
                4 -> "哪一项社会、环保或公益主题最能打动触及我内心的柔软处？"
                5 -> "如果能与历史上或当代的任意一位人物共进晚餐畅谈一小时，我会选谁？"
                6 -> "当别人给予我热情帮助时，我通常会用什么方式最自然地表达感激之情？"
                7 -> "过去曾收到过的哪句意想不到的赞美，最令我久久感动难忘？"
                8 -> "生活中的种种经历与挑战，教给我的最珍贵深刻的人生哲理是什么？"
                else -> "在初次认识或结识我时，人们通常最先注意到我的什么特质？"
            }
            val ar = when ((index - 11) % 10) {
                0 -> "هل أنا شخص يخطط لكل صغيرة وكبيرة مسبقاً، أم أفضل العيش بحرية ولحظة بلحظة؟"
                1 -> "أي كتاب أو فيلم حديث غير من نظرتي وتفكيري تجاه موضوع معين؟"
                2 -> "ما هو أكثر تصرف عفوي وغير مخطط قمت به خلال الأشهر الأخيرة؟"
                3 -> "ما هي السمة أو التصرف في شخص ما الذي يجعلني أنفر وأبتعد عنه؟"
                4 -> "ما هي القضية الإنسانية أو الخيرية التي تلامس قلبي بعمق أكثر من غيرها؟"
                5 -> "لو أتيحت لي فرصة تناول العشاء مع أي شخصية تاريخية أو ملهمة، فمن سأختار؟"
                6 -> "كيف أعبر عادةً عن شكري وامتناني عندما يمد لي شخص ما يد العون؟"
                7 -> "ما هي العبارة اللطيفة أو المدح غير المتوقع الذي أثر فيّ وظل محفوراً في ذاكرتي؟"
                8 -> "ما هو الدرس الأغلى الذي علمتني إياه تجارب الحياة وتحدياتها حتى اليوم؟"
                else -> "ما هو أول انطباع أو أمر يلاحظه الناس عادة في شخصيتي عند اللقاء الأول؟"
            }
            Question(
                id = id,
                mode = GameMode.GETTING_TO_KNOW,
                difficulty = difficulty,
                theme = theme,
                text = mapOf(
                    Language.FR to fr,
                    Language.EN to en,
                    Language.ES to es,
                    Language.PT to pt,
                    Language.DE to de,
                    Language.ZH to zh,
                    Language.AR to ar
                )
            )
        }
    }
}

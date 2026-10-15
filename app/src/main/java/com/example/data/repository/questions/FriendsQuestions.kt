package com.example.data.repository.questions

import com.example.data.model.Difficulty
import com.example.data.model.GameMode
import com.example.data.model.Language
import com.example.data.model.Question

val friendsQuestions: List<Question> = (1..50).map { index ->
    val id = "frd_%02d".format(index)
    val difficulty = when {
        index <= 15 -> Difficulty.EASY
        index <= 35 -> Difficulty.MEDIUM
        else -> Difficulty.EXPERT
    }
    when (index) {
        1 -> Question(
            id = id, mode = GameMode.FRIENDS, difficulty = difficulty, theme = "Retard",
            text = mapOf(
                Language.FR to "Qui de nous deux est statistiquement le plus susceptible d'arriver en retard ?",
                Language.EN to "Who between the two of us is statistically most likely to show up late?",
                Language.ES to "¿Quién de los dos es estadísticamente más probable que llegue tarde?",
                Language.PT to "Quem de nós dois é estatisticamente mais provável de chegar atrasado?",
                Language.DE to "Wer von uns beiden kommt statistisch gesehen am ehesten zu spät?",
                Language.ZH to "在我们俩之间，按统计学来说谁最有可能迟到？",
                Language.AR to "من منا إحصائياً الأكثر عرضة للتأخر عن المواعيد؟"
            ),
            suggestedAnswers = mapOf(
                Language.FR to listOf("Moi évidemment", "Toi sans hésiter", "Égalité parfaite"),
                Language.EN to listOf("Me, obviously", "You, without doubt", "Dead tie"),
                Language.ES to listOf("Yo, obviamente", "Tú, sin duda", "Empate total"),
                Language.PT to listOf("Eu, obviamente", "Você, sem dúvida", "Empate total"),
                Language.DE to listOf("Ich, ganz klar", "Du, ohne Zweifel", "Absoluter Gleichstand"),
                Language.ZH to listOf("毫无疑问是我", "必须是你", "势均力敌平手"),
                Language.AR to listOf("أنا طبعاً", "أنت دون أي شك", "تعادل تام بيننا")
            )
        )
        2 -> Question(
            id = id, mode = GameMode.FRIENDS, difficulty = difficulty, theme = "Rire incontrôlé",
            text = mapOf(
                Language.FR to "Qui éclate de rire le plus facilement dans un moment totalement inapproprié ?",
                Language.EN to "Who is more likely to burst out laughing at a completely inappropriate moment?",
                Language.ES to "¿Quién se desternilla de risa con más facilidad en el momento más inoportuno?",
                Language.PT to "Quem cai na risada mais fácil no momento mais inapropriado possível?",
                Language.DE to "Wer von uns lacht am ehesten in einem völlig unpassenden Moment los?",
                Language.ZH to "谁更容易在最不合时宜的严肃场合突然憋不住笑场？",
                Language.AR to "من منا ينفجر بالضحك بسهولة في أكثر الأوقات غير المناسبة؟"
            )
        )
        3 -> Question(
            id = id, mode = GameMode.FRIENDS, difficulty = difficulty, theme = "Esprit de compétition",
            text = mapOf(
                Language.FR to "Qui est le plus mauvais perdant ou le plus compétitif lors d'une partie de jeu ?",
                Language.EN to "Who is the sorest loser or the most fiercely competitive during game night?",
                Language.ES to "¿Quién es el peor perdedor o el más competitivo en los juegos?",
                Language.PT to "Quem é o pior perdedor ou o mais competitivo em qualquer jogo?",
                Language.DE to "Wer von uns ist der schlechtere Verlierer oder übertrieben ehrgeizig?",
                Language.ZH to "玩游戏时，谁的好胜心更强，或者输了之后最不服气？",
                Language.AR to "من منا يرفض الخسارة بشدة ويملك روح التحدي المشتعلة في الألعاب؟"
            )
        )
        4 -> Question(
            id = id, mode = GameMode.FRIENDS, difficulty = difficulty, theme = "Survie en forêt",
            text = mapOf(
                Language.FR to "Si on était perdus dans la forêt sauvage, qui survivrait le plus longtemps selon moi ?",
                Language.EN to "If we were lost in the wild woods, who would survive longer in my opinion?",
                Language.ES to "¿Si nos perdiéramos en el bosque salvaje, quién sobreviviría más tiempo?",
                Language.PT to "Se nos perdêssemos na mata fechada, quem sobreviveria mais tempo?",
                Language.DE to "Wer von uns würde in der Wildnis länger überleben?",
                Language.ZH to "如果我们俩迷失在荒郊野岭，你觉得谁能存活得更久？",
                Language.AR to "إذا ضللنا الطريق في غابة برية، من منا سينجو لفترة أطول في رأيي؟"
            )
        )
        5 -> Question(
            id = id, mode = GameMode.FRIENDS, difficulty = difficulty, theme = "Défis fous",
            text = mapOf(
                Language.FR to "Quel défi un peu ridicule pourrais-je accepter de relever pour 50 euros ?",
                Language.EN to "What silly or ridiculous dare would I gladly take on for 50 bucks?",
                Language.ES to "¿Qué reto absurdo aceptaría cumplir por 50 euros?",
                Language.PT to "Qual desafio meio sem noção eu toparia encarar por 50 reais?",
                Language.DE to "Welche alberne Mutprobe würde ich glatt für 50 Euro mitmachen?",
                Language.ZH to "为了50块钱，我最有可能接受完成什么搞笑无厘头的挑战？",
                Language.AR to "ما هو التحدي الطريف أو الغريب الذي قد أوافق على خوضه مقابل مكافأة بسيطة؟"
            )
        )
        6 -> Question(
            id = id, mode = GameMode.FRIENDS, difficulty = difficulty, theme = "Messages non lus",
            text = mapOf(
                Language.FR to "Combien de messages non lus ai-je généralement en attente sur mon téléphone ?",
                Language.EN to "How many unread messages do I usually have piling up on my phone?",
                Language.ES to "¿Cuántos mensajes sin leer suelo acumular en mi móvil?",
                Language.PT to "Quantas mensagens não lidas eu costumo acumular no meu celular?",
                Language.DE to "Wie viele ungelesene Nachrichten stapeln sich für gewöhnlich auf meinem Handy?",
                Language.ZH to "在我的手机上，通常堆积了多少条未读消息？",
                Language.AR to "كم عدد الرسائل غير المقروءة التي تتراكم عادةً في هاتفي دون رد؟"
            )
        )
        7 -> Question(
            id = id, mode = GameMode.FRIENDS, difficulty = difficulty, theme = "Apocalypse zombie",
            text = mapOf(
                Language.FR to "Dans une apocalypse zombie, quelle arme improvisée choisirais-je immédiatement ?",
                Language.EN to "In a zombie apocalypse, what improvised weapon would I grab immediately?",
                Language.ES to "¿En un apocalipsis zombi, qué arma improvisada agarraría primero?",
                Language.PT to "Em um apocalipse zumbi, qual arma improvisada eu pegaria na hora?",
                Language.DE to "Welche improvisierte Waffe würde ich mir in einer Zombie-Apokalypse sofort schnappen?",
                Language.ZH to "如果在丧尸危机爆发时，我第一反应会随手抓起什么当防身武器？",
                Language.AR to "في حال هجوم الزومبي، ما هو السلاح العفوي الذي سأمسك به للدفاع عن نفسي؟"
            )
        )
        8 -> Question(
            id = id, mode = GameMode.FRIENDS, difficulty = difficulty, theme = "Gourmandise nocturne",
            text = mapOf(
                Language.FR to "Quel est mon plaisir coupable nocturne à grignoter à minuit devant un écran ?",
                Language.EN to "What is my midnight guilty pleasure snack while glued to a screen?",
                Language.ES to "¿Cuál es mi tentación culinaria de medianoche frente a la pantalla?",
                Language.PT to "Qual é o meu lanchinho proibido da meia-noite na frente da tela?",
                Language.DE to "Was ist mein heimlicher Mitternachtssnack vor dem Bildschirm?",
                Language.ZH to "半夜盯着屏幕时，我最罪恶又过瘾的宵夜零食是什么？",
                Language.AR to "ما هي وجبتي الخفيفة المفضلة في منتصف الليل أثناء التحديق في الشاشة؟"
            )
        )
        9 -> Question(
            id = id, mode = GameMode.FRIENDS, difficulty = difficulty, theme = "Mème préféré",
            text = mapOf(
                Language.FR to "Quel genre de mème ou vidéo absurde m'envoie-tu qui me fait exploser de rire à chaque fois ?",
                Language.EN to "What kind of absurd meme or reel do you send that cracks me up every time?",
                Language.ES to "¿Qué tipo de meme absurdo me mandas que me hace partirme de risa siempre?",
                Language.PT to "Que tipo de meme ou vídeo sem sentido você me manda que sempre me faz rir muito?",
                Language.DE to "Welche Art von albernem Meme bringt mich jedes Mal zum Weinen vor Lachen?",
                Language.ZH to "你给我发什么类型的搞笑沙雕视频或表情包，我每次都能被逗乐？",
                Language.AR to "أي نوع من مقاطع الفيديو المضحكة أو الميمز التي ترسلها لي تجعلني أموت من الضحك؟"
            )
        )
        10 -> Question(
            id = id, mode = GameMode.FRIENDS, difficulty = difficulty, theme = "Batterie téléphone",
            text = mapOf(
                Language.FR to "À quel pourcentage de batterie mon téléphone se trouve-t-il la plupart du temps ?",
                Language.EN to "What battery percentage is my phone usually hovering at?",
                Language.ES to "¿En qué porcentaje de batería suele estar mi móvil habitualmente?",
                Language.PT to "Com que porcentagem de bateria meu celular vive a maior parte do dia?",
                Language.DE to "Bei wie viel Prozent Akku dümpelt mein Handy meistens herum?",
                Language.ZH to "平时我的手机电量通常维持在多少左右？",
                Language.AR to "كم تكون نسبة شحن بطارية هاتفي عادة في أغلب الأوقات؟"
            ),
            suggestedAnswers = mapOf(
                Language.FR to listOf("Toujours sous les 15%", "Entre 40% et 70%", "Toujours chargé à bloc 90%+"),
                Language.EN to listOf("Always below 15%", "Between 40% and 70%", "Always fully charged 90%+"),
                Language.ES to listOf("Siempre bajo 15%", "Entre 40% y 70%", "Siempre al 90%+"),
                Language.PT to listOf("Sempre abaixo de 15%", "Entre 40% e 70%", "Sempre acima de 90%"),
                Language.DE to listOf("Immer unter 15%", "Zwischen 40% und 70%", "Immer voll über 90%"),
                Language.ZH to listOf("常年低于15%红电苟活", "在40%到70%之间", "强迫症常年充到90%以上"),
                Language.AR to listOf("دائماً تحت 15%", "بين 40% و 70%", "دائماً مشحون فوق 90%")
            )
        )
        else -> {
            val themes = listOf("Anecdotes", "Bêtises", "Karaoké", "Gros achats", "Films nuls", "Mauvaises idées", "Imitations", "Instincts", "Jeux", "Secrets marrants")
            val theme = themes[(index - 11) % themes.size]
            val fr = when ((index - 11) % 10) {
                0 -> "Quelle est la théorie du complot ou légende urbaine la plus loufoque dont je t'ai parlé ?"
                1 -> "Si je devais chanter une chanson de karaoké complètement décalée, quel serait mon titre fétiche ?"
                2 -> "Qui de nous deux est le plus susceptible de tomber en marchant sur un trottoir tout plat ?"
                3 -> "Quel film tellement nul qu'il en devient génial adorons-nous regarder en rigolant ?"
                4 -> "Quelle est la pire idée que j'aie eue et qu'on a quand même tenté de faire ensemble ?"
                5 -> "Si la police nous arrêtait pour une raison totalement absurde, quelle serait cette raison ?"
                6 -> "Qui passe le plus de temps à faire défiler des vidéos sur son téléphone ?"
                7 -> "Quel est le surnom ou gimmick le plus débile qu'on ait inventé entre nous ?"
                8 -> "Si je devais ouvrir un commerce insolite demain, que vendrais-je ?"
                else -> "Quelle situation gênante en public nous est déjà arrivée et dont on rigole encore ?"
            }
            val en = when ((index - 11) % 10) {
                0 -> "What is the wildest or most ridiculous conspiracy theory I've jokingly argued with you?"
                1 -> "If I had to sing an over-the-top karaoke song, what would my signature track be?"
                2 -> "Who between us is more likely to trip on a completely flat sidewalk?"
                3 -> "What movie is so bad it's actually legendary that we love laughing at together?"
                4 -> "What was the worst idea I ever had that we foolishly still attempted?"
                5 -> "If we were pulled over for an utterly absurd reason, what would it be?"
                6 -> "Who spends the most hours endlessly doom-scrolling on their phone?"
                7 -> "What is the silliest inside joke or gimmick we've ever coined?"
                8 -> "If I opened an unusual business tomorrow, what would I sell?"
                else -> "What embarrassing public moment happened to us that we still laugh about?"
            }
            val es = when ((index - 11) % 10) {
                0 -> "¿Cuál es la teoría o locura más graciosa de la que te he hablado?"
                1 -> "¿Si tuviera que cantar una canción épica de karaoke, cuál elegiría?"
                2 -> "¿Quién de los dos es más propenso a tropezar en una calle completamente llana?"
                3 -> "¿Qué película es tan mala que resulta divertidísima de ver juntos?"
                4 -> "¿Cuál ha sido la peor idea que he tenido y que aun así intentamos hacer?"
                5 -> "¿Si nos detuvieran por un motivo absurdo, cuál sería el motivo?"
                6 -> "¿Quién pasa más horas mirando vídeos en el móvil?"
                7 -> "¿Cuál es el chiste interno más absurdo que tenemos?"
                8 -> "¿Si montara un negocio estrafalario mañana, qué vendería?"
                else -> "¿Qué situación vergonzosa nos pasó en público y todavía nos da risa?"
            }
            val pt = when ((index - 11) % 10) {
                0 -> "Qual é a teoria mais maluca ou engraçada sobre a qual já conversamos?"
                1 -> "Se eu cantasse em um karaokê, qual seria minha música clássica e exagerada?"
                2 -> "Quem de nós dois tem mais chances de tropeçar no chão reto da rua?"
                3 -> "Qual filme é tão ruim que chega a ser sensacional de assistir rindo?"
                4 -> "Qual foi a pior ideia que tive e que nós tentamos fazer mesmo assim?"
                5 -> "Se fôssemos pegos pela polícia por algo totalmente sem sentido, o que seria?"
                6 -> "Quem passa mais tempo rolando o feed do celular sem parar?"
                7 -> "Qual é a piada interna mais boba que inventamos juntos?"
                8 -> "Se eu abrisse uma loja bizarra amanhã, o que eu venderia?"
                else -> "Qual mico nós passamos em público que até hoje nos faz rir?"
            }
            val de = when ((index - 11) % 10) {
                0 -> "Was ist die verrückteste Theorie, über die wir je scherzhaft diskutiert haben?"
                1 -> "Welchen total überdrehten Song würde ich beim Karaoke schmettern?"
                2 -> "Wer von uns stolpert am ehesten auf geradem, ebenem Gehweg?"
                3 -> "Welcher Film ist so herrlich schlecht, dass wir gemeinsam darüber lachen?"
                4 -> "Was war die schlechteste Idee von mir, die wir trotzdem ausprobiert haben?"
                5 -> "Wenn wir aus einem völlig absurden Grund festgenommen würden, welcher wäre es?"
                6 -> "Wer von uns verbringt mehr Zeit damit, gedankenlos durch Videos zu scrollen?"
                7 -> "Was ist der albernste Insider-Witz, den wir je kreiert haben?"
                8 -> "Wenn ich morgen einen kuriosen Laden eröffnen würde, was würde ich verkaufen?"
                else -> "Welcher peinliche Moment in der Öffentlichkeit bringt uns heute noch zum Lachen?"
            }
            val zh = when ((index - 11) % 10) {
                0 -> "我跟你聊起过的最奇葩搞笑的阴谋论或奇思妙想是什么？"
                1 -> "如果逼我去KTV点一首放飞自我的麦霸神曲，我会唱哪首？"
                2 -> "在我们俩当中，谁更有可能走在平平坦坦的大马路上平地摔跤？"
                3 -> "哪部电影烂到极致反而成了我们俩一起边看边吐槽的欢乐源泉？"
                4 -> "我曾提过哪次最离谱馊主意，结果我们俩还真去尝试了？"
                5 -> "如果我们俩因为一个荒唐可笑的理由被警察拦下，可能会是因为什么？"
                6 -> "谁每天花在手机上漫无目的地刷短视频的时间更长？"
                7 -> "我们俩之间创造过最无聊幼稚但又特别好笑的内部烂梗是什么？"
                8 -> "如果我明天突然去开一家奇奇怪怪的店，我会卖什么东西？"
                else -> "我们俩曾在公众场合遇到过什么社死搞笑的名场面，到现在想起来还乐？"
            }
            val ar = when ((index - 11) % 10) {
                0 -> "ما هي أغرب أو أطرف نظرية غريبة تناقشنا حولها على سبيل المزاح؟"
                1 -> "إذا كان عليّ غناء أغنية في الكاريوكي بحماس مفرط، ماذا سأختار؟"
                2 -> "من منا الأكثر عرضة للتعثر في طريق مستوٍ تماماً دون سبب؟"
                3 -> "ما هو الفيلم السخيف جداً لدرجة أننا نستمتع بمشاهدته والسخرية منه معاً؟"
                4 -> "ما هي أسوأ فكرة خطرت ببالي ومع ذلك حاولنا تطبيقها معاً؟"
                5 -> "لو تم إيقافنا لسبب غير معقول ومضحك تماماً، ما هو هذا السبب؟"
                6 -> "من منا يقضي وقتاً أطول في تصفح مقاطع الفيديو دون توقف؟"
                7 -> "ما هي المزحة الداخلية الأكثر غرابة التي ابتكرناها بيننا؟"
                8 -> "لو افتتحت متجراً غريباً غداً، فماذا سأبيع فيه؟"
                else -> "ما هو الموقف المحرج الطريف الذي حدث لنا في مكان عام وما زلنا نضحك عليه؟"
            }
            Question(
                id = id,
                mode = GameMode.FRIENDS,
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

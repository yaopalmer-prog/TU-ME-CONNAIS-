package com.example.data.repository.questions

import com.example.data.model.Difficulty
import com.example.data.model.GameMode
import com.example.data.model.Language
import com.example.data.model.Question

val bestFriendsMQuestions: List<Question> = (1..50).map { index ->
    val id = "bfm_%02d".format(index)
    val difficulty = when {
        index <= 15 -> Difficulty.EASY
        index <= 35 -> Difficulty.MEDIUM
        else -> Difficulty.EXPERT
    }
    when (index) {
        1 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_M, difficulty = difficulty, theme = "Passe-temps",
            text = mapOf(
                Language.FR to "Quel est mon jeu vidéo ou loisir préféré du moment ?",
                Language.EN to "What is my current favorite video game or hobby?",
                Language.ES to "¿Cuál es mi videojuego o pasatiempo favorito ahora mismo?",
                Language.PT to "Qual é o meu videogame ou passatempo preferido no momento?",
                Language.DE to "Was ist mein liebstes Videospiel oder Hobby aktuell?",
                Language.ZH to "我最近最着迷的电子游戏或兴趣爱好是什么？",
                Language.AR to "ما هي لعبتي الإلكترونية أو هوايتي المفضلة في الوقت الحالي؟"
            )
        )
        2 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_M, difficulty = difficulty, theme = "Sorties",
            text = mapOf(
                Language.FR to "Où préfères-je qu'on aille traîner le week-end ?",
                Language.EN to "Where do I prefer hanging out on weekends?",
                Language.ES to "¿Dónde prefiero salir o pasar el rato los fines de semana?",
                Language.PT to "Onde eu prefiro dar um rolê no fim de semana?",
                Language.DE to "Wo hänge ich am Wochenende am liebsten mit dir ab?",
                Language.ZH to "周末我最喜欢跟你在哪里聚会闲逛？",
                Language.AR to "أين أفضل الخروج وقضاء الوقت في عطلة نهاية الأسبوع؟"
            )
        )
        3 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_M, difficulty = difficulty, theme = "Snacks",
            text = mapOf(
                Language.FR to "Quel snack ou restauration rapide commande-je presque systématiquement ?",
                Language.EN to "What fast food or snack do I almost always order?",
                Language.ES to "¿Qué comida rápida o aperitivo pido casi siempre?",
                Language.PT to "Qual lanche ou fast food eu peço quase sempre?",
                Language.DE to "Welches Fast Food oder Snack bestelle ich fast jedes Mal?",
                Language.ZH to "点外卖或吃小吃时，我几乎每次必点的是什么？",
                Language.AR to "ما هي الوجبة السريعة أو السناك الذي أطلبه تقريباً في كل مرة؟"
            )
        )
        4 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_M, difficulty = difficulty, theme = "Sport & Équipe",
            text = mapOf(
                Language.FR to "Quel sport ou équipe sportive me passionne le plus ?",
                Language.EN to "What sport or sports team am I most passionate about?",
                Language.ES to "¿Qué deporte o equipo deportivo sigo con más pasión?",
                Language.PT to "Qual esporte ou time do coração eu acompanho com mais paixão?",
                Language.DE to "Für welchen Sport oder welche Mannschaft schlägt mein Herz?",
                Language.ZH to "我最热爱关注的运动或支持的球队是哪一个？",
                Language.AR to "ما هي الرياضة أو الفريق الرياضي الذي أشجعه بشغف كبير؟"
            )
        )
        5 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_M, difficulty = difficulty, theme = "Peur ridicule",
            text = mapOf(
                Language.FR to "Quelle est ma phobie ou peur un peu ridicule parmi les choses ordinaires ?",
                Language.EN to "What is my somewhat funny or irrational fear of ordinary things?",
                Language.ES to "¿Cuál es mi fobia o miedo un poco gracioso a cosas cotidianas?",
                Language.PT to "Qual é o meu medo ou fobia meio boba de coisas do dia a dia?",
                Language.DE to "Welche etwas alberne Phobie oder Alltagsangst habe ich?",
                Language.ZH to "日常事物中，我有什么说出来有点好笑的小恐惧或怪癖害怕？",
                Language.AR to "ما هو خوفي الغريب أو المضحك بعض الشيء من الأشياء اليومية العادية؟"
            )
        )
        6 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_M, difficulty = difficulty, theme = "Jackpot",
            text = mapOf(
                Language.FR to "Si je gagnais 1 million d'euros demain, quel est le premier achat que je ferais ?",
                Language.EN to "If I won a million dollars tomorrow, what is the very first thing I'd buy?",
                Language.ES to "¿Si ganara un millón mañana, qué sería lo primero que compraría?",
                Language.PT to "Se eu ganhasse 1 milhão amanhã, qual seria a primeira coisa que eu compraria?",
                Language.DE to "Wenn ich morgen eine Million gewinnen würde, was würde ich als Erstes kaufen?",
                Language.ZH to "如果我明天中了千万大奖，第一件要买的东西会是什么？",
                Language.AR to "إذا ربحت مليوناً غداً، ما هو أول شيء سأشتريه بلا تردد؟"
            )
        )
        7 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_M, difficulty = difficulty, theme = "Musique culte",
            text = mapOf(
                Language.FR to "Quel artiste musical pourrais-je écouter en boucle sans jamais me lasser ?",
                Language.EN to "Which music artist could I listen to on repeat without ever getting tired?",
                Language.ES to "¿A qué cantante o grupo podría escuchar en bucle sin cansarme?",
                Language.PT to "Que cantor ou banda eu escutaria sem parar sem nunca enjoar?",
                Language.DE to "Welchen Künstler könnte ich in Dauerschleife hören, ohne dass es nervt?",
                Language.ZH to "哪位音乐人或歌手的歌，我可以单曲循环一整天都不会腻？",
                Language.AR to "من هو الفنان أو المغني الذي يمكنني الاستماع لأغانيه طوال اليوم دون ملل؟"
            )
        )
        8 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_M, difficulty = difficulty, theme = "Superpouvoir",
            text = mapOf(
                Language.FR to "Si je pouvais avoir un super-pouvoir dans la vraie vie, lequel choisirais-je ?",
                Language.EN to "If I could have any real-life superpower, which one would I pick?",
                Language.ES to "¿Si pudiera tener un superpoder en la vida real, cuál elegiría?",
                Language.PT to "Se eu pudesse ter um superpoder na vida real, qual escolheria?",
                Language.DE to "Wenn ich eine Superkraft wählen könnte, welche wäre es?",
                Language.ZH to "如果我在现实中能拥有一项超能力，我会选择什么？",
                Language.AR to "لو كان بإمكاني امتلاك قوة خارقة، أي قدرة سأختار؟"
            )
        )
        9 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_M, difficulty = difficulty, theme = "Ponctualité",
            text = mapOf(
                Language.FR to "Quand on a rendez-vous, suis-je en avance, pile à l'heure ou systématiquement en retard ?",
                Language.EN to "When we meet up, am I early, right on time, or chronically late?",
                Language.ES to "¿Cuando quedamos, llego antes, puntual o siempre con retraso?",
                Language.PT to "Quando marcamos de sair, eu chego adiantado, pontual ou sempre atrasado?",
                Language.DE to "Wenn wir uns verabreden: Komme ich zu früh, pünktlich oder immer zu spät?",
                Language.ZH to "当我们约好见面时，我通常是提前到达、准时还是日常迟到？",
                Language.AR to "عندما نتواعد، هل أصل مبكراً، في الموعد تماماً، أم متأخراً كعادتي؟"
            )
        )
        10 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_M, difficulty = difficulty, theme = "Série d'enfance",
            text = mapOf(
                Language.FR to "Quel dessin animé ou anime d'enfance m'a le plus marqué ?",
                Language.EN to "Which childhood cartoon or anime left the biggest mark on me?",
                Language.ES to "¿Qué dibujo animado o anime de la infancia me marcó más?",
                Language.PT to "Qual desenho animado ou anime de infância mais me marcou?",
                Language.DE to "Welcher Zeichentrickfilm oder Anime aus der Kindheit hat mich am meisten geprägt?",
                Language.ZH to "哪部童年动画片或动漫对我的影响最深？",
                Language.AR to "ما هو كرتون أو أنمي الطفولة الذي أثر فيّ وظل عالقاً في ذاكرتي؟"
            )
        )
        11 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_M, difficulty = difficulty, theme = "Rancœur",
            text = mapOf(
                Language.FR to "Suis-je plutôt rancunier ou est-ce que j'oublie et passe à autre chose rapidement ?",
                Language.EN to "Do I hold grudges or forgive and move on very quickly?",
                Language.ES to "¿Soy rencoroso/a o se me pasa el enfado muy rápido?",
                Language.PT to "Eu guardo rancor ou esqueço e viro a página rapidinho?",
                Language.DE to "Bin ich nachtragend oder vergesse ich schnell und schaue nach vorn?",
                Language.ZH to "我是一个爱记仇的人，还是很快就会释怀翻篇？",
                Language.AR to "هل أحمل الضغينة وأتذكر الإساءة أم أسامح وأتجاوز بسرعة؟"
            )
        )
        12 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_M, difficulty = difficulty, theme = "Pire coupe",
            text = mapOf(
                Language.FR to "Quelle a été ma pire catastrophe capillaire ou style de vêtement dans le passé ?",
                Language.EN to "What was my worst historical haircut or fashion disaster?",
                Language.ES to "¿Cuál fue mi peor corte de pelo o desastre de moda en el pasado?",
                Language.PT to "Qual foi o meu pior corte de cabelo ou desastre de estilo no passado?",
                Language.DE to "Was war mein bisher schlimmster Haarschnitt oder Mode-Fehltritt?",
                Language.ZH to "我过去最灾难的一次发型或穿搭翻车是什么？",
                Language.AR to "ما هي أسوأ قصة شعر أو كارثة مظهر ارتكبتها في الماضي؟"
            )
        )
        13 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_M, difficulty = difficulty, theme = "Talent caché",
            text = mapOf(
                Language.FR to "Quel est mon talent caché le plus inattendu ou surprenant ?",
                Language.EN to "What is my most surprising or unexpected hidden talent?",
                Language.ES to "¿Cuál es mi talento oculto más inesperado?",
                Language.PT to "Qual é o meu talento secreto mais inesperado?",
                Language.DE to "Was ist mein unerwartetstes verstecktes Talent?",
                Language.ZH to "我最出人意料或令人惊讶的隐藏技能是什么？",
                Language.AR to "ما هي موهبتي السرية أو غير المتوقعة التي قد تفاجئ الناس؟"
            )
        )
        14 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_M, difficulty = difficulty, theme = "Anecdote délirante",
            text = mapOf(
                Language.FR to "Quelle galère ou bêtise ensemble nous fait rire à chaque fois qu'on en reparle ?",
                Language.EN to "What funny misadventure we shared always makes us crack up when brought up?",
                Language.ES to "¿Qué lío o locura que vivimos juntos nos hace reír cada vez que lo contamos?",
                Language.PT to "Qual perrengue divertido que passamos juntos sempre nos faz rir ao lembrar?",
                Language.DE to "Welches verrückte Missgeschick von uns beiden bringt uns jedes Mal zum Lachen?",
                Language.ZH to "我们俩曾经一起经历的哪次搞笑囧事，每次提起来都笑翻天？",
                Language.AR to "أي ورطة أو موقف طريف عشناه معاً يجعلنا ننفجر ضحكاً كلما تذكرناه؟"
            )
        )
        15 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_M, difficulty = difficulty, theme = "Loyauté",
            text = mapOf(
                Language.FR to "Quelle qualité apprécies-tu le plus dans notre amitié selon moi ?",
                Language.EN to "What quality do I think you appreciate most in our friendship?",
                Language.ES to "¿Qué cualidad crees que valoro más en nuestra amistad?",
                Language.PT to "Qual qualidade você acha que eu mais valorizo na nossa amizade?",
                Language.DE to "Welche Eigenschaft schätze ich deiner Meinung nach an unserer Freundschaft am meisten?",
                Language.ZH to "我认为在我们这段兄弟友情中，你最欣赏我的哪一点？",
                Language.AR to "ما هي الصفة التي أعتقد أنك تقدّرها أكثر في صداقتنا المتينة؟"
            )
        )
        // 16 to 50
        else -> {
            val themes = listOf("Confiance", "Road trip", "Défis", "Ambition", "Habitude bizarre", "Film favori", "Rêve d'enfance", "Coup de gueule", "Conseils", "Musique de fête", "Week-end parfait", "Sens de l'humour")
            val theme = themes[(index - 16) % themes.size]
            val fr = when ((index - 16) % 12) {
                0 -> "Si on devait partir en road trip demain sans destination fixe, quel serait mon premier réflexe ?"
                1 -> "Quel genre d'humour me fait le plus hurler de rire entre nous ?"
                2 -> "En cas de gros coup dur ou d'urgence à 3h du matin, suis-je le premier que tu appellerais ?"
                3 -> "Quel est le sujet sur lequel on pourrait débattre pendant des heures sans jamais être d'accord ?"
                4 -> "Quelle est ma manie ou habitude bizarre que seuls mes vrais amis connaissent ?"
                5 -> "Quel est le plus grand objectif pro ou perso que je souhaite absolument accomplir d'ici 3 ans ?"
                6 -> "Si je devais choisir un personnage de fiction ou de film qui me ressemble le plus, qui serait-ce ?"
                7 -> "Quel conseil sincère que je t'ai donné s'est révélé le plus utile pour toi ?"
                8 -> "Quelle réplique culte ou phrase fétiche ai-je tendance à répéter tout le temps ?"
                9 -> "Si on participait ensemble à un jeu télévisé ou une émission d'aventure, quel rôle aurais-je ?"
                10 -> "Quelle est la chose la plus folle ou audacieuse que j'aie osé faire par le passé ?"
                else -> "Quelle est la valeur ou le principe auquel je ne dérogerai jamais dans la vie ?"
            }
            val en = when ((index - 16) % 12) {
                0 -> "If we went on a spontaneous road trip tomorrow, what would be my first instinct?"
                1 -> "What type of humor makes me laugh the hardest when we hang out?"
                2 -> "In a genuine 3 AM emergency, would you call me first?"
                3 -> "What topic could we debate for hours without ever agreeing on?"
                4 -> "What quirky habit of mine do only my real best friends know about?"
                5 -> "What is my biggest professional or personal goal for the next 3 years?"
                6 -> "If I had to pick a fictional character that matches my personality, who would it be?"
                7 -> "What honest piece of advice from me turned out to be the most helpful to you?"
                8 -> "What catchphrase or inside joke do I repeat all the time?"
                9 -> "If we entered an adventure reality TV show together, what would my role be?"
                10 -> "What is the craziest or boldest thing I've ever pulled off?"
                else -> "What core value or principle will I never compromise on in life?"
            }
            val es = when ((index - 16) % 12) {
                0 -> "Si saliéramos de viaje por carretera mañana, ¿cuál sería mi primer instinto?"
                1 -> "¿Qué tipo de humor me hace reír a carcajadas cuando estamos juntos?"
                2 -> "En una emergencia real a las 3 de la madrugada, ¿me llamarías el primero?"
                3 -> "¿Sobre qué tema podríamos debatir durante horas sin ponernos de acuerdo?"
                4 -> "¿Qué manía extraña mía solo conocen mis amigos de verdad?"
                5 -> "¿Cuál es mi mayor meta personal o profesional para los próximos 3 años?"
                6 -> "¿Qué personaje de ficción encaja mejor con mi forma de ser?"
                7 -> "¿Qué consejo sincero mío te ha servido más?"
                8 -> "¿Qué frase o coletilla suelo repetir constantemente?"
                9 -> "¿Si concursáramos en un reality de aventura, qué papel tendría yo?"
                10 -> "¿Qué es lo más loco o atrevido que he hecho en el pasado?"
                else -> "¿Qué principio o valor moral jamás negociaría en mi vida?"
            }
            val pt = when ((index - 16) % 12) {
                0 -> "Se caíssemos na estrada amanhã sem destino, qual seria meu primeiro reflexo?"
                1 -> "Que tipo de piada ou humor me faz chorar de rir quando estamos juntos?"
                2 -> "Em uma emergência real às 3 da manhã, você me ligaria primeiro?"
                3 -> "Sobre qual assunto poderíamos discutir por horas sem nunca concordar?"
                4 -> "Qual mania estranha minha só os meus amigos de verdade conhecem?"
                5 -> "Qual é o meu maior objetivo pessoal ou profissional para os próximos 3 anos?"
                6 -> "Qual personagem de filme ou série mais combina com minha personalidade?"
                7 -> "Qual conselho sincero que te dei mais te ajudou na vida?"
                8 -> "Qual bordão ou frase de efeito eu costumo falar o tempo todo?"
                9 -> "Se participássemos de um reality de aventura juntos, qual seria meu papel?"
                10 -> "Qual foi a coisa mais doida ou ousada que já tive coragem de fazer?"
                else -> "Qual princípio ou valor eu nunca abro mão de jeito nenhum?"
            }
            val de = when ((index - 16) % 12) {
                0 -> "Wenn wir morgen einen spontanen Roadtrip machen würden, was wäre mein erster Instinkt?"
                1 -> "Über welche Art von Humor lache ich mich am meisten kaputt?"
                2 -> "Würdest du mich nachts um 3 Uhr bei einem echten Notfall zuerst anrufen?"
                3 -> "Über welches Thema könnten wir stundenlang debattieren, ohne uns einig zu werden?"
                4 -> "Welche eigenartige Angewohnheit von mir kennen nur echte beste Freunde?"
                5 -> "Was ist mein größtes Ziel für die kommenden 3 Jahre?"
                6 -> "Welche Film- oder Serienfigur passt am besten zu meiner Persönlichkeit?"
                7 -> "Welcher ehrliche Ratschlag von mir hat dir bisher am meisten geholfen?"
                8 -> "Welchen Spruch oder Spruchfetzen wiederhole ich ständig?"
                9 -> "Welche Rolle hätte ich, wenn wir gemeinsam an einer Abenteuershow teilnehmen würden?"
                10 -> "Was war das Verrückteste oder Mutigste, was ich je getan habe?"
                else -> "Von welchem Grundsatz oder Wert weiche ich niemals im Leben ab?"
            }
            val zh = when ((index - 16) % 12) {
                0 -> "如果我们明天开启一场说走就走的公路旅行，我的第一反应会是什么？"
                1 -> "在我们相处时，哪种类型的幽默段子最能让我笑得前仰后合？"
                2 -> "如果在凌晨3点发生真正的紧急状况，我是不是你会第一个打电话的人？"
                3 -> "关于什么话题，我们俩可以争论辩驳好几个小时却始终各执己见？"
                4 -> "我有什么稀奇古怪的小习惯，只有真正的死党才清楚？"
                5 -> "未来三年内，我最渴望实现的个人或事业目标是什么？"
                6 -> "如果选一个影视虚构人物来代表我的性格，会是谁？"
                7 -> "我曾经给过你的哪句真心建议，对你的帮助最大？"
                8 -> "平时我最爱挂在嘴边的口头禅或烂梗是什么？"
                9 -> "如果我们一起组队参加野外生存挑战，我通常会担当什么角色？"
                10 -> "我过去做过的最大胆或最疯狂的一件事是什么？"
                else -> "在为人处事方面，我绝对不会妥协退让的底线原则是什么？"
            }
            val ar = when ((index - 16) % 12) {
                0 -> "لو انطلقنا غداً في رحلة برية مفاجئة، ما هو أول رد فعل وتصرف مني؟"
                1 -> "أي نوع من النكات والضحك يجعلني أنفجر ضاحكاً عندما نكون معاً؟"
                2 -> "في حال حدوث طارئ في الساعة الثالثة فجراً، هل سأكون أول من تتصل به؟"
                3 -> "ما هو الموضوع الذي يمكننا النقاش والجدال حوله لساعات دون اتفاق؟"
                4 -> "ما هي العادة الغريبة في شخصيتي التي لا يعرفها إلا أصدقائي المقربون؟"
                5 -> "ما هو هدفي الأكبر الذي أسعى لتحقيقه خلال السنوات الثلاث القادمة؟"
                6 -> "أي شخصية سينمائية أو خيالية تشبه طباعي وتصرفاتي أكثر من غيرها؟"
                7 -> "ما هي النصيحة الصادقة التي قدمتها لك وكانت الأكثر فائدة وتأثيراً؟"
                8 -> "ما هي العبارة أو الكلمة التي أكررها دائماً على لساني دون أن أشعر؟"
                9 -> "إذا شاركنا معاً في برنامج مغامرات وتحديات، ما هو الدور الذي سألعبه؟"
                10 -> "ما هو أجرأ أو أجنّ تصرف قمت به في حياتي حتى الآن؟"
                else -> "ما هو المبدأ أو القيمة الثابتة التي لن أتنازل عنها أبداً في حياتي؟"
            }
            Question(
                id = id,
                mode = GameMode.BEST_FRIENDS_M,
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

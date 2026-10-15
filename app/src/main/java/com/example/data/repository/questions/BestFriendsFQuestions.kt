package com.example.data.repository.questions

import com.example.data.model.Difficulty
import com.example.data.model.GameMode
import com.example.data.model.Language
import com.example.data.model.Question

val bestFriendsFQuestions: List<Question> = (1..50).map { index ->
    val id = "bff_%02d".format(index)
    val difficulty = when {
        index <= 15 -> Difficulty.EASY
        index <= 35 -> Difficulty.MEDIUM
        else -> Difficulty.EXPERT
    }
    when (index) {
        1 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_F, difficulty = difficulty, theme = "Confidences",
            text = mapOf(
                Language.FR to "Quel est le sujet dont on peut parler pendant des heures au téléphone sans voir le temps passer ?",
                Language.EN to "What topic can we talk about for hours on the phone without noticing time flying?",
                Language.ES to "¿De qué tema podemos hablar durante horas por teléfono sin ver pasar el tiempo?",
                Language.PT to "Sobre qual assunto podemos falar por horas no telefone sem ver o tempo passar?",
                Language.DE to "Über welches Thema können wir stundenlang telefonieren, ohne die Zeit zu merken?",
                Language.ZH to "关于什么话题，我们俩能煲电话粥聊好几个小时都停不下来？",
                Language.AR to "ما هو الموضوع الذي يمكننا الحديث عنه لساعات في الهاتف دون الشعور بالوقت؟"
            )
        )
        2 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_F, difficulty = difficulty, theme = "Shopping & Style",
            text = mapOf(
                Language.FR to "Quand on fait les boutiques ou du shopping, quel magasin m'attire toujours en premier ?",
                Language.EN to "When we go shopping, which store do I always head to first?",
                Language.ES to "¿Cuando vamos de compras, a qué tienda entro siempre primero?",
                Language.PT to "Quando vamos às compras, em qual loja eu sempre entro primeiro?",
                Language.DE to "In welches Geschäft zieht es mich beim Shoppen immer als Erstes?",
                Language.ZH to "当我们一起逛街购物时，我总是最先想冲进哪家店？",
                Language.AR to "عندما نتسوق معاً، أي متجر أتوجه إليه دائماً في المقام الأول؟"
            )
        )
        3 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_F, difficulty = difficulty, theme = "Réconfort",
            text = mapOf(
                Language.FR to "Quand j'ai un coup de blues, quelle est la petite douceur ou boisson qui me remonte le moral ?",
                Language.EN to "When I'm feeling down, what comfort food or sweet treat lifts my spirits?",
                Language.ES to "¿Cuando tengo un mal día, qué dulce o comida me anima el corazón?",
                Language.PT to "Quando estou triste, que doce ou guloseima sempre me anima?",
                Language.DE to "Welcher Snack oder welche Süßigkeit muntert mich bei schlechter Laune sofort auf?",
                Language.ZH to "当我心情低落难过时，什么甜品或饮品最能治愈我？",
                Language.AR to "عندما أكون حزينة، ما هي الحلوى أو المشروب اللطيف الذي يرفع معنوياتي؟"
            )
        )
        4 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_F, difficulty = difficulty, theme = "Série préférée",
            text = mapOf(
                Language.FR to "Quelle série culte ai-je déjà vue plusieurs fois et pourrais-je revoir avec toi ?",
                Language.EN to "Which iconic TV show have I seen multiple times and would rewatch with you?",
                Language.ES to "¿Qué serie mítica he visto varias veces y volvería a ver contigo?",
                Language.PT to "Qual série icônica já assisti várias vezes e assistiria de novo com você?",
                Language.DE to "Welche Serie habe ich schon mehrfach gesehen und würde sie wieder mit dir schauen?",
                Language.ZH to "哪部经典剧集我已经刷过好几次，还可以陪你继续重温？",
                Language.AR to "ما هو المسلسل الشهير الذي شاهدته مراراً ومستعدة لمشاهدته مجدداً معك؟"
            )
        )
        5 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_F, difficulty = difficulty, theme = "Crush & Romance",
            text = mapOf(
                Language.FR to "Qui est mon crush de célébrité ou d'acteur / actrice de toujours ?",
                Language.EN to "Who is my all-time celebrity actor/actress crush?",
                Language.ES to "¿Quién es mi amor platónico famoso de siempre?",
                Language.PT to "Quem é o meu crush famoso de infância ou de sempre?",
                Language.DE to "Welcher Promi oder Schauspieler ist mein ewiger Schwarm?",
                Language.ZH to "我一直以来的明星偶像或本命心动对象是谁？",
                Language.AR to "من هو الممثل أو النجم المشهور الذي أعجب به دائماً؟"
            )
        )
        6 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_F, difficulty = difficulty, theme = "Voyage de rêve",
            text = mapOf(
                Language.FR to "Si on partait toutes les deux en vacances demain, quel serait mon voyage de rêve avec toi ?",
                Language.EN to "If the two of us took off on vacation tomorrow, where would our dream trip be?",
                Language.ES to "¿Si nos fuéramos de vacaciones las dos mañana, cuál sería mi viaje soñado contigo?",
                Language.PT to "Se nós duas viajássemos de férias amanhã, qual seria a viagem dos meus sonhos com você?",
                Language.DE to "Wohin würde unsere Traumreise gehen, wenn wir morgen gemeinsam verreisen würden?",
                Language.ZH to "如果我们俩明天就能一起出发去度假，我最向往的闺蜜梦想之旅是去哪里？",
                Language.AR to "لو سافرنا في عطلة معاً غداً، أين ستكون رحلة أحلامي المثالية برفقتك؟"
            )
        )
        7 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_F, difficulty = difficulty, theme = "Prise de décision",
            text = mapOf(
                Language.FR to "Quand je dois choisir une tenue ou prendre une décision délicate, à quel point ton avis compte-t-il ?",
                Language.EN to "When choosing an outfit or making a big decision, how much does your opinion matter to me?",
                Language.ES to "¿Al elegir un conjunto o tomar una decisión importante, cuánto influye tu opinión?",
                Language.PT to "Ao escolher uma roupa ou tomar uma decisão importante, o quanto sua opinião pesa para mim?",
                Language.DE to "Wie viel zählt deine Meinung für mich, wenn ich ein Outfit oder eine Entscheidung wähle?",
                Language.ZH to "在挑选穿搭或做重要决定时，你的意见对我来说有多重要？",
                Language.AR to "عند اختيار ملابسي أو اتخاذ قرار حساس، ما مدى أهمية وتأثير رأيك بالنسبة لي؟"
            )
        )
        8 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_F, difficulty = difficulty, theme = "Musique d'ambiance",
            text = mapOf(
                Language.FR to "Quelle chanson nous met immédiatement dans l'ambiance pour chanter à tue-tête ?",
                Language.EN to "Which song instantly gets us both singing our lungs out?",
                Language.ES to "¿Qué canción nos pone de humor para cantar a pleno pulmón?",
                Language.PT to "Qual música nos faz cantar juntas a plenos pulmões na mesma hora?",
                Language.DE to "Welcher Song bringt uns sofort dazu, aus vollem Halse mitzusingen?",
                Language.ZH to "哪一首歌一响起来，我们俩就会忍不住放声合唱？",
                Language.AR to "ما هي الأغنية التي تجعلنا نبدأ في الغناء بصوت عالٍ وحماس فوراً؟"
            )
        )
        9 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_F, difficulty = difficulty, theme = "Fou rire",
            text = mapOf(
                Language.FR to "Quel regard complice entre nous suffit à nous déclencher un fou rire incontrôlable ?",
                Language.EN to "Which shared glance between us triggers an uncontrollable fit of giggles?",
                Language.ES to "¿Qué mirada cómplice entre nosotras desata un ataque de risa imparable?",
                Language.PT to "Qual olhar cúmplice entre nós é suficiente para disparar uma crise de riso?",
                Language.DE to "Welcher Blick zwischen uns reicht aus für einen unkontrollierbaren Lachanfall?",
                Language.ZH to "我们之间哪一个默契的小眼神，就能立刻引爆止不住的爆笑？",
                Language.AR to "أي نظرة عفوية بيننا تكفي لإطلاق نوبة ضحك هيستيرية لا نستطيع كتمانها؟"
            )
        )
        10 -> Question(
            id = id, mode = GameMode.BEST_FRIENDS_F, difficulty = difficulty, theme = "Matin ou Soir",
            text = mapOf(
                Language.FR to "Suis-je plutôt une lève-tôt pleine d'énergie ou une couche-tard invétérée ?",
                Language.EN to "Am I an early bird full of energy or an unapologetic night owl?",
                Language.ES to "¿Soy de madrugar con energía o de trasnochar hasta las mil?",
                Language.PT to "Sou do tipo que acorda cedo com energia ou sou uma coruja noturna assumida?",
                Language.DE to "Bin ich ein energiegeladener Frühaufsteher oder eine echte Nachteule?",
                Language.ZH to "我是清晨活力满满的早起星人，还是无可救药的熬夜夜猫子？",
                Language.AR to "هل أنا شخصية صباحية مفعمة بالنشاط أم بومة ليلية تعشق السهر؟"
            )
        )
        else -> {
            val themes = listOf("Qualités", "Soutien", "Secrets", "Conseils", "Moments forts", "Photos souvenirs", "Rêves futurs", "Anecdotes", "Loyauté", "Générosité")
            val theme = themes[(index - 11) % themes.size]
            val fr = when ((index - 11) % 10) {
                0 -> "Quelle est la qualité chez moi que tu admire le plus dans notre amitié ?"
                1 -> "Quelle est ma réaction habituelle quand je reçois une super bonne nouvelle ?"
                2 -> "Quel est le secret ou la confidence dont tu es l'une des rares personnes au monde à être au courant ?"
                3 -> "Si je devais résumer notre complicité en une couleur ou un emoji, lequel choisirais-je ?"
                4 -> "Quelle photo ou vidéo dossier de nous deux est la plus drôle dans ta galerie ?"
                5 -> "Quand j'ai un chagrin ou une déception, qu'est-ce qui m'aide le plus à sécher mes larmes ?"
                6 -> "Quel projet ou rêve fou avons-nous juré de réaliser ensemble un jour ?"
                7 -> "Quelle est ma plus grande force de caractère face aux difficultés de la vie ?"
                8 -> "Quelle est ma manie la plus mignonne ou attachante selon toi ?"
                else -> "Dans 20 ans, comment nous imagines-tu toutes les deux lors de nos retrouvailles ?"
            }
            val en = when ((index - 11) % 10) {
                0 -> "Which of my qualities do you admire most in our friendship?"
                1 -> "What is my typical reaction when I receive incredible news?"
                2 -> "What deep secret or confidence are you one of the only people in the world to know?"
                3 -> "If I had to summarize our friendship with an emoji or color, what would it be?"
                4 -> "Which memorable photo or video in your gallery captures our funniest moment?"
                5 -> "When I'm heartbroken or disappointed, what best helps comfort me?"
                6 -> "What wild dream or promise have we sworn to accomplish together one day?"
                7 -> "What is my greatest inner strength when facing life's hardships?"
                8 -> "What is my cutest or most endearing little quirk in your eyes?"
                else -> "In 20 years, how do you picture the two of us catching up?"
            }
            val es = when ((index - 11) % 10) {
                0 -> "¿Qué cualidad mía admiras más en nuestra amistad?"
                1 -> "¿Cuál es mi reacción habitual cuando recibo una gran noticia?"
                2 -> "¿Qué secreto o confidencia eres de las pocas personas en el mundo que conoce?"
                3 -> "¿Si tuviera que resumir nuestra complicidad en un emoji o color, cuál sería?"
                4 -> "¿Qué foto o vídeo de las dos en tu móvil es el más divertido de recordar?"
                5 -> "¿Cuando estoy decepcionada o triste, qué es lo que más me consuela?"
                6 -> "¿Qué sueño loco o promesa juramos cumplir juntas algún día?"
                7 -> "¿Cuál es mi mayor fortaleza cuando las cosas se ponen difíciles?"
                8 -> "¿Cuál es mi manía más dulce o entrañable según tú?"
                else -> "¿Dentro de 20 años, cómo imaginas nuestro reencuentro de amigas?"
            }
            val pt = when ((index - 11) % 10) {
                0 -> "Qual qualidade minha você mais admira na nossa amizade?"
                1 -> "Qual é a minha reação típica quando recebo uma notícia maravilhosa?"
                2 -> "Qual segredo ou desabafo você é uma das poucas pessoas no mundo a saber?"
                3 -> "Se eu resumisse nossa cumplicidade em uma cor ou emoji, qual seria?"
                4 -> "Qual foto ou vídeo nosso na sua galeria é o mais hilário de todos?"
                5 -> "Quando estou chateada ou triste, o que mais me ajuda a sorrir de novo?"
                6 -> "Qual sonho ou promessa juramos realizar juntas um dia?"
                7 -> "Qual é a minha maior força interior diante das dificuldades?"
                8 -> "Qual é a minha mania mais fofa ou cativante na sua opinião?"
                else -> "Daqui a 20 anos, como você imagina nosso encontro com café e risadas?"
            }
            val de = when ((index - 11) % 10) {
                0 -> "Welche Eigenschaft an mir schätzt du in unserer Freundschaft am meisten?"
                1 -> "Wie reagiere ich typischerweise, wenn ich eine fantastische Nachricht erhalte?"
                2 -> "Welches Geheimnis oder welchen Herzenswunsch von mir weißt du exklusiv?"
                3 -> "Mit welchem Emoji oder welcher Farbe würde ich unsere Freundschaft beschreiben?"
                4 -> "Welches gemeinsame Foto in deiner Galerie zeigt unseren witzigsten Moment?"
                5 -> "Was tröstet mich am meisten, wenn ich traurig oder enttäuscht bin?"
                6 -> "Welchen Traum haben wir uns geschworen, eines Tages gemeinsam wahr zu machen?"
                7 -> "Was ist meine größte innere Stärke in schwierigen Zeiten?"
                8 -> "Welche Eigenart von mir findest du besonders liebenswert?"
                else -> "Wie stellst du dir unser Wiedersehen in 20 Jahren vor?"
            }
            val zh = when ((index - 11) % 10) {
                0 -> "在我们真挚的闺蜜情中，你最欣赏我的哪一项品质？"
                1 -> "当我收到超级爆炸的好消息时，我通常会有怎样的夸张反应？"
                2 -> "哪一个私密心事或秘密，全世界只有极少数几个人知道，而你就是其中之一？"
                3 -> "如果用一个颜色或Emoji表情来形容我们的默契，会是什么？"
                4 -> "你相册里关于我们俩的哪张照片或视频，是最搞笑有意思的珍贵回忆？"
                5 -> "当我伤心难过时，什么样的安慰最能帮我拭去泪水、重拾笑容？"
                6 -> "我们曾经立下誓言、一定要携手完成的疯狂梦想是什么？"
                7 -> "在面对生活挫折和困难时，我身上最大的内在韧性是什么？"
                8 -> "在你眼中，我最可爱或最让人感到温暖的小习惯是什么？"
                else -> "20年以后，当我们再次聚在一起畅聊往事时，会是怎样一番美好的场景？"
            }
            val ar = when ((index - 11) % 10) {
                0 -> "ما هي صفتي الشخصية التي تعجبك وتقدرينها أكثر في صداقتنا؟"
                1 -> "ما هي ردة فعلي العفوية عندما أتلقى خبراً رائعاً ومفرحاً؟"
                2 -> "ما هو السر العميق الذي تعدين من بين قلائل في العالم يعرفونه عني؟"
                3 -> "لو اختصرت تفاهمنا وصداقتنا في رمز تعبيري (إيموجي) أو لون، فماذا سيكون؟"
                4 -> "أي صورة أو فيديو يجمعنا في هاتفك يعتبر الأطرف والأجمل ذكريات؟"
                5 -> "عندما أشعر بالحزن، ما هو الشيء الذي يواسيني بصدق ويمسح دموعي؟"
                6 -> "ما هو الحلم الجميل أو الوعد الذي تعاهدنا على تحقيقه معاً يوماً ما؟"
                7 -> "ما هي نقطة قوتي وعزيمتي الأبرز في مواجهة صعوبات الحياة؟"
                8 -> "ما هي العادة اللطيفة أو الطريفة التي تجدينها محببة في تصرفاتي؟"
                else -> "بعد عشرين عاماً، كيف تتخيلين لقاءنا وحديثنا الدافئ معاً؟"
            }
            Question(
                id = id,
                mode = GameMode.BEST_FRIENDS_F,
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

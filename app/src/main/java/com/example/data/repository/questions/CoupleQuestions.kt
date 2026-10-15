package com.example.data.repository.questions

import com.example.data.model.Difficulty
import com.example.data.model.GameMode
import com.example.data.model.Language
import com.example.data.model.Question

val coupleQuestions: List<Question> = listOf(
    // 1 - 10 (Easy / Goûts & Préférences)
    Question(
        id = "cpl_01",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EASY,
        theme = "Goûts culinaires",
        text = mapOf(
            Language.FR to "Quel est mon plat ou aliment préféré ?",
            Language.EN to "What is my favorite dish or comfort food?",
            Language.ES to "¿Cuál es mi comida o plato preferido?",
            Language.PT to "Qual é o meu prato ou comida favorita?",
            Language.DE to "Was ist mein Lieblingsgericht?",
            Language.ZH to "我最喜欢的食物或菜肴是什么？",
            Language.AR to "ما هي وجبتي أو طعامي المفضل؟"
        ),
        suggestedAnswers = mapOf(
            Language.FR to listOf("Pizza", "Pâtes", "Sushi", "Burger", "Chocolat"),
            Language.EN to listOf("Pizza", "Pasta", "Sushi", "Burger", "Chocolate"),
            Language.ES to listOf("Pizza", "Pasta", "Sushi", "Hamburguesa", "Chocolate"),
            Language.PT to listOf("Pizza", "Massa", "Sushi", "Hambúrguer", "Chocolate"),
            Language.DE to listOf("Pizza", "Pasta", "Sushi", "Burger", "Schokolade"),
            Language.ZH to listOf("披萨", "意面", "寿司", "汉堡", "巧克力"),
            Language.AR to listOf("بيتزا", "معكرونة", "سوشي", "برغر", "شوكولاتة")
        )
    ),
    Question(
        id = "cpl_02",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EASY,
        theme = "Loisirs & Détente",
        text = mapOf(
            Language.FR to "Quel genre de soirée me détend le plus avec toi ?",
            Language.EN to "What kind of evening relaxes me most with you?",
            Language.ES to "¿Qué tipo de noche me relaja más contigo?",
            Language.PT to "Que tipo de noite mais me relaxa com você?",
            Language.DE to "Welche Art von Abend entspannt mich am meisten mit dir?",
            Language.ZH to "跟你在一起时，什么样的夜晚最让我放松？",
            Language.AR to "أي نوع من السهرات يرخيني ويسعدني معك أكثر؟"
        ),
        suggestedAnswers = mapOf(
            Language.FR to listOf("Film & plaid", "Resto romantique", "Balade nocturne", "Cuisiner ensemble"),
            Language.EN to listOf("Movie night", "Romantic dinner", "Night walk", "Cooking together"),
            Language.ES to listOf("Peli y manta", "Cena romántica", "Paseo nocturno", "Cocinar juntos"),
            Language.PT to listOf("Filme no sofá", "Jantar romântico", "Caminhada noturna", "Cozinhar juntos"),
            Language.DE to listOf("Filmabend", "Romantisches Essen", "Nachtspaziergang", "Gemeinsam kochen"),
            Language.ZH to listOf("窝在沙发看电影", "浪漫烛光晚餐", "散步夜聊", "一起做饭"),
            Language.AR to listOf("فيلم في المنزل", "عشاء رومانسي", "نزهة ليلية", "الطبخ معاً")
        )
    ),
    Question(
        id = "cpl_03",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EASY,
        theme = "Boissons & Douceurs",
        text = mapOf(
            Language.FR to "Quelle est ma boisson préférée au réveil ou en journée ?",
            Language.EN to "What is my go-to drink in the morning or throughout the day?",
            Language.ES to "¿Cuál es mi bebida favorita al despertar o durante el día?",
            Language.PT to "Qual é a minha bebida favorita pela manhã ou durante o dia?",
            Language.DE to "Was ist mein Lieblingsgetränk am Morgen oder tagsüber?",
            Language.ZH to "我早上起床或平时最爱喝什么饮料？",
            Language.AR to "ما هو مشروبي المفضل عند الاستيقاظ أو طوال اليوم؟"
        ),
        suggestedAnswers = mapOf(
            Language.FR to listOf("Café noir", "Café au lait", "Thé vert", "Chocolat chaud", "Jus frais"),
            Language.EN to listOf("Black coffee", "Latte", "Green tea", "Hot cocoa", "Fresh juice"),
            Language.ES to listOf("Café solo", "Café con leche", "Té verde", "Chocolate", "Zumo fresco"),
            Language.PT to listOf("Café puro", "Café com leite", "Chá verde", "Chocolate quente", "Suco fresco"),
            Language.DE to listOf("Schwarzer Kaffee", "Cappuccino", "Grüner Tee", "Heiße Schokolade", "Frischer Saft"),
            Language.ZH to listOf("美式黑咖啡", "拿铁/奶咖", "绿茶", "热可可", "鲜榨果汁"),
            Language.AR to listOf("قهوة سوداء", "قهوة بالحليب", "شاي أخضر", "شوكولاتة ساخنة", "عصير طازج")
        )
    ),
    Question(
        id = "cpl_04",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EASY,
        theme = "Couleurs & Styles",
        text = mapOf(
            Language.FR to "Quelle est la couleur de vêtement qui me va le mieux selon moi ?",
            Language.EN to "What color of clothing do I think suits me best?",
            Language.ES to "¿Qué color de ropa creo que me queda mejor?",
            Language.PT to "Que cor de roupa eu acho que me veste melhor?",
            Language.DE to "Welche Kleidungsfarbe steht mir meiner Meinung nach am besten?",
            Language.ZH to "我觉得自己穿什么颜色的衣服最好看？",
            Language.AR to "ما هو لون الملابس الذي أعتقد أنه يناسبني أكثر؟"
        )
    ),
    Question(
        id = "cpl_05",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EASY,
        theme = "Musique & Ambiance",
        text = mapOf(
            Language.FR to "Quel style musical m'apaise ou me met de bonne humeur en voiture ?",
            Language.EN to "What music genre calms me down or boosts my mood in the car?",
            Language.ES to "¿Qué género de música me alegra o relaja en el coche?",
            Language.PT to "Que estilo musical me anima ou relaxa no carro?",
            Language.DE to "Welche Musikrichtung beruhigt oder begeistert mich im Auto?",
            Language.ZH to "在车上时，哪种音乐最能让我开心或放松？",
            Language.AR to "أي نوع من الموسيقى يسعدني أو يهدئني أثناء القيادة؟"
        )
    ),
    Question(
        id = "cpl_06",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EASY,
        theme = "Vacances & Évasion",
        text = mapOf(
            Language.FR to "Suis-je plutôt vacances à la mer, à la montagne ou en ville ?",
            Language.EN to "Am I more of a beach, mountain, or city trip person?",
            Language.ES to "¿Prefiero vacaciones en la playa, en la montaña o en la ciudad?",
            Language.PT to "Eu prefiro férias na praia, na montanha ou na cidade?",
            Language.DE to "Mag ich Urlaub lieber am Meer, in den Bergen oder in der Stadt?",
            Language.ZH to "度假时，我更喜欢去海滩、山区还是探索城市？",
            Language.AR to "هل أفضل عطلة على شاطئ البحر، في الجبال أم استكشاف المدن؟"
        ),
        suggestedAnswers = mapOf(
            Language.FR to listOf("Plage et soleil", "Montagne et nature", "Grande ville dynamique"),
            Language.EN to listOf("Sunny beach", "Mountains & nature", "Vibrant city"),
            Language.ES to listOf("Playa y sol", "Montaña y naturaleza", "Ciudad vibrante"),
            Language.PT to listOf("Praia e sol", "Montanha e natureza", "Cidade vibrante"),
            Language.DE to listOf("Strand & Sonne", "Berge & Natur", "Großstadt"),
            Language.ZH to listOf("阳光沙滩海岛", "山林与自然", "繁华都市探索"),
            Language.AR to listOf("الشاطئ والشمس", "الجبال والطبيعة", "المدن الصاخبة")
        )
    ),
    Question(
        id = "cpl_07",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EASY,
        theme = "Habitudes matinales",
        text = mapOf(
            Language.FR to "Combien de réveils ou alarmes me faut-il pour sortir du lit ?",
            Language.EN to "How many alarms do I need to actually get out of bed?",
            Language.ES to "¿Cuántas alarmas necesito para levantarme de la cama?",
            Language.PT to "De quantos alarmes eu preciso para realmente sair da cama?",
            Language.DE to "Wie viele Wecker brauche ich, um wirklich aufzustehen?",
            Language.ZH to "我需要定几个闹钟才能真正起床？",
            Language.AR to "كم منبهاً أحتاج لأستيقظ فعلياً من السرير؟"
        )
    ),
    Question(
        id = "cpl_08",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EASY,
        theme = "Petites attentions",
        text = mapOf(
            Language.FR to "Quelle petite attention spontanée me fait fondre à coup sûr ?",
            Language.EN to "What spontaneous gesture instantly melts my heart?",
            Language.ES to "¿Qué detalle espontáneo me derrite el corazón sin falta?",
            Language.PT to "Qual gesto espontâneo sempre derrete o meu coração?",
            Language.DE to "Welche spontane kleine Aufmerksamkeit lässt mein Herz schmelzen?",
            Language.ZH to "什么样的自发小举动总能瞬间打动我的心？",
            Language.AR to "ما هي المبادرة اللطيفة العفوية التي تذيب قلبي دائماً؟"
        )
    ),
    Question(
        id = "cpl_09",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EASY,
        theme = "Cadeaux",
        text = mapOf(
            Language.FR to "Pour mon anniversaire, est-ce que je préfère un cadeau matériel ou une expérience vécue ?",
            Language.EN to "For my birthday, do I prefer a material gift or an experience?",
            Language.ES to "¿Para mi cumple prefiero un regalo material o una experiencia?",
            Language.PT to "No meu aniversário, prefiro um presente material ou uma experiência?",
            Language.DE to "Bevorzuge ich zum Geburtstag ein Geschenk oder ein Erlebnis?",
            Language.ZH to "生日时，我更喜欢收到实体礼物还是难忘的体验经历？",
            Language.AR to "في عيد ميلادي، هل أفضل هدية مادية أم تجربة ورحلة جميلة؟"
        )
    ),
    Question(
        id = "cpl_10",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EASY,
        theme = "Série & Cinéma",
        text = mapOf(
            Language.FR to "Quel film ou série pourrais-je regarder encore et encore avec toi ?",
            Language.EN to "What movie or TV series could I rewatch over and over with you?",
            Language.ES to "¿Qué película o serie podría ver una y otra vez contigo?",
            Language.PT to "Qual filme ou série eu assistiria de novo e de novo com você?",
            Language.DE to "Welchen Film oder welche Serie könnte ich immer wieder mit dir schauen?",
            Language.ZH to "哪部电影或剧集我可以陪你刷了一遍又一遍？",
            Language.AR to "ما هو الفيلم أو المسلسل الذي يمكنني مشاهدته مراراً وتكراراً معك؟"
        )
    ),

    // 11 - 25 (Medium / Sentiments & Habitudes)
    Question(
        id = "cpl_11",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.MEDIUM,
        theme = "Premier regard",
        text = mapOf(
            Language.FR to "Quelle a été ma toute première impression quand on s'est rencontrés ?",
            Language.EN to "What was my very first impression when we first met?",
            Language.ES to "¿Cuál fue mi primera impresión cuando nos conocimos?",
            Language.PT to "Qual foi minha primeira impressão quando nos conhecemos?",
            Language.DE to "Was war mein allererster Eindruck, als wir uns kennenlernten?",
            Language.ZH to "我们初次相遇时，我对你的第一印象是什么？",
            Language.AR to "ما هو أول انطباع أخذته عنك عندما التقينا لأول مرة؟"
        )
    ),
    Question(
        id = "cpl_12",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.MEDIUM,
        theme = "Stress & Réconfort",
        text = mapOf(
            Language.FR to "Quand je suis stressé(e) ou inquiet(e), de quoi ai-je le plus besoin ?",
            Language.EN to "When I am stressed or worried, what do I need most?",
            Language.ES to "¿Cuando estoy estresado/a o preocupado/a, qué necesito más?",
            Language.PT to "Quando estou estressado(a) ou ansioso(a), do que mais preciso?",
            Language.DE to "Wenn ich gestresst bin, was brauche ich dann am meisten?",
            Language.ZH to "当我感到压力或焦虑时，我最需要什么安慰？",
            Language.AR to "عندما أكون متوتراً أو قلقاً، ما الذي أحتاجه أكثر من أي شيء؟"
        ),
        suggestedAnswers = mapOf(
            Language.FR to listOf("Un gros câlin", "Qu'on m'écoute parler", "Du calme et du silence", "M'aérer dehors"),
            Language.EN to listOf("A warm hug", "A listening ear", "Quiet time alone", "A fresh walk"),
            Language.ES to listOf("Un abrazo fuerte", "Que me escuchen", "Paz y silencio", "Salir a pasear"),
            Language.PT to listOf("Um abraço apertado", "Alguém para me ouvir", "Silêncio e espaço", "Passear ao ar livre"),
            Language.DE to listOf("Eine feste Umarmung", "Zuhören", "Ruhe für mich", "Frische Luft"),
            Language.ZH to listOf("一个温暖的拥抱", "耐心倾听我的诉说", "让我安静待一会儿", "出去透透气"),
            Language.AR to listOf("عناق دافئ", "الاستماع لي باهتمام", "الهدوء وبعض العزلة", "الخروج لنزهة قصيرة")
        )
    ),
    Question(
        id = "cpl_13",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.MEDIUM,
        theme = "Humeur",
        text = mapOf(
            Language.FR to "Qu'est-ce qui a le don de m'énerver ou de me mettre de mauvaise humeur ?",
            Language.EN to "What is guaranteed to tick me off or put me in a bad mood?",
            Language.ES to "¿Qué cosa tiene la capacidad de ponerme de mal humor al instante?",
            Language.PT to "O que é batata para me irritar ou me deixar de mau humor?",
            Language.DE to "Was bringt mich garantiert auf die Palme oder verdirbt meine Laune?",
            Language.ZH to "什么事情最容易让我瞬间炸毛或心情变糟？",
            Language.AR to "ما الشيء الكفيل بتعكير مزاجي أو إثارة غضبي فوراً؟"
        )
    ),
    Question(
        id = "cpl_14",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.MEDIUM,
        theme = "Qualités",
        text = mapOf(
            Language.FR to "Quelle est la qualité chez toi dont je suis le plus fier ou reconnaissant ?",
            Language.EN to "Which of your qualities am I most proud of or grateful for?",
            Language.ES to "¿De cuál de tus cualidades estoy más orgulloso/a o agradecido/a?",
            Language.PT to "De qual das suas qualidades eu tenho mais orgulho ou gratidão?",
            Language.DE to "Auf welche deiner Eigenschaften bin ich am stolzesten oder dankbarsten?",
            Language.ZH to "身上哪项优点最让我感到自豪或心怀感激？",
            Language.AR to "ما هي صفتك التي أنا فخور بها أو ممتن لوجودها أكثر من غيرها؟"
        )
    ),
    Question(
        id = "cpl_15",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.MEDIUM,
        theme = "Souvenirs communs",
        text = mapOf(
            Language.FR to "Quel fou rire partagé ensemble me revient le plus souvent en mémoire ?",
            Language.EN to "Which shared moment of laughter do I reminisce about most often?",
            Language.ES to "¿Qué ataque de risa juntos recuerdo con más frecuencia?",
            Language.PT to "Qual momento de crise de riso juntos eu mais lembro com carinho?",
            Language.DE to "An welchen gemeinsamen Lachanfall denke ich am liebsten zurück?",
            Language.ZH to "我们俩最搞笑的一起大笑的瞬间是哪一次？",
            Language.AR to "ما هي نوبة الضحك المشتركة بيننا التي لا تفارق ذاكرتي؟"
        )
    ),
    Question(
        id = "cpl_16",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.MEDIUM,
        theme = "Rêves de voyage",
        text = mapOf(
            Language.FR to "Quelle est LA destination de voyage dont je te parle le plus pour nous deux ?",
            Language.EN to "What is THE dream travel destination I talk about most for the two of us?",
            Language.ES to "¿Cuál es EL destino de viaje del que más te hablo para los dos?",
            Language.PT to "Qual é O destino de viagem que eu mais comento para nós dois?",
            Language.DE to "Von welchem Reiseziel für uns beide schwärme ich am meisten?",
            Language.ZH to "我常跟你念叨、最想同你一起去的梦想旅行地是哪里？",
            Language.AR to "ما هي الوجهة السياحية الحلم التي أتحدث عنها معك دائماً لنسافر معاً؟"
        )
    ),
    Question(
        id = "cpl_17",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.MEDIUM,
        theme = "Rôles au quotidien",
        text = mapOf(
            Language.FR to "Quelle tâche ménagère est-ce que je déteste le plus faire ?",
            Language.EN to "Which household chore do I dislike doing the most?",
            Language.ES to "¿Qué tarea del hogar es la que más detesto hacer?",
            Language.PT to "Qual tarefa doméstica eu mais odeio fazer?",
            Language.DE to "Welche Hausarbeit mag ich am allerwenigsten?",
            Language.ZH to "日常家务中，我最讨厌做哪一项？",
            Language.AR to "ما هي الأعمال المنزلية التي أكره القيام بها أكثر من غيرها؟"
        ),
        suggestedAnswers = mapOf(
            Language.FR to listOf("La vaisselle", "Le repassage", "Passer l'aspirateur", "Sortir les poubelles", "Plier le linge"),
            Language.EN to listOf("Washing dishes", "Ironing", "Vacuuming", "Taking out trash", "Folding laundry"),
            Language.ES to listOf("Lavar los platos", "Planchar", "Aspirar", "Bajar la basura", "Doblar la ropa"),
            Language.PT to listOf("Lavar a louça", "Passar roupa", "Aspirar a casa", "Tirar o lixo", "Dobrar roupas"),
            Language.DE to listOf("Geschirr spülen", "Bügeln", "Staubsaugen", "Müll rausbringen", "Wäsche falten"),
            Language.ZH to listOf("洗碗", "熨烫衣服", "吸尘拖地", "倒垃圾", "折叠衣物"),
            Language.AR to listOf("غسيل الأطباق", "كي الملابس", "كنس البيت", "رمي القمامة", "طي الملابس")
        )
    ),
    Question(
        id = "cpl_18",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.MEDIUM,
        theme = "Achats & Dépenses",
        text = mapOf(
            Language.FR to "Sur quoi ai-je le plus tendance à craquer et dépenser de l'argent sans compter ?",
            Language.EN to "What am I most tempted to splurge on without counting?",
            Language.ES to "¿En qué suelo gastar o darme caprichos sin pensarlo dos veces?",
            Language.PT to "Com o que eu mais tendo a gastar dinheiro sem pensar duas vezes?",
            Language.DE to "Wofür gebe ich am ehesten schwach werdend Geld aus?",
            Language.ZH to "我最容易在哪方面忍不住冲动消费或犒劳自己？",
            Language.AR to "ما هو الشيء الذي أنفق عليه المال دون تردد أو حساب؟"
        )
    ),
    Question(
        id = "cpl_19",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.MEDIUM,
        theme = "Gestes d'affection",
        text = mapOf(
            Language.FR to "Quel est mon langage de l'amour prédominant selon moi ?",
            Language.EN to "What do I consider my primary love language?",
            Language.ES to "¿Cuál considero que es mi lenguaje de amor predominante?",
            Language.PT to "Qual considero ser minha linguagem do amor predominante?",
            Language.DE to "Was ist meiner Meinung nach meine primäre Liebessprache?",
            Language.ZH to "我认为自己主要的‘爱的语言’是什么？",
            Language.AR to "ما هي لغة الحب الأساسية بالنسبة لي في نظري؟"
        ),
        suggestedAnswers = mapOf(
            Language.FR to listOf("Mots d'encouragement", "Moments de qualité", "Cadeaux attentionnés", "Services rendus", "Toucher physique"),
            Language.EN to listOf("Words of affirmation", "Quality time", "Receiving gifts", "Acts of service", "Physical touch"),
            Language.ES to listOf("Palabras de afirmación", "Tiempo de calidad", "Regalos con detalle", "Actos de servicio", "Contacto físico"),
            Language.PT to listOf("Palavras de afirmação", "Tempo de qualidade", "Presentes", "Atos de serviço", "Toque físico"),
            Language.DE to listOf("Lob und Anerkennung", "Zweisamkeit", "Geschenke", "Hilfsbereitschaft", "Zärtlichkeit"),
            Language.ZH to listOf("肯定的言语", "高质量陪伴", "精心准备的礼物", "贴心的服务行动", "肢体接触与拥抱"),
            Language.AR to listOf("كلمات التقدير والتشجيع", "قضاء وقت مميز", "الهدايا المعبرة", "تقديم المساعدة", "التلامس والعناق")
        )
    ),
    Question(
        id = "cpl_20",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.MEDIUM,
        theme = "Jalousie & Confiance",
        text = mapOf(
            Language.FR to "Sur une échelle de 1 à 10, à quel point suis-je jaloux / jalouse en réalité ?",
            Language.EN to "On a scale from 1 to 10, how jealous am I in reality?",
            Language.ES to "Del 1 al 10, ¿qué tan celoso/a soy en realidad?",
            Language.PT to "De 1 a 10, o quão ciumento(a) eu sou de verdade?",
            Language.DE to "Auf einer Skala von 1 bis 10: Wie eifersüchtig bin ich wirklich?",
            Language.ZH to "按1到10分打分，在现实中我的真实吃醋嫉妒程度是几分？",
            Language.AR to "على مقياس من 1 إلى 10، ما مدى غيرتي في الحقيقة؟"
        )
    ),
    Question(
        id = "cpl_21",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.MEDIUM,
        theme = "Débats de couple",
        text = mapOf(
            Language.FR to "Quand on a un petit désaccord, qui vient faire le premier pas pour se réconcilier ?",
            Language.EN to "When we have a small disagreement, who usually makes the first move to make up?",
            Language.ES to "¿Cuando tenemos un desacuerdo, quién suele dar el primer paso para reconciliarse?",
            Language.PT to "Quando temos um desentendimento, quem costuma dar o primeiro passo para fazer as pazes?",
            Language.DE to "Wer von uns macht nach einem Streit meist den ersten Schritt zur Versöhnung?",
            Language.ZH to "当我们产生小矛盾时，通常是谁先主动开口和好？",
            Language.AR to "عندما يقع خلاف بيننا، من يبادر أولاً بطلب الصلح؟"
        )
    ),
    Question(
        id = "cpl_22",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.MEDIUM,
        theme = "Rendez-vous idéal",
        text = mapOf(
            Language.FR to "Si je pouvais planifier notre prochain rendez-vous idéal en toute liberté, que ferions-nous ?",
            Language.EN to "If I had total freedom to plan our next dream date, what would we do?",
            Language.ES to "¿Si pudiera planear nuestra próxima cita ideal sin límites, qué haríamos?",
            Language.PT to "Se eu pudesse planejar nosso próximo encontro perfeito, o que faríamos?",
            Language.DE to "Wenn ich unser nächstes Traumdate frei planen könnte, was würden wir tun?",
            Language.ZH to "如果让我完全自由策划下一次完美的约会，我们会做什么？",
            Language.AR to "لو كان بإمكاني التخطيط لموعدنا القادم بحرية تامة، ماذا سنفعل؟"
        )
    ),
    Question(
        id = "cpl_23",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.MEDIUM,
        theme = "Surnoms",
        text = mapOf(
            Language.FR to "Quel est le surnom affectueux que je préfère te donner en privé ?",
            Language.EN to "What pet name or sweet nickname do I like calling you most in private?",
            Language.ES to "¿Cuál es el apodo cariñoso que más me gusta decirte en privado?",
            Language.PT to "Qual apelido carinhoso eu mais gosto de usar com você na intimidade?",
            Language.DE to "Welchen Kosenamen gebe ich dir privat am liebsten?",
            Language.ZH to "私底下我最喜欢怎么亲昵地称呼你？",
            Language.AR to "ما هو اسم التدليل أو اللقب اللطيف الذي أفضل مناداتك به في الخلوة؟"
        )
    ),
    Question(
        id = "cpl_24",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.MEDIUM,
        theme = "Confiance & Secrets",
        text = mapOf(
            Language.FR to "Suis-je plutôt du genre à tout te raconter immédiatement ou à garder pour moi d'abord ?",
            Language.EN to "Am I more likely to tell you everything immediately or process it alone first?",
            Language.ES to "¿Suelo contártelo todo inmediatamente o procesarlo a solas primero?",
            Language.PT to "Costumo te contar tudo na mesma hora ou processo as coisas sozinho(a) primeiro?",
            Language.DE to "Erzähle ich dir alles sofort oder verarbeite ich Dinge erst allein?",
            Language.ZH to "遇到事情时，我是立刻全盘跟你说，还是先自己消化吸收？",
            Language.AR to "هل أخبرك بكل شيء على الفور أم أفضل التفكير فيه لوحدي أولاً؟"
        )
    ),
    Question(
        id = "cpl_25",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.MEDIUM,
        theme = "Fierté amoureuse",
        text = mapOf(
            Language.FR to "Quel accomplissement personnel ou professionnel récent m'a rendu(e) le plus fier / fière ?",
            Language.EN to "Which recent personal or professional achievement made me feel most proud?",
            Language.ES to "¿Qué logro personal o profesional reciente me hizo sentir más orgulloso/a?",
            Language.PT to "Qual conquista pessoal ou profissional recente me deixou mais orgulhoso(a)?",
            Language.DE to "Welcher persönliche oder berufliche Erfolg hat mich zuletzt besonders stolz gemacht?",
            Language.ZH to "我最近取得的哪项个人或工作成就最让我自豪？",
            Language.AR to "ما هو الإنجاز الشخصي أو المهني الأخير الذي جعلني أشعر بأكبر قدر من الفخر؟"
        )
    ),

    // 26 - 50 (Expert / Rêves profonds, Projets d'avenir & Intimité)
    Question(
        id = "cpl_26",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Avenir commun",
        text = mapOf(
            Language.FR to "Quel est mon plus grand rêve ou projet pour notre couple dans les 5 prochaines années ?",
            Language.EN to "What is my biggest dream or project for our relationship over the next 5 years?",
            Language.ES to "¿Cuál es mi mayor sueño o proyecto para nosotros en los próximos 5 años?",
            Language.PT to "Qual é o meu maior sonho ou projeto para nós dois nos próximos 5 anos?",
            Language.DE to "Was ist mein größter Traum oder mein wichtigstes Projekt für uns in den nächsten 5 Jahren?",
            Language.ZH to "对于我们俩未来五年的生活，我最大的梦想或规划是什么？",
            Language.AR to "ما هو أكبر حلم أو مشروع أتمناه لعلاقتنا خلال السنوات الخمس القادمة؟"
        )
    ),
    Question(
        id = "cpl_27",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Peurs secrètes",
        text = mapOf(
            Language.FR to "Quelle est ma plus grande vulnérabilité ou crainte profonde dans la vie ?",
            Language.EN to "What is my deepest vulnerability or fear in life?",
            Language.ES to "¿Cuál es mi mayor vulnerabilidad o miedo profundo en la vida?",
            Language.PT to "Qual é a minha maior vulnerabilidade ou medo mais profundo na vida?",
            Language.DE to "Was ist meine größte Verwundbarkeit oder tiefste Angst im Leben?",
            Language.ZH to "在内心深处，我最大的软肋或恐惧是什么？",
            Language.AR to "ما هي نقطة ضعفي الكبرى أو خوفي الأعمق في هذه الحياة؟"
        )
    ),
    Question(
        id = "cpl_28",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Moments fondateurs",
        text = mapOf(
            Language.FR to "À quel moment exact ai-je su que j'étais profondément amoureux / amoureuse de toi ?",
            Language.EN to "At what exact moment did I realize I was deeply in love with you?",
            Language.ES to "¿En qué momento exacto me di cuenta de que estaba enamorado/a de ti?",
            Language.PT to "Em que momento exato eu soube que estava completamente apaixonado(a) por você?",
            Language.DE to "In welchem Moment wurde mir klar, dass ich mich Hals über Kopf in dich verliebt hatte?",
            Language.ZH to "是在哪一个具体的时刻，我突然意识到自己深深地爱上了你？",
            Language.AR to "في أي لحظة بالتحديد أدركت أنني واقع في حبك بعمق؟"
        )
    ),
    Question(
        id = "cpl_29",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Évolution personnelle",
        text = mapOf(
            Language.FR to "En quoi notre relation m'a-t-elle le plus transformé(e) ou fait grandir ?",
            Language.EN to "In what way has our relationship transformed me or helped me grow the most?",
            Language.ES to "¿En qué aspecto me ha transformado o hecho crecer más nuestra relación?",
            Language.PT to "De que maneira o nosso relacionamento mais me transformou ou me fez crescer?",
            Language.DE to "Inwiefern hat unsere Beziehung mich am meisten verändert oder wachsen lassen?",
            Language.ZH to "我们之间的感情在哪一方面对我的改变最大、让我收获了最多的成长？",
            Language.AR to "بأي طريقة أثرت علاقتنا بي وساعدتني على النضج والتطور أكثر؟"
        )
    ),
    Question(
        id = "cpl_30",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Logement de rêve",
        text = mapOf(
            Language.FR to "Si nous devions concevoir notre maison de rêve idéale, quel détail serait indispensable pour moi ?",
            Language.EN to "If we were designing our dream home, what specific feature would be non-negotiable for me?",
            Language.ES to "¿Si diseñáramos nuestra casa ideal, qué detalle sería imprescindible para mí?",
            Language.PT to "Se fôssemos planejar nossa casa ideal, qual detalhe seria indispensável para mim?",
            Language.DE to "Wenn wir unser Traumhaus planen würden, welches Detail wäre für mich unverzichtbar?",
            Language.ZH to "如果我们一起打造梦想中的家，对我来说哪一个设计细节是必不可少的？",
            Language.AR to "إذا صممنا منزل أحلامنا معاً، ما هو التفصيل الذي لا يمكنني الاستغناء عنه؟"
        )
    ),
    Question(
        id = "cpl_31",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Enfance & Racines",
        text = mapOf(
            Language.FR to "Quel souvenir d'enfance ou tradition familiale me tient le plus à cœur ?",
            Language.EN to "Which childhood memory or family tradition is dearest to my heart?",
            Language.ES to "¿Qué recuerdo de la infancia o tradición familiar valoro más en mi corazón?",
            Language.PT to "Qual lembrança de infância ou tradição de família é mais preciosa para mim?",
            Language.DE to "Welche Kindheitserinnerung oder Familientradition liegt mir besonders am Herzen?",
            Language.ZH to "哪段童年记忆或家庭传统在我心中最为珍贵？",
            Language.AR to "أي ذكرى من طفولتي أو تقليد عائلي يحتل المكانة الأغلى في قلبي؟"
        )
    ),
    Question(
        id = "cpl_32",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Pardon & Tolérance",
        text = mapOf(
            Language.FR to "Quelle petite maladresse de ta part me fait sourire plutôt que de me fâcher ?",
            Language.EN to "Which little clumsy habit of yours makes me smile rather than get upset?",
            Language.ES to "¿Qué pequeña torpeza tuya me hace sonreír en vez de enfadarme?",
            Language.PT to "Qual pequeno desajeito seu me faz sorrir em vez de me irritar?",
            Language.DE to "Welche kleine Ungeschicklichkeit von dir bringt mich eher zum Lächeln als zum Ärgern?",
            Language.ZH to "你的哪一个笨拙的小习惯不但不会让我生气，反而会让我会心一笑？",
            Language.AR to "أي تصرف عفوي أو ارتباك بسيط يصدر منك يضحكني بدلاً من أن يغضبني؟"
        )
    ),
    Question(
        id = "cpl_33",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Complicité secrète",
        text = mapOf(
            Language.FR to "Quel regard ou mot de code entre nous suffit à nous faire comprendre instantanément en public ?",
            Language.EN to "What inside code word or shared glance allows us to instantly communicate in public?",
            Language.ES to "¿Qué mirada o palabra en clave entre nosotros nos hace entendernos al instante en público?",
            Language.PT to "Que olhar ou palavra de código entre nós nos faz entender tudo na hora em público?",
            Language.DE to "Welcher Blick oder Code unter uns reicht aus, damit wir uns öffentlich sofort verstehen?",
            Language.ZH to "在公众场合，我们彼此之间哪种眼神或暗号能让我们瞬间心领神会？",
            Language.AR to "ما هي النظرة أو الكلمة السرية التي تجعلنا نتفاهم في العلن بلمح البصر؟"
        )
    ),
    Question(
        id = "cpl_34",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Livre & Pensée",
        text = mapOf(
            Language.FR to "Quel livre, citation ou idée philosophique a profondément marqué ma vision du monde ?",
            Language.EN to "Which book, quote, or philosophy has profoundly shaped my worldview?",
            Language.ES to "¿Qué libro, frase o idea filosófica ha marcado más mi visión del mundo?",
            Language.PT to "Qual livro, frase ou filosofia de vida mais marcou minha visão de mundo?",
            Language.DE to "Welches Buch, Zitat oder Lebensmotto hat mein Weltbild am tiefsten geprägt?",
            Language.ZH to "哪本书、名言或哲学思想最深远地塑造了我看待世界的方式？",
            Language.AR to "أي كتاب أو مقولة أو حكمة أثرت بعمق في نظرتي للحياة والعالم؟"
        )
    ),
    Question(
        id = "cpl_35",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Activité à deux",
        text = mapOf(
            Language.FR to "Quelle nouvelle passion ou compétence aimerais-je qu'on apprenne ensemble à deux ?",
            Language.EN to "What new hobby or skill would I love for the two of us to learn together?",
            Language.ES to "¿Qué nueva afición o habilidad me encantaría que aprendiéramos juntos?",
            Language.PT to "Qual novo hobby ou habilidade eu adoraria que aprendêssemos juntos?",
            Language.DE to "Welches neue Hobby oder welche Fertigkeit würde ich gerne zu zweit mit dir lernen?",
            Language.ZH to "我最希望我们两个人一起尝试去学习的全新爱好或技能是什么？",
            Language.AR to "ما هي المهارة أو الهواية الجديدة التي أتمنى لو نتعلمها سوياً؟"
        )
    ),
    Question(
        id = "cpl_36",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Date mémorable",
        text = mapOf(
            Language.FR to "Quel a été selon moi le rendez-vous le plus magique que nous ayons partagé jusqu'ici ?",
            Language.EN to "In my opinion, what was the most magical date we've shared so far?",
            Language.ES to "¿En mi opinión, cuál ha sido la cita más mágica que hemos tenido hasta ahora?",
            Language.PT to "Na minha opinião, qual foi o encontro mais mágico que já tivemos até hoje?",
            Language.DE to "Was war meiner Meinung nach das magischste Date, das wir bisher hatten?",
            Language.ZH to "在我心中，截至目前我们俩度过的最奇妙浪漫的一次约会是哪一次？",
            Language.AR to "في نظري، ما هو الموعد الأكثر سحراً وجمالاً الذي قضيناه معاً حتى الآن؟"
        )
    ),
    Question(
        id = "cpl_37",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Compliment chéri",
        text = mapOf(
            Language.FR to "Quel compliment venant de toi me touche plus que n'importe quel autre ?",
            Language.EN to "Which compliment from you touches my heart more than anything else?",
            Language.ES to "¿Qué cumplido de tu parte me emociona más que ningún otro?",
            Language.PT to "Qual elogio vindo de você me toca mais fundo do que qualquer outro?",
            Language.DE to "Welches Kompliment von dir berührt mich mehr als jedes andere?",
            Language.ZH to "来自你的哪一句赞美，最能深深击中我的内心？",
            Language.AR to "ما هي الكلمة الطيبة أو الإطراء الصادر منك الذي يلامس مشاعري أكثر من أي شيء؟"
        )
    ),
    Question(
        id = "cpl_38",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Week-end surprise",
        text = mapOf(
            Language.FR to "Si tu devais m'organiser un week-end surprise, quel type de décor me comblerait ?",
            Language.EN to "If you planned a surprise weekend for me, what setting would delight me most?",
            Language.ES to "¿Si me prepararas un fin de semana sorpresa, qué lugar me fascinaría?",
            Language.PT to "Se você fosse me preparar um fim de semana surpresa, que cenário me encantaria?",
            Language.DE to "Wenn du ein Überraschungswochenende für mich planst, welche Kulisse würde mich begeistern?",
            Language.ZH to "如果你为我准备一个周末惊喜旅行，哪种环境最能让我喜出望外？",
            Language.AR to "لو أعددت لي عطلة نهاية أسبوع مفاجئة، أي بيئة وأجواء ستجعلني في قمة سعادتي؟"
        )
    ),
    Question(
        id = "cpl_39",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Valeurs de vie",
        text = mapOf(
            Language.FR to "Quelle valeur morale est la plus essentielle pour moi dans la construction d'un foyer ?",
            Language.EN to "Which moral value is most essential to me when building a future home?",
            Language.ES to "¿Qué valor ético considero más indispensable para construir un hogar?",
            Language.PT to "Qual valor moral é o mais essencial para mim na construção de um lar?",
            Language.DE to "Welcher moralische Wert ist mir beim Aufbau eines Zuhauses am wichtigsten?",
            Language.ZH to "在共同组建家庭方面，我认为最不可或缺的核心道德价值观是什么？",
            Language.AR to "ما هي القيمة الأخلاقية الأساسية بالنسبة لي عند بناء عش الزوجية والبيت؟"
        )
    ),
    Question(
        id = "cpl_40",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Refuge émotionnel",
        text = mapOf(
            Language.FR to "Quand le monde extérieur devient lourd, quel est mon plus grand réconfort auprès de toi ?",
            Language.EN to "When the outside world feels heavy, what is my greatest comfort with you?",
            Language.ES to "¿Cuando el mundo exterior se vuelve pesado, cuál es mi mayor consuelo a tu lado?",
            Language.PT to "Quando a vida lá fora fica pesada, qual é meu maior refúgio junto de você?",
            Language.DE to "Wenn die Welt draußen anstrengend wird, was schenkt mir bei dir den größten Trost?",
            Language.ZH to "当外界生活让人疲惫不堪时，你在身边的什么举动能给我最大的慰藉？",
            Language.AR to "عندما تصبح الحياة قاسية، ما هو أكبر ملاذ وأمان أشعر به بجانبك؟"
        )
    ),
    Question(
        id = "cpl_41",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Animal de compagnie",
        text = mapOf(
            Language.FR to "Quel animal de compagnie rêvé aimerais-je accueillir avec toi ?",
            Language.EN to "What dream pet would I love to welcome into our lives?",
            Language.ES to "¿Qué mascota soñada me encantaría tener contigo?",
            Language.PT to "Que animal de estimação dos sonhos eu gostaria de ter com você?",
            Language.DE to "Welches Traum-Haustier würde ich am liebsten mit dir aufnehmen?",
            Language.ZH to "我最希望和你一起抚养什么宠物？",
            Language.AR to "ما هو الحيوان الأليف الحلم الذي أتمنى أن نربيه معاً؟"
        )
    ),
    Question(
        id = "cpl_42",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Chanson de nous",
        text = mapOf(
            Language.FR to "Quelle musique ou chanson associe-je instantanément à notre histoire d'amour ?",
            Language.EN to "Which song or melody do I instantly associate with our love story?",
            Language.ES to "¿Qué canción o melodía asocio de inmediato con nuestra historia de amor?",
            Language.PT to "Qual música ou melodia eu associo imediatamente à nossa história de amor?",
            Language.DE to "Welches Lied verbinde ich sofort mit unserer Liebesgeschichte?",
            Language.ZH to "哪一首歌或旋律，会让我立刻联想到我们俩的爱情故事？",
            Language.AR to "ما هي الأغنية التي ترتبط تلقائياً في بالي بقصة حبنا؟"
        )
    ),
    Question(
        id = "cpl_43",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Tenue préférée",
        text = mapOf(
            Language.FR to "Quelle est la tenue que tu portes qui me fait systématiquement craquer ?",
            Language.EN to "Which outfit of yours consistently makes my jaw drop?",
            Language.ES to "¿Qué conjunto tuyo de ropa me vuelve loco/a sin excepción?",
            Language.PT to "Qual roupa sua sempre me deixa de queixo caído?",
            Language.DE to "In welchem Outfit gefällst du mir ausnahmslos jedes Mal besonders gut?",
            Language.ZH to "你穿哪一套衣服时，总是能让我眼前一亮、心动不已？",
            Language.AR to "ما هو الزي أو الملابس التي ترتديها وتأسر قلبي في كل مرة دون استثناء؟"
        )
    ),
    Question(
        id = "cpl_44",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Saison préférée",
        text = mapOf(
            Language.FR to "Quelle est ma saison de l'année préférée pour les moments en couple ?",
            Language.EN to "What is my favorite season of the year for couple moments?",
            Language.ES to "¿Cuál es mi estación del año favorita para pasar momentos en pareja?",
            Language.PT to "Qual é a minha estação do ano favorita para curtir a dois?",
            Language.DE to "Was ist meine liebste Jahreszeit für gemeinsame Momente zu zweit?",
            Language.ZH to "度过二人世界时，我最喜欢一年当中的哪一个季节？",
            Language.AR to "ما هو فصلي المفضل من فصول السنة لقضاء أوقات رومانسية معاً؟"
        )
    ),
    Question(
        id = "cpl_45",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Habitude attendrissante",
        text = mapOf(
            Language.FR to "Quelle manie ou petite habitude rigolote ai-je quand je dors ou m'endors ?",
            Language.EN to "What funny or endearing quirk do I have when falling asleep or sleeping?",
            Language.ES to "¿Qué manía curiosa o tierna tengo al dormir o al acostarme?",
            Language.PT to "Qual mania engraçada ou fofa eu tenho ao pegar no sono ou dormir?",
            Language.DE to "Welche süße oder lustige Angewohnheit habe ich beim Einschlafen oder Schlafen?",
            Language.ZH to "我入睡或熟睡时，有什么可爱又搞笑的习惯动作？",
            Language.AR to "ما هي العادة الغريبة أو اللطيفة التي أفعلها عند النوم أو الاستغراق فيه؟"
        )
    ),
    Question(
        id = "cpl_46",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Surprise réussie",
        text = mapOf(
            Language.FR to "Quelle surprise que tu m'as faite m'a le plus sincèrement ému(e) ?",
            Language.EN to "Which surprise you pulled off genuinely moved me the most?",
            Language.ES to "¿Qué sorpresa que me diste me conmovió más profundamente?",
            Language.PT to "Qual surpresa que você me fez mais me tocou o coração de verdade?",
            Language.DE to "Welche Überraschung von dir hat mich am meisten berührt?",
            Language.ZH to "你曾为我做过的哪一次惊喜，最真实地感动了我的心？",
            Language.AR to "ما هي المفاجأة التي أعددتها لي وكانت الأكثر تأثيراً في مشاعري بصدق؟"
        )
    ),
    Question(
        id = "cpl_47",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Météo et câlins",
        text = mapOf(
            Language.FR to "Préfères-je un jour de pluie sous la couette ou une journée ensoleillée au grand air ?",
            Language.EN to "Do I prefer a rainy day cozy in bed or a bright sunny day outdoors?",
            Language.ES to "¿Prefiero un día lluvioso acurrucados en la cama o un día soleado al aire libre?",
            Language.PT to "Prefiro um dia chuvoso debaixo do cobertor ou um dia ensolarado ao ar livre?",
            Language.DE to "Liebe ich einen Regentag eingekuschelt im Bett oder sonniges Wetter draußen?",
            Language.ZH to "我更喜欢雨天窝在被窝里相拥，还是晴空万里在户外散步？",
            Language.AR to "هل أفضل يوماً ممطراً دافئاً تحت الغطاء أم يوماً مشرقاً في الهواء الطلق؟"
        )
    ),
    Question(
        id = "cpl_48",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Inspiration mutuelle",
        text = mapOf(
            Language.FR to "En quoi m'inspires-tu le plus pour devenir une meilleure personne au quotidien ?",
            Language.EN to "How do you inspire me most to become a better person every day?",
            Language.ES to "¿De qué manera me inspiras más para ser mejor persona a diario?",
            Language.PT to "Como você mais me inspira a ser alguém melhor a cada dia?",
            Language.DE to "Wie inspirierst du mich am meisten, jeden Tag ein besserer Mensch zu werden?",
            Language.ZH to "你在哪一方面最能激励我每天努力成为一个更好的人？",
            Language.AR to "كيف تلهمني في كل يوم لأكون إنساناً أفضل وأكثر نضجاً؟"
        )
    ),
    Question(
        id = "cpl_49",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "Vieillir ensemble",
        text = mapOf(
            Language.FR to "Comment m'imagines-je avec toi quand nous aurons les cheveux blancs ?",
            Language.EN to "How do I picture us when we both have gray hair?",
            Language.ES to "¿Cómo nos imagino juntos cuando tengamos el pelo blanco?",
            Language.PT to "Como imagino nós dois juntos quando estivermos com cabelos brancos?",
            Language.DE to "Wie stelle ich uns vor, wenn wir beide graue Haare haben?",
            Language.ZH to "当我畅想我们俩白发苍苍的时候，画面中我们在做什么？",
            Language.AR to "كيف أتخيل حياتنا معاً عندما يكسو الشيب رؤوسنا؟"
        )
    ),
    Question(
        id = "cpl_50",
        mode = GameMode.COUPLE,
        difficulty = Difficulty.EXPERT,
        theme = "L'essence de l'amour",
        text = mapOf(
            Language.FR to "Si je devais résumer ce que tu représentes pour moi en un seul mot, quel serait-il ?",
            Language.EN to "If I had to describe what you mean to me in a single word, what would it be?",
            Language.ES to "¿Si tuviera que resumir lo que significas para mí en una sola palabra, cuál sería?",
            Language.PT to "Se eu tivesse que resumir o que você significa para mim em uma única palavra, qual seria?",
            Language.DE to "Wenn ich zusammenfassen müsste, was du mir bedeutest, in einem Wort: Welches wäre es?",
            Language.ZH to "如果用一个词来概括你在我生命中的意义，会是哪个词？",
            Language.AR to "لو كان عليّ تلخيص ما تعنيه لي بكلمة واحدة فقط، فماذا ستكون؟"
        )
    )
)

package com.example.data.repository.questions

import com.example.data.model.Difficulty
import com.example.data.model.GameMode
import com.example.data.model.Language
import com.example.data.model.Question

val schoolQuestions: List<Question> = (1..50).map { index ->
    val id = "sch_%02d".format(index)
    val difficulty = when {
        index <= 15 -> Difficulty.EASY
        index <= 35 -> Difficulty.MEDIUM
        else -> Difficulty.EXPERT
    }
    when (index) {
        1 -> Question(
            id = id, mode = GameMode.SCHOOL, difficulty = difficulty, theme = "Matière préférée",
            text = mapOf(
                Language.FR to "Quelle est ma matière ou discipline préférée en cours ?",
                Language.EN to "What is my favorite subject or class at school/university?",
                Language.ES to "¿Cuál es mi asignatura o clase favorita en los estudios?",
                Language.PT to "Qual é a minha matéria ou disciplina favorita nos estudos?",
                Language.DE to "Was ist mein Lieblingsfach in der Schule oder Uni?",
                Language.ZH to "在学校或大学里，我最喜欢的学科或课程是什么？",
                Language.AR to "ما هي مادتي الدراسية المفضلة في المدرسة أو الجامعة؟"
            ),
            suggestedAnswers = mapOf(
                Language.FR to listOf("Mathématiques", "Histoire-Géo", "Langues", "Sciences/SVT", "Sport/EPS", "Arts/Musique"),
                Language.EN to listOf("Math", "History", "Languages", "Science", "P.E. / Sports", "Art / Music"),
                Language.ES to listOf("Matemáticas", "Historia", "Idiomas", "Ciencias", "Educación Física", "Arte / Música"),
                Language.PT to listOf("Matemática", "História", "Idiomas", "Ciências/Biologia", "Educação Física", "Artes"),
                Language.DE to listOf("Mathematik", "Geschichte", "Sprachen", "Naturwissenschaften", "Sport", "Kunst / Musik"),
                Language.ZH to listOf("数学", "历史/地理", "外语", "科学/物理/化学", "体育", "美术/音乐"),
                Language.AR to listOf("الرياضيات", "التاريخ والجغرافيا", "اللغات", "العلوم والأحياء", "التربية الرياضية", "الفنون والموسيقى")
            )
        )
        2 -> Question(
            id = id, mode = GameMode.SCHOOL, difficulty = difficulty, theme = "Bête noire",
            text = mapOf(
                Language.FR to "Quelle matière me demande le plus d'efforts ou me stresse le plus ?",
                Language.EN to "Which subject requires the most effort or stresses me out the most?",
                Language.ES to "¿Qué asignatura me cuesta más trabajo o me estresa más?",
                Language.PT to "Qual matéria me exige mais esforço ou me dá mais dor de cabeça?",
                Language.DE to "Welches Fach fällt mir am schwersten oder stresst mich am meisten?",
                Language.ZH to "哪门课程让我最头疼、需要付出最多努力或者考试压力最大？",
                Language.AR to "ما هي المادة التي تتطلب مني أكبر جهد أو تسبب لي توتراً؟"
            )
        )
        3 -> Question(
            id = id, mode = GameMode.SCHOOL, difficulty = difficulty, theme = "Emplacement en classe",
            text = mapOf(
                Language.FR to "Où préfères-je m'asseoir en classe ou en amphi ?",
                Language.EN to "Where do I prefer to sit in the classroom or lecture hall?",
                Language.ES to "¿Dónde prefiero sentarme en clase o en el aula?",
                Language.PT to "Onde eu prefiro sentar na sala de aula?",
                Language.DE to "Wo sitze ich im Klassenzimmer oder Hörsaal am liebsten?",
                Language.ZH to "在教室或阶梯大课教室里，我最喜欢坐在什么位置？",
                Language.AR to "أين أفضل الجلوس في قاعة الفصل أو المدرج الدراسي؟"
            ),
            suggestedAnswers = mapOf(
                Language.FR to listOf("Au premier rang bien concentré", "Au milieu pour être tranquille", "Tout au fond près du radiateur/fenêtre"),
                Language.EN to listOf("Front row focused", "In the middle", "Back row by the window"),
                Language.ES to listOf("En primera fila atento", "En el medio tranquilo", "Al fondo junto a la ventana"),
                Language.PT to listOf("Na primeira fila focado", "No meio da sala", "Lá no fundão na janela"),
                Language.DE to listOf("Ganz vorne konzentriert", "In der Mitte", "Ganz hinten am Fenster"),
                Language.ZH to listOf("前排认真听讲", "中间不引人注目", "靠窗后排宝座"),
                Language.AR to listOf("في الصف الأول بتركيز", "في الوسط بهدوء", "في الخلف بجانب النافذة")
            )
        )
        4 -> Question(
            id = id, mode = GameMode.SCHOOL, difficulty = difficulty, theme = "Révisions & Devoirs",
            text = mapOf(
                Language.FR to "Comment gères-je mes révisions : très en avance ou la veille à minuit ?",
                Language.EN to "How do I study for exams: well in advance or cramming at midnight before?",
                Language.ES to "¿Cómo estudio para los exámenes: con días de antelación o la noche anterior?",
                Language.PT to "Como estudo para as provas: com bastante antecedência ou de véspera na madrugada?",
                Language.DE to "Wie lerne ich auf Prüfungen: Wochen im Voraus oder am Vorabend um Mitternacht?",
                Language.ZH to "面对期末考试，我是按部就班提前复习，还是考前通宵临时抱佛脚？",
                Language.AR to "كيف أستعد للامتحانات: قبل وقت كافٍ بتخطيط، أم ليلة الامتحان في اللحظات الأخيرة؟"
            )
        )
        5 -> Question(
            id = id, mode = GameMode.SCHOOL, difficulty = difficulty, theme = "Travail en groupe",
            text = mapOf(
                Language.FR to "Suis-je plutôt travail individuel en solitaire ou projets en équipe ?",
                Language.EN to "Am I more of a solo worker or an enthusiastic team project person?",
                Language.ES to "¿Prefiero trabajar en solitario o en proyectos de grupo?",
                Language.PT to "Prefiro estudar e fazer trabalhos sozinho(a) ou em grupo?",
                Language.DE to "Lerne und arbeite ich lieber allein oder in Gruppenprojekten?",
                Language.ZH to "在完成学业作业时，我是喜欢单打独斗还是团队小组协作？",
                Language.AR to "هل أفضل العمل والمذاكرة بشكل فردي أم في مشاريع ومجموعات جماعية؟"
            )
        )
        6 -> Question(
            id = id, mode = GameMode.SCHOOL, difficulty = difficulty, theme = "Métier de rêve",
            text = mapOf(
                Language.FR to "Quel métier ou domaine d'activité rêvais-je de faire quand j'étais plus jeune ?",
                Language.EN to "What career or dream job did I want to pursue when I was younger?",
                Language.ES to "¿Qué profesión soñaba con tener cuando era más pequeño/a?",
                Language.PT to "Qual profissão dos sonhos eu queria ter quando era mais novo(a)?",
                Language.DE to "Welchen Traumberuf wollte ich als Kind oder Jugendlicher ergreifen?",
                Language.ZH to "小时候我梦想长大了做哪种职业或进入什么行业？",
                Language.AR to "ما هي مهنة الأحلام التي كنت أتمنى ممارستها عندما كنت أصغر سناً؟"
            )
        )
        7 -> Question(
            id = id, mode = GameMode.SCHOOL, difficulty = difficulty, theme = "Pause de midi",
            text = mapOf(
                Language.FR to "Quel est mon moment préféré de la journée scolaire ou étudiante ?",
                Language.EN to "What is my absolute favorite part of the school or campus day?",
                Language.ES to "¿Cuál es mi momento favorito de la jornada escolar o universitaria?",
                Language.PT to "Qual é o meu momento favorito do dia na escola ou faculdade?",
                Language.DE to "Was ist mein absoluter Lieblingsmoment an einem Uni- oder Schultag?",
                Language.ZH to "在校园生活的一整天中，哪一个时段是我最期待开心的？",
                Language.AR to "ما هي اللحظة الأكثر متعة وفرحاً بالنسبة لي خلال اليوم الدراسي؟"
            ),
            suggestedAnswers = mapOf(
                Language.FR to listOf("La pause déjeuner avec les amis", "La fin des cours", "La récréation", "Un cours passionnant"),
                Language.EN to listOf("Lunch break with friends", "End of classes bell", "Recess", "A great lecture"),
                Language.ES to listOf("La hora de comer con amigos", "La salida al terminar", "El recreo", "Una clase interesante"),
                Language.PT to listOf("O almoço e intervalo com a turma", "O sinal da saída", "O recreio", "Uma aula incrível"),
                Language.DE to listOf("Mittagspause mit Freunden", "Schulschluss", "Große Pause", "Eine spannende Vorlesung"),
                Language.ZH to listOf("和朋友一起午餐干饭", "放学下课铃声响起", "课间休息聊天", "听到一节精彩的课"),
                Language.AR to listOf("استراحة الغداء مع الأصدقاء", "انتهاء الدوام والعودة", "فترة الاستراحة القصيرة", "حصة دراسية ممتعة")
            )
        )
        8 -> Question(
            id = id, mode = GameMode.SCHOOL, difficulty = difficulty, theme = "Fournitures & Organisation",
            text = mapOf(
                Language.FR to "Mon sac et mes cours sont-ils super bien rangés ou c'est le chaos artistique ?",
                Language.EN to "Are my backpack and class notes neat and tidy or total organized chaos?",
                Language.ES to "¿Mi mochila y mis apuntes son súper ordenados o un caos artístico?",
                Language.PT to "Minha mochila e anotações são impecavelmente organizadas ou puro caos?",
                Language.DE to "Sind meine Tasche und Unterlagen top geordnet oder herrscht buntes Chaos?",
                Language.ZH to "我的书包和课堂笔记是井井有条，还是随心所欲的‘艺术性混乱’？",
                Language.AR to "هل حقيبتي ودفاتري الدراسية منظمة بدقة فائقة أم أنها في فوضى عارمة؟"
            )
        )
        9 -> Question(
            id = id, mode = GameMode.SCHOOL, difficulty = difficulty, theme = "Type de prof",
            text = mapOf(
                Language.FR to "Quel type d'enseignant ou professeur m'inspire le plus ?",
                Language.EN to "What kind of teacher or professor inspires me the most?",
                Language.ES to "¿Qué tipo de profesor/a me inspira o enseña mejor según yo?",
                Language.PT to "Que tipo de professor(a) mais me inspira a aprender?",
                Language.DE to "Welche Art von Lehrer oder Dozent inspiriert mich am meisten?",
                Language.ZH to "什么风格的老师或教授最能激发我的学习热情？",
                Language.AR to "أي نوع من الأساتذة أو المعلمين يلهمني ويجعلني أحب التعلم أكثر؟"
            )
        )
        10 -> Question(
            id = id, mode = GameMode.SCHOOL, difficulty = difficulty, theme = "Motivation",
            text = mapOf(
                Language.FR to "Quelle est ma principale motivation pour réussir mes études ?",
                Language.EN to "What is my primary motivation for succeeding in my studies?",
                Language.ES to "¿Cuál es mi mayor motivación para salir adelante en mis estudios?",
                Language.PT to "Qual é a minha maior motivação para ter sucesso nos estudos?",
                Language.DE to "Was ist meine größte Motivation, meine Ausbildung oder mein Studium erfolgreich abzuschließen?",
                Language.ZH to "激励我努力读书、在学业上取得优异成绩的最大动力是什么？",
                Language.AR to "ما هو حافزي ودافعي الأكبر للنجاح والتفوق في دراستي؟"
            )
        )
        else -> {
            val themes = listOf("Projets d'avenir", "Examens", "Bavardages", "Anecdotes de cours", "Activités extrascolaires", "Conseils d'orientation", "Travaux pratiques", "Souvenirs de rentrée", "Objectifs", "Ambiance de classe")
            val theme = themes[(index - 11) % themes.size]
            val fr = when ((index - 11) % 10) {
                0 -> "Si je pouvais changer une seule règle dans notre établissement, laquelle choisirais-je ?"
                1 -> "Qui de nous deux écoute le plus attentivement pendant les cours théoriques ?"
                2 -> "Quel est le projet ou l'exposé dont le résultat m'a rendu le plus fier en classe ?"
                3 -> "Quel objet scolaire (stylo fétiche, surligneur, carnet) ne me quitte jamais ?"
                4 -> "Comment réagis-je typiquement quand je reçois une excellente note inattendue ?"
                5 -> "Quel événement scolaire (voyage, spectacle, fête de fin d'année) m'a le plus marqué ?"
                6 -> "Dans quel pays étranger rêverais-je de faire un semestre d'échange ou un stage ?"
                7 -> "Suis-je plutôt du genre à prendre la parole spontanément en classe ou à rester discret ?"
                8 -> "Quelle compétence concrète acquise en cours me sera la plus utile pour mon futur métier ?"
                else -> "Où me vois-je professionnellement dans 10 ans après la fin de nos études ?"
            }
            val en = when ((index - 11) % 10) {
                0 -> "If I could rewrite one single school or campus rule, which one would it be?"
                1 -> "Who between us pays the closest attention during long theoretical lectures?"
                2 -> "Which school presentation or project made me feel proudest of the outcome?"
                3 -> "Which stationery item (favorite pen, highlighter, notebook) is always with me?"
                4 -> "How do I typically react when receiving an unexpected top grade on an exam?"
                5 -> "Which campus event (field trip, sports day, graduation festival) was most memorable to me?"
                6 -> "In which country would I love to study abroad for a semester or internship?"
                7 -> "Am I prone to raising my hand and speaking up or do I prefer keeping quiet in class?"
                8 -> "What practical skill learned during classes will serve me most in my future career?"
                else -> "Where do I see myself professionally 10 years after completing our studies?"
            }
            val es = when ((index - 11) % 10) {
                0 -> "¿Si pudiera cambiar una sola norma del centro de estudios, cuál cambiaría?"
                1 -> "¿Quién de los dos presta más atención en las clases teóricas?"
                2 -> "¿De qué exposición o trabajo de clase me sentí más satisfecho/a?"
                3 -> "¿Qué material escolar (boli favorito, libreta) llevo siempre encima?"
                4 -> "¿Cómo reacciono al sacar una nota excelente que no me esperaba?"
                5 -> "¿Qué evento escolar (viaje de fin de curso, festival) recuerdo con más cariño?"
                6 -> "¿En qué país soñaría con hacer un intercambio o prácticas universitarias?"
                7 -> "¿Suelo participar y levantar la mano en clase o prefiero la discreción?"
                8 -> "¿Qué habilidad práctica aprendida en clase me servirá más en mi futuro trabajo?"
                else -> "¿Dónde me veo profesionalmente dentro de 10 años al terminar los estudios?"
            }
            val pt = when ((index - 11) % 10) {
                0 -> "Se eu pudesse mudar uma única regra da escola ou faculdade, qual seria?"
                1 -> "Quem de nós dois presta mais atenção nas aulas teóricas mais longas?"
                2 -> "De qual trabalho em grupo ou apresentação eu mais me orgulhei do resultado?"
                3 -> "Qual item de papelaria (caneta favorita, marca-texto) nunca sai da minha mochila?"
                4 -> "Como costumo reagir ao tirar uma nota máxima surpreendente em uma prova?"
                5 -> "Qual evento escolar (viagem da turma, formatura) mais me marcou?"
                6 -> "Em qual país eu adoraria fazer um intercâmbio de estudos ou estágio?"
                7 -> "Costumo levantar a mão e participar ou prefiro ficar na minha durante a aula?"
                8 -> "Qual habilidade prática das aulas será a mais útil para minha carreira futura?"
                else -> "Onde me vejo trabalhando daqui a 10 anos após concluir os estudos?"
            }
            val de = when ((index - 11) % 10) {
                0 -> "Wenn ich eine einzige Schul- oder Uni-Regel ändern könnte, welche wäre das?"
                1 -> "Wer von uns beiden passt in langen Theorie-Vorlesungen aufmerksamer auf?"
                2 -> "Auf welches Schulprojekt oder welchen Vortrag war ich besonders stolz?"
                3 -> "Welches Schreibutensil (Lieblingsstift, Textmarker) habe ich immer dabei?"
                4 -> "Wie reagiere ich typischerweise auf eine unerwartete Top-Note in einer Prüfung?"
                5 -> "Welches Schul-Event (Klassenfahrt, Schulfest) ist mir am besten in Erinnerung geblieben?"
                6 -> "In welchem Land würde ich am liebsten ein Auslandssemester oder Praktikum machen?"
                7 -> "Melde ich mich gerne und spreche im Unterricht oder halte ich mich eher zurück?"
                8 -> "Welche praktische Fähigkeit aus dem Unterricht wird mir im Beruf am meisten nützen?"
                else -> "Wo sehe ich mich beruflich in 10 Jahren nach dem Abschluss?"
            }
            val zh = when ((index - 11) % 10) {
                0 -> "如果允许我修改学校里的一项校规或制度，我会修改哪一条？"
                1 -> "在上理论大课时，我们俩当中谁听讲最专注认真？"
                2 -> "哪一次课堂展示、演讲或课题项目让我对成果感到最自豪？"
                3 -> "哪件文具（最心仪的笔、荧光笔或笔记本）是我随身不可或缺的？"
                4 -> "当我考了一门意外的高分时，我通常会做出什么欣喜反应？"
                5 -> "哪次校园活动（毕业典礼、春游学农、校运会）给我留下了最美好的回忆？"
                6 -> "如果去海外交换留学或实习，我最向往去哪个国家？"
                7 -> "在课堂上，我是积极举手发言互动，还是更偏向安静低调？"
                8 -> "在课程中掌握的哪项实际能力，对我未来的职业生涯最有帮助？"
                else -> "毕业10年之后，我期望自己在职场或事业上处于什么状态？"
            }
            val ar = when ((index - 11) % 10) {
                0 -> "لو استطعت تغيير قانون أو لائحة واحدة في المؤسسة التعليمية، فماذا سأختار؟"
                1 -> "من منا أكثر تركيزاً وانتباهاً أثناء الحصص والمحاضرات النظرية الطويلة؟"
                2 -> "أي مشروع دراسي أو عرض تقديمي شعرت فيه بأكبر قدر من الفخر بإنجازه؟"
                3 -> "ما هي الأداة الدراسية (قلم مفضل، دفتر) التي لا تفارق حقيبتي أبداً؟"
                4 -> "كيف تكون ردة فعلي عندما أحصل على علامة ممتازة غير متوقعة في الامتحان؟"
                5 -> "أي مناسبة أو نشاط دراسي (رحلة مدرسية، حفل تخرج) ترك في قلبي أجمل أثر؟"
                6 -> "في أي بلد خارجي أحلم بقضاء فصل دراسي للتبادل الطلابي أو التدريب؟"
                7 -> "هل أحب المشاركة وطرح الأسئلة في الصف أم أفضل الهدوء والاستماع؟"
                8 -> "ما هي المهارة العملية التي تعلمتها في الدراسة وستفيدني أكثر في مستقبلي المهني؟"
                else -> "أين أرى نفسي على الصعيد المهني بعد 10 سنوات من إكمال دراستنا؟"
            }
            Question(
                id = id,
                mode = GameMode.SCHOOL,
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

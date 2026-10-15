package com.example.data.localization

import com.example.data.model.Language

object Translations {

    fun appTitle(lang: Language): String = when (lang) {
        Language.FR -> "TU ME CONNAIS VRAIMENT ? ❤️"
        Language.EN -> "DO YOU REALLY KNOW ME? ❤️"
        Language.ES -> "¿ME CONOCES DE VERDAD? ❤️"
        Language.PT -> "VOCÊ ME CONHECE MESMO? ❤️"
        Language.DE -> "KENNST DU MICH WIRKLICH? ❤️"
        Language.ZH -> "你真的了解我吗？ ❤️"
        Language.AR -> "هل تعرفني حقاً؟ ❤️"
    }

    fun appSlogan(lang: Language): String = when (lang) {
        Language.FR -> "Tu penses tout savoir sur moi ? Prouve-le !"
        Language.EN -> "Think you know everything about me? Prove it!"
        Language.ES -> "¿Crees que lo sabes todo sobre mí? ¡Demuéstralo!"
        Language.PT -> "Acha que sabe tudo sobre mim? Prove!"
        Language.DE -> "Glaubst du, du weißt alles über mich? Beweise es!"
        Language.ZH -> "你以为你很懂我？来证明看看！"
        Language.AR -> "تعتقد أنك تعرف كل شيء عني؟ أثبت ذلك!"
    }

    fun playNow(lang: Language): String = when (lang) {
        Language.FR -> "JOUER MAINTENANT"
        Language.EN -> "PLAY NOW"
        Language.ES -> "JUGAR AHORA"
        Language.PT -> "JOGAR AGORA"
        Language.DE -> "JETZT SPIELEN"
        Language.ZH -> "立即开始"
        Language.AR -> "العب الآن"
    }

    fun howToPlay(lang: Language): String = when (lang) {
        Language.FR -> "COMMENT JOUER ?"
        Language.EN -> "HOW TO PLAY?"
        Language.ES -> "¿CÓMO JUGAR?"
        Language.PT -> "COMO JOGAR?"
        Language.DE -> "WIE WIRD GESPIELT?"
        Language.ZH -> "游戏规则"
        Language.AR -> "كيفية اللعب؟"
    }

    fun selectModeTitle(lang: Language): String = when (lang) {
        Language.FR -> "Choisis ton mode de jeu"
        Language.EN -> "Choose your game mode"
        Language.ES -> "Elige tu modo de juego"
        Language.PT -> "Escolha seu modo de jogo"
        Language.DE -> "Wähle deinen Spielmodus"
        Language.ZH -> "选择游戏模式"
        Language.AR -> "اختر نمط اللعبة"
    }

    fun configTitle(lang: Language): String = when (lang) {
        Language.FR -> "Configuration de la partie"
        Language.EN -> "Game Setup"
        Language.ES -> "Configuración del juego"
        Language.PT -> "Configuração do jogo"
        Language.DE -> "Spiel-Konfiguration"
        Language.ZH -> "游戏设置"
        Language.AR -> "إعداد الجولة"
    }

    fun player1Label(lang: Language): String = when (lang) {
        Language.FR -> "Prénom du Joueur 1"
        Language.EN -> "Player 1 Name"
        Language.ES -> "Nombre del Jugador 1"
        Language.PT -> "Nome do Jogador 1"
        Language.DE -> "Name von Spieler 1"
        Language.ZH -> "玩家 1 名字"
        Language.AR -> "اسم اللاعب الأول"
    }

    fun player2Label(lang: Language): String = when (lang) {
        Language.FR -> "Prénom du Joueur 2"
        Language.EN -> "Player 2 Name"
        Language.ES -> "Nombre del Jugador 2"
        Language.PT -> "Nome do Jogador 2"
        Language.DE -> "Name von Spieler 2"
        Language.ZH -> "玩家 2 名字"
        Language.AR -> "اسم اللاعب الثاني"
    }

    fun difficultyTitle(lang: Language): String = when (lang) {
        Language.FR -> "Niveau de difficulté"
        Language.EN -> "Difficulty Level"
        Language.ES -> "Nivel de dificultad"
        Language.PT -> "Nível de dificuldade"
        Language.DE -> "Schwierigkeitsgrad"
        Language.ZH -> "难度等级"
        Language.AR -> "مستوى الصعوبة"
    }

    fun questionCountTitle(lang: Language): String = when (lang) {
        Language.FR -> "Nombre de questions"
        Language.EN -> "Number of Questions"
        Language.ES -> "Número de preguntas"
        Language.PT -> "Número de perguntas"
        Language.DE -> "Anzahl der Fragen"
        Language.ZH -> "题目数量"
        Language.AR -> "عدد الأسئلة"
    }

    fun shuffleOption(lang: Language): String = when (lang) {
        Language.FR -> "Mélanger les questions"
        Language.EN -> "Shuffle questions"
        Language.ES -> "Mezclar preguntas"
        Language.PT -> "Embaralhar perguntas"
        Language.DE -> "Fragen mischen"
        Language.ZH -> "随机打乱题目"
        Language.AR -> "خلط الأسئلة عشوائياً"
    }

    fun startGame(lang: Language): String = when (lang) {
        Language.FR -> "LANCER LA PARTIE 🚀"
        Language.EN -> "START GAME 🚀"
        Language.ES -> "EMPEZAR PARTIDA 🚀"
        Language.PT -> "INICIAR JOGO 🚀"
        Language.DE -> "SPIEL STARTEN 🚀"
        Language.ZH -> "开启挑战 🚀"
        Language.AR -> "ابدأ التحدي 🚀"
    }

    fun errorMissingNames(lang: Language): String = when (lang) {
        Language.FR -> "Veuillez renseigner les prénoms des deux joueurs pour continuer."
        Language.EN -> "Please enter both players' names to continue."
        Language.ES -> "Por favor, introduce los nombres de ambos jugadores para continuar."
        Language.PT -> "Por favor, informe o nome dos dois jogadores para continuar."
        Language.DE -> "Bitte gib die Namen beider Spieler ein, um fortzufahren."
        Language.ZH -> "请输入两位玩家的名字以继续游戏。"
        Language.AR -> "يرجى إدخال اسم كلا اللاعبين للمتابعة."
    }

    fun guesserTurnPrompt(guesser: String, subject: String, lang: Language): String = when (lang) {
        Language.FR -> "$guesser, réponds à une question sur $subject :"
        Language.EN -> "$guesser, answer a question about $subject:"
        Language.ES -> "$guesser, responde a una pregunta sobre $subject:"
        Language.PT -> "$guesser, responda a uma pergunta sobre $subject:"
        Language.DE -> "$guesser, beantworte eine Frage über $subject:"
        Language.ZH -> "$guesser，请回答关于 $subject 的问题："
        Language.AR -> "يا $guesser، أجب عن سؤال يخص $subject:"
    }

    fun typeOrChooseHint(lang: Language): String = when (lang) {
        Language.FR -> "Tape ta réponse ou choisis une suggestion rapide :"
        Language.EN -> "Type your answer or pick a quick suggestion:"
        Language.ES -> "Escribe tu respuesta o elige una sugerencia rápida:"
        Language.PT -> "Digite sua resposta ou escolha uma sugestão rápida:"
        Language.DE -> "Tippe deine Antwort oder wähle einen Vorschlag:"
        Language.ZH -> "输入你的回答，或选择快速提示："
        Language.AR -> "اكتب إجابتك أو اختر من الاقتراحات السريعة:"
    }

    fun answerInputPlaceholder(lang: Language): String = when (lang) {
        Language.FR -> "Écris ta réponse ici..."
        Language.EN -> "Write your answer here..."
        Language.ES -> "Escribe tu respuesta aquí..."
        Language.PT -> "Escreva sua resposta aqui..."
        Language.DE -> "Schreibe deine Antwort hier..."
        Language.ZH -> "在此输入你的答案..."
        Language.AR -> "اكتب إجابتك هنا..."
    }

    fun submitAnswer(lang: Language): String = when (lang) {
        Language.FR -> "VALIDER MA RÉPONSE"
        Language.EN -> "SUBMIT ANSWER"
        Language.ES -> "VALIDAR RESPUESTA"
        Language.PT -> "VALIDAR RESPOSTA"
        Language.DE -> "ANTWORT BESTÄTIGEN"
        Language.ZH -> "提交我的回答"
        Language.AR -> "تأكيد إجابتي"
    }

    fun skipQuestion(lang: Language): String = when (lang) {
        Language.FR -> "JE PRÉFÈRE PASSER"
        Language.EN -> "I PREFER TO SKIP"
        Language.ES -> "PREFIERO PASAR"
        Language.PT -> "PREFIRO PULAR"
        Language.DE -> "ICH PASSE LIEBER"
        Language.ZH -> "我想跳过本题"
        Language.AR -> "أفضل تخطي السؤال"
    }

    fun handoverTitle(subject: String, lang: Language): String = when (lang) {
        Language.FR -> "Passe le téléphone à $subject ! 📱"
        Language.EN -> "Pass the phone to $subject! 📱"
        Language.ES -> "¡Pasa el teléfono a $subject! 📱"
        Language.PT -> "Passe o celular para $subject! 📱"
        Language.DE -> "Gib das Handy an $subject! 📱"
        Language.ZH -> "把手机递给 $subject！ 📱"
        Language.AR -> "مرّر الهاتف إلى $subject! 📱"
    }

    fun handoverSubtitle(guesser: String, subject: String, lang: Language): String = when (lang) {
        Language.FR -> "Attention ! $guesser ne doit pas regarder. C'est à $subject de vérifier la réponse !"
        Language.EN -> "Attention! $guesser must not peek. It's time for $subject to verify the answer!"
        Language.ES -> "¡Atención! $guesser no debe mirar. ¡Es el turno de $subject para comprobar la respuesta!"
        Language.PT -> "Atenção! $guesser não deve espiar. É hora de $subject conferir a resposta!"
        Language.DE -> "Achtung! $guesser darf nicht schauen. Jetzt überprüft $subject die Antwort!"
        Language.ZH -> "注意！ $guesser 请不要偷看，现在轮到 $subject 来判定答案！"
        Language.AR -> "انتبه! لا تدع $guesser يرى الشاشة، الآن دور $subject ليتحقق من الإجابة!"
    }

    fun handoverButton(lang: Language): String = when (lang) {
        Language.FR -> "C'EST À MOI ! VÉRIFIER 👁️"
        Language.EN -> "I'M READY! VERIFY 👁️"
        Language.ES -> "¡ESTOY LISTO! COMPROBAR 👁️"
        Language.PT -> "É A MINHA VEZ! VERIFICAR 👁️"
        Language.DE -> "ICH BIN BEREIT! ÜBERPRÜFEN 👁️"
        Language.ZH -> "轮到我了！进行验证 👁️"
        Language.AR -> "أنا جاهز! التحقق 👁️"
    }

    fun validationHeader(subject: String, lang: Language): String = when (lang) {
        Language.FR -> "Étape de validation — $subject"
        Language.EN -> "Verification step — $subject"
        Language.ES -> "Paso de validación — $subject"
        Language.PT -> "Etapa de validação — $subject"
        Language.DE -> "Überprüfung — $subject"
        Language.ZH -> "验证环节 — $subject"
        Language.AR -> "مرحلة التحقق — $subject"
    }

    fun validationSaid(guesser: String, lang: Language): String = when (lang) {
        Language.FR -> "$guesser a répondu :"
        Language.EN -> "$guesser said:"
        Language.ES -> "$guesser ha respondido:"
        Language.PT -> "$guesser respondeu:"
        Language.DE -> "$guesser hat geantwortet:"
        Language.ZH -> "$guesser 的回答是："
        Language.AR -> "إجابة $guesser هي:"
    }

    fun validationQuestion(lang: Language): String = when (lang) {
        Language.FR -> "Est-ce la vérité ou la bonne réponse ?"
        Language.EN -> "Is this true or the correct answer?"
        Language.ES -> "¿Es verdad o la respuesta correcta?"
        Language.PT -> "Isso é verdade ou a resposta certa?"
        Language.DE -> "Ist das die Wahrheit oder die richtige Antwort?"
        Language.ZH -> "这是真实的或正确的答案吗？"
        Language.AR -> "هل هذه هي الإجابة الصحيحة أو الحقيقة؟"
    }

    fun validateCorrect(lang: Language): String = when (lang) {
        Language.FR -> "OUI, C'EST EXACT ! ✅"
        Language.EN -> "YES, THAT'S RIGHT! ✅"
        Language.ES -> "¡SÍ, ES EXACTO! ✅"
        Language.PT -> "SIM, ESTÁ CORRETO! ✅"
        Language.DE -> "JA, DAS STIMMT! ✅"
        Language.ZH -> "是的，完全正确！ ✅"
        Language.AR -> "نعم، هذا صحيح تماماً! ✅"
    }

    fun validateWrong(lang: Language): String = when (lang) {
        Language.FR -> "NON, CE N'EST PAS ÇA ! ❌"
        Language.EN -> "NO, THAT'S WRONG! ❌"
        Language.ES -> "¡NO, NO ES ESO! ❌"
        Language.PT -> "NÃO, NÃO É ISSO! ❌"
        Language.DE -> "NEIN, DAS STIMMT NICHT! ❌"
        Language.ZH -> "不对，不是这样的！ ❌"
        Language.AR -> "لا، هذا غير صحيح! ❌"
    }

    fun revealPlaceholder(lang: Language): String = when (lang) {
        Language.FR -> "Quelle était la vraie réponse ? (Optionnel)"
        Language.EN -> "What was the real answer? (Optional)"
        Language.ES -> "¿Cuál era la verdadera respuesta? (Opcional)"
        Language.PT -> "Qual era a resposta verdadeira? (Opcional)"
        Language.DE -> "Was war die echte Antwort? (Optional)"
        Language.ZH -> "真实的答案是什么？（选填）"
        Language.AR -> "ما هي الإجابة الحقيقية؟ (اختياري)"
    }

    fun streakBonusBanner(count: Int, lang: Language): String = when (lang) {
        Language.FR -> "🔥 SÉRIE DE $count ! +5 POINTS BONUS ! 🔥"
        Language.EN -> "🔥 STREAK OF $count! +5 BONUS POINTS! 🔥"
        Language.ES -> "🔥 ¡RACHA DE $count! ¡+5 PUNTOS EXTRA! 🔥"
        Language.PT -> "🔥 SEQUÊNCIA DE $count! +5 PONTOS BÔNUS! 🔥"
        Language.DE -> "🔥 SERIE VON $count! +5 BONUS-PUNKTE! 🔥"
        Language.ZH -> "🔥 连续连对 $count 题！额外奖励 +5 分！ 🔥"
        Language.AR -> "🔥 سلسلة نجاح من $count إجابات! +5 نقاط إضافية! 🔥"
    }

    fun nextQuestion(lang: Language): String = when (lang) {
        Language.FR -> "QUESTION SUIVANTE ➡️"
        Language.EN -> "NEXT QUESTION ➡️"
        Language.ES -> "SIGUIENTE PREGUNTA ➡️"
        Language.PT -> "PRÓXIMA PERGUNTA ➡️"
        Language.DE -> "NÄCHSTE FRAGE ➡️"
        Language.ZH -> "下一题 ➡️"
        Language.AR -> "السؤال التالي ➡️"
    }

    fun resultsTitle(lang: Language): String = when (lang) {
        Language.FR -> "Résultats de la partie ! 🎉"
        Language.EN -> "Game Results! 🎉"
        Language.ES -> "¡Resultados de la partida! 🎉"
        Language.PT -> "Resultados do jogo! 🎉"
        Language.DE -> "Spielergebnisse! 🎉"
        Language.ZH -> "最终对决战报！ 🎉"
        Language.AR -> "نتائج اللعبة! 🎉"
    }

    fun verdictTitle(lang: Language): String = when (lang) {
        Language.FR -> "Verdict de complicité"
        Language.EN -> "Chemistry & Knowledge Verdict"
        Language.ES -> "Veredicto de complicidad"
        Language.PT -> "Veredito de cumplicidade"
        Language.DE -> "Ergebnis der Verbundenheit"
        Language.ZH -> "默契鉴定结果"
        Language.AR -> "تقييم التوافق والانسجام"
    }

    fun scorePoints(points: Int, lang: Language): String = when (lang) {
        Language.FR -> "$points pts"
        Language.EN -> "$points pts"
        Language.ES -> "$points pts"
        Language.PT -> "$points pts"
        Language.DE -> "$points Pkt"
        Language.ZH -> "$points 分"
        Language.AR -> "$points نقطة"
    }

    fun statCorrect(lang: Language): String = when (lang) {
        Language.FR -> "Bonnes réponses"
        Language.EN -> "Correct answers"
        Language.ES -> "Aciertos"
        Language.PT -> "Acertos"
        Language.DE -> "Richtige Antworten"
        Language.ZH -> "正确答对"
        Language.AR -> "إجابات صحيحة"
    }

    fun statIncorrect(lang: Language): String = when (lang) {
        Language.FR -> "Mauvaises réponses"
        Language.EN -> "Incorrect answers"
        Language.ES -> "Fallos"
        Language.PT -> "Erros"
        Language.DE -> "Falsche Antworten"
        Language.ZH -> "答错次数"
        Language.AR -> "إجابات خاطئة"
    }

    fun statSkipped(lang: Language): String = when (lang) {
        Language.FR -> "Passées"
        Language.EN -> "Skipped"
        Language.ES -> "Saltadas"
        Language.PT -> "Puladas"
        Language.DE -> "Übersprungen"
        Language.ZH -> "跳过题目"
        Language.AR -> "تم تخطيها"
    }

    fun statStreakBonus(lang: Language): String = when (lang) {
        Language.FR -> "Bonus de série"
        Language.EN -> "Streak bonuses"
        Language.ES -> "Bonus de racha"
        Language.PT -> "Bônus de sequência"
        Language.DE -> "Serien-Boni"
        Language.ZH -> "连击奖励"
        Language.AR -> "مكافآت السلسلة"
    }

    fun statAccuracy(lang: Language): String = when (lang) {
        Language.FR -> "Précision"
        Language.EN -> "Accuracy"
        Language.ES -> "Precisión"
        Language.PT -> "Precisão"
        Language.DE -> "Genauigkeit"
        Language.ZH -> "准确率"
        Language.AR -> "نسبة الدقة"
    }

    fun verdictComment(percentage: Int, hasAnswered: Boolean, lang: Language): String {
        if (!hasAnswered) {
            return when (lang) {
                Language.FR -> "Partie découverte sans réponses validées ! Rejouez pour prouver votre complicité !"
                Language.EN -> "Discovery game without validated answers! Play again to test your chemistry!"
                Language.ES -> "¡Partida de prueba sin respuestas validadas! ¡Juega de nuevo para poner a prueba tu complicidad!"
                Language.PT -> "Jogo de teste sem respostas validadas! Jogue novamente para provar sua cumplicidade!"
                Language.DE -> "Proberunde ohne gewertete Antworten! Spielt nochmal, um euch zu beweisen!"
                Language.ZH -> "探索模式试玩！再玩一局来检验你们真正的默契吧！"
                Language.AR -> "جولة تجريبية بدون تقييم! العبا مجدداً لاختبار مدى تفاهمكما الحقيقي!"
            }
        }
        return when {
            percentage >= 90 -> when (lang) {
                Language.FR -> "Vous vous connaissez par cœur ! ❤️"
                Language.EN -> "You know each other by heart! ❤️"
                Language.ES -> "¡Os conocéis al dedillo! ❤️"
                Language.PT -> "Vocês se conhecem de cor e salteado! ❤️"
                Language.DE -> "Ihr kennt euch in- und auswendig! ❤️"
                Language.ZH -> "你们简直心有灵犀，彼此了如指掌！ ❤️"
                Language.AR -> "أنتما تحفظان بعضكما عن ظهر قلب! ❤️"
            }
            percentage >= 70 -> when (lang) {
                Language.FR -> "Vous êtes vraiment complices ! 🥰"
                Language.EN -> "You have incredible chemistry! 🥰"
                Language.ES -> "¡Tenéis una gran complicidad! 🥰"
                Language.PT -> "Vocês têm uma cumplicidade incrível! 🥰"
                Language.DE -> "Ihr seid ein richtig tolles Team! 🥰"
                Language.ZH -> "超强默契，感情深厚亲密！ 🥰"
                Language.AR -> "أنتما منسجمان ومقربان جداً من بعضكما! 🥰"
            }
            percentage >= 40 -> when (lang) {
                Language.FR -> "Il vous reste des choses à découvrir ! 😉"
                Language.EN -> "You still have great things to discover! 😉"
                Language.ES -> "¡Aún os quedan cosas por descubrir! 😉"
                Language.PT -> "Ainda há muito o que descobrir um sobre o outro! 😉"
                Language.DE -> "Es gibt noch spannende Dinge zu entdecken! 😉"
                Language.ZH -> "还有很多未知的小惊喜等待去发现哦！ 😉"
                Language.AR -> "لا يزال أمامكما الكثير لتكتشفاه معاً! 😉"
            }
            else -> when (lang) {
                Language.FR -> "Une nouvelle partie s'impose ! 😂"
                Language.EN -> "A rematch is definitely required! 😂"
                Language.ES -> "¡Una revancha es totalmente obligatoria! 😂"
                Language.PT -> "Uma nova partida é indispensável! 😂"
                Language.DE -> "Ein Revanche-Spiel ist Pflicht! 😂"
                Language.ZH -> "快来开启重赛，加深一下互相了解吧！ 😂"
                Language.AR -> "جولة إعادة ضرورية فوراً لتصحيح النتيجة! 😂"
            }
        }
    }

    fun playAgain(lang: Language): String = when (lang) {
        Language.FR -> "REJOUER"
        Language.EN -> "PLAY AGAIN"
        Language.ES -> "REPETIR"
        Language.PT -> "JOGAR NOVAMENTE"
        Language.DE -> "NOCHMAL SPIELEN"
        Language.ZH -> "再来一局"
        Language.AR -> "إعادة اللعب"
    }

    fun changeMode(lang: Language): String = when (lang) {
        Language.FR -> "CHANGER DE MODE"
        Language.EN -> "CHANGE MODE"
        Language.ES -> "CAMBIAR MODO"
        Language.PT -> "MUDAR MODO"
        Language.DE -> "MODUS WECHSELN"
        Language.ZH -> "更换模式"
        Language.AR -> "تغيير النمط"
    }

    fun shareScore(lang: Language): String = when (lang) {
        Language.FR -> "PARTAGER MON SCORE 📲"
        Language.EN -> "SHARE SCORE 📲"
        Language.ES -> "COMPARTIR PUNTUACIÓN 📲"
        Language.PT -> "COMPARTILHAR PONTUAÇÃO 📲"
        Language.DE -> "ERGEBNIS TEILEN 📲"
        Language.ZH -> "分享战绩 📲"
        Language.AR -> "مشاركة النتيجة 📲"
    }

    fun returnHome(lang: Language): String = when (lang) {
        Language.FR -> "RETOUR À L'ACCUEIL"
        Language.EN -> "RETURN TO HOME"
        Language.ES -> "VOLVER AL INICIO"
        Language.PT -> "VOLTAR AO INÍCIO"
        Language.DE -> "ZURÜCK ZUR STARTSEITE"
        Language.ZH -> "返回主页"
        Language.AR -> "العودة للرئيسية"
    }

    fun howToPlayContent(lang: Language): String = when (lang) {
        Language.FR -> """
            🎯 BUT DU JEU
            Prouver à quel point deux personnes se connaissent réellement à travers des questions personnelles, drôles ou profondes.
            
            🔄 DÉROULEMENT
            1. Chacun son tour : l'un répond à une question sur l'autre.
            2. Tu peux taper ta réponse ou choisir une option suggérée.
            3. Passe le téléphone à ton partenaire sans qu'il ne voie tes réponses précédentes !
            4. Le partenaire valide : « OUI » (+10 points) ou « NON » (0 pt).
            
            ⭐ SYSTÈME DE POINTS
            • Bonne réponse : +10 points
            • Mauvaise réponse : 0 point
            • Question passée : 0 point
            • Bonus de série : +5 points à chaque palier de 5 bonnes réponses consécutives !
            
            🔒 RESPECT & SÉCURITÉ
            Toutes vos réponses restent privées sur cet appareil. Si une question vous met mal à l'aise, vous pouvez toujours appuyer sur « JE PRÉFÈRE PASSER ».
        """.trimIndent()
        Language.EN -> """
            🎯 OBJECTIVE
            Discover how well two people truly know each other through personal, hilarious, and thoughtful questions.
            
            🔄 GAMEPLAY
            1. Take turns: one player answers a question about the other.
            2. Type your answer or choose from suggested options.
            3. Hand over the phone without spoiling the answer!
            4. Your partner validates: "YES" (+10 pts) or "NO" (0 pts).
            
            ⭐ SCORING
            • Correct answer: +10 points
            • Wrong answer: 0 points
            • Skipped question: 0 points
            • Streak bonus: +5 bonus points for every streak of 5 consecutive correct answers!
            
            🔒 PRIVACY & RESPECT
            All answers stay local on this device. You can always tap "I PREFER TO SKIP" at any time.
        """.trimIndent()
        Language.ES -> """
            🎯 OBJETIVO
            Comprobar cuánto os conocéis en realidad a través de preguntas personales, divertidas y sorprendentes.
            
            🔄 CÓMO SE JUEGA
            1. Por turnos: uno responde sobre el otro.
            2. Escribe tu respuesta o elige una sugerencia.
            3. ¡Pasa el teléfono para que tu compañero verifique!
            4. El compañero valida: «SÍ» (+10 pts) o «NO» (0 pts).
            
            ⭐ PUNTUACIÓN
            • Acierto: +10 puntos
            • Fallo o salto: 0 puntos
            • Racha de 5 aciertos seguidos: +5 puntos extra.
            
            🔒 PRIVACIDAD
            El juego es 100% privado y seguro en tu dispositivo.
        """.trimIndent()
        Language.PT -> """
            🎯 OBJETIVO
            Descobrir o quanto vocês realmente se conhecem através de perguntas pessoais, divertidas e sinceras.
            
            🔄 COMO FUNCIONA
            1. Revezamento: um responde sobre o outro.
            2. Digite sua resposta ou selecione uma opção.
            3. Passe o celular para seu parceiro conferir!
            4. O parceiro valida: «SIM» (+10 pts) ou «NÃO» (0 pts).
            
            ⭐ PONTUAÇÃO
            • Acerto: +10 pontos
            • Erro ou pular: 0 pontos
            • Bônus de sequência: +5 pontos a cada 5 acertos consecutivos.
            
            🔒 PRIVACIDADE
            Seus dados ficam 100% seguros no aparelho.
        """.trimIndent()
        Language.DE -> """
            🎯 ZIEL DES SPIELS
            Finde heraus, wie gut ihr euch wirklich kennt – durch persönliche, lustige und spannende Fragen.
            
            🔄 ABLAUF
            1. Abwechselnd antwortet einer auf eine Frage über den anderen.
            2. Antwort eintippen oder Vorschlag wählen.
            3. Handy weitergeben zur Überprüfung!
            4. Der Partner bestätigt: „JA“ (+10 Pkt) oder „NEIN“ (0 Pkt).
            
            ⭐ PUNKTE
            • Richtige Antwort: +10 Punkte
            • Serien-Bonus: +5 Punkte bei jeweils 5 richtigen Antworten in Folge!
            
            🔒 DATENSCHUTZ
            Alle Daten bleiben privat auf dem Gerät.
        """.trimIndent()
        Language.ZH -> """
            🎯 游戏目标
            通过一系列真实、趣味且富有温情的问题，检验两个人到底有多了解彼此！
            
            🔄 游戏流程
            1. 轮流作答：一人回答关于另一人的问题。
            2. 自行输入答案，或直接选择快捷提示选项。
            3. 将手机递给对方，进行诚实验证！
            4. 对方点击判定：“完全正确”（+10分）或“不对”（0分）。
            
            ⭐ 积分规则
            • 答对：+10分
            • 答错或跳过：0分
            • 连对奖励：每连续答对5题，立即奖励 +5 额外积分！
            
            🔒 隐私保障
            游戏纯本地单机运行，答案绝不上传任何服务器。遇到不想回答的题目可随时跳过。
        """.trimIndent()
        Language.AR -> """
            🎯 هدف اللعبة
            اكتشف مدى معرفتك الحقيقية بالشخص الآخر من خلال أسئلة شخصية، ممتعة، ومفاجئة!
            
            🔄 طريقة اللعب
            1. بالتناوب: يجيب أحد اللاعبين عن سؤال يتعلق بالآخر.
            2. اكتب إجابتك أو اختر من المقترحات السريعة.
            3. مرر الهاتف لشريكك ليتحقق من الإجابة دون أن ترى خياره مسبقاً!
            4. يقوم الشريك بالتحقق: «نعم» (+10 نقاط) أو «لا» (0 نقطة).
            
            ⭐ نظام النقاط
            • إجابة صحيحة: +10 نقاط
            • تخطي أو إجابة خاطئة: 0 نقطة
            • مكافأة السلسلة: +5 نقاط إضافية لكل 5 إجابات صحيحة متتالية!
            
            🔒 الخصوصية
            اللعبة تعمل كلياً على جهازك ولا تشارك أي بيانات خارجياً.
        """.trimIndent()
    }
}

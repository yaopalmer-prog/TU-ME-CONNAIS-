package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.localization.Translations
import com.example.data.model.ActiveGameState
import com.example.data.model.Language
import com.example.data.model.PlayStep
import com.example.ui.theme.EmeraldLight
import com.example.ui.theme.EmeraldSuccess
import com.example.ui.theme.RoseError
import com.example.ui.theme.RoseLight

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun GamePlayScreen(
    gameState: ActiveGameState,
    language: Language,
    showQuitDialog: Boolean,
    liveNotification: String? = null,
    onRequestQuit: () -> Unit,
    onDismissQuit: () -> Unit,
    onConfirmQuit: () -> Unit,
    onAnswerChange: (String) -> Unit,
    onSubmitGuess: () -> Unit,
    onSkipQuestion: () -> Unit,
    onSubjectReady: () -> Unit,
    onExplanationChange: (String) -> Unit,
    onValidateAnswer: (Boolean) -> Unit,
    onProceedNext: () -> Unit
) {
    BackHandler { onRequestQuit() }

    val currentQ = gameState.currentQuestion ?: return
    val totalQ = gameState.questions.size
    val currentNum = gameState.currentQuestionIndex + 1
    val progress = currentNum.toFloat() / totalQ.toFloat()

    val guesserName = gameState.currentGuesserName
    val subjectName = gameState.currentSubjectName
    val mode = gameState.config.mode

    if (showQuitDialog) {
        AlertDialog(
            onDismissRequest = onDismissQuit,
            title = { Text("Quitter la partie ?") },
            text = { Text("Si vous quittez maintenant, la progression de la partie actuelle sera perdue.") },
            confirmButton = {
                TextButton(
                    onClick = onConfirmQuit,
                    modifier = Modifier.testTag("confirm_quit_button")
                ) {
                    Text("Oui, quitter", color = MaterialTheme.colorScheme.error)
                }
            },
            dismissButton = {
                TextButton(
                    onClick = onDismissQuit,
                    modifier = Modifier.testTag("cancel_quit_button")
                ) {
                    Text("Continuer à jouer")
                }
            }
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .statusBarsPadding()
            .navigationBarsPadding()
    ) {
        // Top Header Bar
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Mode Pill
                Surface(
                    color = mode.containerColor,
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = mode.emoji, fontSize = 16.sp)
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = mode.getDisplayName(language),
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold,
                            color = mode.primaryColor
                        )
                    }
                }

                // Question Counter & Streak
                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (gameState.currentGuesserStats.currentStreak > 0) {
                        Surface(
                            color = Color(0xFFFEF3C7),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.LocalFireDepartment,
                                    contentDescription = "Streak",
                                    tint = Color(0xFFD97706),
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(2.dp))
                                Text(
                                    text = "${gameState.currentGuesserStats.currentStreak}",
                                    style = MaterialTheme.typography.labelMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFFB45309)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                    }

                    Text(
                        text = "$currentNum / $totalQ",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    IconButton(
                        onClick = onRequestQuit,
                        modifier = Modifier.testTag("game_quit_button")
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Quitter",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            // Progress bar
            LinearProgressIndicator(
                progress = { progress },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(6.dp)
                    .clip(RoundedCornerShape(3.dp)),
                color = mode.primaryColor,
                trackColor = MaterialTheme.colorScheme.surfaceVariant
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Players Score Board
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                PlayerScorePill(
                    name = gameState.config.player1Name,
                    stats = gameState.player1Stats,
                    isCurrentTurn = gameState.isPlayer1Turn,
                    modifier = Modifier.weight(1f)
                )
                PlayerScorePill(
                    name = gameState.config.player2Name,
                    stats = gameState.player2Stats,
                    isCurrentTurn = !gameState.isPlayer1Turn,
                    modifier = Modifier.weight(1f)
                )
            }
        }

        // Main Step Area
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            when (gameState.currentStep) {
                PlayStep.GUESSING -> {
                    GuesserStepView(
                        guesserName = guesserName,
                        subjectName = subjectName,
                        question = currentQ,
                        currentAnswer = gameState.currentGuessAnswer,
                        language = language,
                        onAnswerChange = onAnswerChange,
                        onSubmit = onSubmitGuess,
                        onSkip = onSkipQuestion
                    )
                }
                PlayStep.HANDOVER -> {
                    HandoverStepView(
                        guesserName = guesserName,
                        subjectName = subjectName,
                        language = language,
                        onReady = onSubjectReady
                    )
                }
                PlayStep.VALIDATING -> {
                    ValidatingStepView(
                        guesserName = guesserName,
                        subjectName = subjectName,
                        question = currentQ,
                        givenAnswer = gameState.currentGuessAnswer,
                        currentExplanation = gameState.currentExplanation,
                        language = language,
                        isProcessing = gameState.isProcessingValidation,
                        onExplanationChange = onExplanationChange,
                        onValidate = onValidateAnswer
                    )
                }
                PlayStep.FEEDBACK -> {
                    FeedbackStepView(
                        guesserName = guesserName,
                        subjectName = subjectName,
                        question = currentQ,
                        historyItem = gameState.history.lastOrNull(),
                        pointsAwarded = gameState.lastAwardedPoints,
                        wasStreakBonus = gameState.lastWasStreakBonus,
                        language = language,
                        onProceed = onProceedNext
                    )
                }
            }
        }
    }
}

@Composable
private fun PlayerScorePill(
    name: String,
    stats: com.example.data.model.PlayerStats,
    isCurrentTurn: Boolean,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isCurrentTurn) {
                MaterialTheme.colorScheme.primaryContainer
            } else {
                MaterialTheme.colorScheme.surface
            }
        ),
        border = if (isCurrentTurn) {
            androidx.compose.foundation.BorderStroke(1.5.dp, MaterialTheme.colorScheme.primary)
        } else null
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 6.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (isCurrentTurn) {
                    Text(text = "👉 ", fontSize = 12.sp)
                }
                Text(
                    text = name,
                    style = MaterialTheme.typography.labelLarge,
                    fontWeight = if (isCurrentTurn) FontWeight.Bold else FontWeight.Medium,
                    maxLines = 1,
                    color = if (isCurrentTurn) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onSurface
                )
            }
            Text(
                text = "${stats.score} pts",
                style = MaterialTheme.typography.labelMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun GuesserStepView(
    guesserName: String,
    subjectName: String,
    question: com.example.data.model.Question,
    currentAnswer: String,
    language: Language,
    onAnswerChange: (String) -> Unit,
    onSubmit: () -> Unit,
    onSkip: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Guesser Turn Banner
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
        ) {
            Row(
                modifier = Modifier.padding(14.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "🎯", fontSize = 24.sp)
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = Translations.guesserTurnPrompt(guesserName, subjectName, language),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        }

        // Question Card
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .testTag("current_question_card"),
            shape = RoundedCornerShape(22.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            elevation = CardDefaults.cardElevation(defaultElevation = 3.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Surface(
                    color = MaterialTheme.colorScheme.primaryContainer,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = question.theme,
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }

                Text(
                    text = question.getText(language),
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface,
                    lineHeight = 30.sp
                )
            }
        }

        // Suggestions if any
        val options = question.getOptions(language)
        if (options.isNotEmpty()) {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(
                    text = Translations.typeOrChooseHint(language),
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                FlowRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    options.forEach { opt ->
                        val isSelected = (currentAnswer == opt)
                        Surface(
                            modifier = Modifier
                                .clip(RoundedCornerShape(12.dp))
                                .clickable { onAnswerChange(opt) }
                                .testTag("option_chip_$opt"),
                            color = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface,
                            shape = RoundedCornerShape(12.dp),
                            border = androidx.compose.foundation.BorderStroke(
                                1.dp,
                                if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.outlineVariant
                            )
                        ) {
                            Text(
                                text = opt,
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                color = if (isSelected) Color.White else MaterialTheme.colorScheme.onSurface,
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
                            )
                        }
                    }
                }
            }
        }

        // Free-text Input Field
        OutlinedTextField(
            value = currentAnswer,
            onValueChange = onAnswerChange,
            placeholder = { Text(Translations.answerInputPlaceholder(language)) },
            modifier = Modifier
                .fillMaxWidth()
                .testTag("guess_answer_input"),
            shape = RoundedCornerShape(16.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = MaterialTheme.colorScheme.outline
            ),
            minLines = 2,
            maxLines = 4
        )

        Spacer(modifier = Modifier.weight(1f, fill = false))

        // Actions: Submit vs Skip
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            OutlinedButton(
                onClick = onSkip,
                modifier = Modifier
                    .weight(1f)
                    .height(52.dp)
                    .testTag("skip_button"),
                shape = RoundedCornerShape(14.dp)
            ) {
                Icon(Icons.Default.SkipNext, contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = Translations.skipQuestion(language),
                    style = MaterialTheme.typography.labelLarge,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Button(
                onClick = onSubmit,
                enabled = currentAnswer.trim().isNotEmpty(),
                modifier = Modifier
                    .weight(1.3f)
                    .height(52.dp)
                    .testTag("submit_guess_button"),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = Color.White
                )
            ) {
                Icon(Icons.Default.Send, contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = Translations.submitAnswer(language),
                    style = MaterialTheme.typography.labelLarge,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
private fun HandoverStepView(
    guesserName: String,
    subjectName: String,
    language: Language,
    onReady: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .testTag("handover_card"),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(28.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primaryContainer),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "📱", fontSize = 42.sp)
            }

            Text(
                text = Translations.handoverTitle(subjectName, language),
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Black,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurface
            )

            Text(
                text = Translations.handoverSubtitle(guesserName, subjectName, language),
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center,
                lineHeight = 24.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = onReady,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .testTag("subject_ready_button"),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = Color.White
                )
            ) {
                Icon(Icons.Default.Visibility, contentDescription = null)
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = Translations.handoverButton(language),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
private fun ValidatingStepView(
    guesserName: String,
    subjectName: String,
    question: com.example.data.model.Question,
    givenAnswer: String,
    currentExplanation: String,
    language: Language,
    isProcessing: Boolean,
    onExplanationChange: (String) -> Unit,
    onValidate: (Boolean) -> Unit
) {
    var showWrongExplanationInput by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Validation Header
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
        ) {
            Row(
                modifier = Modifier.padding(14.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "🔍", fontSize = 24.sp)
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = Translations.validationHeader(subjectName, language),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
        }

        // Question reminder
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(18.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = question.theme,
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = question.getText(language),
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }

        // 1. CLAIREMENT ET EN GROS: Guesser's Answer Card with high-contrast styling in light & dark modes
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .testTag("guesser_answer_display_card"),
            shape = RoundedCornerShape(22.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface
            ),
            border = androidx.compose.foundation.BorderStroke(2.5.dp, MaterialTheme.colorScheme.primary),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Surface(
                    color = MaterialTheme.colorScheme.primary,
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Text(
                        text = "💬 " + Translations.validationSaid(guesserName, language),
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp)
                    )
                }

                val displayAnswer = if (givenAnswer.isNotBlank()) givenAnswer else "(Réponse non saisie)"
                Surface(
                    shape = RoundedCornerShape(16.dp),
                    color = MaterialTheme.colorScheme.primaryContainer,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "« $displayAnswer »",
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Black,
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(18.dp)
                    )
                }
            }
        }

        // 2. Question to Subject
        Text(
            text = Translations.validationQuestion(language),
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        // 3. Two Big Validation Buttons directly underneath
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // NO button (opens explanation if not yet opened)
            Button(
                onClick = {
                    if (!isProcessing) {
                        showWrongExplanationInput = true
                    }
                },
                enabled = !isProcessing,
                modifier = Modifier
                    .weight(1f)
                    .height(58.dp)
                    .testTag("validate_wrong_button"),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = RoseError,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = Translations.validateWrong(language),
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold
                )
            }

            // YES button
            Button(
                onClick = { if (!isProcessing) onValidate(true) },
                enabled = !isProcessing,
                modifier = Modifier
                    .weight(1f)
                    .height(58.dp)
                    .testTag("validate_correct_button"),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = EmeraldSuccess,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = Translations.validateCorrect(language),
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        // 4. Si le Joueur 2 clique sur « NON », ouvre un champ permettant d'afficher/saisir la VRAIE réponse correcte
        AnimatedVisibility(
            visible = showWrongExplanationInput,
            enter = fadeIn() + slideInVertically()
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .testTag("wrong_explanation_card"),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Text(
                        text = "Quelle était la vraie réponse correcte ?",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.error
                    )

                    OutlinedTextField(
                        value = currentExplanation,
                        onValueChange = onExplanationChange,
                        placeholder = { Text(Translations.revealPlaceholder(language)) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("reveal_explanation_input"),
                        shape = RoundedCornerShape(14.dp),
                        minLines = 2,
                        maxLines = 3
                    )

                    Button(
                        onClick = { if (!isProcessing) onValidate(false) },
                        enabled = !isProcessing,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .testTag("confirm_wrong_answer_button"),
                        shape = RoundedCornerShape(14.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = RoseError,
                            contentColor = Color.White
                        )
                    ) {
                        Text(
                            text = "Confirmer la mauvaise réponse ❌",
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun FeedbackStepView(
    guesserName: String,
    subjectName: String,
    question: com.example.data.model.Question,
    historyItem: com.example.data.model.QuestionHistoryItem?,
    pointsAwarded: Int,
    wasStreakBonus: Boolean,
    language: Language,
    onProceed: () -> Unit
) {
    val isCorrect = historyItem?.isCorrect == true

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .testTag("feedback_step_card"),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isCorrect) EmeraldLight else RoseLight
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(26.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(72.dp)
                    .clip(CircleShape)
                    .background(if (isCorrect) EmeraldSuccess else RoseError),
                contentAlignment = Alignment.Center
            ) {
                Text(text = if (isCorrect) "✅" else "❌", fontSize = 36.sp)
            }

            Text(
                text = if (isCorrect) {
                    "Bravo $guesserName !"
                } else {
                    "Oups, ce n'est pas tout à fait ça !"
                },
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Black,
                textAlign = TextAlign.Center,
                color = if (isCorrect) Color(0xFF065F46) else Color(0xFF991B1B)
            )

            Text(
                text = if (isCorrect) {
                    Translations.scorePoints(pointsAwarded, language)
                } else {
                    "0 point pour cette question"
                },
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = if (isCorrect) EmeraldSuccess else RoseError
            )

            // Streak Bonus Banner if achieved
            if (wasStreakBonus) {
                Surface(
                    color = Color(0xFFFEF3C7),
                    shape = RoundedCornerShape(12.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFF59E0B))
                ) {
                    Text(
                        text = Translations.streakBonusBanner(5, language),
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Black,
                        color = Color(0xFFB45309),
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 8.dp),
                        textAlign = TextAlign.Center
                    )
                }
            }

            // Real answer explanation if provided
            if (!isCorrect && !historyItem?.actualAnswerExplanation.isNullOrBlank()) {
                Surface(
                    color = Color.White,
                    shape = RoundedCornerShape(14.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(14.dp)) {
                        Text(
                            text = "Explication de $subjectName :",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "« ${historyItem?.actualAnswerExplanation} »",
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Medium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Button(
                onClick = onProceed,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp)
                    .testTag("proceed_next_question_button"),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = Translations.nextQuestion(language),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

package com.example.ui.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import kotlin.math.sin
import kotlin.random.Random

data class Particle(
    val initialXRatio: Float,
    val speed: Float,
    val size: Float,
    val color: Color,
    val isHeart: Boolean,
    val phaseOffset: Float
)

@Composable
fun FloatingParticles(
    modifier: Modifier = Modifier,
    count: Int = 18,
    primaryColor: Color = Color(0xFFE11D48)
) {
    val particles = remember {
        val random = Random(42)
        List(count) {
            Particle(
                initialXRatio = random.nextFloat(),
                speed = 0.5f + random.nextFloat() * 0.8f,
                size = 12f + random.nextFloat() * 16f,
                color = if (random.nextBoolean()) {
                    primaryColor.copy(alpha = 0.12f + random.nextFloat() * 0.18f)
                } else {
                    Color(0xFFF59E0B).copy(alpha = 0.10f + random.nextFloat() * 0.15f)
                },
                isHeart = random.nextBoolean(),
                phaseOffset = random.nextFloat() * 10f
            )
        }
    }

    val infiniteTransition = rememberInfiniteTransition(label = "particles")
    val progress by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 10000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "particleProgress"
    )

    Canvas(modifier = modifier.fillMaxSize()) {
        val width = size.width
        val height = size.height

        particles.forEach { p ->
            val yProgress = (progress * p.speed + p.phaseOffset) % 1f
            val y = height - (yProgress * (height + 100f))
            val sway = sin((yProgress * 6f + p.phaseOffset) * Math.PI.toFloat()) * 25f
            val x = (p.initialXRatio * width + sway).coerceIn(10f, width - 10f)

            if (p.isHeart) {
                drawHeart(Offset(x, y), p.size, p.color)
            } else {
                drawStar(Offset(x, y), p.size * 0.8f, p.color)
            }
        }
    }
}

private fun DrawScope.drawHeart(center: Offset, size: Float, color: Color) {
    val path = Path().apply {
        val half = size / 2f
        moveTo(center.x, center.y + half * 0.6f)
        cubicTo(
            center.x - size, center.y - half * 0.6f,
            center.x - half * 0.8f, center.y - size,
            center.x, center.y - half * 0.3f
        )
        cubicTo(
            center.x + half * 0.8f, center.y - size,
            center.x + size, center.y - half * 0.6f,
            center.x, center.y + half * 0.6f
        )
        close()
    }
    drawPath(path, color)
}

private fun DrawScope.drawStar(center: Offset, radius: Float, color: Color) {
    val path = Path().apply {
        val innerRadius = radius * 0.45f
        for (i in 0 until 8) {
            val r = if (i % 2 == 0) radius else innerRadius
            val angle = i * Math.PI.toFloat() / 4f - Math.PI.toFloat() / 2f
            val x = center.x + r * kotlin.math.cos(angle)
            val y = center.y + r * kotlin.math.sin(angle)
            if (i == 0) moveTo(x, y) else lineTo(x, y)
        }
        close()
    }
    drawPath(path, color)
}

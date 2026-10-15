package com.example.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Adsterra monetization configuration.
 * Disabled by default to comply with Section 11 requirements.
 * When real Adsterra credentials and SDK / WebView scripts are provided,
 * set [ADS_ENABLED] = true and inject the network tags inside [AdsterraBannerSlot].
 */
object AdsterraConfig {
    /** Toggle this to true once official Adsterra tags or banner keys are supplied. */
    const val ADS_ENABLED: Boolean = false

    /** Placement slot keys for easy integration. */
    const val HOME_BANNER_SLOT_ID = "adsterra_home_banner"
    const val RESULTS_RECTANGLE_SLOT_ID = "adsterra_results_box"
    const val TRANSITION_INTERSTITIAL_SLOT_ID = "adsterra_transition_interstitial"
}

@Composable
fun AdsterraBannerSlot(
    slotId: String,
    modifier: Modifier = Modifier,
    heightDp: Int = 50
) {
    if (!AdsterraConfig.ADS_ENABLED) {
        // Initially empty or clean discrete container without fake ads or blocking UI
        return
    }

    // When ADS_ENABLED is true, this renders the official Adsterra ad view / webview container
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(heightDp.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f),
                shape = RoundedCornerShape(8.dp)
            )
            .padding(horizontal = 12.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Espace Partenaire ($slotId)",
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f),
            fontStyle = FontStyle.Italic,
            fontSize = 11.sp
        )
    }
}

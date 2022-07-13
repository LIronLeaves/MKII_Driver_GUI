package com.example.core_ui.defaultpresentation

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import com.example.core_ui.LocalSpacing

@Composable
fun CoreUIDefaultButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = false,
    textStyle: TextStyle = MaterialTheme.typography.labelLarge
) {
    val dimensions = LocalSpacing.current

    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = isEnabled,
        shape = RoundedCornerShape(dimensions.buttonCornersLarge)
    ) {
        CoreUIDefaultText(
            text = text,
            modifier = Modifier.padding(dimensions.spaceSmall),
            color = MaterialTheme.colorScheme.onPrimary,
            textAlign = TextAlign.Center,
            style = textStyle
        )
    }
}
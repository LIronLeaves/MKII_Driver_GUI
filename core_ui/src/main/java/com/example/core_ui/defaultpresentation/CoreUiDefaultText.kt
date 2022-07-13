package com.example.core_ui.defaultpresentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow

@Composable
fun CoreUIDefaultText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Black,
    fontStyle: FontStyle = FontStyle.Normal,
    textAlign: TextAlign = TextAlign.Start,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = 1,
    style: TextStyle = MaterialTheme.typography.displayMedium
) {
    Text(
        text = text,
        modifier = modifier,
        color = color,
        fontStyle =fontStyle,
        textAlign = textAlign,
        overflow = overflow,
        maxLines = maxLines,
        style = style
    )
}
package com.example.core_ui

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimensions(
    val default: Dp = 0.dp,
    val spaceExtraSmall: Dp = 4.dp,
    val spaceSmall: Dp = 8.dp,
    val spaceMedium: Dp = 16.dp,
    val spaceLarge: Dp = 32.dp,
    val spaceExtraLarge: Dp = 64.dp,

    val buttonHeightSmall: Dp = 48.dp,
    val buttonHeightMedium: Dp = 56.dp,
    val buttonHeightLarge: Dp = 64.dp,

    val buttonCornersSmall: Dp = 32.dp,
    val buttonCornersMedium: Dp = 64.dp,
    val buttonCornersLarge: Dp = 96.dp,

    val elevationLow: Dp = 4.dp,
    val elevationMedium: Dp = 8.dp,
    val elevationHigh: Dp = 16.dp,

    val smallBar: Dp =56.dp,
    val mediumBar: Dp =64.dp,
    val largeBar: Dp =72.dp,

    val smallTouchTarget: Dp = 48.dp,
    val mediumTouchTarget: Dp = 56.dp,
    val largeTouchTarget: Dp = 64.dp
)

val LocalSpacing = compositionLocalOf { Dimensions() }

// 1. screen configuration is get via LocalConfiguration
// 2. device type is set according to orientation and height / width
// 2.a. landscape and height
// 2.b. portrait and width

package com.example.core_ui

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun rememberScreenInfo(): ScreenInfo {
    val configuration = LocalConfiguration.current
    val deviceType = if (
        configuration.orientation == Configuration.ORIENTATION_LANDSCAPE
    ) {
        when {
            configuration.screenHeightDp < 480f -> ScreenInfo.DeviceType.Phone
            else -> ScreenInfo.DeviceType.Tablet
        }
    } else {
        when {
            configuration.screenWidthDp < 600f -> ScreenInfo.DeviceType.Phone
            else -> ScreenInfo.DeviceType.Tablet
        }
    }
    return ScreenInfo(
        screenWidth = configuration.screenWidthDp.dp,
        screenHeight = configuration.screenHeightDp.dp,
        screenResolution = configuration.densityDpi,
        isLandscapeMode = when (configuration.orientation) {
            Configuration.ORIENTATION_LANDSCAPE -> true
            else -> false
        },
        deviceType = deviceType
    )
}
// utility class containing screen dimensions and device Type
data class ScreenInfo(
    val deviceType: DeviceType,
    val screenWidth: Dp,
    val screenHeight: Dp,
    val screenResolution: Int,
    val isLandscapeMode: Boolean
) {
    sealed class DeviceType {
        object Phone : DeviceType()
        object Tablet : DeviceType()
    }
}
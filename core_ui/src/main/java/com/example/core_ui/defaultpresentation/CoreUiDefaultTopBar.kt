// Lars Eisenblaetter, 22.07.2022
// Definition for default top bar composable for app wide use
// Depending on use case default icon buttons could be set such as:
// - always left icon button: simple on click lambda:
//  - pass the leftIconOnClick lambda
// - optional right icon button: with drop down menu:
//  - pass the rightIconOnClick lambda which is a user event to toggle visibility of drop down menu
//  - pass list of drop down menu item names
//  - maybe pass the drop down menu item icons
//  - pass list of drop down menu item onClick functions

package com.example.core_ui.defaultpresentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.core_ui.LocalSpacing
import com.example.core_ui.ScreenInfo
import com.example.core_ui.rememberScreenInfo

@Composable
fun CoreUIDefaultTopBar(
    leftIconImageVector: ImageVector,
    rightIconImageVector: ImageVector? = null,
    leftIconOnClick: () -> Unit,
    rightIconOnClick: () -> Unit = {},
    itemNameList: Array<String> = arrayOf(),
    itemOnClick: List<() -> Unit> = emptyList(),
    expansionState: Boolean =false
) {
    val spacing = LocalSpacing.current
    val screenInfo = rememberScreenInfo()
    val touchTargetSize = when (screenInfo.deviceType) {
        is ScreenInfo.DeviceType.Tablet -> spacing.largeTouchTarget
        is ScreenInfo.DeviceType.Phone -> spacing.smallTouchTarget
    }
    val topBarSize = when (screenInfo.deviceType) {
        is ScreenInfo.DeviceType.Tablet -> spacing.largeBar
        is ScreenInfo.DeviceType.Phone -> spacing.smallBar
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(topBarSize)
            .background(MaterialTheme.colorScheme.onSurface)
    ) {
        CoreUIDefaultIconButton(
            modifier = Modifier
                .size(touchTargetSize)
                .align(Alignment.CenterStart),
            onClick = leftIconOnClick,
            imageVector = leftIconImageVector
        )
        if (rightIconImageVector != null) {
            CoreUIDefaultIconButton(
                modifier = Modifier
                    .size(touchTargetSize)
                    .align(Alignment.CenterEnd),
                onClick = rightIconOnClick,
                imageVector = rightIconImageVector,
                hasContent = true,
                itemNameList = itemNameList,
                itemOnClick = itemOnClick,
                menuOnDismiss = rightIconOnClick,
                expansionState = expansionState
            )
        }
    }
}
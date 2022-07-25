// Lars Eisenblaetter, 22.07.2022
// Definition for default icon button composable for app wide use
// Depending on use case the icon button could be:
// - a simple button with a function
// - a button which opens a drop down menu
//  - pass down the item names
//  - pass down the item onClick functions
//  - pass down the on dismiss state toggle function

package com.example.core_ui.defaultpresentation

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun CoreUIDefaultIconButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    imageVector: ImageVector,
    hasContent: Boolean = false,
    itemNameList: Array<String> = arrayOf(),
    itemOnClick: List<() -> Unit> = emptyList(),
    menuOnDismiss: () -> Unit = {},
    expansionState: Boolean =false
) {
    IconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = true
    ) {
        Icon(
            imageVector = imageVector,
            contentDescription = null,
            tint = Color.LightGray  // for now hard coded, bind it to colorScheme once it is defined
        )
        if (hasContent) {
            CoreUIDefaultDropDown(
                itemNameList = itemNameList,
                itemOnClick = itemOnClick,
                menuOnDismiss = menuOnDismiss,
                expansionState = expansionState
            )
        }
    }
}
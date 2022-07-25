// Lars Eisenblaetter, 25.07.2022
// Definition of Drop Down Menu toe be used app wide

package com.example.core_ui.defaultpresentation

import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MenuDefaults
import androidx.compose.runtime.Composable

@Composable
fun CoreUIDefaultDropDown(
    itemNameList: Array<String>,         // list of text to be displayed for each menu item
    //itemIconList: List<ImageVector>,  // list of icons to be displayed with text
    itemOnClick: List<() -> Unit>,      // list of callbacks
    menuOnDismiss: () -> Unit,           // link it to toggle function for state -> UserEvent
    expansionState: Boolean = false     // boolean state the menus visibility is linked to
) {
    DropdownMenu(
        expanded = expansionState,
        onDismissRequest = menuOnDismiss
    ) {
        itemNameList.forEachIndexed { index, string ->
            DropdownMenuItem(
                text = {
                    CoreUIDefaultText(
                        text = string,
                        style = MaterialTheme.typography.labelMedium
                    )
                },
                onClick = {
                    menuOnDismiss()
                    itemOnClick[index]
                },
                enabled = true,
                contentPadding = MenuDefaults.DropdownMenuItemContentPadding
            )
        }
    }
}
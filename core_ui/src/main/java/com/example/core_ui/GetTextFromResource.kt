// Lars Eisenblaetter, 12.05.22
// wrapper class to get strings from any resource to
// overcome the issue of composable invocation in view models

package com.example.core_ui

import android.content.Context
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

sealed class GetTextFromResource() {
    data class DynamicText(val value: String) : GetTextFromResource()
    class StringResource(
        @StringRes val resId: Int,
        vararg val args: Any
    ) : GetTextFromResource()

    @Composable
    fun asString(): String {
        return when (this) {
            is DynamicText -> value
            is StringResource -> stringResource(id = resId, formatArgs = args)
        }
    }


    fun asString(context: Context): String {
        return when (this) {
            is DynamicText -> value
            is StringResource -> context.getString(resId, args)
        }
    }

    fun getTextResId(): Int {
        return when (this) {
            is DynamicText -> 0
            is StringResource -> resId
        }
    }
}
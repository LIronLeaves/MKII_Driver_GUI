object Compose {
    const val composeVersion = "1.2.0"
    const val composeCompilerVersion ="1.2.0"
    const val composeUIVersion = "1.1.1"
    const val composeMaterial3Version ="1.0.0-alpha13"
    const val animation ="androidx.compose.animation:animation:$composeUIVersion"
    //const val material = "androidx.compose.material:material:$composeUIVersion"
    const val material3 ="androidx.compose.material3:material3:$composeMaterial3Version"
    const val ui = "androidx.compose.ui:ui:$composeUIVersion"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:$composeUIVersion"
    const val runtime = "androidx.compose.runtime:runtime:$composeUIVersion"
    const val compiler = "androidx.compose.compiler:compiler:$composeCompilerVersion"

    private const val navigationVersion = "2.5.0"
    const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"

    private const val hiltNavigationComposeVersion = "1.0.0"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:$hiltNavigationComposeVersion"

    private const val activityComposeVersion = "1.5.0"
    const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"

    private const val lifecycleVersion = "2.5.0"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion"

}
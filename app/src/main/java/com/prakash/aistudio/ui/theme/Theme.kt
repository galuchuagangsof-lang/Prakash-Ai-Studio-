package com.prakash.aistudio.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Background = Color(0xFF0A0A0A)
val CardGrey = Color(0xFF1C1C1E)
val Accent = Color(0xFFFF7A00)

private val Scheme = darkColorScheme(
    primary = Accent,
    onPrimary = Color.Black,
    background = Background,
    onBackground = Color.White,
    surface = CardGrey,
    onSurface = Color.White,
    surfaceVariant = CardGrey,
    secondary = Accent,
    error = Color(0xFFFF5252)
)

@Composable
fun PrakashTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = Scheme, content = content)
}

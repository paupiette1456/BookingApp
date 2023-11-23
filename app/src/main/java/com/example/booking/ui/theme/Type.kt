package com.example.booking.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.booking.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

val sfProDisplay = FontFamily(
    Font(R.font.sf_regular, FontWeight.Normal),
    Font(R.font.sf_bold, FontWeight.Bold)
)

val textHint = TextStyle(
    fontFamily = sfProDisplay,
    fontSize = 16.sp,
    color = gray_font,
    fontWeight = FontWeight.Normal
)

val needed = TextStyle(
    fontFamily = sfProDisplay,
    fontSize = 16.sp,
    fontWeight = FontWeight.W500,
    color = Color.Black
)

val underNeeded = TextStyle(
    fontFamily = sfProDisplay,
    fontSize = 14.sp,
    fontWeight = FontWeight.W400,
    color = gray_font

)
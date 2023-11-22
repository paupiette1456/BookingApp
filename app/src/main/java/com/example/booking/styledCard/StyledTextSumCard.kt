package com.example.booking.styledCard

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.booking.ui.theme.gray_font
import com.example.booking.ui.theme.link_color
import com.example.booking.ui.theme.sfProDisplay

@Composable
fun StyledTextSumCard1() {
    Text(
        text = "Тур",
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = gray_font
    )
}

@Composable
fun StyledTextSumCard2() {
    Text(
        text = "Топливный сбор",
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = gray_font
    )
}

@Composable
fun StyledTextSumCard3() {
    Text(
        text = "Сервисный сбор",
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = gray_font
    )
}

@Composable
fun StyledTextSumCard4() {
    Text(
        text = "К оплате",
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = gray_font
    )
}




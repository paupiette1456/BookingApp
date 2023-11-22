package com.example.booking.formatting

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.booking.dataClasses.sum
import com.example.booking.ui.theme.link_color
import com.example.booking.ui.theme.sfProDisplay

@Preview
@Composable
fun TourFormatted() {
    val formattedTour = String.format("%,d", sum.tour)
    Text(text = formattedTour,
        fontFamily = sfProDisplay,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Black
    )
}
@Preview
@Composable
fun FuelFormatted() {
    val formattedFuel = String.format("%,d", sum.fuel)
    Text(text = formattedFuel,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Black
    )
}
@Preview
@Composable
fun ServiceFormatted() {
    val formattedService = String.format("%,d", sum.service)
    Text(text = formattedService,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Black
    )
}
@Preview
@Composable
fun PaidFormatted() {
    val formattedPaid = String.format("%,d", sum.paid)
    Text(text = formattedPaid,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = link_color
    )
}


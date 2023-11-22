package com.example.booking.styledCard


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.booking.formatting.formattedDate1
import com.example.booking.formatting.formattedDate2
import com.example.booking.dataClasses.hotel
import com.example.booking.styledCard.infoCard
import com.example.booking.ui.theme.gray_font
import com.example.booking.ui.theme.sfProDisplay

@Composable
fun StyledTextHotelCard1() {
    Text(
        text = infoCard.startDestination,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = gray_font
    )
}

@Composable
fun StyledTextHotelCard2() {
    Text(
        text = infoCard.countryCard,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = gray_font
    )
}

@Composable
fun StyledTextHotelCard3() {
    Text(
        text = infoCard.cityCard,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = gray_font
    )
}

@Composable
fun StyledTextHotelCard4() {
    Text(
        text = infoCard.dates,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = gray_font
    )
}

@Composable
fun StyledTextHotelCard5() {
    Text(
        text = infoCard.countOfNights,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = gray_font
    )
}

@Composable
fun StyledTextHotelCard6() {
    Text(
        text = infoCard.hotelCard,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = gray_font
    )
}

@Preview
@Composable
fun StyledTextHotelCard7() {
    Text(
        text = infoCard.numberCard,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = gray_font
    )
}

@Composable
fun StyledTextHotelCard8() {
    Text(
        text = infoCard.foodCard,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = gray_font
    )
}

@Preview
@Composable
fun StyledTextHotelCardRight1() {
    Text(
        text = hotel.start,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Black
    )
}

@Composable
fun StyledTextHotelCardRight2() {
    Text(
        text = hotel.country,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Black
    )
}

@Composable
fun StyledTextHotelCardRight3() {
    Text(
        text = hotel.city,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Black
    )
}
@Preview
@Composable
fun StyledTextHotelCardRight4() {
    if (formattedDate1 != null) {
        Text(
            text = formattedDate1,
            fontFamily = sfProDisplay,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black
        )
    }
}

@Preview
@Composable
fun StyledTextHotelCardRight5() {
    if (formattedDate2 != null) {
        Text(
            text = formattedDate2,
            fontFamily = sfProDisplay,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black
        )
    }
}

@Composable
fun StyledTextHotelCardRight6() {
    Text(
        text = hotel.countOfNights.toString(),
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Black
    )
}

@Composable
fun StyledTextHotelCardRight7() {
    Text(
        text = hotel.hotel,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Black
    )
}

@Composable
fun StyledTextHotelCardRight8() {
    Text(
        text = hotel.number,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Black
    )
}

@Composable
fun StyledTextHotelCardRight9() {
    Text(
        text = hotel.food,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Black
    )
}

@Composable
fun StyledTextHotelCardRight10() {
    Text(
        text = hotel.nights,
        fontFamily = sfProDisplay,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Black
    )
}



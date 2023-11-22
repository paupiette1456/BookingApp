package com.example.booking.customImages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.booking.ui.theme.gray
import com.example.booking.ui.theme.gray_font
import com.example.booking.ui.theme.sfProDisplay

@Preview
@Composable
fun Advantages() {
    Column {

        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp))
        {
            Text(text = "Все включено",
                Modifier
                    .background(gray, shape = RoundedCornerShape(5.dp))
                    .padding(start = 10.dp, top = 5.dp, end = 10.dp, bottom = 5.dp),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = sfProDisplay,
                    color = gray_font,
                    fontWeight = FontWeight.Medium)
            )
            Spacer(Modifier.width(8.dp))
            Text(text = "Кондиционер",
                Modifier
                    .background(gray, shape = RoundedCornerShape(5.dp))
                    .padding(start = 10.dp, top = 5.dp, end = 10.dp, bottom = 5.dp),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = sfProDisplay,
                    color = gray_font,
                    fontWeight = FontWeight.Medium)
            )

    }

        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp))
        {
            Text(text = "Все включено",
                Modifier
                    .background(gray, shape = RoundedCornerShape(5.dp))
                    .padding(start = 10.dp, top = 5.dp, end = 10.dp, bottom = 5.dp),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = sfProDisplay,
                    color = gray_font,
                    fontWeight = FontWeight.Medium)
            )
            Spacer(Modifier.width(8.dp))
            Text(text = "Кондиционер",
                Modifier
                    .background(gray, shape = RoundedCornerShape(5.dp))
                    .padding(start = 10.dp, top = 5.dp, end = 10.dp, bottom = 5.dp),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = sfProDisplay,
                    color = gray_font,
                    fontWeight = FontWeight.Medium)
            )

        }

    }
}
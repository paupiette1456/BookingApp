package com.example.booking.customImages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.booking.blendedColors.color_rate
import com.example.booking.R
import com.example.booking.ui.theme.rate_font
import com.example.booking.ui.theme.sfProDisplay

@Preview
@Composable
fun ImageRate() {

    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(color_rate, shape = RoundedCornerShape(3.33.dp))
            .padding(horizontal = 5.dp, vertical = 2.5.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "star"
        )
        Text(
            text = "5 Превосходно",
            style = TextStyle(
                fontFamily = sfProDisplay,
                fontSize = 14.sp,
                fontWeight = FontWeight.W500,
                color = rate_font
            )
        )

    }
}




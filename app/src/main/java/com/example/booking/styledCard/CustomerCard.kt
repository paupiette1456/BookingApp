package com.example.booking.styledCard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.booking.R
import com.example.booking.textFields.CustomTextFields_mail
import com.example.booking.textFields.CustomTextFields_phone
import com.example.booking.ui.theme.gray_font
import com.example.booking.ui.theme.sfProDisplay

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun CustomerCard() {
    Card (
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(235.dp))
    {
        Text(
            text = "Информация о покупателе",
            modifier = Modifier.padding(start = 16.dp, top = 8.dp),
            style = TextStyle(
                fontFamily = sfProDisplay,
                fontWeight = FontWeight.W600,
                fontSize = 22.sp,
                lineHeight = 10.sp
            )
        )
        Column(
            verticalArrangement = Arrangement.Center,
             modifier = Modifier.padding(16.dp, vertical = 16.dp)
        ) {
            Column {
                CustomTextFields_phone()
                Spacer(modifier = Modifier.height(8.dp))
                CustomTextFields_mail()
                Text(
                    stringResource(id = R.string.data_customer),
                    modifier = Modifier.padding(top = 5.dp),
                    style = TextStyle(
                        fontFamily = sfProDisplay,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        color = gray_font
                    )
                )

            }

        }

    }
}
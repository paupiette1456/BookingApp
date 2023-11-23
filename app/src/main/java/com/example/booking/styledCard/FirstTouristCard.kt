package com.example.booking.styledCard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.booking.textFields.CustomTextFields_bday
import com.example.booking.textFields.CustomTextFields_citizen
import com.example.booking.textFields.CustomTextFields_expired
import com.example.booking.textFields.CustomTextFields_name
import com.example.booking.textFields.CustomTextFields_number
import com.example.booking.textFields.CustomTextFields_surname

@Preview
@Composable
fun FirstTouristCard() {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color.White))
    {

        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 16.dp)

        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)) {
                CustomTextFields_name()
                CustomTextFields_surname()
                CustomTextFields_bday()
                CustomTextFields_citizen()
                CustomTextFields_number()
                CustomTextFields_expired()
            }

        }

    }
}
package com.example.booking.styledButtons

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.booking.navigation.Screen
import com.example.booking.dataClasses.sum
import com.example.booking.ui.theme.blue

@Composable
fun BlueButtonPaidScreen(
    navController: NavController

) {
    val formattedPaid = String.format("%,d", sum.paid)
    Button(
        onClick = {navController.navigate(route = Screen.Paid.route)},
        colors = ButtonDefaults.buttonColors(blue),
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .width(343.dp)
            .height(48.dp))

    {
        Text("Оплатить" + " " + formattedPaid + " " + sum.rub)

    }
}

@Preview
@Composable
fun ButtonPreview() {
    BlueButtonPaidScreen(
        navController = rememberNavController())
}


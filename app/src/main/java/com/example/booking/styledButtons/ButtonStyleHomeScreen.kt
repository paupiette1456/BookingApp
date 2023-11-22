package com.example.booking.styledButtons

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.booking.R
import com.example.booking.navigation.Screen
import com.example.booking.ui.theme.blue

@Composable
fun BlueButton(
    navController: NavController
) {
        Button(
            onClick = {navController.navigate(route = Screen.NumberL.route)},
            colors = ButtonDefaults.buttonColors(blue),
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .width(343.dp)
                .height(48.dp))

        {
            Text(stringResource(id = R.string.number_pick))
        }
    }


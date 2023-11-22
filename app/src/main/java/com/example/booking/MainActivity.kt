package com.example.booking

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import com.example.booking.ui.theme.BookingTheme
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.booking.navigation.SetupNavGraph


class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    @RequiresApi(34)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookingTheme {

                navController = rememberNavController()
                SetupNavGraph(navController = navController)


            }

        }
    }
}









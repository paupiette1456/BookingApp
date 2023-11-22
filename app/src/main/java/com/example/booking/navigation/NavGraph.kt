package com.example.booking.navigation

import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.booking.screens.NumberScreen
import com.example.booking.screens.PaidScreen
import com.example.booking.screens.ReservationScreen
import com.example.booking.screens.Home

@RequiresApi(34)
@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ){
            Home(navController = navController)
        }
        composable(
            route = Screen.NumberL.route
        ) {
            NumberScreen(navController = navController)
        }

        composable(
            route = Screen.Reservation.route
        ) {
            ReservationScreen(navController = navController)
        }

        composable(
            route = Screen.Paid.route
        ) {
            PaidScreen(navController = navController)
        }
    }
}
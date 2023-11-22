package com.example.booking.navigation

sealed class Screen(val route: String){
    object Home: Screen(route = "home_screen")
    object NumberL: Screen(route = "number_screen")
    object Reservation: Screen(route = "reservation_screen")
    object Paid: Screen(route = "paid_screen")
}

package com.example.booking.dataClasses
data class HotelData(
    var start: String,
    val country: String,
    val city: String,
    val countOfNights: Int,
    val nights: String,
    val hotel: String,
    val number: String,
    val food: String

)

val hotel: HotelData = HotelData("Санкт-Петербург", "Египет, ", "Хугарда", 7, "ночей ", "Steigenberger Makadi",
    "Стандартный с видом на бассейн или сад", "Все включено" )



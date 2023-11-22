package com.example.booking.styledCard

data class DataCardInfo(
    val startDestination: String,
    val countryCard: String,
    val cityCard: String,
    val dates: String,
    val countOfNights: String,
    val hotelCard: String,
    val numberCard: String,
    val foodCard: String

)

val infoCard: DataCardInfo = DataCardInfo("Вылет из", "Страна, ","город", "Даты", "Кол-во ночей", "Отель", "Номер", "Питание" )

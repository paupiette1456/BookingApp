package com.example.booking.dataClasses

data class SumData(
    val tour: Int,
    val fuel: Int,
    val service: Int,
    val paid: Int,
    val rub: String
)

val sum: SumData = SumData (186_600, 9_300, 2_136, 198_036, "₽" )


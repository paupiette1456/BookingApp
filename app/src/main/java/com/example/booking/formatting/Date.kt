package com.example.booking.formatting

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

const val dateBegin = "2023-09-19"
const val dateEnd = "2023-09-27"
@SuppressLint("ConstantLocale")
val inputFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
@SuppressLint("ConstantLocale")
val outputFormat = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault())
val date1: Date? = inputFormat.parse(dateBegin)
val date2: Date? = inputFormat.parse(dateEnd)
val formattedDate1: String? = outputFormat.format(date1!!)
val formattedDate2: String? = outputFormat.format(date2!!)
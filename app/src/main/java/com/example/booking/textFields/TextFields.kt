package com.example.booking.textFields

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.booking.textFields.FieldBday
import com.example.booking.textFields.FieldCitizen
import com.example.booking.textFields.FieldExpired
import com.example.booking.textFields.FieldNumber
import com.example.booking.ui.theme.circle
import com.example.booking.ui.theme.field
import com.example.booking.ui.theme.field_up
import com.example.booking.ui.theme.sfProDisplay


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun CustomTextFields_phone() {
    var text_2 by remember{ mutableStateOf("") }
    TextField(

        value = text_2,
        onValueChange = { text_2 = it },
        modifier = Modifier.
        fillMaxWidth(),
        placeholder = {
                      Text(text = "+7 (951) 555-99-00",
                          color = Color.Black)

        },
        label = {
            Text("Номер телефона",
                style = TextStyle(
                    color = field_up,
                    fontFamily = sfProDisplay,
                    fontSize = 12.sp)
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = circle,
            unfocusedIndicatorColor = circle,
            focusedIndicatorColor = circle
        ),
        shape = RoundedCornerShape(10.dp),
        textStyle = TextStyle(fontFamily = sfProDisplay, color = field, fontSize = 16.sp)
    )
}





@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun CustomTextFields_mail() {
    var text_1 by remember{ mutableStateOf("") }
    TextField(

        value = text_1,
        onValueChange = { text_1 = it },
        modifier = Modifier.
        fillMaxWidth(),
        placeholder = {
                      Text(text = "examplemail.000@mail.ru",
                          color = Color.Black)
        },
        label = {
            Text("Почта",
                style = TextStyle(
                    color = field_up,
                    fontFamily = sfProDisplay,
                    fontSize = 12.sp)
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = circle,
            unfocusedIndicatorColor = circle,
            focusedIndicatorColor = circle
        ),
        shape = RoundedCornerShape(10.dp),
        textStyle = TextStyle(fontFamily = sfProDisplay, color = field, fontSize = 16.sp)
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun CustomTextFields_name() {
    var text_3 by remember{ mutableStateOf("") }
    TextField(

        value = text_3,
        onValueChange = { text_3 = it },
        modifier = Modifier.
        fillMaxWidth(),
        placeholder = {
                      Text(text = "Иван",
                          color = Color.Black)
        },
        label = {
            Text("Имя",
                style = TextStyle(
                    color = field_up,
                    fontFamily = sfProDisplay,
                    fontSize = 12.sp)
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = circle,
            unfocusedIndicatorColor = circle,
            focusedIndicatorColor = circle
        ),
        shape = RoundedCornerShape(10.dp),
        textStyle = TextStyle(fontFamily = sfProDisplay, color = field, fontSize = 16.sp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun CustomTextFields_surname() {
    var text_4 by remember{ mutableStateOf("") }
    TextField(
        value = text_4,
        onValueChange = { text_4 = it },
        modifier = Modifier
            .fillMaxWidth(),
        placeholder = {
                      Text(text = "Иванов",
                          color = Color.Black)
        },
        label = {
            Text("Фамилия",
                style = TextStyle(
                    color = field_up,
                    fontFamily = sfProDisplay,
                    fontSize = 12.sp)
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = circle,
            unfocusedIndicatorColor = circle,
            focusedIndicatorColor = circle
        ),
        shape = RoundedCornerShape(10.dp),
        textStyle = TextStyle(fontFamily = sfProDisplay, color = field, fontSize = 16.sp)
    )
}

@Preview
@Composable
fun CustomTextFields_bday() {
    FieldBday()
}

@Preview
@Composable
fun CustomTextFields_citizen() {
    FieldCitizen()
}

@Preview
@Composable
fun CustomTextFields_number() {
    FieldNumber()
}

@Preview
@Composable
fun CustomTextFields_expired() {
    FieldExpired()
}
















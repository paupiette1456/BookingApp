package com.example.booking.textFields

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.booking.ui.theme.circle
import com.example.booking.ui.theme.gray_font

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun FieldBday(hint: String = "Дата рождения") {
    var text by remember { mutableStateOf(TextFieldValue()) }

    BasicTextField(
        value = text,
        onValueChange = { text = it },
        textStyle = TextStyle(color = Color.Black),
        decorationBox = {innerTextField ->
            Box(
                modifier = Modifier
                    .background(color = circle, shape = RoundedCornerShape(size = 10.dp))
                    .padding(all = 16.dp)
                    .fillMaxWidth()
            ) {
                if (text.text.isEmpty()) {
                    Text(text = hint,
                        color = gray_font
                    )
                }
                innerTextField()
            }
        }
    )
}

@Preview
@Composable
fun FieldCitizen(hint: String = "Гражданство") {
    var text by remember { mutableStateOf(TextFieldValue()) }


    BasicTextField(
        value = text,
        onValueChange = { text = it },
        textStyle = TextStyle(color = Color.Black),
        decorationBox = {innerTextField ->
            Box(
                modifier = Modifier
                    .background(color = circle, shape = RoundedCornerShape(size = 10.dp))
                    .padding(all = 16.dp)
                    .fillMaxWidth()
            ) {
                if (text.text.isEmpty()) {
                    Text(text = hint,
                        color = gray_font
                    )
                }
                innerTextField()
            }
        }
    )
}

@Preview
@Composable
fun FieldNumber(hint: String = "Номер загранпаспорта") {
    var text by remember { mutableStateOf(TextFieldValue()) }

    BasicTextField(
        value = text,
        onValueChange = { text = it },
        textStyle = TextStyle(color = Color.Black),
        decorationBox = {innerTextField ->
            Box(
                modifier = Modifier
                    .background(color = circle, shape = RoundedCornerShape(size = 10.dp))
                    .padding(all = 16.dp)
                    .fillMaxWidth()
            ) {
                if (text.text.isEmpty()) {
                    Text(text = hint,
                        color = gray_font
                    )
                }
                innerTextField()
            }
        }
    )
}

@Preview
@Composable
fun FieldExpired(hint: String = "Срок действия загранпаспорта") {
    var text by remember { mutableStateOf(TextFieldValue()) }

    BasicTextField(
        value = text,
        onValueChange = { text = it },
        textStyle = TextStyle(color = Color.Black),
        decorationBox = {innerTextField ->
            Box(
                modifier = Modifier
                    .background(color = circle, shape = RoundedCornerShape(size = 10.dp))
                    .padding(all = 16.dp)
                    .fillMaxWidth()
            ) {
                if (text.text.isEmpty()) {
                    Text(text = hint,
                        color = gray_font
                    )
                }
                innerTextField()
            }
        }
    )
}


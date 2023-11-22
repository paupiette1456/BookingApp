package com.example.booking.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.booking.R
import com.example.booking.navigation.Screen
import com.example.booking.ui.theme.blue
import com.example.booking.ui.theme.blue_button_number
import com.example.booking.ui.theme.gray
import com.example.booking.ui.theme.gray_font
import com.example.booking.blendedColors.new_color
import com.example.booking.ui.theme.sfProDisplay


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable


fun NumberScreen(
    navController: NavController
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Steigenberger Makadi",
                        fontFamily = sfProDisplay,
                        fontWeight = FontWeight.W600,
                        fontSize = 18.sp)
                }
            )
            Spacer(modifier = Modifier.padding(top = 40.dp))
        },
        content = {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(start = 16.dp, end = 16.dp, top = 80.dp)
                )
                {

                    Column(
                        Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center) {

                        Image(
                            painter = painterResource(id = R.drawable.hotel2),
                            contentDescription = null)

                        Text(
                            text = "Стандартный с видом на бассейн или сад",
                            modifier = Modifier
                                .padding(top = 8.dp),
                            style = TextStyle(
                                fontSize = 22.sp,
                                fontFamily = sfProDisplay,
                                fontWeight = FontWeight.SemiBold))

                        Row(
                            horizontalArrangement = Arrangement.Start,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 8.dp))
                        {
                            Text(text = "Все включено",
                                Modifier
                                    .background(gray, shape = RoundedCornerShape(5.dp))
                                    .padding(start = 10.dp, top = 5.dp, end = 10.dp, bottom = 5.dp),
                                style = TextStyle(
                                    fontSize = 16.sp,
                                    fontFamily = sfProDisplay,
                                    color = gray_font,
                                    fontWeight = FontWeight.Medium))
                            Spacer(Modifier.width(8.dp))
                            Text(text = "Кондиционер",
                                Modifier
                                    .background(gray, shape = RoundedCornerShape(5.dp))
                                    .padding(start = 10.dp, top = 5.dp, end = 10.dp, bottom = 5.dp),
                                style = TextStyle(
                                    fontSize = 16.sp,
                                    fontFamily = sfProDisplay,
                                    color = gray_font,
                                    fontWeight = FontWeight.Medium))

                        }

                        Box(Modifier.padding(top = 8.dp)){
                            Row (
                                Modifier
                                    .background(new_color, shape = RoundedCornerShape(5.dp))
                                    .height(35.dp)
                            ){
                                TextButton(
                                    onClick = {},
                                    )
                                {
                                    Text(
                                        text = "Подробнее о номере",
                                        color = blue_button_number,
                                        fontSize = 16.sp,
                                        fontFamily = sfProDisplay
                                    )

                                    Spacer(Modifier.width(8.dp))

                                    Image(
                                        painter = painterResource(id = R.drawable.blue_arrow),
                                        contentDescription = null )
                                }
                            }
                        }
                        Box(
                            Modifier.padding(top = 16.dp)) {
                            Column() {
                                Row(
                                    Modifier.fillMaxWidth(),
                                    verticalAlignment = Alignment.Bottom){
                                    Text(
                                        text = "186 600₽",
                                        style = TextStyle(
                                            fontSize = 30.sp,
                                            fontFamily = sfProDisplay,
                                            fontWeight = FontWeight.Bold))
                                    Spacer(Modifier.width(8.dp))
                                    Text(
                                        text = "за 7 ночей с перелётом",
                                        style = TextStyle(
                                            fontFamily = sfProDisplay,
                                            fontSize = 16.sp,
                                            color = gray_font
                                        ))
                                }
                                Spacer(Modifier.height(16.dp))
                                Column(
                                    Modifier
                                        .fillMaxWidth()
                                        .fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally) {

                                    Button(
                                        onClick = {navController.navigate(route = Screen.Reservation.route)},
                                        colors = ButtonDefaults.buttonColors(blue),
                                        shape = RoundedCornerShape(15.dp),
                                        modifier = Modifier
                                            .width(343.dp)
                                            .height(48.dp))

                                    {
                                        Text("Выбрать номер",
                                            color = Color.Companion.White,
                                            fontSize = 16.sp,
                                            fontFamily = sfProDisplay,
                                            fontWeight = FontWeight.W500)
                                    }
                                }


                                Spacer(Modifier.height(30.dp))

                                Image(
                                    painter = painterResource(id = R.drawable.hotel3),
                                    contentDescription = null)

                                Text(
                                    text = "Стандартный с видом на бассейн или сад",
                                    modifier = Modifier
                                        .padding(top = 8.dp),
                                    style = TextStyle(
                                        fontSize = 22.sp,
                                        fontFamily = sfProDisplay,
                                        fontWeight = FontWeight.SemiBold))

                                Row(
                                    horizontalArrangement = Arrangement.Start,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 8.dp))
                                {
                                    Text(text = "Все включено",
                                        Modifier
                                            .background(gray, shape = RoundedCornerShape(5.dp))
                                            .padding(
                                                start = 10.dp,
                                                top = 5.dp,
                                                end = 10.dp,
                                                bottom = 5.dp
                                            ),
                                        style = TextStyle(
                                            fontSize = 16.sp,
                                            fontFamily = sfProDisplay,
                                            color = gray_font,
                                            fontWeight = FontWeight.Medium))
                                    Spacer(Modifier.width(8.dp))
                                    Text(text = "Кондиционер",
                                        Modifier
                                            .background(gray, shape = RoundedCornerShape(5.dp))
                                            .padding(
                                                start = 10.dp,
                                                top = 5.dp,
                                                end = 10.dp,
                                                bottom = 5.dp
                                            ),
                                        style = TextStyle(
                                            fontSize = 16.sp,
                                            fontFamily = sfProDisplay,
                                            color = gray_font,
                                            fontWeight = FontWeight.Medium))

                                }

                                Box(Modifier.padding(top = 8.dp)){
                                    Row (
                                        Modifier
                                            .background(new_color, shape = RoundedCornerShape(5.dp))
                                            .height(35.dp)
                                    ){
                                        TextButton(
                                            onClick = {},
                                        )
                                        {
                                            Text(
                                                text = "Подробнее о номере",
                                                color = blue_button_number,
                                                fontSize = 16.sp,
                                                fontFamily = sfProDisplay
                                            )

                                            Spacer(Modifier.width(8.dp))

                                            Image(
                                                painter = painterResource(id = R.drawable.blue_arrow),
                                                contentDescription = null )
                                        }
                                    }
                                }
                                Box(
                                    ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .fillMaxHeight()
                                            .padding(vertical = 15.dp),
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally) {
                                        Row(
                                            Modifier.fillMaxWidth(),
                                            verticalAlignment = Alignment.Bottom){
                                            Text(
                                                text = "186 600₽",
                                                style = TextStyle(
                                                    fontSize = 30.sp,
                                                    fontFamily = sfProDisplay,
                                                    fontWeight = FontWeight.Bold))
                                            Spacer(Modifier.width(8.dp))
                                            Text(text = "за 7 ночей с перелётом")
                                        }
                                        Spacer(Modifier.height(16.dp))
                                        Button(
                                            onClick = {},
                                            colors = ButtonDefaults.buttonColors(blue),
                                            shape = RoundedCornerShape(15.dp),
                                            modifier = Modifier
                                                .width(343.dp)
                                                .height(48.dp))

                                        {
                                            Text("Выбрать номер")
                                        }
                                    }
                                }
                            }
                            }
                        }
                    }

                }

        }

    )
}

@Preview
@Composable
fun NumberScreenPreview() {
    NumberScreen(
        navController = rememberNavController()
    )
}


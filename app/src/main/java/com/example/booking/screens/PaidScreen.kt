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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.booking.R
import com.example.booking.navigation.Screen
import com.example.booking.ui.theme.blue
import com.example.booking.ui.theme.circle
import com.example.booking.ui.theme.gray_font
import com.example.booking.ui.theme.sfProDisplay

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PaidScreen(
    navController: NavController
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        stringResource(R.string.paid_hotel),
                        fontFamily = sfProDisplay,
                        fontWeight = FontWeight.W600,
                        fontSize = 18.sp
                    )
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
                        .padding(start = 16.dp, end = 16.dp, top = 223.dp)
                )
                {

                    Column(
                        Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.party),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .background(color = circle, shape = CircleShape)
                                    .padding(20.dp)
                                    .size(40.dp))
                        }
                        Spacer(modifier = Modifier.height(50.dp))

                        Text(stringResource(id = R.string.ready_order),
                            style = TextStyle(
                                fontFamily = sfProDisplay,
                                fontSize = 22.sp,
                                fontWeight = FontWeight.W600)
                            )
                        Spacer(modifier = Modifier.height(24.dp))

                        Text(stringResource(id = R.string.number_order),
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontFamily = sfProDisplay,
                                fontSize = 16.sp,
                                color = gray_font,
                                fontWeight = FontWeight.Medium)
                            )
                        }
                    }
                }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

            }
        },
        bottomBar = {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Button(
                    onClick = {navController.navigate(route = Screen.Home.route)},
                    colors = ButtonDefaults.buttonColors(blue),
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier
                        .width(343.dp)
                        .height(48.dp))

                {
                    Text(stringResource(id = R.string.button_paidScreen))
                }

                }

        }

    )

}

@Composable
@Preview
fun PaidPreview() {
    PaidScreen(navController = rememberNavController())
}
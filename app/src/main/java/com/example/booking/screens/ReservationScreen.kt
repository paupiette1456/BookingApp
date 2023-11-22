package com.example.booking.screens

import android.annotation.SuppressLint
import androidx.annotation.RequiresApi
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.booking.addTourists.AddTourist
import com.example.booking.styledButtons.BlueButtonPaidScreen
import com.example.booking.styledButtons.ClickableLink1
import com.example.booking.styledButtons.ClickableLink2
import com.example.booking.styledButtons.ClickableLink3
import com.example.booking.styledButtons.ClickableLink4
import com.example.booking.styledCard.CustomerCard
import com.example.booking.addTourists.FirstTourist
import com.example.booking.customImages.ImageRate
import com.example.booking.addTourists.SecondTourist
import com.example.booking.styledCard.FilledCardExample
import com.example.booking.styledCard.SumCard
import com.example.booking.ui.theme.sfProDisplay

@RequiresApi(34)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReservationScreen(
    navController: NavController
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Бронирование",
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
                        .padding(start = 16.dp, end = 16.dp, top = 80.dp)
                )
                {
                    ImageRate()

                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(start = 16.dp, end = 16.dp, top = 8.dp)
                ) {
                    Column {
                        Text(text = "Steigenberger Makadi",
                            style = TextStyle(
                                fontFamily = sfProDisplay,
                                fontSize = 22.sp,
                                fontWeight = FontWeight.W600)
                            )
                        Row ()
                        {
                            ClickableLink1()
                            Spacer(Modifier.width(5.dp))
                            ClickableLink2()
                            Spacer(Modifier.width(5.dp))
                            ClickableLink3()
                            Spacer(Modifier.width(5.dp))
                            ClickableLink4()
                        }
                    }

                }
                FilledCardExample()
                Spacer(modifier = Modifier.height(8.dp))
                CustomerCard()
                Spacer(modifier = Modifier.height(10.dp))
                FirstTourist()
                SecondTourist()
                AddTourist()
                SumCard()
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    BlueButtonPaidScreen(navController)
                }


            }
        }
    )
}

@RequiresApi(34)
@Preview
@Composable
fun ReservationPreview() {
    ReservationScreen(
        navController = rememberNavController() )
}

package com.example.booking.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Gray
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
import com.example.booking.customImages.Advantages
import com.example.booking.customImages.ImageRate
import com.example.booking.styledButtons.BlueButton
import com.example.booking.styledCard.BottomCard
import com.example.booking.ui.theme.blue
import com.example.booking.ui.theme.gray
import com.example.booking.ui.theme.gray1
import com.example.booking.ui.theme.gray_font
import com.example.booking.ui.theme.sfProDisplay


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(
    navController: NavController
) {
    val scrollState = rememberScrollState()


    Scaffold {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = "Отель",
                fontFamily = sfProDisplay,
                fontWeight = FontWeight.W600,
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 10.dp)
                    .fillMaxWidth()
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .padding(horizontal = 16.dp)
            ) {


                Image(
                    painter = painterResource(id = R.drawable.hotel1),
                    contentDescription = stringResource(id = R.string.hotel_content_description),
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                )
                Image(
                    painter = painterResource(id = R.drawable.segments),
                    contentDescription = null,
                    modifier = Modifier.padding(top = 260.dp, start = 150.dp)
                )

            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)
                    .padding(start = 16.dp)

            ) {
                ImageRate()
            }

            Text(
                text = "Steigenberger Makadi",
                fontSize = 22.sp,
                modifier = Modifier
                    .padding(start = 16.dp)
            )

            Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                Text(
                    text = "Madinat Makadi, Safaga Road, Makadi Bay, Египет",
                    fontSize = 14.sp,
                    color = blue,
                    modifier = Modifier
                        .padding(start = 16.dp)
                )

            }

            Spacer(
                modifier = Modifier.size(30.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Start
            )
            {
                Text(
                    text = "от 134 673 ₽ ",
                    fontSize = 26.sp,
                    fontFamily = sfProDisplay,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = 16.dp),
                )
                Text(
                    text = "за тур с перелётом",
                    fontSize = 14.sp,
                    fontFamily = sfProDisplay,
                    color = Gray,
                    textAlign = TextAlign.Center
                )

            }

            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Об отеле",
                modifier = Modifier
                    .padding(start = 16.dp),
                style = TextStyle(
                    fontSize = 22.sp,
                    fontFamily = sfProDisplay,
                    fontWeight = FontWeight.SemiBold
                )
            )

                Column(

                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Advantages()
                    Text(
                        text = "Отель VIP-класса с собственными гольф полями. " +
                                "Высокий уровнь сервиса. Рекомендуем для респектабельного отдыха. " +
                                "Отель принимает гостей от 18 лет!",
                        textAlign = TextAlign.Left,
                        fontFamily = sfProDisplay,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W400,
                        modifier = Modifier
                            .fillMaxWidth()
                    )


                }
            BottomCard()
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                BlueButton(navController)
            }


        }
    }

}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    Home(
        navController = rememberNavController()
    )

}










    

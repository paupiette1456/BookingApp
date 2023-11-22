package com.example.booking.styledCard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.booking.R
import com.example.booking.ui.theme.gray1
import com.example.booking.ui.theme.gray_font
import com.example.booking.ui.theme.sfProDisplay

@Preview
@Composable
fun BottomCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(230.dp)
            .padding(horizontal = 16.dp)
            .background(color = gray1, shape = RoundedCornerShape(15.dp))
    ) {

        Column(
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 35.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.happy),
                    contentDescription = "smile"
                )



                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Column {
                            Text(text = "Что включено",
                                style = TextStyle(
                                    fontFamily = sfProDisplay,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Normal)
                            )
                            Text(text = "Самое необходимое",
                                style = TextStyle(
                                    fontFamily = sfProDisplay,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = gray_font)
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                        }

                        Spacer(modifier = Modifier.width(160.dp))

                        Image(
                            painter = painterResource(id = R.drawable.arrow_right),
                            contentDescription = "smile"
                        )


                    }
                    Image(
                        painter = painterResource(id = R.drawable.vector),
                        contentDescription = "smile"
                    )

                }



            }
            Spacer(modifier = Modifier.height(8.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.tick),
                    contentDescription = "smile"
                )



                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Column {
                            Text(text = "Что не включено",
                                style = TextStyle(
                                    fontFamily = sfProDisplay,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Normal)
                            )
                            Text(text = "Самое необходимое",
                                style = TextStyle(
                                    fontFamily = sfProDisplay,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = gray_font)
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                        }

                        Spacer(modifier = Modifier.width(160.dp))

                        Image(
                            painter = painterResource(id = R.drawable.arrow_right),
                            contentDescription = "smile"
                        )


                    }
                    Image(
                        painter = painterResource(id = R.drawable.vector),
                        contentDescription = "smile"
                    )

                }



            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.close),
                    contentDescription = "smile"
                )



                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Column {
                            Text(text = "Удобства",
                                style = TextStyle(
                                    fontFamily = sfProDisplay,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Normal)
                            )
                            Text(text = "Самое необходимое",
                                style = TextStyle(
                                    fontFamily = sfProDisplay,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = gray_font)
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                        }

                        Spacer(modifier = Modifier.width(160.dp))

                        Image(
                            painter = painterResource(id = R.drawable.arrow_right),
                            contentDescription = "smile"
                        )
                        Spacer(modifier = Modifier.height(10.dp))


                    }

                }

            }

        }

    }
}
package com.example.booking.styledCard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun FilledCardExample() {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 16.dp)
        )
        {
            Row {
                Column {
                    StyledTextHotelCard1()
                    Row {
                        StyledTextHotelCard2()
                        StyledTextHotelCard3()
                    }
                    StyledTextHotelCard4()
                    StyledTextHotelCard5()
                    StyledTextHotelCard6()
                    StyledTextHotelCard7()
                    Spacer(modifier = Modifier.height(15.dp))
                    StyledTextHotelCard8()
                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentSize(Alignment.CenterEnd))
                {
                    Column {
                        Row {
                            StyledTextHotelCardRight1()
                        }
                        Row {
                            StyledTextHotelCardRight2()
                            StyledTextHotelCardRight3()
                        }
                        Row {
                            StyledTextHotelCardRight4()
                            Text(text = " - ")
                            StyledTextHotelCardRight5()

                        }
                        Row {
                            StyledTextHotelCardRight6()
                            Text(text = " ")
                            StyledTextHotelCardRight10()
                        }

                        Row {
                            StyledTextHotelCardRight7()
                        }
                        Row {
                            Box(
                                modifier = Modifier.
                                width(160.dp)
                            ) {
                                StyledTextHotelCardRight8()
                            }

                        }
                        Row {
                            StyledTextHotelCardRight9()
                        }


                    }
                }
            }
        }
    }
}
package com.example.booking.styledCard



import androidx.compose.foundation.layout.Arrangement
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
import com.example.booking.formatting.FuelFormatted
import com.example.booking.formatting.PaidFormatted
import com.example.booking.formatting.ServiceFormatted
import com.example.booking.formatting.TourFormatted
import com.example.booking.dataClasses.sum
import com.example.booking.styledCard.StyledTextSumCard1
import com.example.booking.styledCard.StyledTextSumCard2
import com.example.booking.styledCard.StyledTextSumCard3
import com.example.booking.styledCard.StyledTextSumCard4
import com.example.booking.ui.theme.link_color


@Preview
@Composable
fun SumCard() {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 16.dp)
        )
        {
            Column {

            }
            Row {
                Column {
                    StyledTextSumCard1()
                    StyledTextSumCard2()
                    StyledTextSumCard3()
                    StyledTextSumCard4()

                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentSize(Alignment.CenterEnd))
                    {
                      Column {
                          Row {
                              TourFormatted()
                              Spacer(modifier = Modifier.width(2.dp))
                              Text(sum.rub)
                          }
                          Row {
                              FuelFormatted()
                              Spacer(modifier = Modifier.width(2.dp))
                              Text(sum.rub)
                          }
                          Row {
                              ServiceFormatted()
                              Spacer(modifier = Modifier.width(2.dp))
                              Text(sum.rub)
                          }
                          Row {
                              PaidFormatted()
                              Spacer(modifier = Modifier.width(2.dp))
                              Text(
                                  sum.rub,
                                  color = link_color
                              )
                          }

                      }
                    }
                }
            }
        }

}

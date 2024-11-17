package com.ahuaman.stylistecommerceapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahuaman.stylistecommerceapp.R
import com.ahuaman.stylistecommerceapp.components.CustomButton
import com.ahuaman.stylistecommerceapp.components.CustomTopBar
import com.ahuaman.stylistecommerceapp.data.MockListSize

@Composable
fun DetailsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),

    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.image_1),
                contentDescription = "Details",
                modifier = Modifier.fillMaxWidth()
            )

            CustomTopBar(
                iconMenu = R.drawable.ic_arrow_left
            )
        }


        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth().padding( horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Men's Printed Pullover Hoodie",
                style = TextStyle(
                    fontSize = 13.sp,
                    lineHeight = 14.3.sp,
                    fontFamily = FontFamily(Font(R.font.inter_regular)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF8F959E),
                )
            )

            Text(
                text = "Price",
                style = TextStyle(
                    fontSize = 13.sp,
                    lineHeight = 14.3.sp,
                    fontFamily = FontFamily(Font(R.font.inter_regular)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF8F959E),
                )
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth().padding( horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Nike Club Fleece",
                style = TextStyle(
                    fontSize = 22.sp,
                    lineHeight = 24.2.sp,
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontWeight = FontWeight(600),
                )
            )

            Text(
                text = "$99",
                style = TextStyle(
                    fontSize = 22.sp,
                    lineHeight = 24.2.sp,
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontWeight = FontWeight(600),
                )
            )
        }

        Spacer(modifier = Modifier.height(21.dp))

        //horizontal scroll with items
        LazyRow(
            modifier = Modifier.fillMaxWidth().padding( horizontal = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(9.dp)
        ) {
            items(4){
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(77.dp)
                        .width(77.dp)
                        .background(
                            color = Color(0xFFE5E5E5),
                            shape = RoundedCornerShape(20.dp)
                        )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.image_1),
                        contentDescription = "image description",
                        contentScale = ContentScale.Inside,
                        modifier = Modifier
                            .background(Color.White, shape = RoundedCornerShape(10.dp))
                            .height(150.dp)
                            .fillMaxWidth()
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Row(
            modifier = Modifier.fillMaxWidth().padding( horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Size",
                style = TextStyle(
                    fontSize = 17.sp,
                    lineHeight = 18.7.sp,
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontWeight = FontWeight(600),
                )
            )

            Text(
                text = "Size Guide",
                style = TextStyle(
                    fontSize = 15.sp,
                    lineHeight = 16.5.sp,
                    fontFamily = FontFamily(Font(R.font.inter_regular)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF8F959E),
                )
            )
        }
        Spacer(modifier = Modifier.height(10.dp))

        LazyRow(
            modifier = Modifier.fillMaxWidth().padding( horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            items(MockListSize.listSize){
                Box(
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                        .background(
                            color = Color(0xFFE5E5E5),
                            shape = RoundedCornerShape(10.dp)
                        ),
                    contentAlignment = androidx.compose.ui.Alignment.Center
                ) {
                    Text(
                        text = it,
                        style = TextStyle(
                            fontSize = 17.sp,
                            lineHeight = 18.7.sp,
                            fontFamily = FontFamily(Font(R.font.inter_semibold)),
                            fontWeight = FontWeight(600),
                        ),

                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(15.dp))
        Row(
            modifier = Modifier.fillMaxWidth().padding( horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Description",
                style = TextStyle(
                    fontSize = 17.sp,
                    lineHeight = 18.7.sp,
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontWeight = FontWeight(600),
                )
            )

        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth().padding( horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "The Nike Throwback Pullover Hoodie is made from premium French terry fabric that blends a performance feel with Read More..",
                style = TextStyle(
                    fontSize = 15.sp,
                    lineHeight = 21.sp,
                    fontFamily = FontFamily(Font(R.font.inter_regular)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF8F959E),
                )
            )
        }

        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth().padding( horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Reviews",
                style = TextStyle(
                    fontSize = 17.sp,
                    lineHeight = 18.7.sp,
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontWeight = FontWeight(600),
                )
            )

            Text(
                text = "View All",
                style = TextStyle(
                    fontSize = 15.sp,
                    lineHeight = 16.5.sp,
                    fontFamily = FontFamily(Font(R.font.inter_regular)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF8F959E),
                )
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(0.dp),
            onClick = {
                /*TODO*/
            }) {
            Text(text = "Add to Cart", modifier = Modifier.padding(top = 20.dp, bottom = 20.dp))
        }


    }
}


@Preview
@Composable
private fun DetailsScreenPrev() {
    DetailsScreen(
        modifier = Modifier.fillMaxSize()
    )
}
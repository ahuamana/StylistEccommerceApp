package com.ahuaman.stylistecommerceapp.screens

import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import com.ahuaman.stylistecommerceapp.components.CustomItemCategory
import com.ahuaman.stylistecommerceapp.components.CustomItemShop
import com.ahuaman.stylistecommerceapp.data.MockListCategory
import com.ahuaman.stylistecommerceapp.data.MockListItemShop

@Composable
fun HomeScreenSEA(
    modifier: Modifier = Modifier,
    onClickItem: () -> Unit
) {

    var inputText by remember { mutableStateOf("") }

    Column(modifier= modifier.fillMaxSize()) {

        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Hemendra",
                style = TextStyle(
                    fontSize = 28.sp,
                    lineHeight = 30.8.sp,
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontWeight = FontWeight(600),
                )
            )

            Text(
                text = "Welcome to Laza.",
                style = TextStyle(
                    fontSize = 15.sp,
                    lineHeight = 16.5.sp,
                    fontFamily = FontFamily(Font(R.font.inter_regular)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF8F959E),
                )
            )
        }

        Row(
            modifier = Modifier.padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomButton(
                icon = R.drawable.ic_search,
                colorIcon = Color.Transparent,
            )

            BasicTextField(
                value = inputText,
                onValueChange = { inputText = it },
                textStyle = TextStyle(
                    fontSize = 15.sp,
                    lineHeight = 16.5.sp,
                    fontFamily = FontFamily(Font(R.font.inter_regular)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF8F959E),
                ),
                modifier = Modifier.weight(1f).padding(start = 10.dp),
                decorationBox = { innerTextField ->
                    if(inputText.isEmpty()) {
                        Text(text = "Search...", color = Color(0xFF8F959E), fontSize = 13.sp)
                    } else Text(text = inputText, fontSize = 15.sp)
                }
            )

            CustomButton(
                modifier = Modifier.padding(start = 10.dp),
                icon = R.drawable.ic_voice,
            )

        }

        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = "Choose Brand",
                style = TextStyle(
                    fontSize = 17.sp,
                    lineHeight = 18.7.sp,
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontWeight = FontWeight(500),
                )
            )

            Text(
                text = "View All",
                style = TextStyle(
                    fontSize = 13.sp,
                    lineHeight = 14.3.sp,
                    fontFamily = FontFamily(Font(R.font.inter_regular)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF8F959E),
                )
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(Modifier.fillMaxWidth()) {
            val list = MockListCategory.listCategory()
            LazyRow {
                items(list) { item ->
                    CustomItemCategory(
                        icon = item.icon,
                        title = item.name
                    )
                }
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = "New Arraival",
                style = TextStyle(
                    fontSize = 17.sp,
                    lineHeight = 18.7.sp,
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontWeight = FontWeight(500),
                )
            )

            Text(
                text = "View All",
                style = TextStyle(
                    fontSize = 13.sp,
                    lineHeight = 14.3.sp,
                    fontFamily = FontFamily(Font(R.font.inter_regular)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF8F959E),
                )
            )


        }

        //Items shop

        val list = MockListItemShop.getDefaultList()

        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Fixed(2),
            state = rememberLazyStaggeredGridState(),
        ) {
            items(list) { item ->
                CustomItemShop(
                    itemShop = item,
                    onClickItem = onClickItem
                )
            }
        }

    }
}

@Preview
@Composable
private fun HomeScreenPrev() {
    HomeScreenSEA(
        onClickItem = {}
    )
}
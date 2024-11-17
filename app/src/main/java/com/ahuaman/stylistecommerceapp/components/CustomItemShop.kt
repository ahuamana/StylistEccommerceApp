package com.ahuaman.stylistecommerceapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahuaman.stylistecommerceapp.R
import com.ahuaman.stylistecommerceapp.data.MockListItemShop
import com.ahuaman.stylistecommerceapp.domain.ItemShop

@Composable
fun CustomItemShop(
    modifier: Modifier = Modifier,
    itemShop: ItemShop,
    onClickItem: () -> Unit
) {
    Column(
        modifier = modifier
            .defaultMinSize(minHeight = 200.dp)
            .padding(end = 16.dp, bottom = 16.dp, start = 16.dp, top = 0.dp)
            .fillMaxWidth()
            .clickable(
                onClick = {onClickItem() }
            ),
    ){

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color(0xFFE5E5E5),
                    shape = RoundedCornerShape(10.dp)
                ),
            contentAlignment = Alignment.Center

        ) {
            Image(
                painter = painterResource(id = itemShop.image),
                contentDescription = "image description",
                contentScale = ContentScale.Inside,
                modifier = Modifier
                    .background(Color.White, shape = RoundedCornerShape(10.dp))
                    .height(150.dp)
                    .fillMaxWidth()
            )
            Icon(
                contentDescription = "image description",
                painter = painterResource(id = R.drawable.ic_favorite_dashboard),
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(16.dp),
               tint = Color(0xFF9775FA),
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        //title
        Text(
            text = itemShop.title,
            style = TextStyle(
                fontSize = 11.sp,
                lineHeight = 15.4.sp,
                fontFamily = FontFamily(Font(R.font.inter_regular)),
                fontWeight = FontWeight(500),
            )
        )
        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "$${itemShop.price}",
            style = TextStyle(
                fontSize = 13.sp,
                lineHeight = 14.3.sp,
                fontFamily = FontFamily(Font(R.font.inter_semibold)),
                fontWeight = FontWeight(600),
            ),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )


    }
}

@Preview
@Composable
private fun CustomItemShopPrev() {
    val itemShop = ItemShop(
        id = 1,
        image = R.drawable.ic_shop_three,
        title = "Adidas",
        price = 100.0
    )
    CustomItemShop(itemShop = itemShop, onClickItem = {})
}


@Preview
@Composable
private fun ListItemShopPrev() {
   val list = MockListItemShop.getDefaultList()

    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2),
        state = rememberLazyStaggeredGridState(),
    ) {
         items(list) { item ->
            CustomItemShop(
                itemShop = item,
                onClickItem = {}
            )
        }
    }
}
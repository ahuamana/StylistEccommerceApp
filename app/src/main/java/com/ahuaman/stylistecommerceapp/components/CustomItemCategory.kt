package com.ahuaman.stylistecommerceapp.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahuaman.stylistecommerceapp.R
import com.ahuaman.stylistecommerceapp.data.MockListCategory

@Composable
fun CustomItemCategory(
    modifier: Modifier = Modifier,
   @DrawableRes icon: Int = R.drawable.adidas,
    title: String = "Adidas"
) {
    Row(
        modifier = modifier.padding(16.dp),
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color(0xFF9775FA)),
        )

        Spacer(modifier = Modifier.width(16.dp))

        Text(
            text = title,
            style = TextStyle(
                fontSize = 15.sp,
                lineHeight = 16.5.sp,
                fontFamily = FontFamily(Font(R.font.inter_semibold)),
                fontWeight = FontWeight(500),
            )
        )

    }
}


@Preview
@Composable
private fun CustomItemCategoryPrev() {
    CustomItemCategory()
}

@Preview
@PreviewScreenSizes
@Composable
private fun ListItemCategoryPrev() {
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
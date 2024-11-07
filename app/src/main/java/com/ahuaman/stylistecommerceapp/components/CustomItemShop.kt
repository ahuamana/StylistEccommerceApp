package com.ahuaman.stylistecommerceapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ahuaman.stylistecommerceapp.R

@Composable
fun CustomItemShop(modifier: Modifier = Modifier) {
    Column {
        Box {
            Image(
                modifier = modifier.height(203.dp).clip(
                    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp)
                ),
                painter = painterResource(id = R.drawable.image_1),
                contentDescription = "image description",
                contentScale = ContentScale.Inside
            )

            Icon(
                painter = painterResource(id = R.drawable.ic_favorite_dashboard),
                contentDescription = "heart",
                tint = androidx.compose.ui.graphics.Color.Gray,
                modifier = Modifier
                    .padding(end = 16.dp, top = 16.dp)
                    .height(14.dp)
                    .align(Alignment.TopEnd)
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

    }
}


@Preview
@Composable
private fun CustomItemShopPrev() {
    CustomItemShop()
}
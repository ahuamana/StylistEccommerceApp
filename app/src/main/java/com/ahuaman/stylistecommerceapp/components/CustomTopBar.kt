package com.ahuaman.stylistecommerceapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ahuaman.stylistecommerceapp.R

@Composable
fun CustomTopBar(modifier: Modifier = Modifier) {

    val imageMenu = painterResource(id = R.drawable.ic_menu_dashboard)
    val imageBag = painterResource(id = R.drawable.ic_menu_bag)

    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White
            ),
            contentPadding = PaddingValues(0.dp),
            modifier = Modifier
                .clip(RoundedCornerShape(50))
        ) {
            Image(
                painter = imageMenu,
                contentDescription = "Menu",
                modifier = Modifier
                    .padding(16.dp)
                    .clip(RoundedCornerShape(50))
            )
        }


        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White
            ),
            contentPadding = PaddingValues(0.dp),
            modifier = Modifier
                .clip(RoundedCornerShape(50))
        ) {
            Image(
                painter = imageBag,
                contentDescription = "Menu",
                modifier = Modifier
                    .padding(16.dp)
                    .clip(RoundedCornerShape(50))
            )
        }
    }
}

@Preview
@Composable
private fun CustomTopBarPrev() {
    CustomTopBar()
}
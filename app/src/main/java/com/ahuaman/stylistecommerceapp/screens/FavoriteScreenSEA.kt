package com.ahuaman.stylistecommerceapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FavoriteScreenSEA(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Favorite Screen")
    }
}

@Preview
@Composable
private fun FavoriteScreenSEAPreview() {
    FavoriteScreenSEA()
}
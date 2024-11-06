package com.ahuaman.stylistecommerceapp.screens

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahuaman.stylistecommerceapp.R

@Composable
fun HomeScreenSEA(modifier: Modifier = Modifier) {
    Column(modifier= modifier.fillMaxSize()) {
       Text("Home Screen")
    }
}

@Preview
@Composable
private fun HomeScreenPrev() {
    HomeScreenSEA()
}
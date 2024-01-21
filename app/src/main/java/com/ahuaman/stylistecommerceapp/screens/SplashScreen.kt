package com.ahuaman.stylistecommerceapp.screens

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahuaman.stylistecommerceapp.R


@Composable
fun SplashScreen() {

    //add image logo from res/drawable
    val imgLogo = painterResource(id = R.drawable.ic_dress_new)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF9775FA)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {


        Image(
            modifier = Modifier
                .height(222.dp)
                .width(222.dp),
            painter = imgLogo, contentDescription = null)

        Text(
            text = "STYLISH",
            style = TextStyle(
                fontSize = 32.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                fontFamily = FontFamily(Font(R.font.fira_sans_regular)
            ),
            color = Color.White
        ))
        Text(
            text = "Find Your Slyle",
            style = TextStyle(
                fontSize = 40.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                fontFamily = FontFamily(Font(R.font.sacramento_regular)),
            ),
            color = Color.White
        )

    }
}


@Preview
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}
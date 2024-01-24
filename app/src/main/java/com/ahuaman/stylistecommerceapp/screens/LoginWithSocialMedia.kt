package com.ahuaman.stylistecommerceapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@Composable
fun LoginWithSocialMedia() {

    val painter = painterResource(id = com.ahuaman.stylistecommerceapp.R.drawable.ic_arrow_left)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        //header
        Column(modifier = Modifier.fillMaxWidth()) {
            Icon(
                modifier = Modifier.padding(start = 20.dp, top = 20.dp),
                painter = painter, contentDescription = null,
                tint = Color.Black)
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = "Let’s Get Started",
                style = TextStyle(
                    fontSize = 28.sp,
                    lineHeight = 30.8.sp,
                    fontFamily = FontFamily(Font(R.font.fira_sans_regular)),
                    fontWeight = FontWeight(600))
            )
        }

        //Three buttons -- body
        val painterFacebook = painterResource(id = R.drawable.ic_facebook)
        Column {
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, bottom = 10.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF4267B2),
                ),
                onClick = { /*TODO*/ }) {
                Image(painter = painterFacebook, contentDescription = null, modifier = Modifier.padding(end = 4.dp))
                Text(
                    fontSize = 17.sp,
                    modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                    text = "Facebook")
            }

            val painterTwitter = painterResource(id = R.drawable.twitter)
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, bottom = 10.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF1DA1F2),
                ),
                onClick = { /*TODO*/ }) {
                Image(painter = painterTwitter, contentDescription = null, modifier = Modifier.padding(end = 4.dp))
                Text(
                    fontSize = 17.sp,
                    modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                    text = "Twitter")
            }

            val painterGoogle = painterResource(id = R.drawable.ic_google)
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, bottom = 10.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFEA4335),
                ),
                onClick = { /*TODO*/ }) {
                Image(painter = painterGoogle, contentDescription = null, modifier = Modifier.padding(end = 4.dp))
                Text(
                    fontSize = 17.sp,
                    modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                    text = "Google")
            }
        }


        //Container container login with credentials -- footer
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 20.dp),
                horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Already have an account?", color = Color(0xFF8F959E))
                Text(text = " Signin", fontWeight = FontWeight(600))
            }

            Button(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(0.dp),
                onClick = { /*TODO*/ }) {
                Text(text = "Create an Account", modifier = Modifier.padding(top = 20.dp, bottom = 20.dp))
            }
        }
    }
}

@Preview
@Composable
fun LoginWithSocialMediaPrev() {
    LoginWithSocialMedia()
}
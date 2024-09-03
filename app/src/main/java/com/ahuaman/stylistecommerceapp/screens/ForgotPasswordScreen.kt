package com.ahuaman.stylistecommerceapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahuaman.stylistecommerceapp.R
import com.ahuaman.stylistecommerceapp.components.CustomTextFieldWithIcon

@Composable
fun ForgotPasswordScreen(modifier: Modifier = Modifier) {
    val painter = painterResource(id = com.ahuaman.stylistecommerceapp.R.drawable.ic_arrow_left)
    val imageCloud = painterResource(id = com.ahuaman.stylistecommerceapp.R.drawable.ic_cloud)
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        //header
        Column(modifier = Modifier.fillMaxWidth()) {
            Icon(
                modifier = Modifier.padding(start = 20.dp, top = 20.dp),
                painter = painter, contentDescription = null,
                tint = Color.Black
            )
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = "Forgot Password",
                style = TextStyle(
                    fontSize = 28.sp,
                    lineHeight = 30.8.sp,
                    fontFamily = FontFamily(Font(R.font.fira_sans_regular)),
                    fontWeight = FontWeight(600)
                )
            )

            //Body
            Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp)) {
                Image(
                    painter = imageCloud,
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 20.dp)
                )

                CustomTextFieldWithIcon(
                    placeholder = "Email Address",
                    text = email,
                    isVisibleIcon = true,
                    emptyPlaceholder = "asd@gmail.com",
                    onValueChange = { email = it }
                )
            }

        }

        //Footer
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                modifier = Modifier.padding( horizontal = 56.dp),
                textAlign = TextAlign.Center,
                fontSize = 13.sp,
                fontFamily = FontFamily(Font(R.font.inter_regular)),
                text = "Please write your email to receive a confirmation code to set a new password.",
                color = Color(0xFF8F959E))

            Spacer(modifier = Modifier.padding(top = 25.dp))

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
private fun ForgotPasswordScreenPrev() {
    ForgotPasswordScreen(modifier = Modifier.fillMaxSize())
}
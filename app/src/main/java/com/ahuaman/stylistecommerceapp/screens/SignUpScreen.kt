package com.ahuaman.stylistecommerceapp.screens

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
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
import com.ahuaman.stylistecommerceapp.components.CustomTextFieldWithIcon

@Composable
fun SignUpScreen() {

    val painter = painterResource(id = R.drawable.ic_arrow_left)
    var isChecked by remember { mutableStateOf(false) }

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        //header
        Column(modifier = Modifier.fillMaxWidth()) {
            Icon(
                modifier = Modifier.padding(start = 20.dp, top = 20.dp),
                painter = painter, contentDescription = null,
                tint = Color.Black)
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = "Sign Up",
                style = TextStyle(
                    fontSize = 28.sp,
                    lineHeight = 30.8.sp,
                    fontFamily = FontFamily(Font(R.font.fira_sans_regular)),
                    fontWeight = FontWeight(600)
                )
            )
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)) {

            CustomTextFieldWithIcon(
                placeholder = "Username",
                text = username,
                emptyPlaceholder = "Hemendra Mali",
                isVisibleIcon = true,
                onValueChange = { username = it }
            )
            CustomTextFieldWithIcon(
                placeholder = "Password",
                text = password
                , isVisibleTextIcon = true,
                emptyPlaceholder = "12345679",
                onValueChange = { password = it }
            )
            CustomTextFieldWithIcon(
                placeholder = "Email Address",
                text = email,
                isVisibleIcon = true,
                emptyPlaceholder = "asd@gmail.com",
                onValueChange = { email = it }
            )

            Column (modifier = Modifier
                .fillMaxWidth()) {
                Spacer(modifier = Modifier.padding(top = 42.dp))
                Row(modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("Remember me")
                    Switch(checked = isChecked, onCheckedChange = { isChecked = it })
                }
            }
        }



        //Container container login with credentials -- footer
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {

            Spacer(modifier = Modifier.padding(top = 20.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(0.dp),
                onClick = { /*TODO*/ }) {
                Text(text = "Sign Up", modifier = Modifier.padding(top = 20.dp, bottom = 20.dp))
            }
        }

    }
}


@Preview
@Composable
fun SignUpScreenPrev() {
    SignUpScreen()
}
package com.ahuaman.stylistecommerceapp.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
fun WelcomeScreen(
    onBackPressed: () -> Unit,
    onLoginSuccess: () -> Unit
) {

    val painter = painterResource(id = R.drawable.ic_arrow_left)
    var isChecked by remember { mutableStateOf(false) }

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        //header
        Column(modifier = Modifier.fillMaxWidth()) {
            Icon(
                modifier = Modifier.padding(start = 20.dp, top = 20.dp).clickable(
                    onClick = onBackPressed
                ),
                painter = painter, contentDescription = null,
                tint = Color.Black)

            Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Welcome",
                    style = TextStyle(
                        fontSize = 28.sp,
                        lineHeight = 30.8.sp,
                        fontFamily = FontFamily(Font(R.font.fira_sans_regular)),
                        fontWeight = FontWeight(600)
                    )
                )

                Text(
                    text = "Please enter your data to continue",
                    modifier = Modifier.padding(top = 10.dp),
                    color = Color(0xFF8F959E),
                )
            }

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

            Text(text = "Forgot Password?",
                modifier = Modifier
                    .padding(start = 20.dp, top = 30.dp)
                    .align(Alignment.End),
                color = Color(0xFFEA4335)

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

            Column(modifier = Modifier.fillMaxWidth().padding(top = 20.dp, bottom = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "By connecting your account confirm that you agree", fontSize = 13.sp,  color = Color(0xFF8F959E))
                Row() {
                    Text(text = "with our", fontSize = 13.sp,  color = Color(0xFF8F959E))
                    Text(text = " Term and Condition",fontSize = 13.sp, fontWeight = FontWeight(600))
                }
            }


            Spacer(modifier = Modifier.padding(top = 20.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(0.dp),
                onClick = { onLoginSuccess()}) {
                Text(text = "Login", modifier = Modifier.padding(top = 20.dp, bottom = 20.dp))
            }
        }

    }
}


@Preview
@Composable
fun WelcomeScreenPrev() {
    WelcomeScreen(
        onBackPressed = {},
        onLoginSuccess = {}
    )
}
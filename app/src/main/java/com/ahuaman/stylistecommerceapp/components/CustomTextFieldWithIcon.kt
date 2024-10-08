package com.ahuaman.stylistecommerceapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahuaman.stylistecommerceapp.R


@Composable
fun CustomTextFieldWithIcon(
    placeholder: String,
    text: String ,
    emptyPlaceholder: String = "",
    icon:Int = R.drawable.ic_check,
    isVisibleIcon:Boolean = false,
    isVisibleTextIcon:Boolean = false,
    onValueChange: (String) -> Unit,
) {

    val painter = painterResource(id = icon)

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = placeholder, color = Color(0xFF8F959E), fontSize = 13.sp)
        Spacer(modifier = Modifier.height(15.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            BasicTextField(
                value = text,
                onValueChange = { onValueChange(it) },
                decorationBox = {
                    if(text.isEmpty()) {
                        Text(text = emptyPlaceholder, color = Color(0xFF8F959E), fontSize = 13.sp)
                    } else Text(text = text, fontSize = 15.sp)

                })

            Row {
                if(isVisibleIcon) Icon(painter = painter, contentDescription = null, tint = Color(0xFF34C358))
                if(isVisibleTextIcon) Text(text = "Strong", color = Color(0xFF34C358), fontSize = 13.sp)
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Divider(color = Color(0xFFE7E8EA), thickness = 1.dp)
    }
}


@Preview
@Composable
fun CustomTextFieldWithIconPrev() {
    CustomTextFieldWithIcon(
        placeholder = "Username",
        text = "Hemendra Mali",
        emptyPlaceholder = "asd@gmail.com",
        isVisibleIcon = true,
        onValueChange = {  }
    )
}
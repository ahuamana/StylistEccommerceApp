package com.ahuaman.stylistecommerceapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
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

@Composable
fun OnboardingScreen(modifier: Modifier = Modifier) {

    val painter = painterResource(id = R.drawable.shopping_persons)

    val brush = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF9775FA),
            Color(0xFF9775FA)
        )
    )

    Box(modifier = modifier.background(brush = brush)) {
        Column(modifier = Modifier.fillMaxSize().verticalScroll(
            state = rememberScrollState()
        )) {
            Spacer(modifier = Modifier.height(35.dp))
            Image(
                painter = painter,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(468.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Column(modifier = Modifier.fillMaxWidth().padding(15.dp)) {
                CustomCardOnboarding()
            }
        }
    }
}

@Composable
fun CustomCardOnboarding(modifier: Modifier = Modifier) {

    var selectedOption by remember { mutableStateOf(1) }

    Card() {
        Column(modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.height(25.dp))
            Text(
                text = "Look Good, Feel Good",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 25.sp,
                    lineHeight = 27.5.sp,
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontWeight = FontWeight(400)
                )
            )
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = "Create your individual & unique style and look amazing everyday.",
                color = Color(0xFF8F959E),
                style = TextStyle(
                    fontSize = 15.sp,
                    lineHeight = 21.sp,
                    fontFamily = FontFamily(Font(R.font.fira_san_light)),
                    fontWeight = FontWeight(400)
            ))
            Spacer(modifier = Modifier.height(20.dp))
            CustomButtonSingleSelection(
                modifier = Modifier.fillMaxWidth(),
                text1 = "Women",
                text2 = "Men",
                selected = selectedOption,
                onSelected = { selected ->
                    selectedOption = selected
                }
            )
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)) {
                Text(text = "Skip", color = Color(0xFF8F959E))
            }
        }
    }
}

//Create un horizontal button single selection between 2 buttons, must change when selected the background color

@Composable
fun CustomButtonSingleSelection(
    modifier: Modifier = Modifier,
    text1: String,
    text2: String,
    selected: Int,
    onSelected: (Int) -> Unit
) {

    Row(modifier = modifier) {
        Button(
            modifier = Modifier.weight(1f),
            shape = RoundedCornerShape(10.dp),
            onClick = { onSelected(0) },
            colors = ButtonDefaults.buttonColors(
                containerColor = if (selected == 0) Color(0xFF9775FA) else Color.Transparent
            )
        ) {
            Text(
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                text = text1,
                color = if (selected == 0) Color.White else Color(0xFF8F959E))
        }
        Spacer(modifier = Modifier.width(10.dp))
        Button(
            modifier = Modifier.weight(1f),
            shape = RoundedCornerShape(10.dp),
            onClick = { onSelected(1) },
            colors = ButtonDefaults.buttonColors(
                containerColor = if (selected == 1) Color(0xFF9775FA) else Color.Transparent
            )
        ) {
            Text(
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                text = text2,
                color = if (selected == 1) Color.White else Color(0xFF8F959E),
            )
        }
    }
}


@Preview
@Composable
private fun CustomCardOnboardingPreview() {
    CustomCardOnboarding()
}


@Preview
@Composable
private fun OnboardingScreenPreview() {
    OnboardingScreen(modifier = Modifier.fillMaxSize())
}
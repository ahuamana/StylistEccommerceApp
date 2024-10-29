package com.ahuaman.stylistecommerceapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ahuaman.stylistecommerceapp.components.CustomTopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            CustomTopBar()
        },
        bottomBar = {
            Text(
                text = "Bottom Bar",
                modifier = Modifier.padding(16.dp)
            )
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier.padding(innerPadding).fillMaxSize(),
                verticalArrangement = Arrangement.Center,
            ) {
                Text(text = "Dashboard Content")
            }
        }
    )
}

@Preview
@Composable
private fun DashboardScreenPrev() {
    DashboardScreen()
}
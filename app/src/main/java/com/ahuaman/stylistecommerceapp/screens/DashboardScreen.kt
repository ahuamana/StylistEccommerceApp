package com.ahuaman.stylistecommerceapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ahuaman.stylistecommerceapp.components.CustomTopBar
import com.ahuaman.stylistecommerceapp.navigation.DashboardScreens
import com.ahuaman.stylistecommerceapp.navigation.NavigationDashboard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(modifier: Modifier = Modifier,
                    controller: NavHostController = rememberNavController(),
                    onClickItem: () -> Unit) {

    val items = DashboardScreens.screens
    var selectedItemMenu by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            CustomTopBar()
        },
        bottomBar = {
            //recovery the current backstack entry
            val currentBackStackEntry = controller.currentBackStackEntryAsState()
            //recovery the current route
            val currentRoute = currentBackStackEntry.value?.destination
            //recovery the current destination
            val selectedFromDestination = items.indexOfFirst { menu ->
                (menu.javaClass.simpleName == currentRoute?.route?.split(".")?.last())
            }

            NavigationBar {
                items.forEachIndexed { index, screen ->
                    val hasSelected = if(selectedFromDestination == -1) index == 0 else index == selectedFromDestination
                    NavigationBarItem(
                        icon = { if(hasSelected.not()) Icon(painterResource(screen.icon), contentDescription = null) },
                        colors = NavigationBarItemDefaults.colors(indicatorColor = Color.White),
                        label = { Text(text = screen.title, modifier = Modifier.offset(y = (-15).dp), color = Color(0xFF9775FA)) },
                        selected = hasSelected,
                        onClick = {
                            if(hasSelected) return@NavigationBarItem
                            selectedItemMenu = index
                            controller.navigate(screen)
                        },
                        alwaysShowLabel = false
                    )
                }
            }

        },
        content = { innerPadding ->
            NavigationDashboard(
                controller = controller,
                modifier = modifier.padding(innerPadding),
                onClickItem = onClickItem
            )
        }
    )
}

@Preview
@Composable
private fun DashboardScreenPrev() {
    DashboardScreen(
        onClickItem = {}
    )
}
package com.ahuaman.stylistecommerceapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ahuaman.stylistecommerceapp.screens.DashboardScreen
import com.ahuaman.stylistecommerceapp.screens.SplashScreen
import kotlinx.serialization.Serializable

@Composable
fun RootNavigation(
    modifier: Modifier = Modifier,
    controller: NavHostController = rememberNavController()
) {

    NavHost(
        navController = controller,
        startDestination = RootScreens.SplashScreen
    ) {
        composable<RootScreens.SplashScreen> {
            SplashScreen(
                onTimeout = {
                    controller.navigate(RootScreens.DashboardScreen)
                }
            )
        }

        composable<RootScreens.DashboardScreen> {
            DashboardScreen()
        }
    }

}

sealed class RootScreens {
    @Serializable
    data object SplashScreen : RootScreens()
    @Serializable
    data object DashboardScreen : RootScreens()
}
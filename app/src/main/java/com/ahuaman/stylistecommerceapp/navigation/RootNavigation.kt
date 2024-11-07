package com.ahuaman.stylistecommerceapp.navigation

import androidx.annotation.DrawableRes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ahuaman.stylistecommerceapp.R
import com.ahuaman.stylistecommerceapp.screens.DashboardScreen
import com.ahuaman.stylistecommerceapp.screens.FavoriteScreenSEA
import com.ahuaman.stylistecommerceapp.screens.HomeScreenSEA
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


@Composable
fun NavigationDashboard(modifier: Modifier = Modifier, controller: NavHostController) {
    NavHost(
        navController = controller,
        startDestination = DashboardScreens.HomeScreen
    ) {
        composable<DashboardScreens.HomeScreen> {
            HomeScreenSEA(modifier = modifier)
        }

        composable<DashboardScreens.FavoriteScreen> {
            FavoriteScreenSEA(modifier = modifier)
        }

        composable<DashboardScreens.CartScreen> {
            Text(text = "Cart Screen", modifier = modifier)
        }

        composable<DashboardScreens.WalletScreen> {
            Text(text = "Wallet Screen", modifier = modifier)
        }

    }
}

@Serializable
sealed class DashboardScreens(val title:String, @DrawableRes val icon:Int) {
    @Serializable
    data object HomeScreen : DashboardScreens("Home", R.drawable.ic_home_dashboard)
    @Serializable
    data object FavoriteScreen : DashboardScreens("Favorite", R.drawable.ic_favorite_dashboard)
    @Serializable
    data object CartScreen : DashboardScreens("Cart", R.drawable.ic_bag_dashboard)
    @Serializable
    data object WalletScreen : DashboardScreens("Wallet", R.drawable.ic_wallet_dashboard)

    companion object {
        val screens = listOf(HomeScreen, FavoriteScreen, CartScreen, WalletScreen)
    }
}


sealed class RootScreens {
    @Serializable
    data object SplashScreen : RootScreens()
    @Serializable
    data object DashboardScreen : RootScreens()
}
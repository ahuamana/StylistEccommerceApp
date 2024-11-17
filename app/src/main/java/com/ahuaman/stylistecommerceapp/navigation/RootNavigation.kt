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
import com.ahuaman.stylistecommerceapp.screens.LoginWithSocialMedia
import com.ahuaman.stylistecommerceapp.screens.OnboardingScreen
import com.ahuaman.stylistecommerceapp.screens.SignUpScreen
import com.ahuaman.stylistecommerceapp.screens.SplashScreen
import com.ahuaman.stylistecommerceapp.screens.WelcomeScreen
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
                    controller.popBackStack(RootScreens.SplashScreen, inclusive = true)
                    controller.navigate(RootScreens.LoginWithSocialMedias)
                }
            )
        }
        composable<RootScreens.LoginWithSocialMedias> {
            LoginWithSocialMedia(
                onClickCreateAccount = {
                    controller.navigate(RootScreens.CreateAccountScreen)
                },
                onClickSignIn = {
                    controller.navigate(RootScreens.SignInScreen)
                }
            )
        }

        composable<RootScreens.SignInScreen> {
            WelcomeScreen(
                onBackPressed = {
                    controller.popBackStack()
                },
                onLoginSuccess = {
                    controller.navigate(RootScreens.OnboardingScreen) {
                        popUpTo(RootScreens.LoginWithSocialMedias) { inclusive = true }
                    }
                }
            )
        }

        composable<RootScreens.CreateAccountScreen> {
            SignUpScreen(
                onBackPressed = {
                    controller.popBackStack()
                },
                onSignUpCompleted = {
                    controller.navigate(RootScreens.OnboardingScreen) {
                        popUpTo(RootScreens.LoginWithSocialMedias) { inclusive = true }
                    }
                }
            )
        }

        composable<RootScreens.OnboardingScreen> {
            OnboardingScreen(
                onContinue = {
                    controller.navigate(RootScreens.DashboardScreen) {
                        popUpTo(RootScreens.OnboardingScreen) { inclusive = true }
                    }
                },
                onSkip = {
                    controller.navigate(RootScreens.DashboardScreen) {
                        popUpTo(RootScreens.OnboardingScreen) { inclusive = true }
                    }
                }
            )
        }

        composable<RootScreens.DashboardScreen> {
            DashboardScreen(
                onClickItem = {
                    controller.navigate(RootScreens.HomeDetailsScreen)
                }
            )
        }

        composable<RootScreens.HomeDetailsScreen> {
            Text(text = "Home Details Screen", modifier = modifier)
        }

    }
}


@Composable
fun NavigationDashboard(modifier: Modifier = Modifier, controller: NavHostController, onClickItem: () -> Unit){
    NavHost(
        navController = controller,
        startDestination = DashboardScreens.HomeScreen
    ) {
        composable<DashboardScreens.HomeScreen> {
            HomeScreenSEA(modifier = modifier, onClickItem = onClickItem)
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
    data object LoginWithSocialMedias : RootScreens()
    @Serializable
    data object SignInScreen : RootScreens()
    @Serializable
    data object CreateAccountScreen : RootScreens()
    @Serializable
    data object OnboardingScreen : RootScreens()
    @Serializable
    data object DashboardScreen : RootScreens()
    @Serializable
    data object HomeDetailsScreen : RootScreens()


}
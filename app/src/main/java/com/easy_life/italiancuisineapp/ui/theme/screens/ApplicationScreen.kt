package com.easy_life.italiancuisineapp.ui.theme.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.easy_life.italiancuisineapp.navigation.NavigationTree
import com.easy_life.italiancuisineapp.ui.theme.screens.login.LoginScreen
import com.easy_life.italiancuisineapp.ui.theme.screens.login.LoginViewModel
import com.easy_life.italiancuisineapp.ui.theme.screens.splash.SplashScreen

@Composable
fun ApplicationScreen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationTree.Splash.name) {
        composable(NavigationTree.Splash.name) { SplashScreen(navController) }
        composable(NavigationTree.Login.name) {
            val loginViewModel = hiltViewModel<LoginViewModel>()
            LoginScreen(loginViewModel = loginViewModel, navController = navController)
        }
        composable("${NavigationTree.Main.name}/{username}") { backStackEntry ->
            MainScreen(backStackEntry.arguments?.getString("username").orEmpty())
        }
    }
}
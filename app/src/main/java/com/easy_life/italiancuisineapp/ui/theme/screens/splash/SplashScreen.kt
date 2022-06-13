package com.easy_life.italiancuisineapp.ui.theme.screens.splash

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.easy_life.italiancuisineapp.navigation.NavigationTree

@Composable
fun SplashScreen(navController: NavController) {
    
    LaunchedEffect(key1 = Unit, block = {
        navController.navigate(NavigationTree.Login.name)

    })
}
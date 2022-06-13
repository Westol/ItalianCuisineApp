package com.easy_life.italiancuisineapp

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.easy_life.italiancuisineapp.ui.theme.AppTheme
import com.easy_life.italiancuisineapp.ui.theme.ItalianCuisineAppTheme
import com.easy_life.italiancuisineapp.ui.theme.screens.ApplicationScreen
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ItalianCuisineAppTheme {
                val systemUiController = rememberSystemUiController()

                // Ставим цвет status bar
                val primaryBackground = AppTheme.colors.primaryBackground
                SideEffect {
                    systemUiController.setSystemBarsColor(
                        color = primaryBackground,
                        darkIcons = true
                    )

                }


                ApplicationScreen()

            }
        }
    }
}


package com.vaos.example.entradausuario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
//import androidx.navigation.compose.composable
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.animation.composable
import com.vaos.example.entradausuario.screens.Ecommerce
import com.vaos.example.entradausuario.screens.Login
import com.vaos.example.entradausuario.screens.ProductControl
import com.vaos.example.entradausuario.screens.RegistrationScreen
import com.vaos.example.entradausuario.ui.theme.EntradausuarioTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EntradausuarioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberAnimatedNavController()
                    AnimatedNavHost(
                        navController = navController,
                        startDestination = "login",
                        exitTransition = {
                            slideOutOfContainer(
                                towards = AnimatedContentScope.SlideDirection.End,
                                tween(380)
                            )
                        },
                        enterTransition = {
                            slideIntoContainer(
                                towards = AnimatedContentScope.SlideDirection.Start,
                                tween(380)
                            )
                        }
                    ){
                        composable(route = "login") {
                            Login(navController)
                        }
                        composable(route = "registration") {
                            RegistrationScreen(navController)
                        }
                        composable(route = "ecommerce") {
                            Ecommerce(navController)
                        }
                        composable(route = "product") {
                            ProductControl(navController)
                        }
                    }
                }
            }
        }
    }
}



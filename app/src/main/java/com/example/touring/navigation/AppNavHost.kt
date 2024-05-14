package com.example.touring.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.touring.ui.theme.screens.dashboard.DashboardScreen
import com.example.touring.ui.theme.screens.destination.Destination
import com.example.touring.ui.theme.screens.destination.DestinationScreen
import com.example.touring.ui.theme.screens.home.HomeScreen
import com.example.touring.ui.theme.screens.login.LoginScreen
import com.example.touring.ui.theme.screens.signup.SignupScreen
import com.example.touring.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(ROUT_DASHBOARD){
            DashboardScreen(navController)

        }
        composable(ROUT_DESTINATION){
            DestinationScreen(navController)

        }
        composable(ROUT_SPLASH){
            SplashScreen(navController)
        }

        }
    }

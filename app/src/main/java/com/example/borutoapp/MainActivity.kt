package com.example.borutoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import com.example.borutoapp.navigation.SetupNavGraph
import com.example.borutoapp.ui.theme.BorutoAppTheme
import dagger.hilt.android.AndroidEntryPoint


//Dagger Hilt Library knows with this annotation where to inject the dependencies provided by the programmer
@ExperimentalMaterialApi
@ExperimentalCoilApi
@ExperimentalAnimationApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BorutoAppTheme {
                
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}
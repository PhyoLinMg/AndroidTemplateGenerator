package ${packageName}.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import ${packageName}.feature.home.navigation.homeGraph

@Composable
fun AppNavHost(navController: NavHostController = rememberNavController(), modifier: Modifier= Modifier) {
    NavHost(modifier= modifier,navController= navController, startDestination = "home"){
        homeGraph(navController)
    }
}
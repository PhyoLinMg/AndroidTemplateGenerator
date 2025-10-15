package ${packageName}.feature.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import ${packageName}.feature.home.presentation.HomeScreen


fun NavGraphBuilder.homeGraph(navController: NavController) {
    composable("home") {
        HomeScreen()
    }
}
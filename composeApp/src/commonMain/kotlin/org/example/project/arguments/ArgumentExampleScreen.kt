package org.example.project.arguments

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

sealed class ArgumentScreen(var route: String){
    data object Input: ArgumentScreen("input")
    data object Output: ArgumentScreen("output/{name}") {
        fun getRoute(name: String) = "output/$name"
    }
}

@Composable
fun ArgumentExampleScreen(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
){
    NavHost(navHostController, startDestination = ArgumentScreen.Input.route){
        addInputScreen(modifier, navHostController)
        addOutput(modifier, navHostController)
    }
}

private fun NavGraphBuilder.addInputScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
){
    composable(
        ArgumentScreen.Input.route
    ){
        InputScreen(modifier){ name ->
            navController.navigate(
                ArgumentScreen.Output.getRoute(
                    if (name.isEmpty()){
                        "John Doe"
                    }
                    else name
                )
            )
        }
    }
}

private fun NavGraphBuilder.addOutput(
    modifier: Modifier = Modifier,
    navController: NavHostController
){
    composable(
        ArgumentScreen.Output.route,
        arguments = listOf(navArgument("name"){type = NavType.StringType})
    ){ backStackEntry ->
        val name = backStackEntry.arguments?.getString("name") ?: "John Doe"
        OutpuScreen(modifier, name){
            navController.popBackStack()
        }
    }
}
package com.example.paginawebkootlin.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.paginawebkootlin.views.Ayuda
import com.example.paginawebkootlin.views.Carrito
import com.example.paginawebkootlin.views.ConfiguracionApp
import com.example.paginawebkootlin.views.HomeView
import com.example.paginawebkootlin.views.PerfilUsuario
import com.example.paginawebkootlin.views.RegistroProducto
import com.example.paginawebkootlin.views.VerProductos
import com.example.paginawebkootlin.views.login

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "inicio") {
        composable("inicio") { login(navController) }
        composable("home") { HomeView(navController) }
        composable("Config") { ConfiguracionApp(navController) }
        composable("Product") { RegistroProducto(navController) }
        composable("Perfil") { PerfilUsuario(navController)  }
        composable("Carrito") { Carrito(navController) }
        composable("Ayuda") { Ayuda(navController) }
        composable("VerProdu") { VerProductos(navController)  }
    }
}

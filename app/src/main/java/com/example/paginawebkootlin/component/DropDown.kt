package com.example.paginawebkootlin.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.paginawebkootlin.repository.UserRepository


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropdownMenu(navController: NavController) {
    var expanded by remember { mutableStateOf(false) }

    Box {
        // 🔹 Ícono hamburguesa
        IconButton(onClick = { expanded = !expanded }) {
            Icon(
                imageVector = Icons.Default.Menu,
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp),
                contentDescription = "Abrir menú",
                tint = Color.White
            )
        }

        // 🔹 Menú desplegable
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
                .background(Color.White)
                .padding(4.dp),

        ) {
            // 👉 Cada opción del menú
            DropdownMenuItem(
                text = { Text("Inicio") },
                leadingIcon = { Icon(Icons.Default.Home, contentDescription = null) },
                onClick = {
                    expanded = false
                    navController.navigate("home")
                }
            )
            DropdownMenuItem(
                text = { Text("Perfil") },
                leadingIcon = { Icon(Icons.Default.Person, contentDescription = null) },
                onClick = {
                    expanded = false
                    navController.navigate("Perfil")
                }
            )
            DropdownMenuItem(
                text = { Text("Configuración") },
                leadingIcon = { Icon(Icons.Default.Settings, contentDescription = null) },
                onClick = {
                    expanded = false
                    navController.navigate("Config")
                }
            )
            DropdownMenuItem(
                text = { Text("Productos") },
                leadingIcon = { Icon(Icons.Default.List, contentDescription = null) },
                onClick = {
                    expanded = false
                    navController.navigate("VerProdu")
                }
            )
            DropdownMenuItem(
                text = { Text("Registro Producto") },
                leadingIcon = { Icon(Icons.Default.Add, contentDescription = null) },
                onClick = {
                    expanded = false
                    navController.navigate("Product")
                }
            )
            DropdownMenuItem(
                text = { Text("Carrito de Compras") },
                leadingIcon = { Icon(Icons.Default.ShoppingCart, contentDescription = null) },
                onClick = {
                    expanded = false
                    navController.navigate("Carrito")
                }
            )
            DropdownMenuItem(
                text = { Text("Ayuda") },
                leadingIcon = { Icon(Icons.Default.Call, contentDescription = null) },
                onClick = {
                    expanded = false
                    navController.navigate("Ayuda")
                }
            )

            DropdownMenuItem(
                text = { Text("Cerrar Sesion") },
                leadingIcon = { Icon(Icons.Default.Close, contentDescription = null) },
                onClick = {
                    // Limpiar estado de sesión
                    UserRepository.logout()
                    // Cerrar dropdown
                    expanded = false
                    // Navegar al login
                    navController.navigate("inicio") {
                        // Evita que el usuario pueda volver a home con el botón "atrás"
                        popUpTo("home") { inclusive = true }
                    }
                }
            )

        }
    }
}


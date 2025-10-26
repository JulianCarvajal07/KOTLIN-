package com.example.paginawebkootlin.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.paginawebkootlin.component.BaseLayout

@Composable
fun VerProductos (navController : NavController){

    BaseLayout(title = "Productos", navController = navController)

    {
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            )
        {
            Text("ACA SE MUESTRAN TODOS LOS PRODUCTOS")
        }
    }

}
package com.example.paginawebkootlin.views

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.paginawebkootlin.component.BotonPersonalizado
import com.example.paginawebkootlin.component.CampoTexto

import com.example.paginawebkootlin.component.TopBar
import com.example.paginawebkootlin.repository.UserRepository

@Composable
fun login (navController : NavController){

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    TopBar(title = "")

        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        )

        {
            //Contenido
            Text("Inicio sesion",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color(0xFF1976D2)
                )

            CampoTexto(
                value = email,
                onValueChange = { email = it },
                label = { Text("Usuario") },
                placeholder = { Text("Ingrese Usuario") }
            )

            CampoTexto(
                value = password,
                onValueChange = { password = it },
                label = { Text("Contraseña") },
                placeholder = { Text("Ingrese Contraseña") }
            )

            BotonPersonalizado(
                texto = "Ingresar",
                onClick = {
                    UserRepository.loginUser(email, password) { user ->
                        if (user != null) {
                            println("✅ Ingreso exitoso: ${user.username}")
                            navController.navigate("home")
                        } else {
                            println("❌ Credenciales incorrectas")
                        }
                    }

                }
            )
        }
}

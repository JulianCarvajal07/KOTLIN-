package com.example.paginawebkootlin.views

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.paginawebkootlin.component.BotonPersonalizado
import com.example.paginawebkootlin.component.CampoTextoEjemplo
import com.example.paginawebkootlin.component.TopBar

@Composable
fun login (navController : NavController){
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
            CampoTextoEjemplo(label = {Text("Usuario")}, placeholder = {Text("Ingrese Usuario")})
            CampoTextoEjemplo(label = {Text("Contraseña")}, placeholder = {Text("Ingrese Contraseña")})
            BotonPersonalizado(texto = "Ingresar", onClick = {navController.navigate("home")})

        }

}

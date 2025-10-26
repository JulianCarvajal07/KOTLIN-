package com.example.paginawebkootlin.component

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BotonPersonalizado(texto: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF1976D2),  // 🔹 color de fondo
            contentColor = Color.White           // 🔹 color del texto
        ),
        shape = RoundedCornerShape(12.dp) // 🔹 Aquí defines el radio de las esquinas
    )
    {
        Text(texto)
    }
}

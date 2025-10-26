package com.example.paginawebkootlin.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.unit.dp
import com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label
import org.w3c.dom.Text

@Composable
fun CampoTextoEjemplo(label: @Composable () -> Unit, placeholder: @Composable () -> Unit
) {
    var texto by remember { mutableStateOf("") }  // Estado que guarda el valor del input

    OutlinedTextField(
        value = texto,                       // El valor actual del campo
        onValueChange = { texto = it },      // Se ejecuta cada vez que cambia el texto
        label = label,         // 👈 Este es el label
        placeholder =  placeholder , // 👈 Texto dentro del campo cuando está vacío
        modifier = Modifier
            .fillMaxWidth(0.8f) //80% del padre
            .padding(8.dp)


    )
}
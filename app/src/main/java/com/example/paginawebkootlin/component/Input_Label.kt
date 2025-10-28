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
fun CampoTexto(
    value: String,
    onValueChange: (String) -> Unit,
    label: @Composable () -> Unit,
    placeholder: @Composable () -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = label,
        placeholder =  placeholder,
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .padding(8.dp)
    )
}

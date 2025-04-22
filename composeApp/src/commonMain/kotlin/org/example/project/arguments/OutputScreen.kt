package org.example.project.arguments

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OutpuScreen(
    modifier: Modifier = Modifier,
    name: String,
    onClick: () -> Unit,
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Hello, $name")

        Button(
            onClick = onClick,
            modifier = Modifier.align(Alignment.End)
        ){
            Text("Go Back!")
        }
    }
}
package org.example.project.arguments

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun InputScreen(
    modifier: Modifier = Modifier,
    onClick: (String) -> Unit,
){
    var name by remember { mutableStateOf("")}

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Enter your name and press submit")

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = name,
            onValueChange = {name = it},
            label = { Text("Enter your name")},
            maxLines = 1,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {onClick(name)},
            modifier = Modifier.align(Alignment.End)
        ){
            Text("Submit")
        }
    }
}

@Preview
@Composable
fun InputScreenPreview(){
    InputScreen{}
}
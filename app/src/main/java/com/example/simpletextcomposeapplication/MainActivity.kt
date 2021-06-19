package com.example.simpletextcomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingText("world")
        }
    }
}


@Composable
fun GreetingText(name: String) {
    Text(
        text = "Hello $name!", modifier = Modifier
            .height(240.dp)
            .width(200.dp)
            .padding(all = 24.dp)
            .clickable { },
        style = MaterialTheme.typography.h5,
        fontWeight = FontWeight.SemiBold
    )
}

@Composable
fun GreetingButton() {
    Button(onClick = {}) {
        GreetingText(name = "button")
        GreetingText(name = "remaining button")

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewMainActivity() {
    GreetingText("world")
}
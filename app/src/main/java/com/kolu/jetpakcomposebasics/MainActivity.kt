package com.kolu.jetpakcomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kolu.jetpakcomposebasics.ui.theme.JetpakComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpakComposeBasicsTheme {

                    Greeting(
                        name = "Android",
                    )
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        color = Color.Magenta,
        fontSize = 30.sp,
        modifier = Modifier
            //the code runs sequentially
            //so first the blue bg is painted
            .background(color = Color.Blue)
            //then the padding is added
            .padding(30.dp)
            //then the green background is painted inside the padding
            .background(color = Color.Green)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpakComposeBasicsTheme {
        Greeting("Android")
    }
}
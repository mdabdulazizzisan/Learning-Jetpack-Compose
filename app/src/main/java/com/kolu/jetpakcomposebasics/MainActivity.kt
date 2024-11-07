package com.kolu.jetpakcomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
                        name = "Android"
                    )
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(Color.Blue)
            .padding(20.dp)
            .fillMaxHeight()
    ) {
        Text(
            text = "Hello $name!",
            fontSize = 30.sp,
            color = Color.White,
            modifier = Modifier
                .background(Color.Red)
                .padding(5.dp)
        )
        Text(
            text = "Second Text",
            fontSize = 30.sp,
            color = Color.LightGray
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpakComposeBasicsTheme {
        Greeting("Android")
    }
}
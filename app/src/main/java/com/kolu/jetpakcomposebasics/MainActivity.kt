package com.kolu.jetpakcomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    Column {
        LazyRow {
            items(10) {
                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription = null,
                    Modifier.size(200.dp)
                )
            }
        }

        Box(
            Modifier
                .background(Color.LightGray)
                .fillMaxWidth()
                .height(10.dp)
        )
        LazyColumn {
            items(10) {
                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription = null,
                    Modifier.size(200.dp)
                )
            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpakComposeBasicsTheme {
        Greeting("Android")
    }
}
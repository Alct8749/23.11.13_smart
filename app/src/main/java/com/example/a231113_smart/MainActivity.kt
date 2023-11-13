package com.example.a231113_smart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a231113_smart.ui.theme._231113_smartTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                MyApp()
        }
    }
}
@Composable
fun MyApp() {
    _231113_smartTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            //Greeting("안녕하세요")
            MyLinearLayout()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _231113_smartTheme {
        Greeting("여기서 바꿔야 적용 댐")
    }
}


@Composable
fun MyLinearLayout() {
    Column {
        Row() {
            Text(text = "안녕하세요",
                modifier = Modifier.background(Color.Yellow)
                    .padding(8.dp)
            )
            Text(text = "컴공",
                modifier = Modifier.background(Color.Cyan)
                    .padding(8.dp)
            )
        }



        Text(text = "어디서 본 것 같은 예제",
            modifier = Modifier.background(Color.Magenta)
                .padding(8.dp)
        )
    }}

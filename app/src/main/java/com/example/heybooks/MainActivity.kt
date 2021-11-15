package com.example.heybooks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.tooling.preview.Preview
import com.example.heybooks.components.BookDetailCard
import com.example.heybooks.components.BookItemList
import com.example.heybooks.components.InputTextField
import com.example.heybooks.components.TopBar
import com.example.heybooks.ui.theme.HeyBooksTheme

class MainActivity : ComponentActivity() {
    @ExperimentalComposeUiApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeyBooksTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {


                    BookDetailCard()

                    val input = remember {
                        mutableStateOf("")
                    }

//                    LazyColumn {
//                        item {
//                            TopBar(title = "Book Description")
//                        }
//                        item {
//                            InputTextField(
//                                label = "Search for Books...",
//                                value = input.value,
//                                onValueChange = {
//                                    input.value = it
//                                }
//                            )
//                        }
//                        item {
//                            BookItemList()
//                        }
//                        item {
//                            BookDetailCard()
//                        }
//                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HeyBooksTheme {
        Greeting("Android")
    }
}
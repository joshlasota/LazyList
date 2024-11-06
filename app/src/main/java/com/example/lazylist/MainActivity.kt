package com.example.lazylist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.lazylist.ui.theme.LazyListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyListTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val sampleItems = listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")

    MyLazyList(items = sampleItems)
}

@Composable
fun MyLazyList(items: List<String>) {
    LazyColumn {
        items(items) { item ->
            Text(
                text = item,
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    LazyListTheme {
        MainScreen()
    }
}

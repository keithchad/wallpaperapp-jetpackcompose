package com.chad.wallpaperapp_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chad.wallpaperapp_jetpackcompose.ui.theme.WallpaperappjetpackcomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WallpaperappjetpackcomposeTheme {
                Content()
            }
        }
    }
}

@Composable

fun Content() {}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WallpaperappjetpackcomposeTheme {
        Content()
    }
}
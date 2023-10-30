package com.leoapps.easynotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.leoapps.easynotes.home.HomeScreen
import com.leoapps.easynotes.ui.theme.EasyNotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EasyNotesTheme {
                // A surface container using the 'background' color from the theme
                HomeScreen()
            }
        }
    }
}

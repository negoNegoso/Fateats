package com.fatec.fateats

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.fatec.fateats.sampledata.sampleSections
import com.fatec.fateats.ui.screens.HomeScreen
import com.fatec.fateats.ui.theme.FateatsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App()
        }
    }

}

@Composable
fun App() {
    FateatsTheme {
        Surface {
            HomeScreen(
                sampleSections
            )
        }
    }
}
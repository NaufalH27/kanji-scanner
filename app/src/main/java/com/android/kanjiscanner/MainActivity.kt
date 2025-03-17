package com.android.kanjiscanner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import com.android.kanjiscanner.ui.theme.KanjiscannerTheme
import com.android.kanjiscanner.ui.components.topBar
import com.android.kanjiscanner.ui.screens.homeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KanjiscannerTheme {
                Scaffold(
                    topBar = { topBar() },
                    modifier = Modifier.fillMaxSize()
                ) { 
                    paddingValues -> homeScreen(Modifier.padding(paddingValues))
                }
            }
        }
    }
}


package com.android.kanjiscanner.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.material3.IconButton
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.Modifier

@Composable
fun homeScreen(modifier: Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top, 
        horizontalAlignment = Alignment.CenterHorizontally 
    ) {
        Text(
            text = "漢字 Scanner",
            fontSize = 44.sp,
        );

        IconButton(
            onClick = {},
            modifier = Modifier.size(160.dp).clip(CircleShape),
        ) {
            Icon(
                imageVector = Icons.Filled.PlayArrow, 
                contentDescription = "Start Button",
                modifier = Modifier.size(140.dp)
            )
        }
        Text("Program Stopped") 
    }
}


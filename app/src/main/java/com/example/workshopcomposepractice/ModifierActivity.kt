package com.example.workshopcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.workshopcomposepractice.ui.theme.WorkshopComposePracticeTheme

class ModifierActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier
                .background(Color.Yellow)
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
                .border(5.dp, Color.Red)
                .padding(5.dp)
                .border(5.dp, Color.White)
                .padding(5.dp)
                .border(5.dp, Color.Gray)
                .padding(10.dp)
            ) {
                Text("Roopa")
                Spacer(modifier = Modifier.height(50.dp))
                Text("Lavanya")
            }
        }
    }
}


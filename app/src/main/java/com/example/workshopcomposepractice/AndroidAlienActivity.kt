package com.example.workshopcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class AndroidAlienActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //AndroidAliens()
           // AndroidAlienRow()
            //AndroidAlienColumn()
            AndroidAliensGameOverBox()
        }
    }
}
@Composable
fun AndroidAlien(
    color: Color,
    modifier: Modifier = Modifier
) {
    Image(modifier = modifier,
        painter = painterResource(R.drawable.android_alien),
        colorFilter = ColorFilter.tint(Color.White, BlendMode.Color),
        contentDescription = "Image Description")
}

@Composable
fun AndroidAliens() {
    AndroidAlien(color = Color.Red,
        modifier = Modifier
            .size(100.dp)
            .padding(4.dp))

    AndroidAlien(color = Color.Green,
        modifier = Modifier
            .size(70.dp)
            .padding(4.dp))
}

@Composable
fun AndroidAlienRow() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Top
    ) {
        AndroidAlien(modifier = Modifier.size(70.dp), color = Color.Red)
        AndroidAlien(modifier = Modifier.weight(1f), color = Color.Green)
        AndroidAlien(modifier = Modifier.size(70.dp), color = Color.Red)
       /* AndroidAlien(
            modifier = Modifier.align(Alignment.CenterVertically),
            color = Color.Red)*/
    }
}

@Composable
fun AndroidAlienColumn() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AndroidAlien(color = Color.Red)
        AndroidAlien(color = Color.Green)
    }
}

@Composable
fun AndroidAliensGameOverBox() {
    Box() {
        AndroidAlienRow()
        Spacer(modifier = Modifier
            .matchParentSize()
            .fillMaxSize()
            .background(color = Color.Gray.copy(alpha = .7f)))
        Text(
            text = "GAME OVER")
    }
}

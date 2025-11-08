package com.example.praktikumtugas_6.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikumtugas_6.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanPertama(

){
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.backgroundddd),
            contentDescription = "Demo Background",
            contentScale = ContentScale.FillBounds,
            modifier = modifier.matchParentSize()
        )
        Text(text = "Form Registrasi",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(
                start = 88.dp,
                top = 56.dp,
            )
        )
}
package com.example.spotify.pages

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.spotify.myComponents.ImageTextHorizontal
import com.example.spotify.myComponents.ImageTextSquare

@Composable
fun SelectorPage(){
    ImageTextHorizontal( "prueba", imageIdR = 1,) { }
    ImageTextSquare("texto1","texto2", imageIdR = 1) { }
}

@Preview
@Composable
fun SelectorPagePreview(){
    SelectorPage()
}
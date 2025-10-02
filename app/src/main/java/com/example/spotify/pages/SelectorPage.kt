package com.example.spotify.pages

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.spotify.R
import com.example.spotify.myComponents.ImageTextHorizontal
import com.example.spotify.myComponents.ImageTextSquare
import com.example.spotify.myComponents.Plantilla

@Composable
fun SelectorPage(){
    Plantilla("texto")
    ImageTextHorizontal( "prueba", R.drawable.imagen1) { }
    ImageTextSquare("texto1", "texto2",R.drawable.imagen1) { }
}

@Preview
@Composable
fun SelectorPagePreview(){
    SelectorPage()
}
package com.example.spotify.myComponents

import android.R.color.white
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.spotify.ui.theme.SpotifyTheme

@Composable
fun Plantilla (name: String){
    Text(
        text= buildAnnotatedString {
            append( "$name")
        },
        modifier= Modifier.padding(6.dp), color = Color.White, fontWeight = FontWeight.Bold
    )
}

@Preview
@Composable
fun PlantillaPreview () {
    SpotifyTheme {
        Plantilla("Good morning")
    }
}

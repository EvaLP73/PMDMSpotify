package com.example.spotify.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.spotify.R

@Composable
fun ImageTextSquare (
    txtMsg: String,
    txtMsg2: String,
    imageIdR: Int,
    action: () -> Unit
){
    Column (modifier = Modifier){

        Box(
            modifier = Modifier
                .width(width = 150.dp)
                .height(height = 150.dp)
                .background(Color.LightGray)
                .clickable { action.invoke() },
        ) {
            Image(painterResource(imageIdR), contentDescription = "", modifier = Modifier
                //.fillMaxWidth()
                //.fillMaxHeight()
                .fillMaxSize(),
                contentScale = ContentScale.Crop

            )
            /*Text(
                text = buildAnnotatedString {
                    append("$txtMsg")
                },
                modifier = Modifier.padding(6.dp), color = Color.White, fontWeight = FontWeight.Bold
            )*/


        }
        Box(
            modifier = Modifier
                .width(width = 150.dp)
                .height(height = 50.dp)
                .background(Color.Transparent)
                .clickable { action.invoke() },
        ) {

            Text(
                text = buildAnnotatedString {
                    append("$txtMsg")

                },
                modifier = Modifier.padding(6.dp), color = Color.White, fontWeight = FontWeight.Bold
            )
            Text(
                text = buildAnnotatedString {
                    append("\n")
                    append( "$txtMsg2")
                },
                modifier = Modifier.padding(6.dp), color = Color.White
            )


        }
    }

}
@Preview
@Composable
fun ImageTextSquarePreview () {
    ImageTextSquare(txtMsg = "Today´s Top Hits", txtMsg2 = "texto", R.drawable.imagen1, {})

}
package com.example.spotify.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.spotify.R

@Composable
fun ImageTextHorizontal (
    txtMsg: String,
    imageIdR: Int,
    action: () -> Unit
){

    Row(
        modifier = Modifier
            .width(width = 150.dp)
            .height(height = 50.dp)
            .background(Color.LightGray)
            .clickable{ action.invoke() },
    ){
        Image(painterResource(imageIdR), contentDescription = "")
        Text(
            text= buildAnnotatedString {
                append( "$txtMsg")
            },
            modifier= Modifier.padding(6.dp), color = Color.White, fontWeight = FontWeight.Bold
        )

    }

}
@Preview
@Composable
fun ImageTextHorizontalPreview () {
    ImageTextHorizontal(txtMsg = "Today´s Top Hits", R.drawable.imagen1, {})

}
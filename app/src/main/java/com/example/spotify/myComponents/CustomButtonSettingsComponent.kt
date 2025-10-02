package com.example.spotify.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CustomButtonSettingsComponent (
    txtMsg : String,
    imageIdR: Int,
    action: Unit

){
    Box(
        modifier = Modifier.width(width = 150.dp).height(height = 50.dp)
    ){
        Image(painterResource(imageIdR), contentDescription = "")
    }
}
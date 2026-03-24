package com.example.kotlinprogramming.practice.app6_business_card_app

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlinprogramming.ui.theme.KotlinProgrammingTheme



@Composable
fun BusinessCardApp(){
//    BusinessCardAppScreen()
}

private fun BusinessCardAppScreen(
    imagePainter: Painter,
    name: String,
    designation: String,
){

}


@Preview(showBackground = true)
@Composable
fun BusinessCardAppPreview(){
    KotlinProgrammingTheme{
        BusinessCardApp()
    }
}
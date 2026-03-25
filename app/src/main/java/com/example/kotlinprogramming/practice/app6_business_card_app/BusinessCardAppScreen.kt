package com.example.kotlinprogramming.practice.app6_business_card_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import com.example.kotlinprogramming.R
import com.example.kotlinprogramming.ui.theme.KotlinProgrammingTheme



@Composable
fun BusinessCardApp(modifier: Modifier = Modifier){
    Box(modifier = modifier){
        ProfileInfo(modifier = modifier.align(Alignment.Center))
        ContactInfo(modifier = modifier.align(Alignment.BottomCenter))
    }
}

@Composable
private fun ProfileInfo(modifier: Modifier = Modifier){

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = null,
        )
        Text(
            text = "Md. Raju Mia",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color(0xFF006D3A)
        )
        Text(
            text = "Android Developer Extraordinarie",
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color(0xFF006D3A),
        )
        Text(
            text = "10 years of Experience",
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
private fun ContactInfo(modifier: Modifier = Modifier){

    Column(
        modifier = modifier.padding(bottom = 20.dp)
    ) {
        ContactRow(
            text = "+880 1723510871",
            icon = Icons.Filled.Call
        )
        ContactRow(
            text = "@AndroidDev",
            icon = Icons.Filled.Share
        )
        ContactRow(
            text = "raju.iit3@gmail.com",
            icon = Icons.Filled.Email
        )
    }

}

@Composable
private fun ContactRow(
    text: String,
    icon: ImageVector
){
    Row {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier
                .size(30.dp)
                .padding(start = 10.dp),
            Color(0xFF006D3A)
        )
        Text(
            text = text,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(start = 18.dp, top = 5.dp)
        )
    }

}


@Preview(showBackground = true)
@Composable
fun BusinessCardAppPreview(){
    KotlinProgrammingTheme{
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFD2E8D4)
            /*color = MaterialTheme.colorScheme.background*/
        ) {
            BusinessCardApp()
        }

    }
}
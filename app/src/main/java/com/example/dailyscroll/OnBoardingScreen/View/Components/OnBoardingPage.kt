package com.example.dailyscroll.OnBoardingScreen.View.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailyscroll.OnBoardingScreen.Data.OnBoardingData
import com.example.dailyscroll.OnBoardingScreen.Data.pages
import com.example.dailyscroll.OnBoardingScreen.View.Screen.OnBoardingScreen

@Composable
fun OnBoardingPage(data: OnBoardingData, modifier: Modifier = Modifier) {

        Column(
            modifier = Modifier
        ) {
            Image(
                    painter = painterResource(data.image),
                    contentDescription = "on boarding image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.6f)
                        .padding(8.dp),
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.Center
                )

                Spacer(modifier = Modifier.height(5.dp))
                OnBoardingText(data)
            }


}


@Composable
fun OnBoardingText(data: OnBoardingData){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TextComponent(text = data.heading, size = 28, fontWeight = FontWeight.SemiBold, Color.White)
        TextComponent(text = data.description, size = 20, fontWeight = FontWeight.Medium, Color(
            0xFFAFAFAF
        )
        )
    }
}
@Preview(showBackground = true)
@Composable
fun Display(){
    OnBoardingPage(data = pages[0])
}
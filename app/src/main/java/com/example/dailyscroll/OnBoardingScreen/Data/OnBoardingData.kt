package com.example.dailyscroll.OnBoardingScreen.Data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.dailyscroll.R

data class OnBoardingData(
    val heading: String,
    val description: String,
    @DrawableRes val image: Int
)


val pages = listOf(
    OnBoardingData("Navigate the News Ocean",
        "Chart your course with our intelligent compass",
        R.drawable.focus
    ),

    OnBoardingData("Beyond the Headlines",
        "Uncover the stories that shape our world",
        R.drawable.echo
        ),

    OnBoardingData("Fuel Your Curiosity",
        "Spark your mind with insightful articles and analysis",
        R.drawable.beyond
    ),

)
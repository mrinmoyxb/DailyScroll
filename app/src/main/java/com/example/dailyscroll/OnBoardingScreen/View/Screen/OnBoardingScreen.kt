package com.example.dailyscroll.OnBoardingScreen.View.Screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dailyscroll.OnBoardingScreen.Data.pages
import com.example.dailyscroll.OnBoardingScreen.View.Components.OnBoardingPage
import com.example.dailyscroll.OnBoardingScreen.View.Components.OnBoardingText
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.google.accompanist.pager.HorizontalPager

@OptIn(ExperimentalPagerApi::class)
@Preview(showBackground = true)
@Composable
fun OnBoardingScreen(){
    val pagerState = rememberPagerState()

    Column(
        modifier = Modifier.fillMaxSize()
    ){
        HorizontalPager(count = 3, state = pagerState) {index->
            OnBoardingPage(data = pages[index])
        }
    }

}
package com.example.dailyscroll.OnBoardingScreen.View.Components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.dailyscroll.R
import androidx.compose.ui.graphics.Color
import com.example.dailyscroll.ui.theme.montserrat

@Composable
fun TextComponent(text: String, size: Int, fontWeight: FontWeight, color: Color){
    Text(text = text,
        fontSize = size.sp,
        fontFamily = montserrat,
        fontWeight = fontWeight,
        color = color,
        textAlign = TextAlign.Center
    )
}
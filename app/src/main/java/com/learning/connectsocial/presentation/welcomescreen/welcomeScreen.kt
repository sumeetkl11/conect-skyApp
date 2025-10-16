package com.learning.connectsocial.presentation.welcomescreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learning.connectsocial.R

@Composable
@Preview
fun WelcomeScreen(){
    Box(modifier = Modifier.fillMaxSize()
        .background(Color.White))
    {
        Image(painter = painterResource(id = R.drawable.connect_logo) ,
            contentDescription = null,
            modifier = Modifier.size(120.dp)
                .align(Alignment.Center))

        Column(modifier=Modifier.align(Alignment.BottomCenter)
            .padding(bottom = 32.dp), // Add margin from the physical bottom edge
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Text(text = "From",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center)

            Text(text = "Social Connect",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center,
                color = colorResource(id = R.color.light_green)
            )
        }

    }
}
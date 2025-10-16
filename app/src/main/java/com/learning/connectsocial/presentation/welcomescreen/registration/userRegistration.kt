package com.learning.connectsocial.presentation.welcomescreen.registration

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learning.connectsocial.R

@Composable
@Preview(showSystemUi = true)
fun UserRegistrationScreen()
{
    var expanded by remember { mutableStateOf(false) }
    var selectedCountry by remember { mutableStateOf("Pakistan") }
    var countryCode by remember { mutableStateOf("+81") }
    var phoneNumber by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()
        .padding( top = 32.dp, start = 16.dp, end= 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Enter your Phone number",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.dark_green)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Social connect will need to verify your phone number")

        Spacer(modifier = Modifier.height(24.dp))

        TextButton(onClick ={expanded = true},
            modifier = Modifier.fillMaxWidth())
        {
            Box(modifier = Modifier.width(250.dp))
            {
                Text(text = selectedCountry,
                    modifier= Modifier.align(Alignment.Center),
                    fontSize = 16.sp,
                    color = Color.Black)

                Icon(imageVector = Icons.Default.ArrowDropDown,
                    contentDescription =null,
                    modifier=Modifier.align(Alignment.CenterEnd),
                    tint = colorResource(id=R.color.light_green))
            }
        }

        HorizontalDivider(
            modifier=Modifier.padding(horizontal = 66.dp),
            thickness = 2.dp,
            color = colorResource(id = R.color.light_green)
        )

        DropdownMenu(expanded = expanded, onDismissRequest = {expanded= false})
        {
            listOf("India","Iraq","China","Canada","Afghanistan","Iran").forEach { country->
                DropdownMenuItem(
                    text = {
                        Text(text = country)
                    },
                    onClick = {
                        selectedCountry = country
                        expanded=false
                    }
                )
            }
        }

        Column(modifier = Modifier.fillMaxWidth()
            .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Row{
                TextField(value = countryCode,
                    onValueChange = {countryCode=it},
                    modifier = Modifier.width(70.dp))
            }

        }
    }
}
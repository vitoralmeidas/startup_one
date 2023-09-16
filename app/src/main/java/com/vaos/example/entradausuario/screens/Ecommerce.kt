package com.vaos.example.entradausuario.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.vaos.example.entradausuario.ui.theme.Mooli

@Composable
fun Ecommerce (navController: NavController) {
    Column (
        modifier = Modifier
            .padding(32.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp, bottom = 24.dp)
                .border(
                    width = 1.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(topStart = 16.dp, bottomEnd = 16.dp)
                )
                .background(Color(174, 179, 177, 138)),
        ) {
            Text(
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.Center),
                text = "StockOptimize",
                fontSize = 24.sp,
                fontFamily = Mooli,
                letterSpacing = 1.8.sp
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp, bottom = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){

            Text(
                modifier = Modifier
                    .padding(32.dp),
                text = "E-commerce",
                fontSize = 28.sp,
                fontFamily = Mooli,
                letterSpacing = 4.sp,
                fontWeight = FontWeight.Bold
            )

        }
        Row (modifier = Modifier.fillMaxWidth()
            .padding(bottom = 18.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically){

            Box(){
                Text(
                    fontFamily = Mooli,
                    fontSize = 24.sp,
                    text = "Shopee")
            }
            Button(
                onClick = { navController.navigate("product") },
                shape = RoundedCornerShape(50),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 6.dp
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF98F3D9),
                    contentColor = Color(88, 94, 60, 255)
                )
                )
            {
                Icon(imageVector = Icons.Default.Add, contentDescription = "adicione")
            }
        }
        Row (modifier = Modifier.fillMaxWidth()
            .padding(bottom = 18.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically){

            Box(){
                Text(
                    fontFamily = Mooli,
                    fontSize = 24.sp,
                    text = "Amazon")
            }
            Button(
                onClick = {  },
                shape = RoundedCornerShape(50),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 6.dp
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF98F3D9),
                    contentColor = Color(88, 94, 60, 255)
                )
            )
            {
                Icon(imageVector = Icons.Default.Add, contentDescription = "adicione")
            }
        }
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically){

            Box(){
                Text(
                    fontFamily = Mooli,
                    fontSize = 24.sp,
                    text = "Magalu")
            }
            Button(
                onClick = {  },
                shape = RoundedCornerShape(50),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 6.dp
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF98F3D9),
                    contentColor = Color(88, 94, 60, 255)
                )
            )
            {
                Icon(imageVector = Icons.Default.Add, contentDescription = "adicione")
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.End),
            onClick = { navController.navigate("login") },
            shape = RoundedCornerShape(50),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 6.dp
            ),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF06DBF5),
                contentColor = Color(22, 40, 49, 255)
            )
        ) {
            Text(
                modifier = Modifier.padding(12.dp),
                text = "Sair",
                fontSize = 20.sp,
                letterSpacing = 2.6.sp,
                fontFamily = Mooli
            )
    }
    }
}
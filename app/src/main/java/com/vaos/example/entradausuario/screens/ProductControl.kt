package com.vaos.example.entradausuario.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.vaos.example.entradausuario.R
import com.vaos.example.entradausuario.ui.theme.Mooli
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun getColorNumber(number: String): Color {
    val numericValue = number.toIntOrNull() ?: 0

    return when {
        numericValue < 3 -> Color(248, 77, 77, 190)
        numericValue < 6 -> Color(255, 255, 0, 148)
        else -> Color(55, 248, 76, 154) // Specify the default color here
    }
}

@Composable
fun ProductControl(navController: NavController) {

    var isLoading by remember { mutableStateOf(false) }

    var actionCompleted by remember { mutableStateOf(false) }

    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier
            .padding(32.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
                .border(
                    width = 1.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(topStart = 16.dp, bottomEnd = 16.dp)
                )
                .background(Color(174, 179, 177, 138)),
        ) {
            Text(
                modifier = Modifier
                    .padding(5.dp)
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
                .padding(top = 12.dp, bottom = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Text(
                modifier = Modifier
                    .padding(8.dp),
                text = "Produto",
                fontSize = 28.sp,
                fontFamily = Mooli,
                letterSpacing = 4.sp,
                fontWeight = FontWeight.Bold,
            )

        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                modifier = Modifier.size(120.dp),
                painter = painterResource(id = R.drawable.vestido_app),
                contentDescription = "vestido infantil"
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box() {
                Text(
                    fontFamily = Mooli,
                    fontSize = 24.sp,
                    text = "Shopee"
                )
            }

            Box(
                modifier = Modifier
                    .background(getColorNumber(number = "5"))
                    .padding(8.dp)
            ) {
                Text(
                    modifier = Modifier.padding(7.dp),
                    text = "7",
                    fontSize = 20.sp,
                    fontFamily = Mooli,
                    color = Color(10, 10, 10, 255),
                )
            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 18.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box() {
                Text(
                    fontFamily = Mooli,
                    fontSize = 24.sp,
                    text = "Amazon"
                )
            }

            Box(
                modifier = Modifier
                    .background(getColorNumber(number = "10"))
                    .padding(8.dp)
            ) {
                Text(
                    modifier = Modifier.padding(7.dp),
                    text = "10",
                    fontSize = 20.sp,
                    fontFamily = Mooli,
                    color = Color(10, 10, 10, 255),
                )
            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box() {
                Text(
                    fontFamily = Mooli,
                    fontSize = 24.sp,
                    text = "Magalu"
                )
            }

            Box(
                modifier = Modifier
                    .background(getColorNumber(number = "2"))
                    .padding(8.dp)
            ) {
                Text(
                    modifier = Modifier.padding(7.dp),
                    text = "2",
                    fontSize = 20.sp,
                    fontFamily = Mooli,
                    color = Color(10, 10, 10, 255),
                )
            }
        }

        Row(
            modifier = Modifier
                .padding(top = 48.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {

            Button(
                onClick = {
                    if (!isLoading) {
                        isLoading = true
                        coroutineScope.launch {
                            // Simulate a delay of 2 seconds
                            delay(1000)

                            // Perform the action after the delay
                            actionCompleted = true
                            isLoading = false
                        }
                    }
                },
                enabled = !isLoading,
                shape = RoundedCornerShape(topStart = 16.dp, bottomEnd = 16.dp),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 6.dp
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xfffedbd0),
                    contentColor = Color.Gray
                )
            ) {
                if (isLoading) {
                    CircularProgressIndicator()
                } else {
                    Icon(imageVector = Icons.Default.Refresh, contentDescription = "atualizar")

                }
            }

            Spacer(modifier = Modifier.width(56.dp))

            Button(
                onClick = { navController.navigate("ecommerce")},
                shape = RoundedCornerShape(topStart = 16.dp, bottomEnd = 16.dp),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 6.dp
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE7FED0),
                    contentColor = Color.Gray
                )
            ) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "voltar")

            }
        }
    }
}
package com.vaos.example.entradausuario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vaos.example.entradausuario.ui.theme.EntradausuarioTheme
import com.vaos.example.entradausuario.ui.theme.Mooli

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EntradausuarioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var isPasswordVisible by remember {
        mutableStateOf(false)
    }

    var cor by remember {
        mutableStateOf(Color.White)
    }

   Column (modifier = Modifier
       .padding(32.dp)
       .background(cor)) {
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
       ){
           Text(modifier = Modifier
               .padding(8.dp)
               .align(Alignment.Center),
               text = "StockOptimize",
               fontSize = 24.sp,
               fontFamily = Mooli,
               letterSpacing = 1.8.sp)
       }
       Box(
           modifier = Modifier
               .fillMaxWidth()
               .padding(top = 12.dp, bottom = 26.dp)
           ){
           Text(modifier = Modifier
               .align(Alignment.Center)
               .padding(12.dp),
               text = "Login",
               letterSpacing = 4.sp,
               fontWeight = FontWeight.ExtraLight,
               fontSize = 34.sp,
               fontFamily = Mooli
               )
       }
       Text(modifier = Modifier
           .padding(bottom = 5.dp),
           text = "Email",
           fontSize = 18.sp,
           fontFamily = Mooli
       )
       OutlinedTextField(
           modifier = Modifier.fillMaxWidth(),
           value = email,
           onValueChange = {userEmail ->
               email = userEmail
           },
           singleLine = true,
           trailingIcon = {
               Icon(
                   painter = painterResource(id = R.drawable.person_24),
                   contentDescription = "icone de senha"
               )
           },
           keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
       )

       Text(
           modifier = Modifier
           .padding(top = 18.dp, bottom = 5.dp),
           text = "Senha",
           fontSize = 18.sp,
           fontFamily = Mooli
       )
       OutlinedTextField(
           modifier = Modifier
               .fillMaxWidth(),
           value = password,
           onValueChange = {userPassword ->
               password = userPassword
           },
           singleLine = true,
           visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
           trailingIcon = {
               Icon(
                   painter = painterResource(id = R.drawable.password),
                   contentDescription = "icone de senha"
               )
           },
           keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
       )

       Row (modifier = Modifier
           .padding(top = 48.dp)
           .fillMaxWidth(),
           horizontalArrangement = Arrangement.Center) {

           Button(
               onClick = { cor = Color.White },
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
               Text(
                   modifier = Modifier.padding(12.dp),
                   text = "Cadastrar",
                   fontSize = 18.sp,
                   letterSpacing = 1.6.sp,
                   fontFamily = Mooli
                   )
           }

           Spacer(modifier = Modifier.width(38.dp))

           Button(
               onClick = { cor = Color(111, 241, 185, 45) },
               shape = RoundedCornerShape(topStart = 16.dp, bottomEnd = 16.dp),
               elevation = ButtonDefaults.buttonElevation(
                   defaultElevation = 10.dp,
                   pressedElevation = 6.dp
               ),
               colors = ButtonDefaults.buttonColors(
                   containerColor = Color(0xFFE7FED0),
                   contentColor = Color.Gray
               )) {
               Text(
                   modifier = Modifier.padding(12.dp),
                   text = "Entrar",
                   fontSize = 18.sp,
                   letterSpacing = 1.6.sp,
                   fontFamily = Mooli
                   )
           }
       }
   }
}

package com.vaos.example.entradausuario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.vaos.example.entradausuario.screens.Ecommerce
import com.vaos.example.entradausuario.screens.Login
import com.vaos.example.entradausuario.screens.Registration
import com.vaos.example.entradausuario.ui.theme.EntradausuarioTheme

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
                    Ecommerce()
//                    Registration()
//                    Login()
                }
            }
        }
    }
}



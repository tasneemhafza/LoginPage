package com.example.loginpage

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextButton
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.input.PasswordVisualTransformation

@Composable
fun LoginScreen() {

    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.img), contentDescription = "Login image",
            modifier = Modifier.size(200.dp))
        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Welcome Back!", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Login to your account")

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = email, onValueChange = {
            email=it
        }, label ={
            Text(text = "Email Address")
        })
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label ={ Text(text = "Password")},
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            Log.i("Credential", "Email: $email Password: $password")
        }) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(6.dp))

        TextButton(onClick = {}) {
            Text(text = "Forget Password?")
        }
        //OR
//        Text(text = "Forgot Password?", modifier = Modifier.clickable{
//
//        })
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Or Sign In With")

        Row(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(painter = painterResource(id = R.drawable.img_2),
                contentDescription = "Google",
                modifier = Modifier.size(40.dp)
                    .align(Alignment.CenterVertically)
                    .clickable{
                    //logic to login with google
                }
            )
            Image(painter = painterResource(id = R.drawable.img_1),
                contentDescription = "Facebook",
                modifier = Modifier.size(65.dp).clickable{
                    //logic to login with Facebook
                }
            )
            Image(painter = painterResource(id = R.drawable.img_3),
                contentDescription = "Insta",
                modifier = Modifier.size(60.dp).clickable{
                    //logic to login with Insta
                }
            )
            Image(painter = painterResource(id = R.drawable.img_4),
                contentDescription = "Twitter",
                modifier = Modifier.size(60.dp).clickable{
                    //logic to login with Twitter
                }
            )
        }
    }

}
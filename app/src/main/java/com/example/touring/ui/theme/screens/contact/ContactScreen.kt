package com.example.touring.ui.theme.screens.contact

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.touring.R


class intentactivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent{
                MyIntents()
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MyIntents() {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .paint(
                    painterResource(id = R.drawable.ark),
                    contentScale = ContentScale.FillBounds
                )


        ) {
            val eve = LocalContext.current
            val nyambu = LocalContext.current
            val lewi = LocalContext.current
            val tess = LocalContext.current
            val sherry = LocalContext.current

            //Topappbar
            TopAppBar(
                title = { Text(text = "Intents", color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
                navigationIcon = {
                    IconButton(onClick = {


                    }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Arrowback"
                        )
                    }

                }
            )
            //End of Topappbar

            OutlinedButton(
                onClick = {/*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp,end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Red)

            ) {
                Text(text = "Mpesa", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(15.dp))
            OutlinedButton(

                onClick = {
                    val simToolKitLaunchIntent =
                        eve.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { eve.startActivity(it) }

                },


                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp,end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Red)

            ) {
                Text(text = "Camera", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(15.dp))
            OutlinedButton(
                onClick = {
                    val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    if (cameraIntent.resolveActivity(nyambu.packageManager)!=null){
                        nyambu.startActivity(cameraIntent)
                    }else{
                        println("Camera app is not available")
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp,end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Red)

            ) {
                Text(text = "Email", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(15.dp))
            OutlinedButton(
                onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("evangelinewamburaireri@gmail.com"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                    sherry.startActivity(shareIntent)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp,end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Red)

            ) {
                Text(text = "Sms", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(15.dp))
            OutlinedButton(
                onClick = {
                    val smsIntent=Intent(Intent.ACTION_SENDTO)
                    smsIntent.data="smsto:0706226264".toUri()
                    smsIntent.putExtra("sms_body","Hello Evajelyn,how was your day?")
                    lewi.startActivity(smsIntent)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp,end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Red)

            ) {
                Text(text = "Call", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(15.dp))
            OutlinedButton(
                onClick = {
                    val callIntent=Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0706226264".toUri()
                    tess.startActivity(callIntent)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp,end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Red)

            ) {
                Text(text = "Share", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(15.dp))

        }
    }



    @Preview(showBackground = true)
    @Composable
    fun MyIntentsPreview(){
        MyIntents()

    }







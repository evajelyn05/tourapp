package com.example.touring.ui.theme.screens.destination

import com.example.touring.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.touring.navigation.HOME_URL
import com.example.touring.navigation.ROUT_DESTINATION


class Destination : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          DestinationScreen(rememberNavController())

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DestinationScreen(navController: NavHostController){
    Column (modifier = Modifier.fillMaxSize()){
        val mContext = LocalContext.current

        //TopappBar
        TopAppBar(
            title = { Text(text = "Destination", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),


            actions =  {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.White
                    )

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "setting",
                        tint = Color.White
                    )

                }
            })
        //End of topappbar
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
        ){

            Image(
                painter = painterResource(id = R.drawable.masaimara) ,
                contentDescription ="london",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Let's plan your next vacation",
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center
            )

        }
        //End of box
        Spacer(modifier = Modifier.height(10.dp))
        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            placeholder = { Text(text = "What's your destination?")},
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        //END OF SEARCHBAR
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Recently viewed",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(20.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier
            .horizontalScroll(rememberScrollState())) {
            //Card1

            Card (
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            ){
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.majimagic),
                            contentDescription ="london",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.Crop)

                    }
                    Text(
                        text = "MajiMagic",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp)

                }

            }


            //End of card1
            Spacer(modifier = Modifier.width(20.dp))
            //Card1

            Card (
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            ){
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.stedmarkgardens),
                            contentDescription ="london",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.Crop)

                    }
                    Text(
                        text = "Stedmarkgardens",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp)

                }

            }


            //End of card1
            Spacer(modifier = Modifier.width(20.dp))
            //Card1

            Card (
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            ){
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.museum),
                            contentDescription ="london",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.Crop)

                    }
                    Text(
                        text = "Museum",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp)

                }

            }


            //End of card1
            Spacer(modifier = Modifier.width(20.dp))
            //Card1

            Card (
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            ){
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.kenyasafari),
                            contentDescription ="london",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.Crop)

                    }
                    Text(
                        text = "KenyaSafari",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp)

                }

            }


            //End of card1
            Spacer(modifier = Modifier.width(20.dp))
            //Card1

            Card (
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            ){
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.tour),
                            contentDescription ="london",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.Crop)

                    }
                    Text(
                        text = "Masaaimara",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp)

                }

            }


            //End of card1
            Spacer(modifier = Modifier.width(20.dp))





        }



    }
}



@Preview(showBackground = true)
@Composable
fun destinationPreview() {
    DestinationScreen(rememberNavController())
}

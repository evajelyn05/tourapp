package com.example.touring.ui.theme.screens.dashboard

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.touring.R
import com.example.touring.navigation.HOME_URL
import com.example.touring.ui.theme.lBlue
import com.example.touring.navigation.ROUT_DESTINATION

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavHostController) {


    Column (modifier = Modifier.fillMaxSize()){
        TopAppBar(
            title = { Text(text = "Here in Nairobi Kenya") },
            modifier = Modifier
                .background(lBlue)

        )





        //end of topappbar

        Spacer(modifier = Modifier.height(30.dp))

        Row (modifier = Modifier.padding(start = 20.dp)) {
            Column {
                Text(
                    text ="Welcome",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Cursive,

                    color = lBlue
                )
                Text(text = "Some of the touring sites ",
                    fontSize = 20.sp)

            }


            Spacer(modifier = Modifier.width(150.dp))
            Image(
                painter = painterResource(id = com.example.touring.R.drawable.waterfall),
                contentDescription = "amazon",
                modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.height(50.dp))


        }
        //row1
        Column (modifier = Modifier.padding(start = 20.dp)) {
            Row {
                Card(modifier = Modifier.size(width = 150.dp, height =100.dp )) {
                    Column {
                        val mContext = LocalContext.current
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id =com.example.touring.R.drawable.stedmarkgardens),
                                contentDescription ="amazon",
                                modifier = Modifier.size(70.dp)
                                    .clickable { navController.navigate(ROUT_DESTINATION)
                                        Toast.makeText(mContext,
                                            "Opening destination screen",
                                            Toast.LENGTH_SHORT).show()

                                    })


                        }
                        Text(text = "Karura Forest", fontSize = 20.sp, color = lBlue, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
                    }
                }
                Spacer(modifier = Modifier.width(20.dp))


                Card(modifier = Modifier.size(width = 150.dp, height =100.dp )) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.museum ),
                                contentDescription ="amazon",
                                modifier = Modifier.size(70.dp))

                        }
                        Text(text = "National Museum", fontSize = 20.sp, color = lBlue, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Column (modifier = Modifier.padding(start = 20.dp)) {
            Row {
                Card(modifier = Modifier.size(width = 150.dp, height =100.dp )) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id =com.example.touring.R.drawable.kenyasafari),
                                contentDescription ="amazon",
                                modifier = Modifier.size(70.dp))

                        }
                        Text(text = "KenyaSafari", fontSize = 20.sp, color = lBlue, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
                    }
                }
                Spacer(modifier = Modifier.width(20.dp))

                Card(modifier = Modifier.size(width = 150.dp, height =100.dp )) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id =com.example.touring.R.drawable.masaimara),
                                contentDescription ="amazon",
                                modifier = Modifier.size(70.dp))

                        }
                        Text(text = "MaasaiMara", fontSize = 20.sp, color = lBlue, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Column (modifier = Modifier.padding(start = 20.dp)) {
            val mContext = LocalContext.current
            Row {
                Card(modifier = Modifier
                    .clickable {
                        navController.navigate(ROUT_DESTINATION)
                        Toast
                            .makeText(
                                mContext,
                                "Opening tours",
                                Toast.LENGTH_SHORT
                            )
                            .show()

                    }

                    .size(width = 150.dp, height = 100.dp)) {
                    Column {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = com.example.touring.R.drawable.stedmarkgardens),
                                contentDescription = "amazon",
                                modifier = Modifier.size(70.dp)
                            )

                        }
                        Text(
                            text = "Stedmarkgardens",
                            fontSize = 20.sp,
                            color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Spacer(modifier = Modifier.width(20.dp))

                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    Column(
                        modifier = Modifier
                            .clickable { navController.navigate(ROUT_DESTINATION) }
                            .size(width = 150.dp, height = 40.dp,)) {
                        /*Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {

                        }*/
                        Column {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = com.example.touring.R.drawable.majimagic),
                                    contentDescription = "amazon",
                                    modifier = Modifier.size(70.dp)
                                )

                            }
                            Text(
                                text = "MajiMagic",
                                fontSize = 20.sp,
                                color = lBlue,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }
                    }



                }
            }
        }
        Spacer(modifier = Modifier.height(50.dp))




        //endofrow1

    }
}






@Preview(showBackground = true)
@Composable
fun DashboardPreview() {
    DashboardScreen(rememberNavController())
}
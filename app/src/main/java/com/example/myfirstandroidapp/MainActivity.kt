package com.example.myfirstandroidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstandroidapp.ui.theme.MyFirstAndroidAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstAndroidAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),

    ) {
        Column(
            modifier = Modifier.weight(2f),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Android Logo",
                modifier = Modifier.padding(
                    start = 120.dp,
                    end = 120.dp,
                    top = 30.dp,
                    bottom = 20.dp
                )
            )
            Text(
                text = "Niyas Hameed",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = "GDSC APP DEV",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(20.dp),
                color = Color.White
            )
        }
        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            ContactCard(id = R.drawable.phone, text = "+91 8148100828")
            Spacer(modifier = Modifier.height(20.dp))
            ContactCard(id = R.drawable.share, text = "@radextrem")
            Spacer(modifier = Modifier.height(20.dp))
            ContactCard(id = R.drawable.email, text = "2020ad@svce")
            Spacer(modifier = Modifier.height(50.dp))
        }
    }
}


@Composable
fun ContactCard(id: Int, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 70.dp, end = 70.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            painter = painterResource(id = id),
            contentDescription = "",
            tint = Color(0xFF3ddc84),
            modifier = Modifier.size(30.dp)
        )
        Text(
            text = text,
            color = Color.White,
            fontSize = 18.sp
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyFirstAndroidAppTheme {
        BusinessCardApp()
    }
}
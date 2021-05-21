package com.yds.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }


}

@Composable
fun NewsStory() {
    Column(
        modifier = Modifier.padding(16.dp)
    ){
        Image(painter= painterResource(id = R.drawable.header),
            contentDescription=null,
        modifier = Modifier
            .height(180.dp)
            .fillMaxWidth()
            .clip(shape= RoundedCornerShape(5.dp)),
        contentScale = ContentScale.Crop)
        
        Spacer(modifier = Modifier.height(10.dp))
        
        Text(text = "A day in Shark Fin Cove",
        style = typography.h4)
        Text(text = "Davenport, California",
        style = typography.body1)
        Text(text = "December 2018",
        style = typography.body2)
    }

}

@Preview
@Composable
fun DefaultPreview(){
    NewsStory()
}

@Composable
fun Greeting(name:String){
    Text(text = "Hello $name")
}

@Preview
@Composable
fun PreviewGreeting(){
    Greeting(name = "People")
}

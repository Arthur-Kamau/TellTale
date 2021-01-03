package org.araizen.teleril.common
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
@Composable
fun App() {
//    var text by remember { mutableStateOf("Hello, World!") }
//
//    MaterialTheme {
//        Button(onClick = {
//            text = "Hello, ${getPlatformName()}"
//        }) {
//            Text(text)
//        }
//    }
    Scaffold(
        topBar = {
            TopAppBar(

                title = {
                    Text(text = "image here")
//                    Image(
                      //  imageResource(id = R.drawable.hotspot),
//                        androidx.compose.ui.graphics.vector.ImageVector.Builder(),
//                        modifier = Modifier.width(50.dp).height(50.dp).padding(horizontal = 1.dp),
//                        contentScale = ContentScale.Crop
//                    )
                },


                backgroundColor = androidx.compose.ui.graphics.Color.White, //colorResource(R.color.material_blue_grey_800),//Color.DarkGray,
                contentColor = Color.White,
                elevation = 12.dp
            )
        }, bodyContent = {

            Row{
                Text("Image here")
            }
        })
}

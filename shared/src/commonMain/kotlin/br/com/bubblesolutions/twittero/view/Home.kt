package br.com.bubblesolutions.twittero.view


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Home() {
    Column(Modifier.background(Color.Black)) {
        Row (Modifier.fillMaxWidth().background(Color.DarkGray).padding(24.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
            Box(Modifier.width(32.dp).height(32.dp).background(Color.Blue))
            Text("Início")
            Box(Modifier.width(32.dp).height(32.dp).background(Color.Transparent))
        }
        Column(Modifier.fillMaxWidth().padding(24.dp)) {
            Box(Modifier.fillMaxWidth().height(60.dp).background(Color.Blue))
            Spacer(Modifier.height(10.dp))
            Box(Modifier.fillMaxWidth().height(60.dp).background(Color.Blue))
            Spacer(Modifier.height(10.dp))
            Box(Modifier.fillMaxWidth().height(60.dp).background(Color.Blue))
            Spacer(Modifier.height(10.dp))
            Box(Modifier.fillMaxWidth().height(60.dp).background(Color.Blue))
        }
    }
}
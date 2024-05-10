
package com.example.urbanspots


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.urbanspots.ui.theme.UrbanspotsTheme


@Composable
fun NavBar(name: String, modifier: Modifier = Modifier)


{
    Surface(color = MaterialTheme.colorScheme.secondary)

    {
        Column(modifier = Modifier.fillMaxSize()) {
            // Top part of the view
            // Add your composables for the top part here

            // Spacer for vertical space
            Spacer(modifier = Modifier.height(16.dp)) // Adjust the height as needed

            // Bottom navigation bar
            // Add your composables for the bottom navigation bar here

      /* Row {
              Text(
                    text = "Map Mode",
                    modifier = modifier
                )
                var checked by remember { mutableStateOf(true) }
                Switch(
                    modifier = Modifier.semantics { contentDescription = "Demo" },
                    checked = checked,
                    onCheckedChange = { checked = it })

            } */

            Spacer(modifier = Modifier.height(720.dp))

            var selectedItem by remember { mutableIntStateOf(0) }
            val items = listOf("Spots", "Map", "Filtres", "Profil")
            val icons = listOf(
                Icons.Filled.Home,
                Icons.Filled.Place,
                Icons.Filled.Search,
                Icons.Filled.Person,

            )

            NavigationBar {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(icon = { Icon(icons[index], contentDescription = item) },
                        label = { Text(item) },
                        selected = selectedItem == index,
                        onClick = { selectedItem = index }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NavBarPreview() {
    UrbanspotsTheme {
        NavBar("Android")

    }
}
















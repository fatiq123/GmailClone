package com.example.gmailclone.components

import android.widget.Toast
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.gmailclone.model.BottomMenuData

@Composable
fun HomeBottomMenu() {
    val items = listOf(
        BottomMenuData.Mail,
        BottomMenuData.Meet
    )

    BottomNavigation(backgroundColor = Color.White, contentColor = Color.Black) {
        items.forEach {
            BottomNavigationItem(selected = false, onClick = {
                Toast.makeText(
                    this@BottomNavigation,
                    "You Select $it",
                    Toast.LENGTH_SHORT
                ).show() }, icon = {
                Icon(
                    imageVector = it.icon,
                    contentDescription = it.title
                )
            }, label = { Text(text = it.title) }, alwaysShowLabel = true)
        }
    }
}
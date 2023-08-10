package com.example.gmailclone.components

import androidx.compose.foundation.ScrollState
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun GmailFab(scrollState: ScrollState) {

    if (scrollState.value > 100) {
        androidx.compose.material.ExtendedFloatingActionButton(
            text = { Text(text = "Compose", fontSize = 16.sp) },
            onClick = { /*TODO*/ },
            icon = { Icon(imageVector = Icons.Default.Edit, contentDescription = "") },
            backgroundColor = MaterialTheme.colors.surface
        )
    } else {
        FloatingActionButton(
            onClick = { /*TODO*/ },
            backgroundColor = MaterialTheme.colors.surface
        ) {
            Icon(imageVector = Icons.Default.Edit, contentDescription = "")
        }
    }

}
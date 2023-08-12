package com.example.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gmailclone.model.DrawerMenuData

@Composable
fun GmailDrawerHeader(scrollState: ScrollState) {

    val menuList = listOf(
        DrawerMenuData.Divider,
        DrawerMenuData.AllInBoxes,
        DrawerMenuData.Divider,
        DrawerMenuData.Primary,
        DrawerMenuData.Social,
        DrawerMenuData.Promotions,
        DrawerMenuData.HeaderOne,
        DrawerMenuData.Starred,
        DrawerMenuData.Snoozed,
        DrawerMenuData.Important,
        DrawerMenuData.Sent,
        DrawerMenuData.Schedule,
        DrawerMenuData.Outbox,
        DrawerMenuData.Draft,
        DrawerMenuData.AllMail,
        DrawerMenuData.HeaderTwo,
        DrawerMenuData.Calendar,
        DrawerMenuData.Divider,
        DrawerMenuData.Setting,
        DrawerMenuData.Help,

        )


    Column(modifier = Modifier.verticalScroll(scrollState)) {
        Text(
            color = Color.Red,
            text = "Gmail",
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp, top = 20.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        menuList.forEach { item ->

            when {
                item.isDivider -> {
                    Divider(
                        modifier = Modifier.padding(bottom = 10.dp, top = 10.dp),
                        thickness = 1.dp,
                        color = Color.Gray
                    )
                }

                item.isHeader -> {
                    Text(
                        text = item.title!!,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 40.dp, bottom = 20.dp, top = 20.dp),
                        )
                }

                else -> {
                    GmailDrawerBody(item = item)
                }
            }

        }
    }
}

@Composable
fun GmailDrawerBody(item: DrawerMenuData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)  // Increase the height for more space
            .padding(16.dp)
    ) {
        Image(
            imageVector = item.icon!!,
            contentDescription = item.title!!,
            modifier = Modifier
                .weight(0.5f)
                .size(32.dp)  // Increase the icon size
        )
        Text(
            text = item.title!!,
            modifier = Modifier
                .weight(2.0f)
                .padding(start = 16.dp),  // Add padding for better spacing
            fontSize = 18.sp,  // Increase the font size
            fontWeight = FontWeight.Normal  // Adjust the font weight as desired
        )
    }
}

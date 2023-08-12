package com.example.gmailclone.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.PersonAddAlt
import androidx.compose.material.icons.outlined.PersonSearch
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.gmailclone.R
import com.example.gmailclone.model.MailData

/*@Composable
fun AccountsDialog(openDialog: MutableState<Boolean>) {
    Dialog(onDismissRequest = { openDialog.value = false }) {
        AccountsDialogUI()
    }
}*/
@Composable
fun AccountsDialog(openDialog: MutableState<Boolean>) {
    Dialog(onDismissRequest = { openDialog.value = false }) {
        AccountsDialogUI(openDialog)
    }
}

/*@Composable
fun AccountsDialogUI(modifier: Modifier = Modifier) {

    var isDialogOpen by remember {
        mutableStateOf(true)
    } // State variable to track dialog open/close

    Card(colors = CardDefaults.cardColors(contentColor = Color.Gray)) {
        Column(
            modifier = modifier
                .background(Color.White)
                .padding(bottom = 16.dp)
        ) {
            Row(
                modifier = modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { isDialogOpen = false }) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "")
                }
                Image(
                    painter = painterResource(id = R.drawable.mypic),   // here I have to replace it by google.jpg
                    contentDescription = "",
                    modifier = modifier
                        .size(30.dp)
                        .weight(2.0f)
                )
            }

            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.mypic),
                    contentDescription = "Profile",
                    modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(color = Color.Gray)
                )
                Column(
                    modifier
                        .weight(2.0f)
                        .padding(start = 16.dp, bottom = 10.dp)
                ) {
                    Text(
                        text = "Fatiq Hussnain",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp
                    )
                    Text(text = "fatiqhussnain1@gmail.com", fontSize = 14.sp)
                }
                Text(text = "99+", modifier = modifier.padding(end = 16.dp))
            }

            Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Card(
                    modifier.requiredWidth(150.dp),
                    shape = RoundedCornerShape(50.dp),
                    border = BorderStroke(1.dp, color = Color.Gray)
                ) {
                    Text(
                        text = "Google Account",
                        modifier
                            .padding(bottom = 10.dp, top = 8.dp, start = 8.dp, end = 8.dp)
                            .fillMaxWidth()
                            .height(25.dp),
                        textAlign = TextAlign.Center,
                        fontSize = 18.sp
                    )
                }
                Spacer(modifier.width(10.dp))
            }

            Divider(modifier.padding(top = 16.dp))
        }
    }
}*/


@Composable
fun AccountsDialogUI(openDialog: MutableState<Boolean>, modifier: Modifier = Modifier) {
    if (openDialog.value) {
        Card(
            colors = CardDefaults.cardColors(containerColor = Color.White),     // remove this colors line in order to get default color of card
            elevation = CardDefaults.cardElevation(10.dp)
        ) {
            Column(
//                modifier = modifier
//                    .background(Color.White)
//                    .padding(bottom = 16.dp)
            ) {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    IconButton(onClick = { openDialog.value = false }) {
                        Icon(imageVector = Icons.Default.Close, contentDescription = "")
                    }
                    Image(
                        painter = painterResource(id = R.drawable.google),   // Replace with your image resource
                        contentDescription = "",
                        modifier = modifier
                            .size(80.dp)
                            .weight(2.0f)
                    )
                }

                // Rest of your dialog content
                // ... (keep the same code you provided for the rest of the dialog)
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, top = 16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mypic),
                        contentDescription = "Profile",
                        modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(color = Color.Gray)
                    )
                    Column(
                        modifier
                            .weight(2.0f)
                            .padding(start = 16.dp, bottom = 10.dp)
                    ) {
                        Text(
                            text = "Fatiq Hussnain",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 18.sp
                        )
                        Text(
                            text = "fatiqhussnain1@gmail.com",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Text(
                        text = "99+",
                        modifier = modifier.padding(end = 16.dp),
                        fontWeight = FontWeight.Bold
                    )
                }

                Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    Card(
                        modifier.requiredWidth(170.dp),
                        shape = RoundedCornerShape(50.dp),
                        border = BorderStroke(1.dp, color = Color.Gray),
                        colors = CardDefaults.cardColors(containerColor = Color.White)      // this line also I code my self in order to give card a white color
                    ) {
                        Text(
                            text = "Google Account",
                            modifier
                                .padding(bottom = 10.dp, top = 8.dp, start = 8.dp, end = 8.dp)
                                .fillMaxWidth()
                                .height(25.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp
                        )
                    }
                    Spacer(modifier.width(10.dp))
                }

                Divider(modifier.padding(top = 16.dp))
            }




            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 26.dp)
            ) {
                /*Image(
                    painter = painterResource(id = R.drawable.mypic),
                    contentDescription = "Profile",
                    modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(color = Color.Gray)
                )*/
                androidx.compose.material.Card(
                    modifier = modifier
                        .padding(8.dp)
                        .size(40.dp)
                        .clip(CircleShape), backgroundColor = Color.Gray
                ) {
                    Text(
                        text = "C",
                        textAlign = TextAlign.Center,
                        modifier = modifier.padding(bottom = 5.dp, start = 5.dp, top = 5.dp, end = 5.dp)
                    )
                }
                Column(
                    modifier
                        .weight(2.0f)
                        .padding(start = 16.dp, bottom = 10.dp)
                ) {
                    Text(
                        text = "Chris Morty",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp
                    )
                    Text(
                        text = "chris@gmail.com",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Text(
                    text = "80+",
                    modifier = modifier.padding(end = 16.dp),
                    fontWeight = FontWeight.Normal
                )
            }



            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp)
            ) {
                /*Image(
                    painter = painterResource(id = R.drawable.mypic),
                    contentDescription = "Profile",
                    modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(color = Color.Gray)
                )*/
                androidx.compose.material.Card(
                    modifier = modifier
                        .padding(8.dp)
                        .size(40.dp)
                        .clip(CircleShape), backgroundColor = Color.Gray
                ) {
                    Text(
//                        text = mailData.userName[0].toString(),
                        text = "C",
                        textAlign = TextAlign.Center,
                        modifier = modifier.padding(bottom = 5.dp, start = 5.dp, top = 5.dp, end = 5.dp)
                    )
                }
                Column(
                    modifier
                        .weight(2.0f)
                        .padding(start = 16.dp, bottom = 10.dp)
                ) {
                    Text(
                        text = "Christy Jane",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp
                    )
                    Text(
                        text = "jane@gmail.com",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Text(
                    text = "99+",
                    modifier = modifier.padding(end = 16.dp),
                    fontWeight = FontWeight.Normal
                )
            }



            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 25.dp, top = 16.dp)
            ) {
                Image(
                    imageVector = Icons.Outlined.PersonAddAlt,
                    contentDescription = "Add Person",
                )

                Text(
                    text = "Add Another Account",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = modifier
                        .weight(2.0f)
                        .padding(start = 15.dp)
                )
            }


            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 25.dp, top = 16.dp)
            ) {
                Image(
                    imageVector = Icons.Outlined.PersonSearch,
                    contentDescription = "Manage Accounts",
                )

                Text(
                    text = "Manage Accounts On This Device",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = modifier
                        .weight(2.0f)
                        .padding(start = 15.dp)
                )
                Spacer(modifier.width(10.dp))
            }

            Divider(modifier.padding(top = 26.dp))

            Column(
                modifier = modifier.padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Privacy Policy", fontSize = 18.sp, fontWeight = FontWeight.Bold,
                        modifier = modifier.padding(start = 15.dp)
                    )
                    Text(
                        text = ".", fontWeight = FontWeight.Bold,
                        modifier = modifier.padding(start = 14.dp, bottom = 8.dp)
                    )
                    Text(
                        text = "Terms Of Service", fontSize = 18.sp, fontWeight = FontWeight.Bold,
                        modifier = modifier.padding(start = 16.dp)
                    )
                }
            }

        }

    }
}
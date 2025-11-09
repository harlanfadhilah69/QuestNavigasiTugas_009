package com.example.praktikumtugas_6.view

import androidx.compose.foundation.Image
import androidx.compose.material3.AlertDialog
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.test.espresso.base.Default
import com.example.praktikumtugas_6.R
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.ui.res.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormulirDaftar(
    onBackClicked : () -> Unit,
    onSubmitClicked : () -> Unit

){
        var textNama by remember { mutableStateOf(value = "") }
        var textNick by remember { mutableStateOf(value = "") }
        var textJK by remember { mutableStateOf(value = "") }
        var textRole by remember { mutableStateOf(value = "") }
        var textKota by remember { mutableStateOf(value = "") }

        var nama by remember { mutableStateOf(value = "") }
        var nickname by remember { mutableStateOf(value = "") }
        var jenis by remember { mutableStateOf(value = "") }
        var role by remember { mutableStateOf(value = "") }
        var kota by remember { mutableStateOf(value = "") }
        var expanded by remember { mutableStateOf(false) }
        var selectedText by remember { mutableStateOf("") }
        var showDialog by remember { mutableStateOf(false) }

        val gender: List<String> = listOf("Laki-laki", "Perempuan")
        val roleOptions = listOf("Pilih Role", "Jungler", "Midlaner", "Roamer", "Goldlaner", "Explaner")

    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.backgroundd),
            contentDescription = "ONIC Background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
        Text(text = "Formulir Pendaftaran",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(
                start = 46.dp,
                top = 35.dp,
            )
        )
        Column (modifier = Modifier.padding(top = 5.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Card(
                modifier = Modifier
                    .padding(top = 80.dp, start = 10.dp, end = 10.dp)
                    .fillMaxWidth()
                    .height(720.dp),
                shape = RoundedCornerShape(30.dp),
                colors = CardDefaults.outlinedCardColors(
                    containerColor = Color.LightGray.copy(alpha = 0.9f)
                )
            ) {
                Text(
                    text = "Nama Lengkap",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.padding(
                        start = 25.dp,
                        top = 25.dp,
                    )
                )

                OutlinedTextField(
                    value = textNama,
                    singleLine = true,
                    shape = MaterialTheme.shapes.large,
                    modifier = Modifier
                        .width(width = 390.dp)
                        .padding(top = 10.dp, start = 20.dp)
                        .height(height = 85.dp),
                    label = { Text(text = "Nama Lengkap") },
                    onValueChange = {
                        textNama = it
                    }
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Nickname MLBB",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.padding(
                        start = 25.dp,
                        top = 25.dp,
                    )
                )

                OutlinedTextField(
                    value = textNick,
                    singleLine = true,
                    shape = MaterialTheme.shapes.large,
                    modifier = Modifier
                        .width(width = 390.dp)
                        .padding(top = 10.dp, start = 20.dp)
                        .height(height = 85.dp),
                    label = { Text(text = "Nick Name") },
                    onValueChange = {
                        textNick = it
                    }
                )

                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Jenis Kelamin",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.padding(
                        start = 25.dp,
                        top = 10.dp,
                    )
                )
                Row {
                    gender.forEach { item ->
                        Row(
                            modifier = Modifier.selectable(
                                selected = textJK == item,
                                onClick = { textJK = item }
                            ).padding(top = 5.dp, start = 15.dp, end = 10.dp),
                            verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(
                                selected = textJK == item,
                                onClick = {
                                    textJK = item
                                })
                            Text(text = item)
                        }
                    }
                }
            }
        }
    }
}






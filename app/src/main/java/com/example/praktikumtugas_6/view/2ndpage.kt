package com.example.praktikumtugas_6.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.praktikumtugas_6.R
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
data class PlayerData(
    val nama: String,
    val nickname: String,
    val gender: String,
    val role: String,
    val kotaAsal: String,
    @DrawableRes val photoResource: Int
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListPesertaScreen(
    onBerandaClicked: () -> Unit,
    onFormulirClicked: () -> Unit

) {
    Scaffold(
    ) { innerPadding ->
        val datalist = listOf(
            PlayerData(
                nama = "Kairi Rayosdelsol",
                nickname = "ONIC Kairi",
                gender = "Laki - Laki",
                role = "Jungler",
                kotaAsal = "Filipina",
                photoResource = R.drawable.kairi
            ),
            PlayerData(
                nama = "Gilang",
                nickname = "ONIC SANZ",
                gender = "Laki - Laki",
                role = "Midlaner",
                kotaAsal = "Makassar",
                photoResource = R.drawable.sanz
            ),
            PlayerData(
                nama = "Nicky Fernando",
                nickname = "ONIC Kiboy",
                gender = "Laki - Laki",
                role = "Roamer",
                kotaAsal = "Manado",
                photoResource = R.drawable.kiboy
            ),
            PlayerData(
                nama = "Schevenko David",
                nickname = "ONIC Skylar",
                gender = "Laki - Laki",
                role = "Goldlaner",
                kotaAsal = "Manado",
                photoResource = R.drawable.skylar

            ),
            PlayerData(
                nama = "Lutfi Ardiansyah",
                nickname = "ONIC Lutpiii",
                gender = "Laki - Laki",
                role = "Explaner",
                kotaAsal = "Sidoarjo",
                photoResource = R.drawable.lutpi
            )
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Image(
                painter = painterResource(id = R.drawable.backgroundd),
                contentDescription = "ONIC Background",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.matchParentSize()
            )
        }
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(datalist) { data ->
                ListElement(data = data)
            }
        }
    }
}

    @Composable
    fun ListElement(data: PlayerData) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.outlinedCardColors(
                containerColor = Color.LightGray.copy(alpha = 0.9f)
            )
        ) {

        }
    }
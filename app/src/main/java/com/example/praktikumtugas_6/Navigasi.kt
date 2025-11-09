package com.example.praktikumtugas_6

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.praktikumtugas_6.view.HalamanPertama
import com.example.praktikumtugas_6.view.ListPesertaScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.praktikumtugas_6.view.FormulirDaftar

enum class Navigasi {
    HalamanPertama,
    ListPesertaScreen,
    FormulirScreen
}

@Composable
fun AppScreen(
    navController: NavHostController = rememberNavController()
){
    Scaffold { isiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi.HalamanPertama.name,
            modifier = Modifier.padding(isiRuang)
        ) {
            composable(route = Navigasi.HalamanPertama.name) {
                HalamanPertama(
                    onMasukClicked = {
                        navController.navigate(Navigasi.ListPesertaScreen.name)
                    }
                )
            }
            composable(route = Navigasi.ListPesertaScreen.name) {
                ListPesertaScreen(
                    onBerandaClicked = {
                        navController.popBackStack(Navigasi.HalamanPertama.name, inclusive = false)
                    },

                    onFormulirClicked = {
                        navController.navigate(Navigasi.FormulirScreen.name)
                    }
                )
            }
            composable(route = Navigasi.FormulirScreen.name) {
                FormulirDaftar(
                    onBackClicked = {
                        navController.popBackStack()
                    },
                    onSubmitClicked = {
                        navController.popBackStack(Navigasi.ListPesertaScreen.name, inclusive = false)
                    }
                )
            }
        }
    }
}
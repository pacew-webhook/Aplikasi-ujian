package com.example.aplikasiujian.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DashboardScreen(
    onLogout: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Dashboard")
        Text("Selamat datang di Aplikasi Ujian")

        Card {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Ujian Mendatang")
                Text("Belum ada ujian")
            }
        }

        Card {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Undangan Ujian")
                Text("Belum ada undangan")
            }
        }

        Card {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Riwayat Nilai")
                Text("Belum ada hasil")
            }
        }

        Button(onClick = onLogout) {
            Text("Keluar")
        }
    }
}

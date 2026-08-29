package com.example.aplikasiujian

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.aplikasiujian.ui.UjianApp
import com.example.aplikasiujian.ui.theme.AplikasiUjianTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AplikasiUjianTheme {
                UjianApp()
            }
        }
    }
}

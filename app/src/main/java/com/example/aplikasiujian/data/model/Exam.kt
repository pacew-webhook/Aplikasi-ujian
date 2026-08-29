package com.example.aplikasiujian.data.model

data class Exam(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val durationMinutes: Int = 60,
    val startTime: Long = 0L,
    val endTime: Long = 0L,
    val creatorId: String = ""
)

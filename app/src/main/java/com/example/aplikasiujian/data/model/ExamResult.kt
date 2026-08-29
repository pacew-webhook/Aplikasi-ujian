package com.example.aplikasiujian.data.model

data class ExamResult(
    val id: String = "",
    val examId: String = "",
    val userId: String = "",
    val score: Double = 0.0,
    val completedAt: Long = 0L
)

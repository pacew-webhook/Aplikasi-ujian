package com.example.aplikasiujian.data.model

data class Question(
    val id: String = "",
    val examId: String = "",
    val question: String = "",
    val options: List<String> = emptyList(),
    val correctAnswerIndex: Int = 0
)

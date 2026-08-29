package com.example.aplikasiujian.data.model

data class Answer(
    val id: String = "",
    val examId: String = "",
    val questionId: String = "",
    val userId: String = "",
    val selectedAnswerIndex: Int? = null
)

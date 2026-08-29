package com.example.aplikasiujian.data.model

enum class UserRole {
    STUDENT,
    TEACHER
}

data class User(
    val id: String = "",
    val name: String = "",
    val email: String = "",
    val role: UserRole = UserRole.STUDENT
)

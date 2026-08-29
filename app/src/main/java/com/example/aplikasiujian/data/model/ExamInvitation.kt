package com.example.aplikasiujian.data.model

enum class InvitationStatus {
    PENDING,
    ACCEPTED,
    REJECTED
}

data class ExamInvitation(
    val id: String = "",
    val examId: String = "",
    val userId: String = "",
    val status: InvitationStatus = InvitationStatus.PENDING
)

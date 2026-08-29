# Struktur Project — Aplikasi Ujian

## Tujuan
Starter project Android Kotlin + Jetpack Compose untuk aplikasi ujian berdasarkan PRD:

1. Undangan Ujian
2. Kerjakan Ujian
3. Kirim Soal via Email
4. Nilai Otomatis
5. Daftar & Masuk
6. Pengingat Ujian

## Struktur

```text
AplikasiUjian/
├── settings.gradle.kts
├── build.gradle.kts
├── gradle.properties
├── PROJECT_STRUCTURE.md
└── app/
    ├── build.gradle.kts
    └── src/main/
        ├── AndroidManifest.xml
        ├── java/com/example/aplikasiujian/
        │   ├── MainActivity.kt
        │   ├── ui/
        │   │   ├── UjianApp.kt
        │   │   ├── screens/
        │   │   │   ├── LoginScreen.kt
        │   │   │   ├── RegisterScreen.kt
        │   │   │   └── DashboardScreen.kt
        │   │   └── theme/
        │   │       └── Theme.kt
        │   └── data/
        │       └── model/
        │           ├── User.kt
        │           ├── Exam.kt
        │           ├── Question.kt
        │           ├── ExamInvitation.kt
        │           ├── Answer.kt
        │           └── ExamResult.kt
        └── res/
            └── values/
                └── styles.xml
```

## Tahap saat ini

Starter sudah memiliki:
- Navigation Compose
- Halaman Login
- Halaman Register
- Dashboard awal
- Model User
- Model Exam
- Model Question
- Model Invitation
- Model Answer
- Model Result
- Theme Compose

## Belum diaktifkan

Fitur berikut akan dibuat pada tahap berikutnya:
- autentikasi sungguhan
- database
- daftar undangan
- detail ujian
- pengerjaan soal
- timer
- penyimpanan jawaban
- submit ujian
- penilaian otomatis
- pembuatan ujian
- email invitation
- notifikasi/pengingat

## Catatan build

Project menggunakan Kotlin 2.2.0 dan target Android API 35. Jika lingkungan Android Code Studio memiliki versi Android Gradle Plugin yang berbeda, file `build.gradle.kts` dapat disesuaikan tanpa mengubah struktur source code.

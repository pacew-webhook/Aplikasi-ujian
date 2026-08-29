# Aplikasi Ujian — GitHub Build

## Tujuan

Project ini sudah disiapkan untuk dibuild menggunakan GitHub Actions tanpa membutuhkan Android Studio/Android Code Studio di sisi GitHub.

## Build otomatis

Workflow berada di:

```text
.github/workflows/android.yml
```

Workflow akan:

1. Checkout source code.
2. Menggunakan JDK 17.
3. Menyiapkan Gradle 8.13.
4. Menjalankan:

```bash
./gradlew :app:assembleDebug
```

5. Menghasilkan:

```text
app/build/outputs/apk/debug/app-debug.apk
```

6. Mengunggah APK sebagai GitHub Actions Artifact dengan nama:

```text
aplikasi-ujian-debug-apk
```

## Cara memasukkan ke GitHub

Buat repository baru, lalu upload seluruh isi folder project ini ke repository.

Struktur penting:

```text
AplikasiUjian/
├── .github/
│   └── workflows/
│       └── android.yml
├── gradle/
│   └── wrapper/
├── gradlew
├── gradlew.bat
├── settings.gradle.kts
├── build.gradle.kts
├── gradle.properties
├── .gitignore
└── app/
```

## Menjalankan build

Setelah source sudah berada di GitHub:

1. Buka repository.
2. Pilih tab **Actions**.
3. Pilih workflow **Android Build**.
4. Tekan **Run workflow** jika ingin menjalankan manual.

Workflow juga otomatis berjalan ketika ada push ke branch `main` atau `master`, serta pada Pull Request ke branch tersebut.

## Mengambil APK

Setelah workflow selesai:

1. Buka halaman run workflow.
2. Cari bagian **Artifacts**.
3. Ambil artifact:

```text
aplikasi-ujian-debug-apk
```

Di dalamnya terdapat:

```text
app-debug.apk
```

## Catatan

Project ini masih merupakan fondasi Step 1. Login/Register saat ini adalah UI dan navigasi awal, belum terhubung ke backend/database.

Fitur PRD berikutnya akan ditambahkan bertahap:
- Undangan Ujian
- Detail Ujian
- Kerjakan Ujian
- Timer
- Penyimpanan jawaban
- Submit ujian
- Nilai otomatis
- Pembuatan ujian
- Kirim undangan via email
- Pengingat dan notifikasi
- Backend/database

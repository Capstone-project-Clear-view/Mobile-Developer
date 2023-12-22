package com.example.clearview

import HomeActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val signInButton = findViewById<Button>(R.id.signInButton)
        signInButton.setOnClickListener {
            // TODO: Validasi input pengguna di sini jika perlu
            // Jika validasi berhasil, navigasi ke halaman beranda
            val intent = Intent(this, HomeActivity::class.java) // Ganti HomeActivity dengan nama activity halaman beranda Anda
            startActivity(intent)
        }

        // Jika tombol "Sign Up" ditekan, navigasikan ke SignUpActivity
        val signUpText = findViewById<TextView>(R.id.signUpRedirectText)
        signUpText.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}

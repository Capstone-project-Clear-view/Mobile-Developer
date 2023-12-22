package com.example.clearview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

class OtpAuthenticationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_authentication)

        val otp1 = findViewById<EditText>(R.id.otpEditText1)
        val otp2 = findViewById<EditText>(R.id.otpEditText2)
        val otp3 = findViewById<EditText>(R.id.otpEditText3)
        val otp4 = findViewById<EditText>(R.id.otpEditText4)

        // Set up TextWatcher untuk memindahkan fokus ke EditText berikutnya setelah satu digit dimasukkan
        val textWatcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                when {
                    otp1.length() == 1 -> otp2.requestFocus()
                    otp2.length() == 1 -> otp3.requestFocus()
                    otp3.length() == 1 -> otp4.requestFocus()
                    otp4.length() == 1 -> otp4.clearFocus() // Bisa juga memicu validasi OTP di sini
                }
            }

            override fun afterTextChanged(s: Editable) {}
        }

        otp1.addTextChangedListener(textWatcher)
        otp2.addTextChangedListener(textWatcher)
        otp3.addTextChangedListener(textWatcher)
        otp4.addTextChangedListener(textWatcher)
    }
}

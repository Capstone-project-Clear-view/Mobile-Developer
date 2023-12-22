package com.example.clearview

//import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val navigation: BottomNavigationView = findViewById(R.id.navigation)
        navigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    // Tetap di Home Activity
                    true
                }
                /*R.id.navigation_info -> {
                    // Buka Info Activity
                    startActivity(Intent(this, InfoActivity::class.java))
                    true
                }
                R.id.navigation_scan -> {
                    // Buka Scan Activity
                    startActivity(Intent(this, ScanActivity::class.java))
                    true
                }*/
                // tambahkan item lainnya sesuai kebutuhan
                else -> false
            }
        }
    }
}

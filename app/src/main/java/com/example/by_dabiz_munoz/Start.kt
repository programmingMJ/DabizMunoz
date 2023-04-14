package com.example.by_dabiz_munoz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    override fun onBackPressed() {
        finish()
        // Your logic here
    }
}
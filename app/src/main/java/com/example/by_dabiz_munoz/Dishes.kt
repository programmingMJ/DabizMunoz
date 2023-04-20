package com.example.by_dabiz_munoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Dishes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dishes)
        val button_home: FloatingActionButton = findViewById(R.id.floatingActionButton_house)
        button_home.setOnClickListener{
            startActivity(Intent(this, Menu::class.java))
        }

        val button_back: FloatingActionButton = findViewById(R.id.floatingActionButtonBack)
        button_back.setOnClickListener{
            startActivity(Intent(this, Menu::class.java))
        }
    }
}
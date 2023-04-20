package com.example.by_dabiz_munoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Recipes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipes)
        val button_home: FloatingActionButton = findViewById(R.id.floatingActionButton_house2)
        button_home.setOnClickListener{
            startActivity(Intent(this, Menu::class.java))
        }

    }
}
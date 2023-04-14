package com.example.by_dabiz_munoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val dishes: Button = findViewById(R.id.Dishes_button)
        val recipes: Button = findViewById(R.id.Recipes_button)

        dishes.setOnClickListener{
            startActivity(Intent(this, Dishes::class.java))
        }

        recipes.setOnClickListener{
            startActivity(Intent(this, Recipes::class.java))
        }
    }
    override fun onBackPressed() {
        finish()
        // Your logic here
    }
}
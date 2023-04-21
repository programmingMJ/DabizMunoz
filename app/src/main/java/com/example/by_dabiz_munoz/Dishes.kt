package com.example.by_dabiz_munoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.by_dabiz_munoz.databinding.ActivityDishesBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Dishes : AppCompatActivity() {

    private lateinit var binding: ActivityDishesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDishesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.carrilleras,R.drawable.rectangle_5)
        val title = arrayOf("Carrilleras","Croquetas")


        plateArrayList = ArrayList()

        for (i in title.indices){
            val plate = Plate(title[i],imageId[i])
            plateArrayList.add(plate)
        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this,plateArrayList)
        binding.listview.setOnClickListe


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
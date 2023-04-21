package com.example.by_dabiz_munoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.by_dabiz_munoz.databinding.ActivityDishesBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Dishes : AppCompatActivity() {

    private lateinit var binding: ActivityDishesBinding
    private lateinit var plateArrayList : ArrayList<Plate>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDishesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.carrilleras,R.drawable.rectangle_5)
        val title = arrayOf("Carrilleras","Croquetas")


        plateArrayList = ArrayList()

        for (i in title.indices){
            val plate = Plate(title[i],imageId[i],"a","a")
            plateArrayList.add(plate)
        }

        binding.list.isClickable = true
        binding.list.adapter = MyAdapter(this,plateArrayList)
        binding.list.setOnItemClickListener{ parent, view, position, id->

            val title =title[position]
            val imageId = imageId[position]

            val i = Intent(this,Description::class.java)

            i.putExtra("title",title)
            i.putExtra("imageId",imageId)
            startActivity(i)
        }


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
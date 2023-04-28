package com.example.by_dabiz_munoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.recyclerview.widget.GridLayoutManager
import com.example.by_dabiz_munoz.databinding.ActivityDishesBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Dishes : AppCompatActivity(),PlateClickListener {

    private lateinit var binding: ActivityDishesBinding
//    private lateinit var plateArrayList : ArrayList<Plate>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDishesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ourPlates()

        val dishesActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext,1)
            adapter = CardAdapter(plateList,dishesActivity)
        }

//
//        for (i in title.indices){
//            val plate = Plate(title[i],imageId[i],"a","a")
//            plateArrayList.add(plate)
//        }
//
//        binding.list.isClickable = true
//        binding.list.adapter = MyAdapter(this,plateArrayList)
//        binding.list.setOnItemClickListener{ parent, view, position, id->
//
//            val title =title[position]
//            val imageId = imageId[position]
//
//            val i = Intent(this,Description::class.java)
//
//            i.putExtra("title",title)
//            i.putExtra("imageId",imageId)
//            startActivity(i)
//        }


        val button_home: FloatingActionButton = findViewById(R.id.floatingActionButton_house)
        button_home.setOnClickListener{
            startActivity(Intent(this, Menu::class.java))
        }

        val button_back: FloatingActionButton = findViewById(R.id.floatingActionButtonBack)
        button_back.setOnClickListener{
            startActivity(Intent(this, Menu::class.java))
        }
    }
    override fun onClick(plate: Plate) {
        val intent = Intent(applicationContext,Description::class.java)
        intent.putExtra(PLATE_ID_EXTRA,plate.id)
        startActivity(intent)
    }
    private fun ourPlates(){
        val plate1 = Plate(
            "Carrilleras",
            R.drawable.carrilleras,
            "description",
            "Diverxo"
        )
        plateList.add(plate1)
        val plate2 = Plate(
            "Carrilleras",
            R.drawable.carrilleras,
            "description",
            "Diverxo"
        )
        plateList.add(plate2)
        val plate3 = Plate(
            "Carrilleras",
            R.drawable.carrilleras,
            "description",
            "Diverxo"
        )
        plateList.add(plate3)

        val plate4 = Plate(
            "Carrilleras",
            R.drawable.carrilleras,
            "description",
            "Diverxo"
        )
        plateList.add(plate4)

        val plate5 = Plate(
            "Carrilleras",
            R.drawable.carrilleras,
            "description",
            "Diverxo"
        )
        plateList.add(plate5)

    }




}
package com.example.by_dabiz_munoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.by_dabiz_munoz.databinding.ActivityDescriptionBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Description : AppCompatActivity() {

    private lateinit var binding : ActivityDescriptionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val plateID = intent.getIntExtra(PLATE_ID_EXTRA,-1)
        val plate =plateFromID(plateID)
        if (plate!=null){
            binding.title.text = plate.title
            binding.imageFood.setImageResource(plate.imageId)
            binding.description.text= plate.description
            binding.restaurantImg.setImageResource(plate.restaurantid)
        }



        val button_home: FloatingActionButton = findViewById(R.id.floatingActionButton_house)
        button_home.setOnClickListener{
            startActivity(Intent(this, Dishes::class.java))
        }

    }

    private fun plateFromID(plateID: Int): Plate? {
    for(plate in plateList)
    {
        if(plate.id == plateID)
            return plate
    }
        return null
    }
}
package com.example.by_dabiz_munoz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.by_dabiz_munoz.databinding.ActivityDescriptionBinding

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
            binding.foundAt.text= plate.restaurant
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
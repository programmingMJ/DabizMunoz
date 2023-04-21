package com.example.by_dabiz_munoz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.by_dabiz_munoz.databinding.ActivityDescriptionBinding

class Description : AppCompatActivity() {

    private lateinit var binding : ActivityDescriptionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDescriptionBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_description)

        val title = intent.getStringExtra("title")
        val imageId = intent.getIntExtra("imageId",R.drawable.carrilleras)

        binding.title.text = title
        binding.imageFood.setImageResource(imageId)

    }
}
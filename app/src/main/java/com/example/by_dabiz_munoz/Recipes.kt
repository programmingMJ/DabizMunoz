package com.example.by_dabiz_munoz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.by_dabiz_munoz.databinding.ActivityDishesBinding
import com.example.by_dabiz_munoz.databinding.ActivityRecipesBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton


class Recipes : AppCompatActivity(),VideoClickListener {
    private lateinit var binding: ActivityRecipesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecipesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ourVideos()

        val recipesActivity = this
        binding.recyclerViewDishes.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
//            layoutManager = GridLayoutManager(applicationContext,1)
            adapter = VideoAdapter(videoList,recipesActivity)
        }


        val button_back: FloatingActionButton = findViewById(R.id.floatingActionButtonBack)
        button_back.setOnClickListener{
            startActivity(Intent(this, Menu::class.java))
        }
    }
    override fun onClick(video: Video) {
        val intent = Intent(applicationContext,Description::class.java)
        intent.putExtra(VIDEO_ID_EXTRA,video.id)
        startActivity(intent)
    }
    private fun ourVideos() {
        val video1 = Video(
            R.drawable.foto_paella,
            1
        )
        videoList.add(video1)

        val video2 = Video(
            R.drawable.fot_torrija,
            2
        )
        videoList.add(video2)

        val video3 = Video(
            R.drawable.oval_1,
            2
        )
        videoList.add(video3)
    }

    override fun onBackPressed() {
        finish()
    }
}



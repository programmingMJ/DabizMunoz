package com.example.by_dabiz_munoz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.by_dabiz_munoz.Adapter.Horizontal_RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class Recipes : AppCompatActivity() {

    private lateinit var recyclerview: RecyclerView
    private lateinit var adapter: Horizontal_RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipes)

        recyclerview = findViewById(R.id.recyclerView_dishes)
        adapter = Horizontal_RecyclerView()

        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerview.adapter = adapter
        /*val videoView = findViewById<View>(R.id.video1) as VideoView //casting to VideoView is not Strictly required above API level 26

        videoView.setVideoPath("android.resource://" + packageName + "/" + R.raw.paella) //set the path of the video that we need to use in our VideoView
        videoView.start() //start() method of the VideoView class will start the video to play

*/
        val button_home: FloatingActionButton = findViewById(R.id.floatingActionButton_house2)
        button_home.setOnClickListener{
            startActivity(Intent(this, Menu::class.java))
        }

    }
}
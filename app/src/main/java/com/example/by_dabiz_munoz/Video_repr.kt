package com.example.by_dabiz_munoz

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.by_dabiz_munoz.databinding.ActivityVideoReprBinding

class Video_repr : AppCompatActivity() {
    private var myVideoView: VideoView? = null
    private var myMediaController: MediaController? = null
    private lateinit var binding : ActivityVideoReprBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_video_repr)
        binding = ActivityVideoReprBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val videoID = intent.getIntExtra(VIDEO_ID_EXTRA,-1)
        val video =videoFromID(videoID)
        if (video!=null){
            binding.textView.text=video.toString()
            //binding.video.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + video.))

        }
        




        myVideoView = findViewById(R.id.video)
        setUpVideoPlayer()
    }

    private fun videoFromID(videoID: Int): Any? {
        for (video in videoList)
        {
            if (video.id == videoID)
                return video
        }

        return null

    }

    private fun setUpVideoPlayer() {
        if (myMediaController == null){
            myMediaController = MediaController(this)
            myMediaController!!.setAnchorView(this.myVideoView)
        }
        myVideoView!!.setMediaController(myMediaController)
        myVideoView!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.paella))
        myVideoView!!.start()
        myVideoView!!.setOnCompletionListener {
            Toast.makeText(applicationContext, "Video Completed", Toast.LENGTH_SHORT).show()
        }
        myVideoView!!.setOnErrorListener { mp, what, extra ->
            Toast.makeText(applicationContext, "An Error Occured", Toast.LENGTH_SHORT).show()
            false
        }
    }
}
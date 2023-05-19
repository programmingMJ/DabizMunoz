package com.example.by_dabiz_munoz

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView

class Video_repr : AppCompatActivity() {
    private var myVideoView: VideoView? = null
    private var myMediaController: MediaController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_repr)
        myVideoView = findViewById(R.id.video)
        setUpVideoPlayer()
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
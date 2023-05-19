package com.example.by_dabiz_munoz

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView


class Video_repr : AppCompatActivity() {

    var Videoview: VideoView? = null

    var mediaControls: MediaController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_repr)

        Videoview = findViewById<VideoView>(R.id.video) as VideoView

        if (mediaControls == null) {
            mediaControls = MediaController(this)

            mediaControls!!.setAnchorView(this.Videoview)
        }

        Videoview!!.setMediaController(mediaControls)
        Videoview!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.win))
        Videoview!!.requestFocus()
        Videoview!!.start()
    }
}
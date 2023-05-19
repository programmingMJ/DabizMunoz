package com.example.by_dabiz_munoz

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class Start : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val mediaPlayer: MediaPlayer = MediaPlayer.create(this, R.raw.sonido_cocina)
        //mediaPlayer.prepare()
        mediaPlayer.start()


    val timer = Timer()
        timer.schedule( object: TimerTask(){
        override fun run(){
            val goMenu = Intent(this@Start, Menu::class.java)
            //Intent intent =  Intent(Start.this, Menu.class);
            startActivity(goMenu)
            if (mediaPlayer.isPlaying()) {
                //pause music
                mediaPlayer.pause()
            }
            finish()
        }
    }, 8000)


    }


    override fun onBackPressed() {
        finish()
        // Your logic here
    }
}
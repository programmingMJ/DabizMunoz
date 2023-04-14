package com.example.by_dabiz_munoz

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class Start : AppCompatActivity() {



//    lateinit var mediaPlayer : MediaPlayer? = null
//    MediaPlayer mysound;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        //var mediaPlayer = MediaPlayer()
        //mediaPlayer = MediaPlayer.create(applicationContext, R.raw.sonido_cocina)
        //mediaPlayer.prepare()
        //mediaPlayer.start()
        /*val audioURL = "https://www.learningcontainer.com/wp-content/uploads/2020/02/Kalimba.mp3"
        mediaPlayer = MediaPlayer()
        mediaPlayer!!.setDataSource(audioURL)
        mediaPlayer!!.prepare()
        mediaPlayer!!.start()*/

    var timer = Timer();
    timer.schedule( object: TimerTask(){
        override fun run(){
            val goMenu = Intent(this@Start, Menu::class.java)
            //Intent intent =  Intent(Start.this, Menu.class);
            startActivity(goMenu);
            finish();
        }
    }, 10000);


    }


    override fun onBackPressed() {
        finish()
        // Your logic here
    }
}
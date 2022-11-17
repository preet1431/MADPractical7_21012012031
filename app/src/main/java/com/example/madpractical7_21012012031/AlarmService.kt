package com.example.madpractical7_21012012031

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder

class AlarmService : Service() {
    var mp: MediaPlayer? = null
    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if(intent != null) {
            mp = MediaPlayer.create(this, R.raw.alarm);
            mp?.start()
        }
        return START_STICKY
    }
    override fun onDestroy() {
        mp?.stop()
        super.onDestroy()
    }
}
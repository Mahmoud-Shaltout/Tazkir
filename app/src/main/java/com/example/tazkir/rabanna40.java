package com.example.tazkir;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class rabanna40 extends AppCompatActivity {
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabanna40);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
    public void play(View v){
        if (player == null){
            player = MediaPlayer.create(this,R.raw.rabanna);
        }
        player.start();
    }
    public void pause(View v){
        if (player != null){
            player.pause();
        }
    }
    public void stop(View v){
        stopPlayer();
    }

    private void stopPlayer() {
        if (player != null){
            player.release();
            player = null;
        }
    }
}
package com.example.tazkir;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class roqia extends AppCompatActivity {
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roqia);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

    }
    public void play(View v){
        if (player == null){
            player = MediaPlayer.create(this,R.raw.roqia);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
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

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}
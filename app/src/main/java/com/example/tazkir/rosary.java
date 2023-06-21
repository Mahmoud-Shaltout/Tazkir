package com.example.tazkir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class rosary extends AppCompatActivity {
    int numberOfClicks =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rosary);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void onClick(View view) {
        TextView textView = findViewById(R.id.mespaha_text);
        textView.setText(""+numberOfClicks);
        numberOfClicks++;
    }

    public void onClick2(View view) {
        TextView textView = findViewById(R.id.mespaha_text);
        textView.setText(""+0);
        numberOfClicks=0;
    }
}
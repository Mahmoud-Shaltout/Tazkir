package com.example.tazkir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class hajj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hajj);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
}
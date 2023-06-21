package com.example.tazkir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class NextActivity extends AppCompatActivity implements View.OnClickListener{
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.main_green)));

        Button btn1 =findViewById(R.id.btn1);
        Button btn2 =findViewById(R.id.btn2);
        Button btn3 =findViewById(R.id.btn3);
        Button btn4 =findViewById(R.id.btn4);
        Button btn5 =findViewById(R.id.btn5);
        Button btn6 =findViewById(R.id.btn6);
        Button btn7 =findViewById(R.id.btn7);
        Button btn8 =findViewById(R.id.btn8);
        Button btn9 =findViewById(R.id.btn9);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                Intent intent1 = new
                        Intent(NextActivity.this, sabah_zikr.class);
                startActivity(intent1);
                break;
            case R.id.btn2:
                Intent intent2 = new
                        Intent(NextActivity.this,masaa_zikr.class);
                startActivity(intent2);
                break;
            case R.id.btn3:
                Intent intent3 = new
                        Intent(NextActivity.this, sleep_zikr.class);
                startActivity(intent3);
                break;
            case R.id.btn4:
                Intent intent4 = new
                        Intent(NextActivity.this, wakup_zikr.class);
                startActivity(intent4);
                break;
            case R.id.btn5:
                Intent intent5 = new
                        Intent(NextActivity.this, afterSalat_zikr.class);
                startActivity(intent5);
                break;
            case R.id.btn6:
                Intent intent6 = new
                        Intent(NextActivity.this, hajj.class);
                startActivity(intent6);
                break;
            case R.id.btn7:
                Intent intent7 = new
                        Intent(NextActivity.this, missed_rakah.class);
                startActivity(intent7);
                break;
            case R.id.btn8:
                Intent intent8 = new
                        Intent(NextActivity.this, rabanna40.class);
                startActivity(intent8);
                break;
            case R.id.btn9:
                Intent intent9 = new
                        Intent(NextActivity.this, roqia.class);
                startActivity(intent9);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.mespaha:
                Intent intent6 = new
                        Intent(NextActivity.this, rosary.class);
                startActivity(intent6);
                return true;
            case R.id.rate:
                Rate();
                return true;
            case R.id.share:
                Share();
                return true;
            case R.id.website:
                Website();
                return true;
            case R.id.facebook:
                Facebook();
                return true;
            case R.id.about:
                Intent intent11 = new
                        Intent(NextActivity.this, about.class);
                startActivity(intent11);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void Rate()
    {
        Uri rate = Uri.parse("https://www.play.google.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, rate);
        startActivity(webIntent);
    }
    public void Share()
    {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
        sendIntent.setType("text/plain");
        startActivity(Intent.createChooser(sendIntent,"Send Via"));

    }
    public void Website()
    {
        Uri webpage = Uri.parse("https://www.linkedin.com/in/ahmed-ali-9706701a1/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void Facebook()
    {
        Uri faecbookpage = Uri.parse("https://web.facebook.com/profile.php?id=100015161014450");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, faecbookpage);
        startActivity(webIntent);
    }
}

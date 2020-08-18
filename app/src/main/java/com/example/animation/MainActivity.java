package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void nextActivity(View v){
        Intent gotosecond = new Intent();
        gotosecond.setClass(this, secondActivity.class);
        startActivity(gotosecond);
    }

    public void onbart(View v){
        ImageView bart = (ImageView) findViewById(R.id.bart4);
        ImageView homer = (ImageView) findViewById(R.id.homer4);

        bart.animate().alpha(0f).setDuration(2000);
        homer.animate().alpha(1f).setDuration(2000);
    }

    /*
    public void onhomer(View v){
        ImageView homer = (ImageView) findViewById(R.id.homer);
        ImageView bart = (ImageView) findViewById(R.id.bart);

        homer.animate().alpha(0f).setDuration(2000);
        //bart.animate().alpha(1f).setDuration(2000);
    }
    */




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
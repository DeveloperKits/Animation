package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FourActivity extends AppCompatActivity {

    public void onbart(View v){
        ImageView bart4 = (ImageView) findViewById(R.id.bart4);
        bart4.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
    }

    public void nextPage(View v){
        Intent gotoFive = new Intent();
        gotoFive.setClass(this, FiveActivity.class);
        startActivity(gotoFive);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }
}
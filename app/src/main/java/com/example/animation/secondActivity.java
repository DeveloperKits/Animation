package com.example.animation;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;

public class secondActivity extends AppCompatActivity {

    public void nextThird(View v){
        Intent gotoThird = new Intent();
        gotoThird.setClass(this, ThirdActivity.class);
        startActivity(gotoThird);
    }

    public void onbart(View v){
        //ImageView bart2 = (ImageView) findViewById(R.id.bart2);
        //bart2.animate().rotationX(2000f).rotationY(2000f).setDuration(4000);
        //bart2.animate().rotationY(2000f).setDuration(4000);
        //bart2.animate().rotationX(2000f).setDuration(6589);
        //bart2.animate().rotationBy(2000f).setDuration(6000);
        //bart2.animate().rotationXBy(2000f).setDuration(6000);
        //bart2.animate().rotationYBy(2000f).setDuration(6000);
        ImageView homer2 = (ImageView) findViewById(R.id.homer5);

        //homer.animate().translationYBy(2000f).setDuration(2000);
        //homer.animate().translationXBy(2050f).setDuration(2000);
        homer2.animate().translationXBy(-2050f).setDuration(2000);
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
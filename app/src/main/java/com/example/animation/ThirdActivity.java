package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ThirdActivity extends AppCompatActivity {

    public void onhomer(View v){
        ImageView bart3 = (ImageView) findViewById(R.id.bart5);
        ImageView homer3 = (ImageView) findViewById(R.id.homer5);

        homer3.animate().alpha(0.2f).setDuration(2000);
        bart3.animate().alpha(1f).setDuration(2000);
    }

    public void translations(View v){
        ImageView bart3 = (ImageView) findViewById(R.id.bart5);
        bart3.animate().translationXBy(1000f).setDuration(2000);
    }

    public void nextPage(View v){
        Intent gotoFour = new Intent();
        gotoFour.setClass(this, FourActivity.class);
        startActivity(gotoFour);
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ImageView bart3 = (ImageView) findViewById(R.id.bart5);
        bart3.setTranslationX(-1000f);
    }
}
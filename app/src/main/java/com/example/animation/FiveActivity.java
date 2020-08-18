package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FiveActivity extends AppCompatActivity {

    public void onhomer(View v){
        ImageView bart5 = (ImageView) findViewById(R.id.bart5);

        bart5.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotationBy(3600)
                .setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        ImageView bart5 = (ImageView) findViewById(R.id.bart5);
        bart5.setTranslationX(-1000f);
        bart5.setTranslationY(-1000f);
    }
}
package com.example.gamification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    ImageButton myImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myImageButton = (ImageButton)findViewById(R.id.imageButton2);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Main2Activity.this, Main5Activity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageView img = (ImageView) findViewById(R.id.imageView11);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Main2Activity.this, Main4Activity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageView img3 = (ImageView) findViewById(R.id.imageView12);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageView img2 = (ImageView) findViewById(R.id.imageView10);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });


    }
}

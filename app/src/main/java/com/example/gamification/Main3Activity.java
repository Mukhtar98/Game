package com.example.gamification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView img2 = (ImageView) findViewById(R.id.imageView14);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageView img = (ImageView) findViewById(R.id.imageView15);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageView img3 = (ImageView) findViewById(R.id.imageView16);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}

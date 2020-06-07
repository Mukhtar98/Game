package com.example.gamification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageView img3 = (ImageView) findViewById(R.id.imageView23);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Main4Activity.this, Main3Activity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageView img2 = (ImageView) findViewById(R.id.imageView20);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Main4Activity.this, Main2Activity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageView img = (ImageView) findViewById(R.id.imageView21);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Main4Activity.this, MainActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}

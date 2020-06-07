package com.example.gamification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import static com.example.gamification.R.color.colorPrimaryDark;
import static com.example.gamification.R.color.green;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;

    private Button button12;
    private Button button13;
    private Button button14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView img = (ImageView) findViewById(R.id.imageView4);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intentLoadNewActivity);
            }
        });




        ImageView img2 = (ImageView) findViewById(R.id.imageView6);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ImageView img3 = (ImageView) findViewById(R.id.imageView7);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intentLoadNewActivity);
            }
        });


        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button13);
        button8 = findViewById(R.id.button14);
        button9 = findViewById(R.id.button15);
        button10 = findViewById(R.id.button16);
        button11 = findViewById(R.id.button17);

        button12 = findViewById(R.id.button7);
        button13 = findViewById(R.id.button8);
        button14 = findViewById(R.id.button9);



        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);

        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                if (button1.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.round_green).getConstantState())) {
                    button1.setBackground(this.getResources().getDrawable(R.drawable.rounded_btn));
                }
                else {
                    button1.setBackground(this.getResources().getDrawable(R.drawable.round_green));
                }
                break;
            case R.id.button2:
                if (button2.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.round_green).getConstantState())) {
                    button2.setBackground(this.getResources().getDrawable(R.drawable.rounded_btn));
                }
                else {
                    button2.setBackground(this.getResources().getDrawable(R.drawable.round_green));
                }
                break;
            case R.id.button3:
                if (button3.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.round_green).getConstantState())) {
                    button3.setBackground(this.getResources().getDrawable(R.drawable.rounded_btn));
                }
                else {
                    button3.setBackground(this.getResources().getDrawable(R.drawable.round_green));
                }
                break;
            case R.id.button4:
                if (button4.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.round_green).getConstantState())) {
                    button4.setBackground(this.getResources().getDrawable(R.drawable.rounded_btn));
                }
                else {
                    button4.setBackground(this.getResources().getDrawable(R.drawable.round_green));
                }
                break;
            case R.id.button5:
                if (button5.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.round_green).getConstantState())) {
                    button5.setBackground(this.getResources().getDrawable(R.drawable.rounded_btn));
                }
                else {
                    button5.setBackground(this.getResources().getDrawable(R.drawable.round_green));
                }
                break;
            case R.id.button6:
                if (button6.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.round_green).getConstantState())) {
                    button6.setBackground(this.getResources().getDrawable(R.drawable.rounded_btn));
                }
                else {
                    button6.setBackground(this.getResources().getDrawable(R.drawable.round_green));
                }
                break;
            case R.id.button13:
                if (button7.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.round_green).getConstantState())) {
                    button7.setBackground(this.getResources().getDrawable(R.drawable.rounded_btn));
                }
                else {
                    button7.setBackground(this.getResources().getDrawable(R.drawable.round_green));
                }
                break;
            case R.id.button14:
                if (button8.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.round_green).getConstantState())) {
                    button8.setBackground(this.getResources().getDrawable(R.drawable.rounded_btn));
                }
                else {
                    button8.setBackground(this.getResources().getDrawable(R.drawable.round_green));
                }
                break;
            case R.id.button15:
                if (button9.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.round_green).getConstantState())) {
                    button9.setBackground(this.getResources().getDrawable(R.drawable.rounded_btn));
                }
                else {
                    button9.setBackground(this.getResources().getDrawable(R.drawable.round_green));
                }
                break;
            case R.id.button16:
                if (button10.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.round_green).getConstantState())) {
                    button10.setBackground(this.getResources().getDrawable(R.drawable.rounded_btn));
                }
                else {
                    button10.setBackground(this.getResources().getDrawable(R.drawable.round_green));
                }
                break;
            case R.id.button17:
                if (button11.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.round_green).getConstantState())) {
                    button11.setBackground(this.getResources().getDrawable(R.drawable.rounded_btn));
                }
                else {
                    button11.setBackground(this.getResources().getDrawable(R.drawable.round_green));
                }
                break;

            case R.id.button7:
                if (button12.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.round_green).getConstantState())) {
                    button12.setBackground(this.getResources().getDrawable(R.drawable.rounded_btn));
                }
                else {
                    button12.setBackground(this.getResources().getDrawable(R.drawable.round_green));
                }
                break;
            case R.id.button8:
                if (button13.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.round_green).getConstantState())) {
                    button13.setBackground(this.getResources().getDrawable(R.drawable.rounded_btn));
                }
                else {
                    button13.setBackground(this.getResources().getDrawable(R.drawable.round_green));
                }
                break;
            case R.id.button9:
                if (button14.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.round_green).getConstantState())) {
                    button14.setBackground(this.getResources().getDrawable(R.drawable.rounded_btn));
                }
                else {
                    button14.setBackground(this.getResources().getDrawable(R.drawable.round_green));
                }
                break;
        }
    }

}

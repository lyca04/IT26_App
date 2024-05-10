package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Timoteo extends AppCompatActivity implements View.OnClickListener{
    public CardView tim1_1, tim1_2, tim1_3, tim1_4, tim1_5, tim1_6, tim2_1, tim2_2, tim2_3, tim2_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timoteo);

        tim1_1 = (CardView) findViewById(R.id.tim1_1);
        tim1_2 = (CardView) findViewById(R.id.tim1_2);
        tim1_3 = (CardView) findViewById(R.id.tim1_3);
        tim1_4 = (CardView) findViewById(R.id.tim1_4);
        tim1_5 = (CardView) findViewById(R.id.tim1_5);
        tim1_6 = (CardView) findViewById(R.id.tim1_6);
        tim2_1 = (CardView) findViewById(R.id.tim2_1);
        tim2_2 = (CardView) findViewById(R.id.tim2_2);
        tim2_3 = (CardView) findViewById(R.id.tim2_3);
        tim2_4 = (CardView) findViewById(R.id.tim2_4);

        tim1_1.setOnClickListener(this);
        tim1_2.setOnClickListener(this);
        tim1_3.setOnClickListener(this);
        tim1_4.setOnClickListener(this);
        tim1_5.setOnClickListener(this);
        tim1_6.setOnClickListener(this);
        tim2_1.setOnClickListener(this);
        tim2_2.setOnClickListener(this);
        tim2_3.setOnClickListener(this);
        tim2_4.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.tim1_1){
            i = new Intent(this, Tim1_1.class);
            startActivity(i);
        }
        if (viewId == R.id.tim1_2){
            i = new Intent(this, Tim1_2.class);
            startActivity(i);
        }
        if (viewId == R.id.tim1_3){
            i = new Intent(this, Tim1_3.class);
            startActivity(i);
        }
        if (viewId == R.id.tim1_4){
            i = new Intent(this, Tim1_4.class);
            startActivity(i);
        }
        if (viewId == R.id.tim1_5){
            i = new Intent(this, Tim1_5.class);
            startActivity(i);
        }
        if (viewId == R.id.tim1_6){
            i = new Intent(this, Tim2_3.class);
            startActivity(i);
        }
        if (viewId == R.id.tim2_1){
            i = new Intent(this, Tim2_1.class);
            startActivity(i);
        }
        if (viewId == R.id.tim2_2){
            i = new Intent(this, Tim2_2.class);
            startActivity(i);
        }
        if (viewId == R.id.tim2_3){
            i = new Intent(this, Tim2_3.class);
            startActivity(i);
        }
        if (viewId == R.id.tim2_4){
            i = new Intent(this, Tim2_4.class);
            startActivity(i);
        }
    }
}
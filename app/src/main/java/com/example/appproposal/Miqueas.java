package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Miqueas extends AppCompatActivity implements View.OnClickListener{
    public CardView miq1, miq2, miq3, miq4, miq5, miq6, miq7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miqueas);

        miq1 = (CardView) findViewById(R.id.miq1);
        miq2 = (CardView) findViewById(R.id.miq2);
        miq3 = (CardView) findViewById(R.id.miq3);
        miq4 = (CardView) findViewById(R.id.miq4);
        miq5 = (CardView) findViewById(R.id.miq5);
        miq6 = (CardView) findViewById(R.id.miq6);
        miq7 = (CardView) findViewById(R.id.miq7);

        miq1.setOnClickListener(this);
        miq2.setOnClickListener(this);
        miq3.setOnClickListener(this);
        miq4.setOnClickListener(this);
        miq5.setOnClickListener(this);
        miq6.setOnClickListener(this);
        miq7.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.miq1){
            i = new Intent(this, Miq1.class);
            startActivity(i);
        }
        if (viewId == R.id.miq2){
            i = new Intent(this, Miq2.class);
            startActivity(i);
        }
        if (viewId == R.id.miq3){
            i = new Intent(this, Miq3.class);
            startActivity(i);
        }
        if (viewId == R.id.miq4){
            i = new Intent(this, Miq4.class);
            startActivity(i);
        }
        if (viewId == R.id.miq5){
            i = new Intent(this, Miq5.class);
            startActivity(i);
        }
        if (viewId == R.id.miq6){
            i = new Intent(this, Miq6.class);
            startActivity(i);
        }
        if (viewId == R.id.miq7){
            i = new Intent(this, Miq7.class);
            startActivity(i);
        }
    }
}
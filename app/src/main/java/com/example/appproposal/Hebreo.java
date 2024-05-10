package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Hebreo extends AppCompatActivity implements View.OnClickListener{
    public CardView heb1, heb2, heb3, heb4, heb5, heb6, heb7, heb8, heb9,  heb10,
            heb11, heb12, heb13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hebreo);

        heb1 = (CardView) findViewById(R.id.heb1);
        heb2 = (CardView) findViewById(R.id.heb2);
        heb3 = (CardView) findViewById(R.id.heb3);
        heb4 = (CardView) findViewById(R.id.heb4);
        heb5 = (CardView) findViewById(R.id.heb5);
        heb6 = (CardView) findViewById(R.id.heb6);
        heb7 = (CardView) findViewById(R.id.heb7);
        heb8 = (CardView) findViewById(R.id.heb8);
        heb9 = (CardView) findViewById(R.id.heb9);
        heb10 = (CardView) findViewById(R.id.heb10);
        heb11 = (CardView) findViewById(R.id.heb11);
        heb12 = (CardView) findViewById(R.id.heb12);
        heb13 = (CardView) findViewById(R.id.heb13);

        heb1.setOnClickListener(this);
        heb2.setOnClickListener(this);
        heb3.setOnClickListener(this);
        heb4.setOnClickListener(this);
        heb5.setOnClickListener(this);
        heb6.setOnClickListener(this);
        heb7.setOnClickListener(this);
        heb8.setOnClickListener(this);
        heb9.setOnClickListener(this);
        heb10.setOnClickListener(this);
        heb11.setOnClickListener(this);
        heb12.setOnClickListener(this);
        heb13.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id. heb1){
            i = new Intent(this, Heb1.class);
            startActivity(i);
        }
        if (viewId == R.id. heb2){
            i = new Intent(this, Heb2.class);
            startActivity(i);
        }
        if (viewId == R.id. heb3){
            i = new Intent(this, Heb3.class);
            startActivity(i);
        }
        if (viewId == R.id. heb4){
            i = new Intent(this, Heb4.class);
            startActivity(i);
        }
        if (viewId == R.id. heb5){
            i = new Intent(this, Heb5.class);
            startActivity(i);
        }
        if (viewId == R.id. heb6){
            i = new Intent(this, Heb6.class);
            startActivity(i);
        }
        if (viewId == R.id. heb7){
            i = new Intent(this, Heb7.class);
            startActivity(i);
        }
        if (viewId == R.id. heb8){
            i = new Intent(this, Heb8.class);
            startActivity(i);
        }
        if (viewId == R.id. heb9){
            i = new Intent(this, Heb9.class);
            startActivity(i);
        }
        if (viewId == R.id. heb10){
            i = new Intent(this, Heb10.class);
            startActivity(i);
        }
        if (viewId == R.id. heb11){
            i = new Intent(this, Heb11.class);
            startActivity(i);
        }
        if (viewId == R.id. heb12){
            i = new Intent(this, Heb12.class);
            startActivity(i);
        }
        if (viewId == R.id. heb13){
            i = new Intent(this, Heb13.class);
            startActivity(i);
        }
    }
}
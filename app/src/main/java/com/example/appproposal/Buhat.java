package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Buhat extends AppCompatActivity implements View.OnClickListener{
    public CardView buh1, buh2, buh3, buh4, buh5, buh6, buh7, buh8, buh9, buh10,
            buh11, buh12, buh13, buh14, buh15, buh16, buh17, buh18, buh19, buh20,
            buh21, buh22, buh23, buh24, buh25, buh26, buh27, buh28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buhat);

        buh1 = (CardView) findViewById(R.id.buh1);
        buh2 = (CardView) findViewById(R.id.buh2);
        buh3 = (CardView) findViewById(R.id.buh3);
        buh4 = (CardView) findViewById(R.id.buh4);
        buh5 = (CardView) findViewById(R.id.buh5);
        buh6 = (CardView) findViewById(R.id.buh6);
        buh7 = (CardView) findViewById(R.id.buh7);
        buh8 = (CardView) findViewById(R.id.buh8);
        buh9 = (CardView) findViewById(R.id.buh9);
        buh10 = (CardView) findViewById(R.id.buh10);
        buh11 = (CardView) findViewById(R.id.buh11);
        buh12 = (CardView) findViewById(R.id.buh12);
        buh13 = (CardView) findViewById(R.id.buh13);
        buh14 = (CardView) findViewById(R.id.buh14);
        buh15 = (CardView) findViewById(R.id.buh15);
        buh16 = (CardView) findViewById(R.id.buh16);
        buh17 = (CardView) findViewById(R.id.buh17);
        buh18 = (CardView) findViewById(R.id.buh18);
        buh19 = (CardView) findViewById(R.id.buh19);
        buh20 = (CardView) findViewById(R.id.buh20);
        buh21 = (CardView) findViewById(R.id.buh21);
        buh22 = (CardView) findViewById(R.id.buh22);
        buh23 = (CardView) findViewById(R.id.buh23);
        buh24 = (CardView) findViewById(R.id.buh24);
        buh25 = (CardView) findViewById(R.id.buh25);
        buh26 = (CardView) findViewById(R.id.buh26);
        buh27 = (CardView) findViewById(R.id.buh27);
        buh28 = (CardView) findViewById(R.id.buh28);

        buh1.setOnClickListener(this);
        buh2.setOnClickListener(this);
        buh3.setOnClickListener(this);
        buh4.setOnClickListener(this);
        buh5.setOnClickListener(this);
        buh6.setOnClickListener(this);
        buh7.setOnClickListener(this);
        buh8.setOnClickListener(this);
        buh9.setOnClickListener(this);
        buh10.setOnClickListener(this);
        buh11.setOnClickListener(this);
        buh12.setOnClickListener(this);
        buh13.setOnClickListener(this);
        buh14.setOnClickListener(this);
        buh15.setOnClickListener(this);
        buh16.setOnClickListener(this);
        buh17.setOnClickListener(this);
        buh18.setOnClickListener(this);
        buh19.setOnClickListener(this);
        buh20.setOnClickListener(this);
        buh21.setOnClickListener(this);
        buh22.setOnClickListener(this);
        buh23.setOnClickListener(this);
        buh24.setOnClickListener(this);
        buh25.setOnClickListener(this);
        buh26.setOnClickListener(this);
        buh27.setOnClickListener(this);
        buh28.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.buh1){
            i = new Intent(this, Buh1.class);
            startActivity(i);
        }
        if (viewId == R.id.buh2){
            i = new Intent(this, Buh2.class);
            startActivity(i);
        }
        if (viewId == R.id.buh3){
            i = new Intent(this, Buh3.class);
            startActivity(i);
        }
        if (viewId == R.id.buh4){
            i = new Intent(this, Buh4.class);
            startActivity(i);
        }
        if (viewId == R.id.buh5){
            i = new Intent(this, Buh5.class);
            startActivity(i);
        }
        if (viewId == R.id.buh6){
            i = new Intent(this, Buh6.class);
            startActivity(i);
        }
        if (viewId == R.id.buh7){
            i = new Intent(this, Buh7.class);
            startActivity(i);
        }
        if (viewId == R.id.buh8){
            i = new Intent(this, Buh8.class);
            startActivity(i);
        }
        if (viewId == R.id.buh9){
            i = new Intent(this, Buh9.class);
            startActivity(i);
        }
        if (viewId == R.id.buh10){
            i = new Intent(this, Buh10.class);
            startActivity(i);
        }
        if (viewId == R.id.buh11){
            i = new Intent(this, Buh11.class);
            startActivity(i);
        }
        if (viewId == R.id.buh12){
            i = new Intent(this, Buh12.class);
            startActivity(i);
        }
        if (viewId == R.id.buh13){
            i = new Intent(this, Buh13.class);
            startActivity(i);
        }
        if (viewId == R.id.buh14){
            i = new Intent(this, Buh14.class);
            startActivity(i);
        }
        if (viewId == R.id.buh15){
            i = new Intent(this, Buh15.class);
            startActivity(i);
        }
        if (viewId == R.id.buh16){
            i = new Intent(this, Buh16.class);
            startActivity(i);
        }
        if (viewId == R.id.buh17){
            i = new Intent(this, Buh17.class);
            startActivity(i);
        }
        if (viewId == R.id.buh18){
            i = new Intent(this, Buh18.class);
            startActivity(i);
        }
        if (viewId == R.id.buh19){
            i = new Intent(this, Buh19.class);
            startActivity(i);
        }
        if (viewId == R.id.buh20){
            i = new Intent(this, Buh20.class);
            startActivity(i);
        }
        if (viewId == R.id.buh21){
            i = new Intent(this, Buh21.class);
            startActivity(i);
        }
        if (viewId == R.id.buh22){
            i = new Intent(this, Buh22.class);
            startActivity(i);
        }
        if (viewId == R.id.buh23){
            i = new Intent(this, Buh23.class);
            startActivity(i);
        }
        if (viewId == R.id.buh24){
            i = new Intent(this, Buh24.class);
            startActivity(i);
        }
        if (viewId == R.id.buh25){
            i = new Intent(this, Buh25.class);
            startActivity(i);
        }
        if (viewId == R.id.buh26){
            i = new Intent(this, Buh26.class);
            startActivity(i);
        }
        if (viewId == R.id.buh27){
            i = new Intent(this, Buh27.class);
            startActivity(i);
        }
        if (viewId == R.id.buh28){
            i = new Intent(this, Buh28.class);
            startActivity(i);
        }
    }
}
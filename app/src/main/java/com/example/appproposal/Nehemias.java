package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Nehemias extends AppCompatActivity implements View.OnClickListener{
    public CardView neh1, neh2, neh3, neh4, neh5, neh6, neh7, neh8, neh9,  neh10,
            neh11, neh12, neh13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nehemias);

        neh1 = (CardView) findViewById(R.id.neh1);
        neh2 = (CardView) findViewById(R.id.neh2);
        neh3 = (CardView) findViewById(R.id.neh3);
        neh4 = (CardView) findViewById(R.id.neh4);
        neh5 = (CardView) findViewById(R.id.neh5);
        neh6 = (CardView) findViewById(R.id.neh6);
        neh7 = (CardView) findViewById(R.id.neh7);
        neh8 = (CardView) findViewById(R.id.neh8);
        neh9 = (CardView) findViewById(R.id.neh9);
        neh10 = (CardView) findViewById(R.id.neh10);
        neh11 = (CardView) findViewById(R.id.neh11);
        neh12= (CardView) findViewById(R.id.neh12);
        neh13 = (CardView) findViewById(R.id.neh13);

        neh1.setOnClickListener(this);
        neh2.setOnClickListener(this);
        neh3.setOnClickListener(this);
        neh4.setOnClickListener(this);
        neh5.setOnClickListener(this);
        neh6.setOnClickListener(this);
        neh7.setOnClickListener(this);
        neh8.setOnClickListener(this);
        neh9.setOnClickListener(this);
        neh10.setOnClickListener(this);
        neh11.setOnClickListener(this);
        neh12.setOnClickListener(this);
        neh13.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id. neh1){
            i = new Intent(this, Neh1.class);
            startActivity(i);
        }
        if (viewId == R.id. neh2){
            i = new Intent(this, Neh2.class);
            startActivity(i);
        }
        if (viewId == R.id. neh3){
            i = new Intent(this, Neh3.class);
            startActivity(i);
        }
        if (viewId == R.id. neh4){
            i = new Intent(this, Neh4.class);
            startActivity(i);
        }
        if (viewId == R.id. neh5){
            i = new Intent(this, Neh5.class);
            startActivity(i);
        }
        if (viewId == R.id. neh6){
            i = new Intent(this, Neh6.class);
            startActivity(i);
        }
        if (viewId == R.id. neh7){
            i = new Intent(this, Neh7.class);
            startActivity(i);
        }
        if (viewId == R.id. neh8){
            i = new Intent(this, Neh8.class);
            startActivity(i);
        }
        if (viewId == R.id. neh9){
            i = new Intent(this, Neh9.class);
            startActivity(i);
        }
        if (viewId == R.id. neh10){
            i = new Intent(this, Neh10.class);
            startActivity(i);
        }
        if (viewId == R.id. neh11){
            i = new Intent(this, Neh11.class);
            startActivity(i);
        }
        if (viewId == R.id. neh12){
            i = new Intent(this, Neh12.class);
            startActivity(i);
        }
        if (viewId == R.id. neh13){
            i = new Intent(this, Neh13.class);
            startActivity(i);
        }
    }
}
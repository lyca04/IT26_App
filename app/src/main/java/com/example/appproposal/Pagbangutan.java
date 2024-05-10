package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Pagbangutan extends AppCompatActivity implements View.OnClickListener{
    public CardView pag1, pag2, pag3, pag4, pag5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagbangutan);

        pag1 = (CardView) findViewById(R.id.pag1);
        pag2 = (CardView) findViewById(R.id.pag2);
        pag3 = (CardView) findViewById(R.id.pag3);
        pag4 = (CardView) findViewById(R.id.pag4);
        pag5 = (CardView) findViewById(R.id.pag5);

        pag1.setOnClickListener(this);
        pag2.setOnClickListener(this);
        pag3.setOnClickListener(this);
        pag4.setOnClickListener(this);
        pag5.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.pag1){
            i = new Intent(this, Pag1.class);
            startActivity(i);
        }
        if (viewId == R.id.pag2){
            i = new Intent(this, Pag2.class);
            startActivity(i);
        }
        if (viewId == R.id.pag3){
            i = new Intent(this, Pag3.class);
            startActivity(i);
        }
        if (viewId == R.id.pag4){
            i = new Intent(this, Pag4.class);
            startActivity(i);
        }
        if (viewId == R.id.pag5){
            i = new Intent(this, Pag5.class);
            startActivity(i);
        }
    }
}
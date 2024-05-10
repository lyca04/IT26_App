package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Esdras extends AppCompatActivity implements View.OnClickListener{
    public CardView esd1, esd2, esd3, esd4, esd5, esd6, esd7, esd8, esd9,  esd10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esdras);

        esd1 = (CardView) findViewById(R.id.esd1);
        esd2 = (CardView) findViewById(R.id.esd2);
        esd3 = (CardView) findViewById(R.id.esd3);
        esd4 = (CardView) findViewById(R.id.esd4);
        esd5 = (CardView) findViewById(R.id.esd5);
        esd6 = (CardView) findViewById(R.id.esd6);
        esd7 = (CardView) findViewById(R.id.esd7);
        esd8 = (CardView) findViewById(R.id.esd8);
        esd9 = (CardView) findViewById(R.id.esd9);
        esd10 = (CardView) findViewById(R.id.esd10);

        esd1.setOnClickListener(this);
        esd2.setOnClickListener(this);
        esd3.setOnClickListener(this);
        esd4.setOnClickListener(this);
        esd5.setOnClickListener(this);
        esd6.setOnClickListener(this);
        esd7.setOnClickListener(this);
        esd8.setOnClickListener(this);
        esd9.setOnClickListener(this);
        esd10.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id. esd1){
            i = new Intent(this, Esd1.class);
            startActivity(i);
        }
        if (viewId == R.id. esd2){
            i = new Intent(this, Esd2.class);
            startActivity(i);
        }
        if (viewId == R.id. esd3){
            i = new Intent(this, Esd3.class);
            startActivity(i);
        }
        if (viewId == R.id. esd4){
            i = new Intent(this, Esd4.class);
            startActivity(i);
        }
        if (viewId == R.id. esd5){
            i = new Intent(this, Esd5.class);
            startActivity(i);
        }
        if (viewId == R.id. esd6){
            i = new Intent(this, Esd6.class);
            startActivity(i);
        }
        if (viewId == R.id. esd7){
            i = new Intent(this, Esd7.class);
            startActivity(i);
        }
        if (viewId == R.id. esd8){
            i = new Intent(this, Esd8.class);
            startActivity(i);
        }
        if (viewId == R.id. esd9){
            i = new Intent(this, Esd9.class);
            startActivity(i);
        }
        if (viewId == R.id. esd10){
            i = new Intent(this, Esd10.class);
            startActivity(i);
        }
    }
}
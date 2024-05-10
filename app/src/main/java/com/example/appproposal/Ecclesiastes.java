package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Ecclesiastes extends AppCompatActivity implements View.OnClickListener{
    public CardView ecc1, ecc2, ecc3, ecc4, ecc5, ecc6, ecc7, ecc8, ecc9,  ecc10, ecc11, ecc12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecclesiastes);

        ecc1 = (CardView) findViewById(R.id.ecc1);
        ecc2 = (CardView) findViewById(R.id.ecc2);
        ecc3 = (CardView) findViewById(R.id.ecc3);
        ecc4 = (CardView) findViewById(R.id.ecc4);
        ecc5 = (CardView) findViewById(R.id.ecc5);
        ecc6 = (CardView) findViewById(R.id.ecc6);
        ecc7 = (CardView) findViewById(R.id.ecc7);
        ecc8 = (CardView) findViewById(R.id.ecc8);
        ecc9 = (CardView) findViewById(R.id.ecc9);
        ecc10 = (CardView) findViewById(R.id.ecc10);
        ecc11 = (CardView) findViewById(R.id.ecc11);
        ecc12 = (CardView) findViewById(R.id.ecc12);

        ecc1.setOnClickListener(this);
        ecc2.setOnClickListener(this);
        ecc3.setOnClickListener(this);
        ecc4.setOnClickListener(this);
        ecc5.setOnClickListener(this);
        ecc6.setOnClickListener(this);
        ecc7.setOnClickListener(this);
        ecc8.setOnClickListener(this);
        ecc9.setOnClickListener(this);
        ecc10.setOnClickListener(this);
        ecc11.setOnClickListener(this);
        ecc12.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id. ecc1){
            i = new Intent(this, Ecc1.class);
            startActivity(i);
        }
        if (viewId == R.id. ecc2){
            i = new Intent(this, Ecc2.class);
            startActivity(i);
        }
        if (viewId == R.id. ecc3){
            i = new Intent(this, Ecc3.class);
            startActivity(i);
        }
        if (viewId == R.id. ecc4){
            i = new Intent(this, Ecc4.class);
            startActivity(i);
        }
        if (viewId == R.id. ecc5){
            i = new Intent(this, Ecc5.class);
            startActivity(i);
        }
        if (viewId == R.id. ecc6){
            i = new Intent(this, Ecc6.class);
            startActivity(i);
        }
        if (viewId == R.id. ecc7){
            i = new Intent(this, Ecc7.class);
            startActivity(i);
        }
        if (viewId == R.id. ecc8){
            i = new Intent(this, Ecc8.class);
            startActivity(i);
        }
        if (viewId == R.id. ecc9){
            i = new Intent(this, Ecc9.class);
            startActivity(i);
        }
        if (viewId == R.id. ecc10){
            i = new Intent(this, Ecc10.class);
            startActivity(i);
        }
        if (viewId == R.id. ecc11){
            i = new Intent(this, Ecc11.class);
            startActivity(i);
        }
        if (viewId == R.id. ecc12){
            i = new Intent(this, Ecc12.class);
            startActivity(i);
        }
    }
}
package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Marcos extends AppCompatActivity implements View.OnClickListener{
    public CardView mar1, mar2, mar3, mar4, mar5, mar6, mar7, mar8, mar9,  mar10,
            mar11, mar12, mar13, mar14, mar15, mar16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcos);

        mar1 = (CardView) findViewById(R.id.mar1);
        mar2 = (CardView) findViewById(R.id.mar2);
        mar3 = (CardView) findViewById(R.id.mar3);
        mar4 = (CardView) findViewById(R.id.mar4);
        mar5 = (CardView) findViewById(R.id.mar5);
        mar6 = (CardView) findViewById(R.id.mar6);
        mar7 = (CardView) findViewById(R.id.mar7);
        mar8 = (CardView) findViewById(R.id.mar8);
        mar9 = (CardView) findViewById(R.id.mar9);
        mar10 = (CardView) findViewById(R.id.mar10);
        mar11 = (CardView) findViewById(R.id.mar11);
        mar12 = (CardView) findViewById(R.id.mar12);
        mar13 = (CardView) findViewById(R.id.mar13);
        mar14 = (CardView) findViewById(R.id.mar14);
        mar15 = (CardView) findViewById(R.id.mar15);
        mar16 = (CardView) findViewById(R.id.mar16);

        mar1.setOnClickListener(this);
        mar2.setOnClickListener(this);
        mar3.setOnClickListener(this);
        mar4.setOnClickListener(this);
        mar5.setOnClickListener(this);
        mar6.setOnClickListener(this);
        mar7.setOnClickListener(this);
        mar8.setOnClickListener(this);
        mar9.setOnClickListener(this);
        mar10.setOnClickListener(this);
        mar11.setOnClickListener(this);
        mar12.setOnClickListener(this);
        mar13.setOnClickListener(this);
        mar14.setOnClickListener(this);
        mar15.setOnClickListener(this);
        mar16.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id. mar1){
            i = new Intent(this, Mar1.class);
            startActivity(i);
        }
        if (viewId == R.id. mar2){
            i = new Intent(this, Mar2.class);
            startActivity(i);
        }
        if (viewId == R.id. mar3){
            i = new Intent(this, Mar3.class);
            startActivity(i);
        }
        if (viewId == R.id. mar4){
            i = new Intent(this, Mar4.class);
            startActivity(i);
        }
        if (viewId == R.id. mar5){
            i = new Intent(this, Mar5.class);
            startActivity(i);
        }
        if (viewId == R.id. mar6){
            i = new Intent(this, Mar6.class);
            startActivity(i);
        }
        if (viewId == R.id. mar7){
            i = new Intent(this, Mar7.class);
            startActivity(i);
        }
        if (viewId == R.id. mar8){
            i = new Intent(this, Mar8.class);
            startActivity(i);
        }
        if (viewId == R.id. mar9){
            i = new Intent(this, Mar9.class);
            startActivity(i);
        }
        if (viewId == R.id. mar10){
            i = new Intent(this, Mar10.class);
            startActivity(i);
        }
        if (viewId == R.id. mar11){
            i = new Intent(this, Mar11.class);
            startActivity(i);
        }
        if (viewId == R.id. mar12){
            i = new Intent(this, Mar12.class);
            startActivity(i);
        }
        if (viewId == R.id. mar13){
            i = new Intent(this, Mar13.class);
            startActivity(i);
        }
        if (viewId == R.id. mar14){
            i = new Intent(this, Mar14.class);
            startActivity(i);
        }
        if (viewId == R.id. mar15){
            i = new Intent(this, Mar15.class);
            startActivity(i);
        }
        if (viewId == R.id. mar16){
            i = new Intent(this, Mar16.class);
            startActivity(i);
        }
    }
}
package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Pinadayag extends AppCompatActivity implements View.OnClickListener{
    public CardView pin1, pin2, pin3, pin4, pin5, pin6, pin7, pin8, pin9, pin10,
            pin11, pin12, pin13, pin14, pin15, pin16, pin17, pin18, pin19, pin20,
            pin21, pin22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinadayag);

        pin1 = (CardView) findViewById(R.id.pin1);
        pin2 = (CardView) findViewById(R.id.pin2);
        pin3 = (CardView) findViewById(R.id.pin3);
        pin4 = (CardView) findViewById(R.id.pin4);
        pin5 = (CardView) findViewById(R.id.pin5);
        pin6 = (CardView) findViewById(R.id.pin6);
        pin7 = (CardView) findViewById(R.id.pin7);
        pin8 = (CardView) findViewById(R.id.pin8);
        pin9 = (CardView) findViewById(R.id.pin9);
        pin10 = (CardView) findViewById(R.id.pin10);
        pin11 = (CardView) findViewById(R.id.pin11);
        pin12 = (CardView) findViewById(R.id.pin12);
        pin13 = (CardView) findViewById(R.id.pin13);
        pin14 = (CardView) findViewById(R.id.pin14);
        pin15 = (CardView) findViewById(R.id.pin15);
        pin16 = (CardView) findViewById(R.id.pin16);
        pin17 = (CardView) findViewById(R.id.pin17);
        pin18 = (CardView) findViewById(R.id.pin18);
        pin19 = (CardView) findViewById(R.id.pin19);
        pin20 = (CardView) findViewById(R.id.pin20);
        pin21 = (CardView) findViewById(R.id.pin21);
        pin22 = (CardView) findViewById(R.id.pin22);

        pin1.setOnClickListener(this);
        pin2.setOnClickListener(this);
        pin3.setOnClickListener(this);
        pin4.setOnClickListener(this);
        pin5.setOnClickListener(this);
        pin6.setOnClickListener(this);
        pin7.setOnClickListener(this);
        pin8.setOnClickListener(this);
        pin9.setOnClickListener(this);
        pin10.setOnClickListener(this);
        pin11.setOnClickListener(this);
        pin12.setOnClickListener(this);
        pin13.setOnClickListener(this);
        pin14.setOnClickListener(this);
        pin15.setOnClickListener(this);
        pin16.setOnClickListener(this);
        pin17.setOnClickListener(this);
        pin18.setOnClickListener(this);
        pin19.setOnClickListener(this);
        pin20.setOnClickListener(this);
        pin21.setOnClickListener(this);
        pin22.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.pin1){
            i = new Intent(this, Pin1.class);
            startActivity(i);
        }
        if (viewId == R.id.pin2){
            i = new Intent(this, Pin2.class);
            startActivity(i);
        }
        if (viewId == R.id.pin3){
            i = new Intent(this, Pin3.class);
            startActivity(i);
        }
        if (viewId == R.id.pin4){
            i = new Intent(this, Pin4.class);
            startActivity(i);
        }
        if (viewId == R.id.pin5){
            i = new Intent(this, Pin5.class);
            startActivity(i);
        }
        if (viewId == R.id.pin6){
            i = new Intent(this, Pin6.class);
            startActivity(i);
        }
        if (viewId == R.id.pin7){
            i = new Intent(this, Pin7.class);
            startActivity(i);
        }
        if (viewId == R.id.pin8){
            i = new Intent(this, Pin8.class);
            startActivity(i);
        }
        if (viewId == R.id.pin9){
            i = new Intent(this, Pin9.class);
            startActivity(i);
        }
        if (viewId == R.id.pin10){
            i = new Intent(this, Pin10.class);
            startActivity(i);
        }
        if (viewId == R.id.pin11){
            i = new Intent(this, Pin11.class);
            startActivity(i);
        }
        if (viewId == R.id.pin12){
            i = new Intent(this, Pin12.class);
            startActivity(i);
        }
        if (viewId == R.id.pin13){
            i = new Intent(this, Pin13.class);
            startActivity(i);
        }
        if (viewId == R.id.pin14){
            i = new Intent(this, Pin14.class);
            startActivity(i);
        }
        if (viewId == R.id.pin15){
            i = new Intent(this, Pin15.class);
            startActivity(i);
        }
        if (viewId == R.id.pin16){
            i = new Intent(this, Pin16.class);
            startActivity(i);
        }
        if (viewId == R.id.pin17){
            i = new Intent(this, Pin17.class);
            startActivity(i);
        }
        if (viewId == R.id.pin18){
            i = new Intent(this, Pin18.class);
            startActivity(i);
        }
        if (viewId == R.id.pin19){
            i = new Intent(this, Pin19.class);
            startActivity(i);
        }
        if (viewId == R.id.pin20){
            i = new Intent(this, Pin20.class);
            startActivity(i);
        }

        if (viewId == R.id.pin21){
            i = new Intent(this, Pin21.class);
            startActivity(i);
        }
        if (viewId == R.id.pin22){
            i = new Intent(this, Pin22.class);
            startActivity(i);
        }
    }
}
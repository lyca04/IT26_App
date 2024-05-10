package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Levitico extends AppCompatActivity implements View.OnClickListener{
    public CardView lev1, lev2, lev3, lev4, lev5, lev6, lev7, lev8, lev9, lev10,
            lev11, lev12, lev13, lev14, lev15, lev16, lev17, lev18, lev19, lev20,
            lev21, lev22, lev23, lev24, lev25, lev26, lev27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levitico);

        lev1 = (CardView) findViewById(R.id.lev1);
        lev2 = (CardView) findViewById(R.id.lev2);
        lev3 = (CardView) findViewById(R.id.lev3);
        lev4 = (CardView) findViewById(R.id.lev4);
        lev5 = (CardView) findViewById(R.id.lev5);
        lev6 = (CardView) findViewById(R.id.lev6);
        lev7 = (CardView) findViewById(R.id.lev7);
        lev8 = (CardView) findViewById(R.id.lev8);
        lev9 = (CardView) findViewById(R.id.lev9);
        lev10 = (CardView) findViewById(R.id.lev10);
        lev11 = (CardView) findViewById(R.id.lev11);
        lev12 = (CardView) findViewById(R.id.lev12);
        lev13 = (CardView) findViewById(R.id.lev13);
        lev14 = (CardView) findViewById(R.id.lev14);
        lev15 = (CardView) findViewById(R.id.lev15);
        lev16 = (CardView) findViewById(R.id.lev16);
        lev17 = (CardView) findViewById(R.id.lev17);
        lev18 = (CardView) findViewById(R.id.lev18);
        lev19 = (CardView) findViewById(R.id.lev19);
        lev20 = (CardView) findViewById(R.id.lev20);
        lev21 = (CardView) findViewById(R.id.lev21);
        lev22 = (CardView) findViewById(R.id.lev22);
        lev23 = (CardView) findViewById(R.id.lev23);
        lev24 = (CardView) findViewById(R.id.lev24);
        lev25 = (CardView) findViewById(R.id.lev25);
        lev26 = (CardView) findViewById(R.id.lev26);
        lev27 = (CardView) findViewById(R.id.lev27);

        lev1.setOnClickListener(this);
        lev2.setOnClickListener(this);
        lev3.setOnClickListener(this);
        lev4.setOnClickListener(this);
        lev5.setOnClickListener(this);
        lev6.setOnClickListener(this);
        lev7.setOnClickListener(this);
        lev8.setOnClickListener(this);
        lev9.setOnClickListener(this);
        lev10.setOnClickListener(this);
        lev11.setOnClickListener(this);
        lev12.setOnClickListener(this);
        lev13.setOnClickListener(this);
        lev14.setOnClickListener(this);
        lev15.setOnClickListener(this);
        lev16.setOnClickListener(this);
        lev17.setOnClickListener(this);
        lev18.setOnClickListener(this);
        lev19.setOnClickListener(this);
        lev20.setOnClickListener(this);
        lev21.setOnClickListener(this);
        lev22.setOnClickListener(this);
        lev23.setOnClickListener(this);
        lev24.setOnClickListener(this);
        lev25.setOnClickListener(this);
        lev26.setOnClickListener(this);
        lev27.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.lev1){
            i = new Intent(this, Lev1.class);
            startActivity(i);
        }
        if (viewId == R.id.lev2){
            i = new Intent(this, Lev2.class);
            startActivity(i);
        }
        if (viewId == R.id.lev3){
            i = new Intent(this, Lev3.class);
            startActivity(i);
        }
        if (viewId == R.id.lev4){
            i = new Intent(this, Lev4.class);
            startActivity(i);
        }
        if (viewId == R.id.lev5){
            i = new Intent(this, Lev5.class);
            startActivity(i);
        }
        if (viewId == R.id.lev6){
            i = new Intent(this, Lev6.class);
            startActivity(i);
        }
        if (viewId == R.id.lev7){
            i = new Intent(this, Lev7.class);
            startActivity(i);
        }
        if (viewId == R.id.lev8){
            i = new Intent(this, Lev8.class);
            startActivity(i);
        }
        if (viewId == R.id.lev9){
            i = new Intent(this, Lev9.class);
            startActivity(i);
        }
        if (viewId == R.id.lev10){
            i = new Intent(this, Lev10.class);
            startActivity(i);
        }
        if (viewId == R.id.lev11){
            i = new Intent(this, Lev11.class);
            startActivity(i);
        }
        if (viewId == R.id.lev12){
            i = new Intent(this, Lev12.class);
            startActivity(i);
        }
        if (viewId == R.id.lev13){
            i = new Intent(this, Lev13.class);
            startActivity(i);
        }
        if (viewId == R.id.lev14){
            i = new Intent(this, Lev14.class);
            startActivity(i);
        }
        if (viewId == R.id.lev15){
            i = new Intent(this, Lev15.class);
            startActivity(i);
        }
        if (viewId == R.id.lev16){
            i = new Intent(this, Lev16.class);
            startActivity(i);
        }
        if (viewId == R.id.lev17){
            i = new Intent(this, Lev17.class);
            startActivity(i);
        }
        if (viewId == R.id.lev18){
            i = new Intent(this, Lev8.class);
            startActivity(i);
        }
        if (viewId == R.id.lev19){
            i = new Intent(this, Lev19.class);
            startActivity(i);
        }
        if (viewId == R.id.lev20){
            i = new Intent(this, Lev20.class);
            startActivity(i);
        }
        if (viewId == R.id.lev21){
            i = new Intent(this, Lev21.class);
            startActivity(i);
        }
        if (viewId == R.id.lev22){
            i = new Intent(this, Lev22.class);
            startActivity(i);
        }
        if (viewId == R.id.lev23){
            i = new Intent(this, Lev23.class);
            startActivity(i);
        }
        if (viewId == R.id.lev24){
            i = new Intent(this, Lev24.class);
            startActivity(i);
        }
        if (viewId == R.id.lev25){
            i = new Intent(this, Lev25.class);
            startActivity(i);
        }
        if (viewId == R.id.lev26){
            i = new Intent(this, Lev26.class);
            startActivity(i);
        }
        if (viewId == R.id.lev27){
            i = new Intent(this, Lev27.class);
            startActivity(i);
        }
    }
}
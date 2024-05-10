package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Zacarias extends AppCompatActivity implements View.OnClickListener{
    public CardView zac1, zac2, zac3, zac4, zac5, zac6, zac7, zac8, zac9,  zac10,
            zac11, zac12, zac13, zac14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zacarias);

        zac1 = (CardView) findViewById(R.id.zac1);
        zac2 = (CardView) findViewById(R.id.zac2);
        zac3 = (CardView) findViewById(R.id.zac3);
        zac4 = (CardView) findViewById(R.id.zac4);
        zac5 = (CardView) findViewById(R.id.zac5);
        zac6 = (CardView) findViewById(R.id.zac6);
        zac7 = (CardView) findViewById(R.id.zac7);
        zac8 = (CardView) findViewById(R.id.zac8);
        zac9 = (CardView) findViewById(R.id.zac9);
        zac10 = (CardView) findViewById(R.id.zac10);
        zac11 = (CardView) findViewById(R.id.zac11);
        zac12 = (CardView) findViewById(R.id.zac12);
        zac13 = (CardView) findViewById(R.id.zac13);
        zac14 = (CardView) findViewById(R.id.zac14);


        zac1.setOnClickListener(this);
        zac2.setOnClickListener(this);
        zac3.setOnClickListener(this);
        zac4.setOnClickListener(this);
        zac5.setOnClickListener(this);
        zac6.setOnClickListener(this);
        zac7.setOnClickListener(this);
        zac8.setOnClickListener(this);
        zac9.setOnClickListener(this);
        zac10.setOnClickListener(this);
        zac11.setOnClickListener(this);
        zac12.setOnClickListener(this);
        zac13.setOnClickListener(this);
        zac14.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id. zac1){
            i = new Intent(this, Zac1.class);
            startActivity(i);
        }
        if (viewId == R.id. zac2){
            i = new Intent(this, Zac2.class);
            startActivity(i);
        }
        if (viewId == R.id. zac3){
            i = new Intent(this, Zac3.class);
            startActivity(i);
        }
        if (viewId == R.id. zac4){
            i = new Intent(this, Zac4.class);
            startActivity(i);
        }
        if (viewId == R.id. zac5){
            i = new Intent(this, Zac5.class);
            startActivity(i);
        }
        if (viewId == R.id. zac6){
            i = new Intent(this, Zac6.class);
            startActivity(i);
        }
        if (viewId == R.id. zac7){
            i = new Intent(this, Zac7.class);
            startActivity(i);
        }
        if (viewId == R.id. zac8){
            i = new Intent(this, Zac8.class);
            startActivity(i);
        }
        if (viewId == R.id. zac9){
            i = new Intent(this, Zac9.class);
            startActivity(i);
        }
        if (viewId == R.id. zac10){
            i = new Intent(this, Zac10.class);
            startActivity(i);
        }
        if (viewId == R.id. zac11){
            i = new Intent(this, Zac11.class);
            startActivity(i);
        }
        if (viewId == R.id. zac12){
            i = new Intent(this, Zac12.class);
            startActivity(i);
        }
        if (viewId == R.id. zac13){
            i = new Intent(this, Zac3.class);
            startActivity(i);
        }
        if (viewId == R.id. zac14){
            i = new Intent(this, Zac4.class);
            startActivity(i);
        }
    }
}
package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Ester extends AppCompatActivity implements View.OnClickListener{
    public CardView est1, est2, est3, est4, est5, est6, est7, est8, est9,  est10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ester);

        est1 = (CardView) findViewById(R.id.est1);
        est2 = (CardView) findViewById(R.id.est2);
        est3 = (CardView) findViewById(R.id.est3);
        est4 = (CardView) findViewById(R.id.est4);
        est5 = (CardView) findViewById(R.id.est5);
        est6 = (CardView) findViewById(R.id.est6);
        est7 = (CardView) findViewById(R.id.est7);
        est8 = (CardView) findViewById(R.id.est8);
        est9 = (CardView) findViewById(R.id.est9);
        est10 = (CardView) findViewById(R.id.est10);

        est1.setOnClickListener(this);
        est2.setOnClickListener(this);
        est3.setOnClickListener(this);
        est4.setOnClickListener(this);
        est5.setOnClickListener(this);
        est6.setOnClickListener(this);
        est7.setOnClickListener(this);
        est8.setOnClickListener(this);
        est9.setOnClickListener(this);
        est10.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id. est1){
            i = new Intent(this, Est1.class);
            startActivity(i);
        }
        if (viewId == R.id. est2){
            i = new Intent(this, Est2.class);
            startActivity(i);
        }
        if (viewId == R.id. est3){
            i = new Intent(this, Est3.class);
            startActivity(i);
        }
        if (viewId == R.id. est4){
            i = new Intent(this, Est4.class);
            startActivity(i);
        }
        if (viewId == R.id. est5){
            i = new Intent(this, Est5.class);
            startActivity(i);
        }
        if (viewId == R.id. est6){
            i = new Intent(this, Est6.class);
            startActivity(i);
        }
        if (viewId == R.id. est7){
            i = new Intent(this, Est7.class);
            startActivity(i);
        }
        if (viewId == R.id. est8){
            i = new Intent(this, Est8.class);
            startActivity(i);
        }
        if (viewId == R.id. est9){
            i = new Intent(this, Est9.class);
            startActivity(i);
        }
        if (viewId == R.id. est10){
            i = new Intent(this, Est10.class);
            startActivity(i);
        }
    }
}
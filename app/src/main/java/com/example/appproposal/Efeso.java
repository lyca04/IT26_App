package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Efeso extends AppCompatActivity implements View.OnClickListener{
    public CardView ef1, ef2, ef3, ef4, ef5, ef6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efeso);

        ef1 = (CardView) findViewById(R.id.ef1);
        ef2 = (CardView) findViewById(R.id.ef2);
        ef3 = (CardView) findViewById(R.id.ef3);
        ef4 = (CardView) findViewById(R.id.ef4);
        ef5 = (CardView) findViewById(R.id.ef5);
        ef6 = (CardView) findViewById(R.id.ef6);

        ef1.setOnClickListener(this);
        ef2.setOnClickListener(this);
        ef3.setOnClickListener(this);
        ef4.setOnClickListener(this);
        ef5.setOnClickListener(this);
        ef6.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.ef1){
            i = new Intent(this, Ef1.class);
            startActivity(i);
        }
        if (viewId == R.id.ef2){
            i = new Intent(this, Ef2.class);
            startActivity(i);
        }
        if (viewId == R.id.ef3){
            i = new Intent(this, Ef3.class);
            startActivity(i);
        }
        if (viewId == R.id.ef4){
            i = new Intent(this, Ef4.class);
            startActivity(i);
        }
        if (viewId == R.id.ef5){
            i = new Intent(this, Ef5.class);
            startActivity(i);
        }
        if (viewId == R.id.ef6){
            i = new Intent(this, Ef6.class);
            startActivity(i);
        }
    }
}
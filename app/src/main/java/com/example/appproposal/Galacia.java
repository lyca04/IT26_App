package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Galacia extends AppCompatActivity implements View.OnClickListener{
    public CardView gal1, gal2, gal3, gal4, gal5, gal6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galacia);

        gal1 = (CardView) findViewById(R.id.gal1);
        gal2 = (CardView) findViewById(R.id.gal2);
        gal3 = (CardView) findViewById(R.id.gal3);
        gal4 = (CardView) findViewById(R.id.gal4);
        gal5 = (CardView) findViewById(R.id.gal5);
        gal6 = (CardView) findViewById(R.id.gal6);

        gal1.setOnClickListener(this);
        gal2.setOnClickListener(this);
        gal3.setOnClickListener(this);
        gal4.setOnClickListener(this);
        gal5.setOnClickListener(this);
        gal6.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.gal1){
            i = new Intent(this, Gal1.class);
            startActivity(i);
        }
        if (viewId == R.id.gal2){
            i = new Intent(this, Gal2.class);
            startActivity(i);
        }
        if (viewId == R.id.gal3){
            i = new Intent(this, Gal3.class);
            startActivity(i);
        }
        if (viewId == R.id.gal4){
            i = new Intent(this, Gal4.class);
            startActivity(i);
        }
        if (viewId == R.id.gal5){
            i = new Intent(this, Gal5.class);
            startActivity(i);
        }
        if (viewId == R.id.gal6){
            i = new Intent(this, Gal6.class);
            startActivity(i);
        }
    }
}
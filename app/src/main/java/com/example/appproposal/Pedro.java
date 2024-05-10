package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Pedro extends AppCompatActivity implements View.OnClickListener{
    public CardView ped1_1, ped1_2, ped1_3, ped1_4, ped1_5,ped2_1, ped2_2, ped2_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedro);

        ped1_1 = (CardView) findViewById(R.id.ped1_1);
        ped1_2 = (CardView) findViewById(R.id.ped1_2);
        ped1_3 = (CardView) findViewById(R.id.ped1_3);
        ped1_4 = (CardView) findViewById(R.id.ped1_4);
        ped1_5 = (CardView) findViewById(R.id.ped1_5);
        ped2_1 = (CardView) findViewById(R.id.ped2_1);
        ped2_2 = (CardView) findViewById(R.id.ped2_2);
        ped2_3 = (CardView) findViewById(R.id.ped2_3);

        ped1_1.setOnClickListener(this);
        ped1_2.setOnClickListener(this);
        ped1_3.setOnClickListener(this);
        ped1_4.setOnClickListener(this);
        ped1_5.setOnClickListener(this);
        ped2_1.setOnClickListener(this);
        ped2_2.setOnClickListener(this);
        ped2_3.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.ped1_1){
            i = new Intent(this, Ped1_1.class);
            startActivity(i);
        }
        if (viewId == R.id.ped1_2){
            i = new Intent(this, Ped1_2.class);
            startActivity(i);
        }
        if (viewId == R.id.ped1_3){
            i = new Intent(this, Ped1_3.class);
            startActivity(i);
        }
        if (viewId == R.id.ped1_4){
            i = new Intent(this, Ped1_4.class);
            startActivity(i);
        }
        if (viewId == R.id.ped1_5){
            i = new Intent(this, Ped1_5.class);
            startActivity(i);
        }
        if (viewId == R.id.ped2_1){
            i = new Intent(this, Ped2_1.class);
            startActivity(i);
        }
        if (viewId == R.id.ped2_2){
            i = new Intent(this, Ped2_2.class);
            startActivity(i);
        }
        if (viewId == R.id.ped2_3){
            i = new Intent(this, Ped2_3.class);
            startActivity(i);
        }
    }
}
package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tesalonica extends AppCompatActivity implements View.OnClickListener{
    public CardView tes1_1, tes1_2, tes1_3, tes1_4, tes1_5,tes2_1, tes2_2, tes2_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tesalonica);

        tes1_1 = (CardView) findViewById(R.id.tes1_1);
        tes1_2 = (CardView) findViewById(R.id.tes1_2);
        tes1_3 = (CardView) findViewById(R.id.tes1_3);
        tes1_4 = (CardView) findViewById(R.id.tes1_4);
        tes1_5 = (CardView) findViewById(R.id.tes1_5);
        tes2_1 = (CardView) findViewById(R.id.tes2_1);
        tes2_2 = (CardView) findViewById(R.id.tes2_2);
        tes2_3 = (CardView) findViewById(R.id.tes2_3);

        tes1_1.setOnClickListener(this);
        tes1_2.setOnClickListener(this);
        tes1_3.setOnClickListener(this);
        tes1_4.setOnClickListener(this);
        tes1_5.setOnClickListener(this);
        tes2_1.setOnClickListener(this);
        tes2_2.setOnClickListener(this);
        tes2_3.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.tes1_1){
            i = new Intent(this, Tes1_1.class);
            startActivity(i);
        }
        if (viewId == R.id.tes1_2){
            i = new Intent(this, Tes1_2.class);
            startActivity(i);
        }
        if (viewId == R.id.tes1_3){
            i = new Intent(this, Tes1_3.class);
            startActivity(i);
        }
        if (viewId == R.id.tes1_4){
            i = new Intent(this, Tes1_4.class);
            startActivity(i);
        }
        if (viewId == R.id.tes1_5){
            i = new Intent(this, Tes1_5.class);
            startActivity(i);
        }
        if (viewId == R.id.tes2_1){
            i = new Intent(this, Tes2_1.class);
            startActivity(i);
        }
        if (viewId == R.id.tes2_2){
            i = new Intent(this, Tes2_2.class);
            startActivity(i);
        }
        if (viewId == R.id.tes2_3){
            i = new Intent(this, Tes2_3.class);
            startActivity(i);
        }
    }
}
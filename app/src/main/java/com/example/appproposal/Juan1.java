package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Juan1 extends AppCompatActivity implements View.OnClickListener{
    public CardView juan1_1, juan1_2, juan1_3,juan1_4, juan1_5,juan2_1, juan3_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juan1);

        juan1_1 = (CardView) findViewById(R.id.juan1_1);
        juan1_2 = (CardView) findViewById(R.id.juan1_2);
        juan1_3 = (CardView) findViewById(R.id.juan1_3);
        juan1_4 = (CardView) findViewById(R.id.juan1_4);
        juan1_5 = (CardView) findViewById(R.id.juan1_5);
        juan2_1 = (CardView) findViewById(R.id.juan2_1);
        juan3_1 = (CardView) findViewById(R.id.juan3_1);

        juan1_1.setOnClickListener(this);
        juan1_2.setOnClickListener(this);
        juan1_3.setOnClickListener(this);
        juan1_4.setOnClickListener(this);
        juan1_5.setOnClickListener(this);
        juan2_1.setOnClickListener(this);
        juan3_1.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.juan1_1){
            i = new Intent(this, Juan1_1.class);
            startActivity(i);
        }
        if (viewId == R.id.juan1_2){
            i = new Intent(this, Juan1_2.class);
            startActivity(i);
        }
        if (viewId == R.id.juan1_3){
            i = new Intent(this, Juan1_3.class);
            startActivity(i);
        }
        if (viewId == R.id.juan1_4){
            i = new Intent(this, Juan1_4.class);
            startActivity(i);
        }
        if (viewId == R.id.juan1_5){
            i = new Intent(this, Juan1_5.class);
            startActivity(i);
        }
        if (viewId == R.id.juan2_1){
            i = new Intent(this, Juan2_1.class);
            startActivity(i);
        }
        if (viewId == R.id.juan3_1){
            i = new Intent(this, Juan3_1.class);
            startActivity(i);
        }
    }
}
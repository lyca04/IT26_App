package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Corinto extends AppCompatActivity implements View.OnClickListener{
    public CardView cor1_1, cor1_2, cor1_3, cor1_4, cor1_5, cor1_6, cor1_7, cor1_8, cor1_9, cor1_10,
            cor1_11, cor1_12, cor1_13, cor1_14, cor1_15, cor1_16, cor2_1, cor2_2, cor2_3, cor2_4,
            cor2_5, cor2_6, cor2_7, cor2_8, cor2_9, cor2_10,
            cor2_11, cor2_12, cor2_13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corinto);

        cor1_1 = (CardView) findViewById(R.id.cor1_1);
        cor1_2 = (CardView) findViewById(R.id.cor1_2);
        cor1_3 = (CardView) findViewById(R.id.cor1_3);
        cor1_4 = (CardView) findViewById(R.id.cor1_4);
        cor1_5 = (CardView) findViewById(R.id.cor1_5);
        cor1_6 = (CardView) findViewById(R.id.cor1_6);
        cor1_7 = (CardView) findViewById(R.id.cor1_7);
        cor1_8 = (CardView) findViewById(R.id.cor1_8);
        cor1_9 = (CardView) findViewById(R.id.cor1_9);
        cor1_10 = (CardView) findViewById(R.id.cor1_10);
        cor1_11 = (CardView) findViewById(R.id.cor1_11);
        cor1_12 = (CardView) findViewById(R.id.cor1_12);
        cor1_13 = (CardView) findViewById(R.id.cor1_13);
        cor1_14 = (CardView) findViewById(R.id.cor1_14);
        cor1_15 = (CardView) findViewById(R.id.cor1_15);
        cor1_16 = (CardView) findViewById(R.id.cor1_16);
        cor2_1 = (CardView) findViewById(R.id.cor2_1);
        cor2_2 = (CardView) findViewById(R.id.cor2_2);
        cor2_3 = (CardView) findViewById(R.id.cor2_3);
        cor2_4 = (CardView) findViewById(R.id.cor2_4);
        cor2_5 = (CardView) findViewById(R.id.cor2_5);
        cor2_6 = (CardView) findViewById(R.id.cor2_6);
        cor2_7 = (CardView) findViewById(R.id.cor2_7);
        cor2_8 = (CardView) findViewById(R.id.cor2_8);
        cor2_9 = (CardView) findViewById(R.id.cor2_9);
        cor2_10 = (CardView) findViewById(R.id.cor2_10);
        cor2_11 = (CardView) findViewById(R.id.cor2_11);
        cor2_12 = (CardView) findViewById(R.id.cor2_12);
        cor2_13 = (CardView) findViewById(R.id.cor2_13);

        cor1_1.setOnClickListener(this);
        cor1_2.setOnClickListener(this);
        cor1_3.setOnClickListener(this);
        cor1_4.setOnClickListener(this);
        cor1_5.setOnClickListener(this);
        cor1_6.setOnClickListener(this);
        cor1_7.setOnClickListener(this);
        cor1_8.setOnClickListener(this);
        cor1_9.setOnClickListener(this);
        cor1_10.setOnClickListener(this);
        cor1_11.setOnClickListener(this);
        cor1_12.setOnClickListener(this);
        cor1_13.setOnClickListener(this);
        cor1_14.setOnClickListener(this);
        cor1_15.setOnClickListener(this);
        cor1_16.setOnClickListener(this);
        cor2_1.setOnClickListener(this);
        cor2_2.setOnClickListener(this);
        cor2_3.setOnClickListener(this);
        cor2_4.setOnClickListener(this);
        cor2_5.setOnClickListener(this);
        cor2_6.setOnClickListener(this);
        cor2_7.setOnClickListener(this);
        cor2_8.setOnClickListener(this);
        cor2_9.setOnClickListener(this);
        cor2_10.setOnClickListener(this);
        cor2_11.setOnClickListener(this);
        cor2_12.setOnClickListener(this);
        cor2_13.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.cor1_1){
            i = new Intent(this, Cor1_1.class);
            startActivity(i);
        }
        if (viewId == R.id.cor1_2){
            i = new Intent(this, Cor1_2.class);
            startActivity(i);
        }
        if (viewId == R.id.cor1_3){
            i = new Intent(this, Cor1_3.class);
            startActivity(i);
        }
        if (viewId == R.id.cor1_4){
            i = new Intent(this, Cor1_4.class);
            startActivity(i);
        }
        if (viewId == R.id.cor1_5){
            i = new Intent(this, Cor1_5.class);
            startActivity(i);
        }
        if (viewId == R.id.cor1_6){
            i = new Intent(this, Cor1_6.class);
            startActivity(i);
        }
        if (viewId == R.id.cor1_7){
            i = new Intent(this, Cor1_7.class);
            startActivity(i);
        }
        if (viewId == R.id.cor1_8){
            i = new Intent(this, Cor1_8.class);
            startActivity(i);
        }
        if (viewId == R.id.cor1_9){
            i = new Intent(this, Cor1_9.class);
            startActivity(i);
        }
        if (viewId == R.id.cor1_10){
            i = new Intent(this, Cor1_10.class);
            startActivity(i);
        }
        if (viewId == R.id.cor1_11){
            i = new Intent(this, Cor1_11.class);
            startActivity(i);
        }
        if (viewId == R.id.cor1_12){
            i = new Intent(this, Cor1_12.class);
            startActivity(i);
        }
        if (viewId == R.id.cor1_13){
            i = new Intent(this, Cor1_13.class);
            startActivity(i);
        }
        if (viewId == R.id.cor1_14){
            i = new Intent(this, Cor1_14.class);
            startActivity(i);
        }
        if (viewId == R.id.cor1_15){
            i = new Intent(this, Cor1_15.class);
            startActivity(i);
        }
        if (viewId == R.id.cor1_16){
            i = new Intent(this, Cor1_16.class);
            startActivity(i);
        }
        if (viewId == R.id.cor2_1){
            i = new Intent(this, Cor2_1.class);
            startActivity(i);
        }
        if (viewId == R.id.cor2_2){
            i = new Intent(this, Cor2_2.class);
            startActivity(i);
        }
        if (viewId == R.id.cor2_3){
            i = new Intent(this, Cor2_3.class);
            startActivity(i);
        }
        if (viewId == R.id.cor2_4){
            i = new Intent(this, Cor2_4.class);
            startActivity(i);
        }
        if (viewId == R.id.cor2_5){
            i = new Intent(this, Cor2_5.class);
            startActivity(i);
        }
        if (viewId == R.id.cor2_6){
            i = new Intent(this, Cor2_6.class);
            startActivity(i);
        }
        if (viewId == R.id.cor2_7){
            i = new Intent(this, Cor2_7.class);
            startActivity(i);
        }
        if (viewId == R.id.cor2_8){
            i = new Intent(this, Cor2_8.class);
            startActivity(i);
        }
        if (viewId == R.id.cor2_9){
            i = new Intent(this, Cor2_9.class);
            startActivity(i);
        }
        if (viewId == R.id.cor2_10){
            i = new Intent(this, Cor2_10.class);
            startActivity(i);
        }
        if (viewId == R.id.cor2_11){
            i = new Intent(this, Cor2_11.class);
            startActivity(i);
        }
        if (viewId == R.id.cor2_12){
            i = new Intent(this, Cor2_12.class);
            startActivity(i);
        }
        if (viewId == R.id.cor2_13){
            i = new Intent(this, Cor2_13.class);
            startActivity(i);
        }
    }
}
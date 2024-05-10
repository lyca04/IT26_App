package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Hari extends AppCompatActivity implements View.OnClickListener{
    public CardView hari1_1, hari1_2, hari1_3, hari1_4, hari1_5, hari1_6, hari1_7, hari1_8, hari1_9, hari1_10,
            hari1_11, hari1_12, hari1_13, hari1_14, hari1_15, hari1_16, hari1_17, hari1_18, hari1_19, hari1_20,
            hari1_21, hari1_22, hari2_1, hari2_2, hari2_3, hari2_4, hari2_5, hari2_6, hari2_7, hari2_8, hari2_9, hari2_10,
            hari2_11, hari2_12, hari2_13, hari2_14, hari2_15, hari2_16, hari2_17, hari2_18, hari2_19, hari2_20,
            hari2_21, hari2_22, hari2_23, hari2_24, hari2_25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hari);

        hari1_1 = (CardView) findViewById(R.id.hari1_1);
        hari1_2 = (CardView) findViewById(R.id.hari1_2);
        hari1_3 = (CardView) findViewById(R.id.hari1_3);
        hari1_4 = (CardView) findViewById(R.id.hari1_4);
        hari1_5 = (CardView) findViewById(R.id.hari1_5);
        hari1_6 = (CardView) findViewById(R.id.hari1_6);
        hari1_7 = (CardView) findViewById(R.id.hari1_7);
        hari1_8 = (CardView) findViewById(R.id.hari1_8);
        hari1_9 = (CardView) findViewById(R.id.hari1_9);
        hari1_10 = (CardView) findViewById(R.id.hari1_10);
        hari1_11 = (CardView) findViewById(R.id.hari1_11);
        hari1_12 = (CardView) findViewById(R.id.hari1_12);
        hari1_13 = (CardView) findViewById(R.id.hari1_13);
        hari1_14 = (CardView) findViewById(R.id.hari1_14);
        hari1_15 = (CardView) findViewById(R.id.hari1_15);
        hari1_16 = (CardView) findViewById(R.id.hari1_16);
        hari1_17 = (CardView) findViewById(R.id.hari1_17);
        hari1_18 = (CardView) findViewById(R.id.hari1_18);
        hari1_19 = (CardView) findViewById(R.id.hari1_19);
        hari1_20 = (CardView) findViewById(R.id.hari1_20);
        hari1_21 = (CardView) findViewById(R.id.hari1_21);
        hari1_22 = (CardView) findViewById(R.id.hari1_22);
        hari2_1 = (CardView) findViewById(R.id.hari2_1);
        hari2_2 = (CardView) findViewById(R.id.hari2_2);
        hari2_3 = (CardView) findViewById(R.id.hari2_3);
        hari2_4 = (CardView) findViewById(R.id.hari2_4);
        hari2_5 = (CardView) findViewById(R.id.hari2_5);
        hari2_6 = (CardView) findViewById(R.id.hari2_6);
        hari2_7 = (CardView) findViewById(R.id.hari2_7);
        hari2_8 = (CardView) findViewById(R.id.hari2_8);
        hari2_9 = (CardView) findViewById(R.id.hari2_9);
        hari2_10 = (CardView) findViewById(R.id.hari2_10);
        hari2_11 = (CardView) findViewById(R.id.hari2_11);
        hari2_12 = (CardView) findViewById(R.id.hari2_12);
        hari2_13 = (CardView) findViewById(R.id.hari2_13);
        hari2_14 = (CardView) findViewById(R.id.hari2_14);
        hari2_15 = (CardView) findViewById(R.id.hari2_15);
        hari2_16 = (CardView) findViewById(R.id.hari2_16);
        hari2_17 = (CardView) findViewById(R.id.hari2_17);
        hari2_18 = (CardView) findViewById(R.id.hari2_18);
        hari2_19 = (CardView) findViewById(R.id.hari2_19);
        hari2_20 = (CardView) findViewById(R.id.hari2_20);
        hari2_21 = (CardView) findViewById(R.id.hari2_21);
        hari2_22 = (CardView) findViewById(R.id.hari2_22);
        hari2_23 = (CardView) findViewById(R.id.hari2_23);
        hari2_24 = (CardView) findViewById(R.id.hari2_24);
        hari2_25 = (CardView) findViewById(R.id.hari2_25);

        hari1_1.setOnClickListener(this);
        hari1_2.setOnClickListener(this);
        hari1_3.setOnClickListener(this);
        hari1_4.setOnClickListener(this);
        hari1_5.setOnClickListener(this);
        hari1_6.setOnClickListener(this);
        hari1_7.setOnClickListener(this);
        hari1_8.setOnClickListener(this);
        hari1_9.setOnClickListener(this);
        hari1_10.setOnClickListener(this);
        hari1_11.setOnClickListener(this);
        hari1_12.setOnClickListener(this);
        hari1_13.setOnClickListener(this);
        hari1_14.setOnClickListener(this);
        hari1_15.setOnClickListener(this);
        hari1_16.setOnClickListener(this);
        hari1_17.setOnClickListener(this);
        hari1_18.setOnClickListener(this);
        hari1_19.setOnClickListener(this);
        hari1_20.setOnClickListener(this);
        hari1_21.setOnClickListener(this);
        hari1_22.setOnClickListener(this);
        hari2_1.setOnClickListener(this);
        hari2_2.setOnClickListener(this);
        hari2_3.setOnClickListener(this);
        hari2_4.setOnClickListener(this);
        hari2_5.setOnClickListener(this);
        hari2_6.setOnClickListener(this);
        hari2_7.setOnClickListener(this);
        hari2_8.setOnClickListener(this);
        hari2_9.setOnClickListener(this);
        hari2_10.setOnClickListener(this);
        hari2_11.setOnClickListener(this);
        hari2_12.setOnClickListener(this);
        hari2_13.setOnClickListener(this);
        hari2_14.setOnClickListener(this);
        hari2_15.setOnClickListener(this);
        hari2_16.setOnClickListener(this);
        hari2_17.setOnClickListener(this);
        hari2_18.setOnClickListener(this);
        hari2_19.setOnClickListener(this);
        hari2_20.setOnClickListener(this);
        hari2_21.setOnClickListener(this);
        hari2_22.setOnClickListener(this);
        hari2_23.setOnClickListener(this);
        hari2_24.setOnClickListener(this);
        hari2_25.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.hari1_1){
            i = new Intent(this, Hari1_1.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_2){
            i = new Intent(this, Hari1_2.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_3){
            i = new Intent(this, Hari1_3.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_4){
            i = new Intent(this, Hari1_4.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_5){
            i = new Intent(this, Hari1_5.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_6){
            i = new Intent(this, Hari1_6.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_7){
            i = new Intent(this, Hari1_7.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_8){
            i = new Intent(this, Hari1_8.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_9){
            i = new Intent(this, Hari1_9.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_10){
            i = new Intent(this, Hari1_10.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_11){
            i = new Intent(this, Hari1_11.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_12){
            i = new Intent(this, Hari1_12.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_13){
            i = new Intent(this, Hari1_13.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_14){
            i = new Intent(this, Hari1_14.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_15){
            i = new Intent(this, Hari1_15.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_16){
            i = new Intent(this, Hari1_16.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_17){
            i = new Intent(this, Hari1_17.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_18){
            i = new Intent(this, Hari1_18.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_19){
            i = new Intent(this, Hari1_19.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_20){
            i = new Intent(this, Hari1_20.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_21){
            i = new Intent(this, Hari1_21.class);
            startActivity(i);
        }
        if (viewId == R.id.hari1_22){
            i = new Intent(this, Hari1_22.class);
            startActivity(i);
        }

        if (viewId == R.id.hari2_1){
            i = new Intent(this, Hari2_1.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_2){
            i = new Intent(this, Hari2_2.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_3){
            i = new Intent(this, Hari2_3.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_4){
            i = new Intent(this, Hari2_4.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_5){
            i = new Intent(this, Hari2_5.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_6){
            i = new Intent(this, Hari2_6.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_7){
            i = new Intent(this, Hari2_7.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_8){
            i = new Intent(this, Hari2_8.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_9){
            i = new Intent(this, Hari2_9.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_10){
            i = new Intent(this, Hari2_10.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_11){
            i = new Intent(this, Hari2_11.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_12){
            i = new Intent(this, Hari2_12.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_13){
            i = new Intent(this, Hari2_13.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_14){
            i = new Intent(this, Hari2_14.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_15){
            i = new Intent(this, Hari2_15.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_16){
            i = new Intent(this, Hari2_16.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_17){
            i = new Intent(this, Hari2_17.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_18){
            i = new Intent(this, Hari2_18.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_19){
            i = new Intent(this, Hari2_19.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_20){
            i = new Intent(this, Hari2_20.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_21){
            i = new Intent(this, Hari2_21.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_22){
            i = new Intent(this, Hari2_22.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_23){
            i = new Intent(this, Hari2_23.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_24){
            i = new Intent(this, Hari2_24.class);
            startActivity(i);
        }
        if (viewId == R.id.hari2_25){
            i = new Intent(this, Hari2_24.class);
            startActivity(i);
        }
    }
}
package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Roma extends AppCompatActivity implements View.OnClickListener{
    public CardView roma1, roma2, roma3, roma4, roma5, roma6, roma7, roma8, roma9,  roma10,
            roma11, roma12, roma13, roma14, roma15, roma16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roma);

        roma1 = (CardView) findViewById(R.id.roma1);
        roma2 = (CardView) findViewById(R.id.roma2);
        roma3 = (CardView) findViewById(R.id.roma3);
        roma4 = (CardView) findViewById(R.id.roma4);
        roma5 = (CardView) findViewById(R.id.roma5);
        roma6 = (CardView) findViewById(R.id.roma6);
        roma7 = (CardView) findViewById(R.id.roma7);
        roma8 = (CardView) findViewById(R.id.roma8);
        roma9 = (CardView) findViewById(R.id.roma9);
        roma10 = (CardView) findViewById(R.id.roma10);
        roma11 = (CardView) findViewById(R.id.roma11);
        roma12 = (CardView) findViewById(R.id.roma12);
        roma13 = (CardView) findViewById(R.id.roma13);
        roma14 = (CardView) findViewById(R.id.roma14);
        roma15 = (CardView) findViewById(R.id.roma15);
        roma16 = (CardView) findViewById(R.id.roma16);


        roma1.setOnClickListener(this);
        roma2.setOnClickListener(this);
        roma3.setOnClickListener(this);
        roma4.setOnClickListener(this);
        roma5.setOnClickListener(this);
        roma6.setOnClickListener(this);
        roma7.setOnClickListener(this);
        roma8.setOnClickListener(this);
        roma9.setOnClickListener(this);
        roma10.setOnClickListener(this);
        roma11.setOnClickListener(this);
        roma12.setOnClickListener(this);
        roma13.setOnClickListener(this);
        roma14.setOnClickListener(this);
        roma15.setOnClickListener(this);
        roma16.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id. roma1){
            i = new Intent(this, Roma1.class);
            startActivity(i);
        }
        if (viewId == R.id. roma2){
            i = new Intent(this, Roma2.class);
            startActivity(i);
        }
        if (viewId == R.id. roma3){
            i = new Intent(this, Roma3.class);
            startActivity(i);
        }
        if (viewId == R.id. roma4){
            i = new Intent(this, Roma4.class);
            startActivity(i);
        }
        if (viewId == R.id. roma5){
            i = new Intent(this, Roma5.class);
            startActivity(i);
        }
        if (viewId == R.id. roma6){
            i = new Intent(this, Roma6.class);
            startActivity(i);
        }
        if (viewId == R.id. roma7){
            i = new Intent(this, Roma7.class);
            startActivity(i);
        }
        if (viewId == R.id. roma8){
            i = new Intent(this, Roma8.class);
            startActivity(i);
        }
        if (viewId == R.id. roma9){
            i = new Intent(this, Roma9.class);
            startActivity(i);
        }
        if (viewId == R.id. roma10){
            i = new Intent(this, Roma10.class);
            startActivity(i);
        }
        if (viewId == R.id. roma11){
            i = new Intent(this, Roma11.class);
            startActivity(i);
        }
        if (viewId == R.id. roma12){
            i = new Intent(this, Roma12.class);
            startActivity(i);
        }
        if (viewId == R.id. roma13){
            i = new Intent(this, Roma13.class);
            startActivity(i);
        }
        if (viewId == R.id. roma14){
            i = new Intent(this, Roma14.class);
            startActivity(i);
        }
        if (viewId == R.id. roma15){
            i = new Intent(this, Roma15.class);
            startActivity(i);
        }
        if (viewId == R.id. roma16){
            i = new Intent(this, Roma16.class);
            startActivity(i);
        }
    }
}
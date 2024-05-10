package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Maghuhukom extends AppCompatActivity implements View.OnClickListener{
    public CardView mag1, mag2, mag3, mag4, mag5, mag6, mag7, mag8, mag9, mag10,
            mag11, mag12, mag13, mag14, mag15, mag16, mag17, mag18, mag19, mag20,
            mag21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maghuhukom);

        mag1 = (CardView) findViewById(R.id.mag1);
        mag2 = (CardView) findViewById(R.id.mag2);
        mag3 = (CardView) findViewById(R.id.mag3);
        mag4 = (CardView) findViewById(R.id.mag4);
        mag5 = (CardView) findViewById(R.id.mag5);
        mag6 = (CardView) findViewById(R.id.mag6);
        mag7 = (CardView) findViewById(R.id.mag7);
        mag8 = (CardView) findViewById(R.id.mag8);
        mag9 = (CardView) findViewById(R.id.mag9);
        mag10 = (CardView) findViewById(R.id.mag10);
        mag11 = (CardView) findViewById(R.id.mag11);
        mag12 = (CardView) findViewById(R.id.mag12);
        mag13 = (CardView) findViewById(R.id.mag13);
        mag14 = (CardView) findViewById(R.id.mag14);
        mag15 = (CardView) findViewById(R.id.mag15);
        mag16 = (CardView) findViewById(R.id.mag16);
        mag17 = (CardView) findViewById(R.id.mag17);
        mag18 = (CardView) findViewById(R.id.mag18);
        mag19 = (CardView) findViewById(R.id.mag19);
        mag20 = (CardView) findViewById(R.id.mag20);
        mag21 = (CardView) findViewById(R.id.mag21);

        mag1.setOnClickListener(this);
        mag2.setOnClickListener(this);
        mag3.setOnClickListener(this);
        mag4.setOnClickListener(this);
        mag5.setOnClickListener(this);
        mag6.setOnClickListener(this);
        mag7.setOnClickListener(this);
        mag8.setOnClickListener(this);
        mag9.setOnClickListener(this);
        mag10.setOnClickListener(this);
        mag11.setOnClickListener(this);
        mag12.setOnClickListener(this);
        mag13.setOnClickListener(this);
        mag14.setOnClickListener(this);
        mag15.setOnClickListener(this);
        mag16.setOnClickListener(this);
        mag17.setOnClickListener(this);
        mag18.setOnClickListener(this);
        mag19.setOnClickListener(this);
        mag20.setOnClickListener(this);
        mag21.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.mag1){
            i = new Intent(this, Mag1.class);
            startActivity(i);
        }
        if (viewId == R.id.mag2){
            i = new Intent(this, Mag2.class);
            startActivity(i);
        }
        if (viewId == R.id.mag3){
            i = new Intent(this, Mag3.class);
            startActivity(i);
        }
        if (viewId == R.id.mag4){
            i = new Intent(this, Mag4.class);
            startActivity(i);
        }
        if (viewId == R.id.mag5){
            i = new Intent(this, Mag5.class);
            startActivity(i);
        }
        if (viewId == R.id.mag6){
            i = new Intent(this, Mag6.class);
            startActivity(i);
        }
        if (viewId == R.id.mag7){
            i = new Intent(this, Mag7.class);
            startActivity(i);
        }
        if (viewId == R.id.mag8){
            i = new Intent(this, Mag8.class);
            startActivity(i);
        }
        if (viewId == R.id.mag9){
            i = new Intent(this, Mag9.class);
            startActivity(i);
        }
        if (viewId == R.id.mag10){
            i = new Intent(this, Mag10.class);
            startActivity(i);
        }
        if (viewId == R.id.mag11){
            i = new Intent(this, Mag11.class);
            startActivity(i);
        }
        if (viewId == R.id.mag12){
            i = new Intent(this, Mag12.class);
            startActivity(i);
        }
        if (viewId == R.id.mag13){
            i = new Intent(this, Mag13.class);
            startActivity(i);
        }
        if (viewId == R.id.mag14){
            i = new Intent(this, Mag14.class);
            startActivity(i);
        }
        if (viewId == R.id.mag15){
            i = new Intent(this, Mag15.class);
            startActivity(i);
        }
        if (viewId == R.id.mag16){
            i = new Intent(this, Mag16.class);
            startActivity(i);
        }
        if (viewId == R.id.mag17){
            i = new Intent(this, Mag17.class);
            startActivity(i);
        }
        if (viewId == R.id.mag18){
            i = new Intent(this, Mag18.class);
            startActivity(i);
        }
        if (viewId == R.id.mag19){
            i = new Intent(this, Mag19.class);
            startActivity(i);
        }
        if (viewId == R.id.mag20){
            i = new Intent(this, Mag20.class);
            startActivity(i);
        }
        if (viewId == R.id.mag21){
            i = new Intent(this, Mag21.class);
            startActivity(i);
        }
    }
}
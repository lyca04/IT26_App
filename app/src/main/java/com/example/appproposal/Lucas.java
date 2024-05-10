package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Lucas extends AppCompatActivity implements View.OnClickListener{
    public CardView luc1, luc2, luc3, luc4, luc5, luc6, luc7, luc8, luc9, luc10,
            luc11, luc12, luc13, luc14, luc15, luc16, luc17, luc18, luc19, luc20,
            luc21, luc22, luc23, luc24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucas);

        luc1 = (CardView) findViewById(R.id.luc1);
        luc2 = (CardView) findViewById(R.id.luc2);
        luc3 = (CardView) findViewById(R.id.luc3);
        luc4 = (CardView) findViewById(R.id.luc4);
        luc5 = (CardView) findViewById(R.id.luc5);
        luc6 = (CardView) findViewById(R.id.luc6);
        luc7 = (CardView) findViewById(R.id.luc7);
        luc8 = (CardView) findViewById(R.id.luc8);
        luc9 = (CardView) findViewById(R.id.luc9);
        luc10 = (CardView) findViewById(R.id.luc10);
        luc11 = (CardView) findViewById(R.id.luc11);
        luc12 = (CardView) findViewById(R.id.luc12);
        luc13 = (CardView) findViewById(R.id.luc13);
        luc14 = (CardView) findViewById(R.id.luc14);
        luc15 = (CardView) findViewById(R.id.luc15);
        luc16 = (CardView) findViewById(R.id.luc16);
        luc17 = (CardView) findViewById(R.id.luc17);
        luc18 = (CardView) findViewById(R.id.luc18);
        luc19 = (CardView) findViewById(R.id.luc19);
        luc20 = (CardView) findViewById(R.id.luc20);
        luc21 = (CardView) findViewById(R.id.luc21);
        luc22 = (CardView) findViewById(R.id.luc22);
        luc23 = (CardView) findViewById(R.id.luc23);
        luc24 = (CardView) findViewById(R.id.luc24);

        luc1.setOnClickListener(this);
        luc2.setOnClickListener(this);
        luc3.setOnClickListener(this);
        luc4.setOnClickListener(this);
        luc5.setOnClickListener(this);
        luc6.setOnClickListener(this);
        luc7.setOnClickListener(this);
        luc8.setOnClickListener(this);
        luc9.setOnClickListener(this);
        luc10.setOnClickListener(this);
        luc11.setOnClickListener(this);
        luc12.setOnClickListener(this);
        luc13.setOnClickListener(this);
        luc14.setOnClickListener(this);
        luc15.setOnClickListener(this);
        luc16.setOnClickListener(this);
        luc17.setOnClickListener(this);
        luc18.setOnClickListener(this);
        luc19.setOnClickListener(this);
        luc20.setOnClickListener(this);
        luc21.setOnClickListener(this);
        luc22.setOnClickListener(this);
        luc23.setOnClickListener(this);
        luc24.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.luc1){
            i = new Intent(this, Luc1.class);
            startActivity(i);
        }
        if (viewId == R.id.luc2){
            i = new Intent(this, Luc2.class);
            startActivity(i);
        }
        if (viewId == R.id.luc3){
            i = new Intent(this, Luc3.class);
            startActivity(i);
        }
        if (viewId == R.id.luc4){
            i = new Intent(this, Luc4.class);
            startActivity(i);
        }
        if (viewId == R.id.luc5){
            i = new Intent(this, Luc5.class);
            startActivity(i);
        }
        if (viewId == R.id.luc6){
            i = new Intent(this, Luc6.class);
            startActivity(i);
        }
        if (viewId == R.id.luc7){
            i = new Intent(this, Luc7.class);
            startActivity(i);
        }
        if (viewId == R.id.luc8){
            i = new Intent(this, Luc8.class);
            startActivity(i);
        }
        if (viewId == R.id.luc9){
            i = new Intent(this, Luc9.class);
            startActivity(i);
        }
        if (viewId == R.id.luc10){
            i = new Intent(this, Luc10.class);
            startActivity(i);
        }
        if (viewId == R.id.luc11){
            i = new Intent(this, Luc11.class);
            startActivity(i);
        }
        if (viewId == R.id.luc12){
            i = new Intent(this, Luc12.class);
            startActivity(i);
        }
        if (viewId == R.id.luc13){
            i = new Intent(this, Luc13.class);
            startActivity(i);
        }
        if (viewId == R.id.luc14){
            i = new Intent(this, Luc14.class);
            startActivity(i);
        }
        if (viewId == R.id.luc15){
            i = new Intent(this, Luc15.class);
            startActivity(i);
        }
        if (viewId == R.id.luc16){
            i = new Intent(this, Luc16.class);
            startActivity(i);
        }
        if (viewId == R.id.luc17){
            i = new Intent(this, Luc17.class);
            startActivity(i);
        }
        if (viewId == R.id.luc18){
            i = new Intent(this, Luc18.class);
            startActivity(i);
        }
        if (viewId == R.id.luc19){
            i = new Intent(this, Luc19.class);
            startActivity(i);
        }
        if (viewId == R.id.luc20){
            i = new Intent(this, Luc20.class);
            startActivity(i);
        }
        if (viewId == R.id.luc21){
            i = new Intent(this, Luc21.class);
            startActivity(i);
        }
        if (viewId == R.id.luc22){
            i = new Intent(this, Luc22.class);
            startActivity(i);
        }
        if (viewId == R.id.luc23){
            i = new Intent(this, Luc23.class);
            startActivity(i);
        }
        if (viewId == R.id.luc24){
            i = new Intent(this, Luc24.class);
            startActivity(i);
        }
    }
}
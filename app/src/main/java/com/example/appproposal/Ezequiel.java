package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Ezequiel extends AppCompatActivity implements View.OnClickListener{
    public CardView eze1, eze2, eze3, eze4, eze5, eze6, eze7, eze8, eze9, eze10,
            eze11, eze12, eze13, eze14, eze15, eze16, eze17, eze18, eze19, eze20,
            eze21, eze22, eze23, eze24, eze25, eze26, eze27, eze28, eze29, eze30,
            eze31, eze32, eze33, eze34, eze35, eze36, eze37, eze38, eze39, eze40,
            eze41, eze42, eze43, eze44, eze45, eze46, eze47, eze48;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ezequiel);

        eze1 = (CardView) findViewById(R.id.eze1);
        eze2 = (CardView) findViewById(R.id.eze2);
        eze3 = (CardView) findViewById(R.id.eze3);
        eze4 = (CardView) findViewById(R.id.eze4);
        eze5 = (CardView) findViewById(R.id.eze5);
        eze6 = (CardView) findViewById(R.id.eze6);
        eze7 = (CardView) findViewById(R.id.eze7);
        eze8 = (CardView) findViewById(R.id.eze8);
        eze9 = (CardView) findViewById(R.id.eze9);
        eze10 = (CardView) findViewById(R.id.eze10);
        eze11 = (CardView) findViewById(R.id.eze11);
        eze12 = (CardView) findViewById(R.id.eze12);
        eze13 = (CardView) findViewById(R.id.eze13);
        eze14 = (CardView) findViewById(R.id.eze14);
        eze15 = (CardView) findViewById(R.id.eze15);
        eze16 = (CardView) findViewById(R.id.eze16);
        eze17 = (CardView) findViewById(R.id.eze17);
        eze18 = (CardView) findViewById(R.id.eze18);
        eze19 = (CardView) findViewById(R.id.eze19);
        eze20 = (CardView) findViewById(R.id.eze20);
        eze21 = (CardView) findViewById(R.id.eze21);
        eze22 = (CardView) findViewById(R.id.eze22);
        eze23 = (CardView) findViewById(R.id.eze23);
        eze24 = (CardView) findViewById(R.id.eze24);
        eze25 = (CardView) findViewById(R.id.eze25);
        eze26 = (CardView) findViewById(R.id.eze26);
        eze27 = (CardView) findViewById(R.id.eze27);
        eze28 = (CardView) findViewById(R.id.eze28);
        eze29 = (CardView) findViewById(R.id.eze29);
        eze30 = (CardView) findViewById(R.id.eze30);
        eze31 = (CardView) findViewById(R.id.eze31);
        eze32 = (CardView) findViewById(R.id.eze32);
        eze33 = (CardView) findViewById(R.id.eze33);
        eze34 = (CardView) findViewById(R.id.eze34);
        eze35 = (CardView) findViewById(R.id.eze35);
        eze36 = (CardView) findViewById(R.id.eze36);
        eze37 = (CardView) findViewById(R.id.eze37);
        eze38 = (CardView) findViewById(R.id.eze38);
        eze39 = (CardView) findViewById(R.id.eze39);
        eze40 = (CardView) findViewById(R.id.eze40);
        eze41 = (CardView) findViewById(R.id.eze41);
        eze42 = (CardView) findViewById(R.id.eze42);
        eze43 = (CardView) findViewById(R.id.eze43);
        eze44 = (CardView) findViewById(R.id.eze44);
        eze45 = (CardView) findViewById(R.id.eze45);
        eze46 = (CardView) findViewById(R.id.eze46);
        eze47 = (CardView) findViewById(R.id.eze47);
        eze48 = (CardView) findViewById(R.id.eze48);

        eze1.setOnClickListener(this);
        eze2.setOnClickListener(this);
        eze3.setOnClickListener(this);
        eze4.setOnClickListener(this);
        eze5.setOnClickListener(this);
        eze6.setOnClickListener(this);
        eze7.setOnClickListener(this);
        eze8.setOnClickListener(this);
        eze9.setOnClickListener(this);
        eze10.setOnClickListener(this);
        eze11.setOnClickListener(this);
        eze12.setOnClickListener(this);
        eze13.setOnClickListener(this);
        eze14.setOnClickListener(this);
        eze15.setOnClickListener(this);
        eze16.setOnClickListener(this);
        eze17.setOnClickListener(this);
        eze18.setOnClickListener(this);
        eze19.setOnClickListener(this);
        eze20.setOnClickListener(this);
        eze21.setOnClickListener(this);
        eze22.setOnClickListener(this);
        eze23.setOnClickListener(this);
        eze24.setOnClickListener(this);
        eze25.setOnClickListener(this);
        eze26.setOnClickListener(this);
        eze27.setOnClickListener(this);
        eze28.setOnClickListener(this);
        eze29.setOnClickListener(this);
        eze30.setOnClickListener(this);
        eze31.setOnClickListener(this);
        eze32.setOnClickListener(this);
        eze33.setOnClickListener(this);
        eze34.setOnClickListener(this);
        eze35.setOnClickListener(this);
        eze36.setOnClickListener(this);
        eze37.setOnClickListener(this);
        eze38.setOnClickListener(this);
        eze39.setOnClickListener(this);
        eze40.setOnClickListener(this);
        eze41.setOnClickListener(this);
        eze42.setOnClickListener(this);
        eze43.setOnClickListener(this);
        eze44.setOnClickListener(this);
        eze45.setOnClickListener(this);
        eze46.setOnClickListener(this);
        eze47.setOnClickListener(this);
        eze48.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.eze1){
            i = new Intent(this, Eze1.class);
            startActivity(i);
        }
        if (viewId == R.id.eze2){
            i = new Intent(this, Eze2.class);
            startActivity(i);
        }
        if (viewId == R.id.eze3){
            i = new Intent(this, Eze3.class);
            startActivity(i);
        }
        if (viewId == R.id.eze4){
            i = new Intent(this, Eze4.class);
            startActivity(i);
        }
        if (viewId == R.id.eze5){
            i = new Intent(this, Eze5.class);
            startActivity(i);
        }
        if (viewId == R.id.eze6){
            i = new Intent(this, Eze6.class);
            startActivity(i);
        }
        if (viewId == R.id.eze7){
            i = new Intent(this, Eze7.class);
            startActivity(i);
        }
        if (viewId == R.id.eze8){
            i = new Intent(this, Eze8.class);
            startActivity(i);
        }
        if (viewId == R.id.eze9){
            i = new Intent(this, Eze9.class);
            startActivity(i);
        }
        if (viewId == R.id.eze10){
            i = new Intent(this, Eze10.class);
            startActivity(i);
        }
        if (viewId == R.id.eze11){
            i = new Intent(this, Eze11.class);
            startActivity(i);
        }
        if (viewId == R.id.eze12){
            i = new Intent(this, Eze12.class);
            startActivity(i);
        }
        if (viewId == R.id.eze13){
            i = new Intent(this, Eze13.class);
            startActivity(i);
        }
        if (viewId == R.id.eze14){
            i = new Intent(this, Eze14.class);
            startActivity(i);
        }
        if (viewId == R.id.eze15){
            i = new Intent(this, Eze15.class);
            startActivity(i);
        }
        if (viewId == R.id.eze16){
            i = new Intent(this, Eze16.class);
            startActivity(i);
        }
        if (viewId == R.id.eze17){
            i = new Intent(this, Eze17.class);
            startActivity(i);
        }
        if (viewId == R.id.eze18){
            i = new Intent(this, Eze18.class);
            startActivity(i);
        }
        if (viewId == R.id.eze19){
            i = new Intent(this, Eze19.class);
            startActivity(i);
        }
        if (viewId == R.id.eze20){
            i = new Intent(this, Eze20.class);
            startActivity(i);
        }
        if (viewId == R.id.eze21){
            i = new Intent(this, Eze21.class);
            startActivity(i);
        }
        if (viewId == R.id.eze22){
            i = new Intent(this, Eze22.class);
            startActivity(i);
        }
        if (viewId == R.id.eze23){
            i = new Intent(this, Eze23.class);
            startActivity(i);
        }
        if (viewId == R.id.eze24){
            i = new Intent(this, Eze24.class);
            startActivity(i);
        }
        if (viewId == R.id.eze25){
            i = new Intent(this, Eze25.class);
            startActivity(i);
        }
        if (viewId == R.id.eze26){
            i = new Intent(this, Eze26.class);
            startActivity(i);
        }
        if (viewId == R.id.eze27){
            i = new Intent(this, Eze27.class);
            startActivity(i);
        }
        if (viewId == R.id.eze28){
            i = new Intent(this, Eze28.class);
            startActivity(i);
        }
        if (viewId == R.id.eze29){
            i = new Intent(this, Eze29.class);
            startActivity(i);
        }
        if (viewId == R.id.eze30){
            i = new Intent(this, Eze30.class);
            startActivity(i);
        }
        if (viewId == R.id.eze31){
            i = new Intent(this, Eze31.class);
            startActivity(i);
        }
        if (viewId == R.id.eze32){
            i = new Intent(this, Eze32.class);
            startActivity(i);
        }
        if (viewId == R.id.eze33){
            i = new Intent(this, Eze33.class);
            startActivity(i);
        }
        if (viewId == R.id.eze34){
            i = new Intent(this, Eze34.class);
            startActivity(i);
        }
        if (viewId == R.id.eze35){
            i = new Intent(this, Eze35.class);
            startActivity(i);
        }
        if (viewId == R.id.eze36){
            i = new Intent(this, Eze36.class);
            startActivity(i);
        }
        if (viewId == R.id.eze37){
            i = new Intent(this, Eze37.class);
            startActivity(i);
        }
        if (viewId == R.id.eze38){
            i = new Intent(this, Eze38.class);
            startActivity(i);
        }
        if (viewId == R.id.eze39){
            i = new Intent(this, Eze39.class);
            startActivity(i);
        }
        if (viewId == R.id.eze40){
            i = new Intent(this, Eze40.class);
            startActivity(i);
        }
        if (viewId == R.id.eze41){
            i = new Intent(this, Eze41.class);
            startActivity(i);
        }
        if (viewId == R.id.eze42){
            i = new Intent(this, Eze42.class);
            startActivity(i);
        }
        if (viewId == R.id.eze43){
            i = new Intent(this, Eze43.class);
            startActivity(i);
        }
        if (viewId == R.id.eze44){
            i = new Intent(this, Eze44.class);
            startActivity(i);
        }
        if (viewId == R.id.eze45){
            i = new Intent(this, Eze45.class);
            startActivity(i);
        }
        if (viewId == R.id.eze46){
            i = new Intent(this, Eze46.class);
            startActivity(i);
        }
        if (viewId == R.id.eze47){
            i = new Intent(this, Eze47.class);
            startActivity(i);
        }
        if (viewId == R.id.eze48){
            i = new Intent(this, Eze48.class);
            startActivity(i);
        }
    }
}
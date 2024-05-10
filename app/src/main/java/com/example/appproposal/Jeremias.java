package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Jeremias extends AppCompatActivity implements View.OnClickListener{
    public CardView jer1, jer2, jer3, jer4, jer5, jer6, jer7, jer8, jer9, jer10,
            jer11, jer12, jer13, jer14, jer15,jer16, jer17, jer18, jer19, jer20,
            jer21, jer22, jer23, jer24, jer25, jer26, jer27, jer28, jer29, jer30,
            jer31, jer32, jer33, jer34, jer35, jer36, jer37, jer38, jer39, jer40,
            jer41, jer42, jer43, jer44, jer45, jer46, jer47, jer48, jer49, jer50,
            jer51, jer52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeremias);

        jer1 = (CardView) findViewById(R.id.jer1);
        jer2 = (CardView) findViewById(R.id.jer2);
        jer3 = (CardView) findViewById(R.id.jer3);
        jer4 = (CardView) findViewById(R.id.jer4);
        jer5 = (CardView) findViewById(R.id.jer5);
        jer6 = (CardView) findViewById(R.id.jer6);
        jer7 = (CardView) findViewById(R.id.jer7);
        jer8 = (CardView) findViewById(R.id.jer8);
        jer9 = (CardView) findViewById(R.id.jer9);
        jer10 = (CardView) findViewById(R.id.jer10);
        jer11 = (CardView) findViewById(R.id.jer11);
        jer12 = (CardView) findViewById(R.id.jer12);
        jer13 = (CardView) findViewById(R.id.jer13);
        jer14 = (CardView) findViewById(R.id.jer14);
        jer15 = (CardView) findViewById(R.id.jer15);
        jer16 = (CardView) findViewById(R.id.jer16);
        jer17 = (CardView) findViewById(R.id.jer17);
        jer18 = (CardView) findViewById(R.id.jer18);
        jer19 = (CardView) findViewById(R.id.jer19);
        jer20 = (CardView) findViewById(R.id.jer20);
        jer21 = (CardView) findViewById(R.id.jer21);
        jer22 = (CardView) findViewById(R.id.jer22);
        jer23 = (CardView) findViewById(R.id.jer23);
        jer24 = (CardView) findViewById(R.id.jer24);
        jer25 = (CardView) findViewById(R.id.jer25);
        jer26 = (CardView) findViewById(R.id.jer26);
        jer27 = (CardView) findViewById(R.id.jer27);
        jer28 = (CardView) findViewById(R.id.jer28);
        jer29 = (CardView) findViewById(R.id.jer29);
        jer30 = (CardView) findViewById(R.id.jer30);
        jer31 = (CardView) findViewById(R.id.jer31);
        jer32 = (CardView) findViewById(R.id.jer32);
        jer33 = (CardView) findViewById(R.id.jer33);
        jer34 = (CardView) findViewById(R.id.jer34);
        jer35 = (CardView) findViewById(R.id.jer35);
        jer36 = (CardView) findViewById(R.id.jer36);
        jer37 = (CardView) findViewById(R.id.jer37);
        jer38 = (CardView) findViewById(R.id.jer38);
        jer39 = (CardView) findViewById(R.id.jer39);
        jer40 = (CardView) findViewById(R.id.jer40);
        jer41 = (CardView) findViewById(R.id.jer41);
        jer42 = (CardView) findViewById(R.id.jer42);
        jer43 = (CardView) findViewById(R.id.jer43);
        jer44 = (CardView) findViewById(R.id.jer44);
        jer45 = (CardView) findViewById(R.id.jer45);
        jer46 = (CardView) findViewById(R.id.jer46);
        jer47 = (CardView) findViewById(R.id.jer47);
        jer48 = (CardView) findViewById(R.id.jer48);
        jer49 = (CardView) findViewById(R.id.jer49);
        jer50 = (CardView) findViewById(R.id.jer50);
        jer51 = (CardView) findViewById(R.id.jer51);
        jer52 = (CardView) findViewById(R.id.jer52);

        jer1.setOnClickListener(this);
        jer2.setOnClickListener(this);
        jer3.setOnClickListener(this);
        jer4.setOnClickListener(this);
        jer5.setOnClickListener(this);
        jer6.setOnClickListener(this);
        jer7.setOnClickListener(this);
        jer8.setOnClickListener(this);
        jer9.setOnClickListener(this);
        jer10.setOnClickListener(this);
        jer11.setOnClickListener(this);
        jer12.setOnClickListener(this);
        jer13.setOnClickListener(this);
        jer14.setOnClickListener(this);
        jer15.setOnClickListener(this);
        jer16.setOnClickListener(this);
        jer17.setOnClickListener(this);
        jer18.setOnClickListener(this);
        jer19.setOnClickListener(this);
        jer20.setOnClickListener(this);
        jer21.setOnClickListener(this);
        jer22.setOnClickListener(this);
        jer23.setOnClickListener(this);
        jer24.setOnClickListener(this);
        jer25.setOnClickListener(this);
        jer26.setOnClickListener(this);
        jer27.setOnClickListener(this);
        jer28.setOnClickListener(this);
        jer29.setOnClickListener(this);
        jer30.setOnClickListener(this);
        jer31.setOnClickListener(this);
        jer32.setOnClickListener(this);
        jer33.setOnClickListener(this);
        jer34.setOnClickListener(this);
        jer35.setOnClickListener(this);
        jer36.setOnClickListener(this);
        jer37.setOnClickListener(this);
        jer38.setOnClickListener(this);
        jer39.setOnClickListener(this);
        jer40.setOnClickListener(this);
        jer41.setOnClickListener(this);
        jer42.setOnClickListener(this);
        jer43.setOnClickListener(this);
        jer44.setOnClickListener(this);
        jer45.setOnClickListener(this);
        jer46.setOnClickListener(this);
        jer47.setOnClickListener(this);
        jer48.setOnClickListener(this);
        jer49.setOnClickListener(this);
        jer50.setOnClickListener(this);
        jer51.setOnClickListener(this);
        jer52.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.jer1){
            i = new Intent(this, Jer1.class);
            startActivity(i);
        }
        if (viewId == R.id.jer2){
            i = new Intent(this, Jer2.class);
            startActivity(i);
        }
        if (viewId == R.id.jer3){
            i = new Intent(this, Jer3.class);
            startActivity(i);
        }
        if (viewId == R.id.jer4){
            i = new Intent(this, Jer4.class);
            startActivity(i);
        }
        if (viewId == R.id.jer5){
            i = new Intent(this, Jer5.class);
            startActivity(i);
        }
        if (viewId == R.id.jer6){
            i = new Intent(this, Jer6.class);
            startActivity(i);
        }
        if (viewId == R.id.jer7){
            i = new Intent(this, Jer7.class);
            startActivity(i);
        }
        if (viewId == R.id.jer8){
            i = new Intent(this, Jer8.class);
            startActivity(i);
        }
        if (viewId == R.id.jer9){
            i = new Intent(this, Jer9.class);
            startActivity(i);
        }
        if (viewId == R.id.jer10){
            i = new Intent(this, Jer10.class);
            startActivity(i);
        }
        if (viewId == R.id.jer11){
            i = new Intent(this, Jer11.class);
            startActivity(i);
        }
        if (viewId == R.id.jer12){
            i = new Intent(this, Jer12.class);
            startActivity(i);
        }
        if (viewId == R.id.jer13){
            i = new Intent(this, Jer13.class);
            startActivity(i);
        }
        if (viewId == R.id.jer14){
            i = new Intent(this, Jer14.class);
            startActivity(i);
        }
        if (viewId == R.id.jer15){
            i = new Intent(this, Jer15.class);
            startActivity(i);
        }
        if (viewId == R.id.jer16){
            i = new Intent(this, Jer16.class);
            startActivity(i);
        }
        if (viewId == R.id.jer17){
            i = new Intent(this, Jer17.class);
            startActivity(i);
        }
        if (viewId == R.id.jer18){
            i = new Intent(this, Jer18.class);
            startActivity(i);
        }
        if (viewId == R.id.jer19){
            i = new Intent(this, Jer19.class);
            startActivity(i);
        }
        if (viewId == R.id.is20){
            i = new Intent(this, Jer20.class);
            startActivity(i);
        }

        if (viewId == R.id.jer21){
            i = new Intent(this, Jer21.class);
            startActivity(i);
        }
        if (viewId == R.id.jer22){
            i = new Intent(this, Jer22.class);
            startActivity(i);
        }
        if (viewId == R.id.jer23){
            i = new Intent(this, Jer23.class);
            startActivity(i);
        }
        if (viewId == R.id.jer24){
            i = new Intent(this, Jer24.class);
            startActivity(i);
        }
        if (viewId == R.id.jer25){
            i = new Intent(this, Jer25.class);
            startActivity(i);
        }
        if (viewId == R.id.jer26){
            i = new Intent(this, Jer26.class);
            startActivity(i);
        }
        if (viewId == R.id.jer27){
            i = new Intent(this, Jer27.class);
            startActivity(i);
        }
        if (viewId == R.id.jer28){
            i = new Intent(this, Jer28.class);
            startActivity(i);
        }
        if (viewId == R.id.jer29){
            i = new Intent(this, Jer29.class);
            startActivity(i);
        }
        if (viewId == R.id.jer30){
            i = new Intent(this, Jer30.class);
            startActivity(i);
        }

        if (viewId == R.id.jer31){
            i = new Intent(this, Jer31.class);
            startActivity(i);
        }
        if (viewId == R.id.jer32){
            i = new Intent(this, Jer32.class);
            startActivity(i);
        }
        if (viewId == R.id.jer33){
            i = new Intent(this, Jer33.class);
            startActivity(i);
        }
        if (viewId == R.id.jer34){
            i = new Intent(this, Jer34.class);
            startActivity(i);
        }
        if (viewId == R.id.jer35){
            i = new Intent(this, Jer35.class);
            startActivity(i);
        }
        if (viewId == R.id.jer36){
            i = new Intent(this, Jer36.class);
            startActivity(i);
        }
        if (viewId == R.id.jer37){
            i = new Intent(this, Jer37.class);
            startActivity(i);
        }
        if (viewId == R.id.jer38){
            i = new Intent(this, Jer38.class);
            startActivity(i);
        }
        if (viewId == R.id.jer39){
            i = new Intent(this, Jer39.class);
            startActivity(i);
        }
        if (viewId == R.id.jer40){
            i = new Intent(this, Jer40.class);
            startActivity(i);
        }
        if (viewId == R.id.jer41){
            i = new Intent(this, Jer41.class);
            startActivity(i);
        }
        if (viewId == R.id.jer42){
            i = new Intent(this, Jer42.class);
            startActivity(i);
        }
        if (viewId == R.id.jer43){
            i = new Intent(this, Jer43.class);
            startActivity(i);
        }
        if (viewId == R.id.jer44){
            i = new Intent(this, Jer44.class);
            startActivity(i);
        }
        if (viewId == R.id.jer45){
            i = new Intent(this, Jer45.class);
            startActivity(i);
        }
        if (viewId == R.id.jer46){
            i = new Intent(this, Jer46.class);
            startActivity(i);
        }
        if (viewId == R.id.jer47){
            i = new Intent(this, Jer47.class);
            startActivity(i);
        }
        if (viewId == R.id.jer48){
            i = new Intent(this, Jer48.class);
            startActivity(i);
        }
        if (viewId == R.id.jer49){
            i = new Intent(this, Jer49.class);
            startActivity(i);
        }
        if (viewId == R.id.jer50){
            i = new Intent(this, Jer50.class);
            startActivity(i);
        }
        if (viewId == R.id.jer51){
            i = new Intent(this, Jer51.class);
            startActivity(i);
        }
        if (viewId == R.id.jer52){
            i = new Intent(this, Jer52.class);
            startActivity(i);
        }
    }
}
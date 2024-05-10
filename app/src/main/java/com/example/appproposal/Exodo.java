package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Exodo extends AppCompatActivity implements View.OnClickListener{
    public CardView exo1, exo2, exo3, exo4, exo5, exo6, exo7, exo8, exo9, exo10,
            exo11, exo12, exo13, exo14, exo15, exo16, exo17, exo18, exo19, exo20,
            exo21, exo22, exo23, exo24, exo25, exo26, exo27, exo28, exo29, exo30,
            exo31, exo32, exo33, exo34, exo35, exo36, exo37, exo38, exo39, exo40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exodo);

        exo1 = (CardView) findViewById(R.id.exo1);
        exo2 = (CardView) findViewById(R.id.exo2);
        exo3 = (CardView) findViewById(R.id.exo3);
        exo4 = (CardView) findViewById(R.id.exo4);
        exo5 = (CardView) findViewById(R.id.exo5);
        exo6 = (CardView) findViewById(R.id.exo6);
        exo7 = (CardView) findViewById(R.id.exo7);
        exo8 = (CardView) findViewById(R.id.exo8);
        exo9 = (CardView) findViewById(R.id.exo9);
        exo10 = (CardView) findViewById(R.id.exo10);
        exo11 = (CardView) findViewById(R.id.exo11);
        exo12 = (CardView) findViewById(R.id.exo12);
        exo13 = (CardView) findViewById(R.id.exo13);
        exo14 = (CardView) findViewById(R.id.exo14);
        exo15 = (CardView) findViewById(R.id.exo15);
        exo16 = (CardView) findViewById(R.id.exo16);
        exo17 = (CardView) findViewById(R.id.exo17);
        exo18 = (CardView) findViewById(R.id.exo18);
        exo19 = (CardView) findViewById(R.id.exo19);
        exo20 = (CardView) findViewById(R.id.exo20);
        exo21 = (CardView) findViewById(R.id.exo21);
        exo22 = (CardView) findViewById(R.id.exo22);
        exo23 = (CardView) findViewById(R.id.exo23);
        exo24 = (CardView) findViewById(R.id.exo24);
        exo25 = (CardView) findViewById(R.id.exo25);
        exo26 = (CardView) findViewById(R.id.exo26);
        exo27 = (CardView) findViewById(R.id.exo27);
        exo28 = (CardView) findViewById(R.id.exo28);
        exo29 = (CardView) findViewById(R.id.exo29);
        exo30 = (CardView) findViewById(R.id.exo30);
        exo31 = (CardView) findViewById(R.id.exo31);
        exo32 = (CardView) findViewById(R.id.exo32);
        exo33 = (CardView) findViewById(R.id.exo33);
        exo34 = (CardView) findViewById(R.id.exo34);
        exo35 = (CardView) findViewById(R.id.exo35);
        exo36 = (CardView) findViewById(R.id.exo36);
        exo37 = (CardView) findViewById(R.id.exo37);
        exo38 = (CardView) findViewById(R.id.exo38);
        exo39 = (CardView) findViewById(R.id.exo39);
        exo40 = (CardView) findViewById(R.id.exo40);

        exo1.setOnClickListener(this);
        exo2.setOnClickListener(this);
        exo3.setOnClickListener(this);
        exo4.setOnClickListener(this);
        exo5.setOnClickListener(this);
        exo6.setOnClickListener(this);
        exo7.setOnClickListener(this);
        exo8.setOnClickListener(this);
        exo9.setOnClickListener(this);
        exo10.setOnClickListener(this);
        exo11.setOnClickListener(this);
        exo12.setOnClickListener(this);
        exo13.setOnClickListener(this);
        exo14.setOnClickListener(this);
        exo15.setOnClickListener(this);
        exo16.setOnClickListener(this);
        exo17.setOnClickListener(this);
        exo18.setOnClickListener(this);
        exo19.setOnClickListener(this);
        exo20.setOnClickListener(this);
        exo21.setOnClickListener(this);
        exo22.setOnClickListener(this);
        exo23.setOnClickListener(this);
        exo24.setOnClickListener(this);
        exo25.setOnClickListener(this);
        exo26.setOnClickListener(this);
        exo27.setOnClickListener(this);
        exo28.setOnClickListener(this);
        exo29.setOnClickListener(this);
        exo30.setOnClickListener(this);
        exo31.setOnClickListener(this);
        exo32.setOnClickListener(this);
        exo33.setOnClickListener(this);
        exo34.setOnClickListener(this);
        exo35.setOnClickListener(this);
        exo36.setOnClickListener(this);
        exo37.setOnClickListener(this);
        exo38.setOnClickListener(this);
        exo39.setOnClickListener(this);
        exo40.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.exo1){
            i = new Intent(this, Exo1.class);
            startActivity(i);
        }
        if (viewId == R.id.exo2){
            i = new Intent(this, Exo2.class);
            startActivity(i);
        }
        if (viewId == R.id.exo3){
            i = new Intent(this, Exo3.class);
            startActivity(i);
        }
        if (viewId == R.id.exo4){
            i = new Intent(this, Exo4.class);
            startActivity(i);
        }
        if (viewId == R.id.exo5){
            i = new Intent(this, Exo5.class);
            startActivity(i);
        }
        if (viewId == R.id.exo6){
            i = new Intent(this, Exo6.class);
            startActivity(i);
        }
        if (viewId == R.id.exo7){
            i = new Intent(this, Exo7.class);
            startActivity(i);
        }
        if (viewId == R.id.exo8){
            i = new Intent(this, Exo8.class);
            startActivity(i);
        }
        if (viewId == R.id.exo9){
            i = new Intent(this, Exo9.class);
            startActivity(i);
        }
        if (viewId == R.id.exo10){
            i = new Intent(this, Exo10.class);
            startActivity(i);
        }
        if (viewId == R.id.exo11){
            i = new Intent(this, Exo11.class);
            startActivity(i);
        }
        if (viewId == R.id.exo12){
            i = new Intent(this, Exo12.class);
            startActivity(i);
        }
        if (viewId == R.id.exo13){
            i = new Intent(this, Exo13.class);
            startActivity(i);
        }
        if (viewId == R.id.exo14){
            i = new Intent(this, Exo14.class);
            startActivity(i);
        }
        if (viewId == R.id.exo15){
            i = new Intent(this, Exo15.class);
            startActivity(i);
        }
        if (viewId == R.id.exo16){
            i = new Intent(this, Exo16.class);
            startActivity(i);
        }
        if (viewId == R.id.exo17){
            i = new Intent(this, Exo17.class);
            startActivity(i);
        }
        if (viewId == R.id.exo18){
            i = new Intent(this, Exo18.class);
            startActivity(i);
        }
        if (viewId == R.id.exo19){
            i = new Intent(this, Exo19.class);
            startActivity(i);
        }
        if (viewId == R.id.exo20){
            i = new Intent(this, Exo20.class);
            startActivity(i);
        }
        if (viewId == R.id.exo21){
            i = new Intent(this, Exo21.class);
            startActivity(i);
        }
        if (viewId == R.id.exo22){
            i = new Intent(this, Exo22.class);
            startActivity(i);
        }
        if (viewId == R.id.exo23){
            i = new Intent(this, Exo23.class);
            startActivity(i);
        }
        if (viewId == R.id.exo24){
            i = new Intent(this, Exo24.class);
            startActivity(i);
        }
        if (viewId == R.id.exo25){
            i = new Intent(this, Exo25.class);
            startActivity(i);
        }
        if (viewId == R.id.exo26){
            i = new Intent(this, Exo26.class);
            startActivity(i);
        }
        if (viewId == R.id.exo27){
            i = new Intent(this, Exo27.class);
            startActivity(i);
        }
        if (viewId == R.id.exo28){
            i = new Intent(this, Exo28.class);
            startActivity(i);
        }
        if (viewId == R.id.exo29){
            i = new Intent(this, Exo29.class);
            startActivity(i);
        }
        if (viewId == R.id.exo30){
            i = new Intent(this, Exo30.class);
            startActivity(i);
        }
        if (viewId == R.id.exo31){
            i = new Intent(this, Exo31.class);
            startActivity(i);
        }
        if (viewId == R.id.exo32){
            i = new Intent(this, Exo32.class);
            startActivity(i);
        }
        if (viewId == R.id.exo33){
            i = new Intent(this, Exo33.class);
            startActivity(i);
        }
        if (viewId == R.id.exo34){
            i = new Intent(this, Exo34.class);
            startActivity(i);
        }
        if (viewId == R.id.exo35){
            i = new Intent(this, Exo35.class);
            startActivity(i);
        }
        if (viewId == R.id.exo36){
            i = new Intent(this, Exo36.class);
            startActivity(i);
        }
        if (viewId == R.id.exo37){
            i = new Intent(this, Exo37.class);
            startActivity(i);
        }
        if (viewId == R.id.exo38){
            i = new Intent(this, Exo38.class);
            startActivity(i);
        }
        if (viewId == R.id.exo39){
            i = new Intent(this, Exo39.class);
            startActivity(i);
        }
        if (viewId == R.id.exo40){
            i = new Intent(this, Exo40.class);
            startActivity(i);
        }
    }
}
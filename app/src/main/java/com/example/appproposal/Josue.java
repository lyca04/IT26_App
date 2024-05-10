package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Josue extends AppCompatActivity implements View.OnClickListener{
    public CardView jos1, jos2, jos3, jos4, jos5, jos6, jos7, jos8, jos9, jos10,
            jos11, jos12, jos13, jos14, jos15, jos16, jos17, jos18, jos19, jos20,
            jos21, jos22, jos23, jos24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_josue);

        jos1 = (CardView) findViewById(R.id.jos1);
        jos2 = (CardView) findViewById(R.id.jos2);
        jos3 = (CardView) findViewById(R.id.jos3);
        jos4 = (CardView) findViewById(R.id.jos4);
        jos5 = (CardView) findViewById(R.id.jos5);
        jos6 = (CardView) findViewById(R.id.jos6);
        jos7 = (CardView) findViewById(R.id.jos7);
        jos8 = (CardView) findViewById(R.id.jos8);
        jos9 = (CardView) findViewById(R.id.jos9);
        jos10 = (CardView) findViewById(R.id.jos10);
        jos11 = (CardView) findViewById(R.id.jos11);
        jos12 = (CardView) findViewById(R.id.jos12);
        jos13 = (CardView) findViewById(R.id.jos13);
        jos14 = (CardView) findViewById(R.id.jos14);
        jos15 = (CardView) findViewById(R.id.jos15);
        jos16 = (CardView) findViewById(R.id.jos16);
        jos17 = (CardView) findViewById(R.id.jos17);
        jos18 = (CardView) findViewById(R.id.jos18);
        jos19 = (CardView) findViewById(R.id.jos19);
        jos20 = (CardView) findViewById(R.id.jos20);
        jos21 = (CardView) findViewById(R.id.jos21);
        jos22 = (CardView) findViewById(R.id.jos22);
        jos23 = (CardView) findViewById(R.id.jos23);
        jos24 = (CardView) findViewById(R.id.jos24);

        jos1.setOnClickListener(this);
        jos2.setOnClickListener(this);
        jos3.setOnClickListener(this);
        jos4.setOnClickListener(this);
        jos5.setOnClickListener(this);
        jos6.setOnClickListener(this);
        jos7.setOnClickListener(this);
        jos8.setOnClickListener(this);
        jos9.setOnClickListener(this);
        jos10.setOnClickListener(this);
        jos11.setOnClickListener(this);
        jos12.setOnClickListener(this);
        jos13.setOnClickListener(this);
        jos14.setOnClickListener(this);
        jos15.setOnClickListener(this);
        jos16.setOnClickListener(this);
        jos17.setOnClickListener(this);
        jos18.setOnClickListener(this);
        jos19.setOnClickListener(this);
        jos20.setOnClickListener(this);
        jos21.setOnClickListener(this);
        jos22.setOnClickListener(this);
        jos23.setOnClickListener(this);
        jos24.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.jos1){
            i = new Intent(this, Jos1.class);
            startActivity(i);
        }
        if (viewId == R.id.jos2){
            i = new Intent(this, Jos2.class);
            startActivity(i);
        }
        if (viewId == R.id.jos3){
            i = new Intent(this, Jos3.class);
            startActivity(i);
        }
        if (viewId == R.id.jos4){
            i = new Intent(this, Jos4.class);
            startActivity(i);
        }
        if (viewId == R.id.jos5){
            i = new Intent(this, Jos5.class);
            startActivity(i);
        }
        if (viewId == R.id.jos6){
            i = new Intent(this, Jos6.class);
            startActivity(i);
        }
        if (viewId == R.id.jos7){
            i = new Intent(this, Jos7.class);
            startActivity(i);
        }
        if (viewId == R.id.jos8){
            i = new Intent(this, Jos8.class);
            startActivity(i);
        }
        if (viewId == R.id.jos9){
            i = new Intent(this, Jos9.class);
            startActivity(i);
        }
        if (viewId == R.id.jos10){
            i = new Intent(this, Jos10.class);
            startActivity(i);
        }
        if (viewId == R.id.jos11){
            i = new Intent(this, Jos11.class);
            startActivity(i);
        }
        if (viewId == R.id.jos12){
            i = new Intent(this, Jos12.class);
            startActivity(i);
        }
        if (viewId == R.id.jos13){
            i = new Intent(this, Jos13.class);
            startActivity(i);
        }
        if (viewId == R.id.jos14){
            i = new Intent(this, Jos14.class);
            startActivity(i);
        }
        if (viewId == R.id.jos15){
            i = new Intent(this, Jos15.class);
            startActivity(i);
        }
        if (viewId == R.id.jos16){
            i = new Intent(this, Jos16.class);
            startActivity(i);
        }
        if (viewId == R.id.jos17){
            i = new Intent(this, Jos17.class);
            startActivity(i);
        }
        if (viewId == R.id.jos18){
            i = new Intent(this, Jos18.class);
            startActivity(i);
        }
        if (viewId == R.id.jos19){
            i = new Intent(this, Jos19.class);
            startActivity(i);
        }
        if (viewId == R.id.jos20){
            i = new Intent(this, Jos20.class);
            startActivity(i);
        }
        if (viewId == R.id.jos21){
            i = new Intent(this, Jos21.class);
            startActivity(i);
        }
        if (viewId == R.id.jos22){
            i = new Intent(this, Jos22.class);
            startActivity(i);
        }
        if (viewId == R.id.jos23){
            i = new Intent(this, Jos23.class);
            startActivity(i);
        }
        if (viewId == R.id.jos24){
            i = new Intent(this, Jos24.class);
            startActivity(i);
        }
    }
}
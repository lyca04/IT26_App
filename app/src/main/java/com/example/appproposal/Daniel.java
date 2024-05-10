package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Daniel extends AppCompatActivity implements View.OnClickListener{
    public CardView dan1, dan2, dan3, dan4, dan5, dan6, dan7, dan8, dan9,  dan10, dan11, dan12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daniel);

        dan1 = (CardView) findViewById(R.id.dan1);
        dan2 = (CardView) findViewById(R.id.dan2);
        dan3 = (CardView) findViewById(R.id.dan3);
        dan4 = (CardView) findViewById(R.id.dan4);
        dan5 = (CardView) findViewById(R.id.dan5);
        dan6 = (CardView) findViewById(R.id.dan6);
        dan7 = (CardView) findViewById(R.id.dan7);
        dan8 = (CardView) findViewById(R.id.dan8);
        dan9 = (CardView) findViewById(R.id.dan9);
        dan10 = (CardView) findViewById(R.id.dan10);
        dan11 = (CardView) findViewById(R.id.dan11);
        dan12 = (CardView) findViewById(R.id.dan12);

        dan1.setOnClickListener(this);
        dan2.setOnClickListener(this);
        dan3.setOnClickListener(this);
        dan4.setOnClickListener(this);
        dan5.setOnClickListener(this);
        dan6.setOnClickListener(this);
        dan7.setOnClickListener(this);
        dan8.setOnClickListener(this);
        dan9.setOnClickListener(this);
        dan10.setOnClickListener(this);
        dan11.setOnClickListener(this);
        dan12.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id. dan1){
            i = new Intent(this, Dan1.class);
            startActivity(i);
        }
        if (viewId == R.id. dan2){
            i = new Intent(this, Dan2.class);
            startActivity(i);
        }
        if (viewId == R.id. dan3){
            i = new Intent(this, Dan3.class);
            startActivity(i);
        }
        if (viewId == R.id. dan4){
            i = new Intent(this, Dan4.class);
            startActivity(i);
        }
        if (viewId == R.id. dan5){
            i = new Intent(this, Dan5.class);
            startActivity(i);
        }
        if (viewId == R.id. dan6){
            i = new Intent(this, Dan6.class);
            startActivity(i);
        }
        if (viewId == R.id. dan7){
            i = new Intent(this, Dan7.class);
            startActivity(i);
        }
        if (viewId == R.id. dan8){
            i = new Intent(this, Dan8.class);
            startActivity(i);
        }
        if (viewId == R.id. dan9){
            i = new Intent(this, Dan9.class);
            startActivity(i);
        }
        if (viewId == R.id. dan10){
            i = new Intent(this, Dan10.class);
            startActivity(i);
        }
        if (viewId == R.id. dan11){
            i = new Intent(this, Dan11.class);
            startActivity(i);
        }
        if (viewId == R.id. dan12){
            i = new Intent(this, Dan12.class);
            startActivity(i);
        }
    }
}
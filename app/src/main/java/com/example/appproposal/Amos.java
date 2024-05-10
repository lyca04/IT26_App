package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Amos extends AppCompatActivity implements View.OnClickListener{
    public CardView amos1, amos2, amos3, amos4, amos5, amos6, amos7,amos8,amos9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amos);

        amos1 = (CardView) findViewById(R.id.amos1);
        amos2 = (CardView) findViewById(R.id.amos2);
        amos3 = (CardView) findViewById(R.id.amos3);
        amos4 = (CardView) findViewById(R.id.amos4);
        amos5 = (CardView) findViewById(R.id.amos5);
        amos6 = (CardView) findViewById(R.id.amos6);
        amos7 = (CardView) findViewById(R.id.amos7);
        amos8 = (CardView) findViewById(R.id.amos8);
        amos9 = (CardView) findViewById(R.id.amos9);

        amos1.setOnClickListener(this);
        amos2.setOnClickListener(this);
        amos3.setOnClickListener(this);
        amos4.setOnClickListener(this);
        amos5.setOnClickListener(this);
        amos6.setOnClickListener(this);
        amos7.setOnClickListener(this);
        amos8.setOnClickListener(this);
        amos9.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id. amos1){
            i = new Intent(this, Amos1.class);
            startActivity(i);
        }
        if (viewId == R.id. amos2){
            i = new Intent(this, Amos2.class);
            startActivity(i);
        }
        if (viewId == R.id. amos3){
            i = new Intent(this, Amos3.class);
            startActivity(i);
        }
        if (viewId == R.id. amos4){
            i = new Intent(this, Amos4.class);
            startActivity(i);
        }
        if (viewId == R.id. amos5){
            i = new Intent(this, Amos5.class);
            startActivity(i);
        }
        if (viewId == R.id. amos6){
            i = new Intent(this, Amos6.class);
            startActivity(i);
        }
        if (viewId == R.id. amos7){
            i = new Intent(this, Amos7.class);
            startActivity(i);
        }
        if (viewId == R.id. amos8){
            i = new Intent(this, Amos8.class);
            startActivity(i);
        }
        if (viewId == R.id. amos9){
            i = new Intent(this, Amos9.class);
            startActivity(i);
        }
    }
}
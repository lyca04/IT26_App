package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Sofonias extends AppCompatActivity implements View.OnClickListener{
    public CardView sof1, sof2, sof3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sofonias);

        sof1 = (CardView) findViewById(R.id.sof1);
        sof2 = (CardView) findViewById(R.id.sof2);
        sof3 = (CardView) findViewById(R.id.sof3);

        sof1.setOnClickListener(this);
        sof2.setOnClickListener(this);
        sof3.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.sof1){
            i = new Intent(this, Sof1.class);
            startActivity(i);
        }
        if (viewId == R.id.sof2){
            i = new Intent(this, Sof2.class);
            startActivity(i);
        }
        if (viewId == R.id.sof3){
            i = new Intent(this, Sof3.class);
            startActivity(i);
        }
    }
}
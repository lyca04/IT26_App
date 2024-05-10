package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Malaquias extends AppCompatActivity implements View.OnClickListener{
    public CardView mal1, mal2, mal3, mal4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malaquias);

        mal1 = (CardView) findViewById(R.id.mal1);
        mal2 = (CardView) findViewById(R.id.mal2);
        mal3 = (CardView) findViewById(R.id.mal3);
        mal4 = (CardView) findViewById(R.id.mal4);

        mal1.setOnClickListener(this);
        mal2.setOnClickListener(this);
        mal3.setOnClickListener(this);
        mal4.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.mal1){
            i = new Intent(this, Mal1.class);
            startActivity(i);
        }
        if (viewId == R.id.mal2){
            i = new Intent(this, Mal2.class);
            startActivity(i);
        }
        if (viewId == R.id.mal3){
            i = new Intent(this, Mal3.class);
            startActivity(i);
        }
        if (viewId == R.id.mal4){
            i = new Intent(this, Mal3.class);
            startActivity(i);
        }
    }
}
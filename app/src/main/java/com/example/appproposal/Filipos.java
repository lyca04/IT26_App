package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Filipos extends AppCompatActivity implements View.OnClickListener{
    public CardView fil1, fil2, fil3, fil4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filipos);

        fil1 = (CardView) findViewById(R.id.fil1);
        fil2 = (CardView) findViewById(R.id.fil2);
        fil3 = (CardView) findViewById(R.id.fil3);
        fil4 = (CardView) findViewById(R.id.fil4);

        fil1.setOnClickListener(this);
        fil2.setOnClickListener(this);
        fil3.setOnClickListener(this);
        fil4.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.fil1){
            i = new Intent(this, Fil1.class);
            startActivity(i);
        }
        if (viewId == R.id.fil2){
            i = new Intent(this, Fil2.class);
            startActivity(i);
        }
        if (viewId == R.id.fil3){
            i = new Intent(this, Fil3.class);
            startActivity(i);
        }
        if (viewId == R.id.fil4){
            i = new Intent(this, Fil4.class);
            startActivity(i);
        }
    }
}
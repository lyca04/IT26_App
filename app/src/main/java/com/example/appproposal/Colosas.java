package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Colosas extends AppCompatActivity implements View.OnClickListener{
    public CardView col1, col2, col3, col4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colosas);

        col1 = (CardView) findViewById(R.id.col1);
        col2 = (CardView) findViewById(R.id.col2);
        col3 = (CardView) findViewById(R.id.col3);
        col4 = (CardView) findViewById(R.id.col4);

        col1.setOnClickListener(this);
        col2.setOnClickListener(this);
        col3.setOnClickListener(this);
        col4.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.col1){
            i = new Intent(this, Col1.class);
            startActivity(i);
        }
        if (viewId == R.id.col2){
            i = new Intent(this, Col2.class);
            startActivity(i);
        }
        if (viewId == R.id.col3){
            i = new Intent(this, Col3.class);
            startActivity(i);
        }
        if (viewId == R.id.col4){
            i = new Intent(this, Col4.class);
            startActivity(i);
        }
    }
}
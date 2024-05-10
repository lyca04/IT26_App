package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Nahum extends AppCompatActivity implements View.OnClickListener{
    public CardView nah1, nah2, nah3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nahum);

        nah1 = (CardView) findViewById(R.id.nah1);
        nah2 = (CardView) findViewById(R.id.nah2);
        nah3 = (CardView) findViewById(R.id.nah3);

        nah1.setOnClickListener(this);
        nah2.setOnClickListener(this);
        nah3.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.nah1){
            i = new Intent(this, Nah1.class);
            startActivity(i);
        }
        if (viewId == R.id.nah2){
            i = new Intent(this, Nah2.class);
            startActivity(i);
        }
        if (viewId == R.id.nah3){
            i = new Intent(this, Nah3.class);
            startActivity(i);
        }
    }
}
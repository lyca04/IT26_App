package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tito extends AppCompatActivity implements View.OnClickListener{
    public CardView tito1, tito2, tito3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tito);

        tito1 = (CardView) findViewById(R.id.tito1);
        tito2 = (CardView) findViewById(R.id.tito2);
        tito3 = (CardView) findViewById(R.id.tito3);

        tito1.setOnClickListener(this);
        tito2.setOnClickListener(this);
        tito3.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.tito1){
            i = new Intent(this, Tito1.class);
            startActivity(i);
        }
        if (viewId == R.id.tito2){
            i = new Intent(this, Tito2.class);
            startActivity(i);
        }
        if (viewId == R.id.tito3){
            i = new Intent(this, Tito3.class);
            startActivity(i);
        }
    }
}
package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Joel extends AppCompatActivity implements View.OnClickListener{
    public CardView joel1, joel2, joel3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joel);

        joel1 = (CardView) findViewById(R.id.joel1);
        joel2 = (CardView) findViewById(R.id.joel2);
        joel3 = (CardView) findViewById(R.id.joel3);

        joel1.setOnClickListener(this);
        joel2.setOnClickListener(this);
        joel3.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.joel1){
            i = new Intent(this, Joel1.class);
            startActivity(i);
        }
        if (viewId == R.id.joel2){
            i = new Intent(this, Joel2.class);
            startActivity(i);
        }
        if (viewId == R.id.joel3){
            i = new Intent(this, Joel3.class);
            startActivity(i);
        }
    }
}
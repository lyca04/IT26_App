package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Habacuc extends AppCompatActivity implements View.OnClickListener{
    public CardView hab1, hab2, hab3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habacuc);

        hab1 = (CardView) findViewById(R.id.hab1);
        hab2 = (CardView) findViewById(R.id.hab2);
        hab3 = (CardView) findViewById(R.id.hab3);

        hab1.setOnClickListener(this);
        hab2.setOnClickListener(this);
        hab3.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.hab1){
            i = new Intent(this, Hab1.class);
            startActivity(i);
        }
        if (viewId == R.id.hab2){
            i = new Intent(this, Hab2.class);
            startActivity(i);
        }
        if (viewId == R.id.hab3){
            i = new Intent(this, Hab3.class);
            startActivity(i);
        }
    }
}
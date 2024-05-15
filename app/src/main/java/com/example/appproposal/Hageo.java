package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Hageo extends AppCompatActivity implements View.OnClickListener{
    public CardView hag1, hag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hageo);

        hag1 = (CardView) findViewById(R.id.hag1);
        hag2 = (CardView) findViewById(R.id.hag2);

        hag1.setOnClickListener(this);
        hag2.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.hag1){
            i = new Intent(this, Hag1.class);
            startActivity(i);
        }
        if (viewId == R.id.hag2){
            i = new Intent(this, Hag2.class);
            startActivity(i);
        }
    }
}
package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Awit extends AppCompatActivity implements View.OnClickListener{
    public CardView awit1, awit2, awit3, awit4, awit5, awit6, awit7,awit8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awit);

        awit1 = (CardView) findViewById(R.id.awit1);
        awit2 = (CardView) findViewById(R.id.awit2);
        awit3 = (CardView) findViewById(R.id.awit3);
        awit4 = (CardView) findViewById(R.id.awit4);
        awit5 = (CardView) findViewById(R.id.awit5);
        awit6 = (CardView) findViewById(R.id.awit6);
        awit7 = (CardView) findViewById(R.id.awit7);
        awit8 = (CardView) findViewById(R.id.awit8);

        awit1.setOnClickListener(this);
        awit2.setOnClickListener(this);
        awit3.setOnClickListener(this);
        awit4.setOnClickListener(this);
        awit5.setOnClickListener(this);
        awit6.setOnClickListener(this);
        awit7.setOnClickListener(this);
        awit8.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id. awit1){
            i = new Intent(this, Awit1.class);
            startActivity(i);
        }
        if (viewId == R.id. awit2){
            i = new Intent(this, Awit2.class);
            startActivity(i);
        }
        if (viewId == R.id. awit3){
            i = new Intent(this, Awit3.class);
            startActivity(i);
        }
        if (viewId == R.id. awit4){
            i = new Intent(this, Awit4.class);
            startActivity(i);
        }
        if (viewId == R.id. awit5){
            i = new Intent(this, Awit5.class);
            startActivity(i);
        }
        if (viewId == R.id. awit6){
            i = new Intent(this, Awit6.class);
            startActivity(i);
        }
        if (viewId == R.id. awit7){
            i = new Intent(this, Awit7.class);
            startActivity(i);
        }
        if (viewId == R.id. awit8){
            i = new Intent(this, Awit8.class);
            startActivity(i);
        }
    }
}
package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Jonas extends AppCompatActivity implements View.OnClickListener{
    public CardView jon1, jon2, jon3, jon4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jonas);

        jon1 = (CardView) findViewById(R.id.jon1);
        jon2 = (CardView) findViewById(R.id.jon2);
        jon3 = (CardView) findViewById(R.id.jon3);
        jon4 = (CardView) findViewById(R.id.jon4);

        jon1.setOnClickListener(this);
        jon2.setOnClickListener(this);
        jon3.setOnClickListener(this);
        jon4.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.jon1){
            i = new Intent(this, Jon1.class);
            startActivity(i);
        }
        if (viewId == R.id.jon2){
            i = new Intent(this, Jon2.class);
            startActivity(i);
        }
        if (viewId == R.id.jon3){
            i = new Intent(this, Jon3.class);
            startActivity(i);
        }
        if (viewId == R.id.jon4){
            i = new Intent(this, Jon4.class);
            startActivity(i);
        }
    }
}
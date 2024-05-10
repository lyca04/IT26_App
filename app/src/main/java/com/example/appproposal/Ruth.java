package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Ruth extends AppCompatActivity implements View.OnClickListener{
    public CardView ruth1, ruth2, ruth3, ruth4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruth);

        ruth1 = (CardView) findViewById(R.id.ruth1);
        ruth2 = (CardView) findViewById(R.id.ruth2);
        ruth3 = (CardView) findViewById(R.id.ruth3);
        ruth4 = (CardView) findViewById(R.id.ruth4);

        ruth1.setOnClickListener(this);
        ruth2.setOnClickListener(this);
        ruth3.setOnClickListener(this);
        ruth4.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.ruth1){
            i = new Intent(this, Ruth1.class);
            startActivity(i);
        }
        if (viewId == R.id.ruth2){
            i = new Intent(this, Ruth2.class);
            startActivity(i);
        }
        if (viewId == R.id.ruth3){
            i = new Intent(this, Ruth3.class);
            startActivity(i);
        }
        if (viewId == R.id.ruth4){
            i = new Intent(this, Ruth4.class);
            startActivity(i);
        }
    }
}
package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Santiago extends AppCompatActivity implements View.OnClickListener{
    public CardView san1, san2, san3, san4, san5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santiago);

        san1 = (CardView) findViewById(R.id.san1);
        san2 = (CardView) findViewById(R.id.san2);
        san3 = (CardView) findViewById(R.id.san3);
        san4 = (CardView) findViewById(R.id.san4);
        san5 = (CardView) findViewById(R.id.san5);

        san1.setOnClickListener(this);
        san2.setOnClickListener(this);
        san3.setOnClickListener(this);
        san4.setOnClickListener(this);
        san5.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.san1){
            i = new Intent(this, San1.class);
            startActivity(i);
        }
        if (viewId == R.id.san2){
            i = new Intent(this, San2.class);
            startActivity(i);
        }
        if (viewId == R.id.san3){
            i = new Intent(this, San3.class);
            startActivity(i);
        }
        if (viewId == R.id.san4){
            i = new Intent(this, San4.class);
            startActivity(i);
        }
        if (viewId == R.id.san5){
            i = new Intent(this, San5.class);
            startActivity(i);
        }

    }
}
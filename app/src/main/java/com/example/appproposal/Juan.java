package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Juan extends AppCompatActivity implements View.OnClickListener{
    public CardView ju1, ju2, ju3, ju4, ju5, ju6, ju7, ju8, ju9, ju10,
            ju11, ju12, ju13, ju14, ju15, ju16, ju17, ju18, ju19, ju20,
            ju21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juan);

        ju1 = (CardView) findViewById(R.id.ju1);
        ju2 = (CardView) findViewById(R.id.ju2);
        ju3 = (CardView) findViewById(R.id.ju3);
        ju4 = (CardView) findViewById(R.id.ju4);
        ju5 = (CardView) findViewById(R.id.ju5);
        ju6 = (CardView) findViewById(R.id.ju6);
        ju7 = (CardView) findViewById(R.id.ju7);
        ju8 = (CardView) findViewById(R.id.ju8);
        ju9 = (CardView) findViewById(R.id.ju9);
        ju10 = (CardView) findViewById(R.id.ju10);
        ju11 = (CardView) findViewById(R.id.ju11);
        ju12 = (CardView) findViewById(R.id.ju12);
        ju13 = (CardView) findViewById(R.id.ju13);
        ju14 = (CardView) findViewById(R.id.ju14);
        ju15 = (CardView) findViewById(R.id.ju15);
        ju16 = (CardView) findViewById(R.id.ju16);
        ju17 = (CardView) findViewById(R.id.ju17);
        ju18 = (CardView) findViewById(R.id.ju18);
        ju19 = (CardView) findViewById(R.id.ju19);
        ju20 = (CardView) findViewById(R.id.ju20);
        ju21 = (CardView) findViewById(R.id.ju21);

        ju1.setOnClickListener(this);
        ju2.setOnClickListener(this);
        ju3.setOnClickListener(this);
        ju4.setOnClickListener(this);
        ju5.setOnClickListener(this);
        ju6.setOnClickListener(this);
        ju7.setOnClickListener(this);
        ju8.setOnClickListener(this);
        ju9.setOnClickListener(this);
        ju10.setOnClickListener(this);
        ju11.setOnClickListener(this);
        ju12.setOnClickListener(this);
        ju13.setOnClickListener(this);
        ju14.setOnClickListener(this);
        ju15.setOnClickListener(this);
        ju16.setOnClickListener(this);
        ju17.setOnClickListener(this);
        ju18.setOnClickListener(this);
        ju19.setOnClickListener(this);
        ju20.setOnClickListener(this);
        ju21.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.ju1){
            i = new Intent(this, Ju1.class);
            startActivity(i);
        }
        if (viewId == R.id.ju2){
            i = new Intent(this, Ju2.class);
            startActivity(i);
        }
        if (viewId == R.id.ju3){
            i = new Intent(this, Ju3.class);
            startActivity(i);
        }
        if (viewId == R.id.ju4){
            i = new Intent(this, Ju4.class);
            startActivity(i);
        }
        if (viewId == R.id.ju5){
            i = new Intent(this, Ju5.class);
            startActivity(i);
        }
        if (viewId == R.id.ju6){
            i = new Intent(this, Ju6.class);
            startActivity(i);
        }
        if (viewId == R.id.ju7){
            i = new Intent(this, Ju7.class);
            startActivity(i);
        }
        if (viewId == R.id.ju8){
            i = new Intent(this, Ju8.class);
            startActivity(i);
        }
        if (viewId == R.id.ju9){
            i = new Intent(this, Ju9.class);
            startActivity(i);
        }
        if (viewId == R.id.ju10){
            i = new Intent(this, Ju10.class);
            startActivity(i);
        }
        if (viewId == R.id.ju11){
            i = new Intent(this, Ju11.class);
            startActivity(i);
        }
        if (viewId == R.id.ju12){
            i = new Intent(this, Ju12.class);
            startActivity(i);
        }
        if (viewId == R.id.ju13){
            i = new Intent(this, Ju13.class);
            startActivity(i);
        }
        if (viewId == R.id.ju14){
            i = new Intent(this, Ju14.class);
            startActivity(i);
        }
        if (viewId == R.id.ju15){
            i = new Intent(this, Ju15.class);
            startActivity(i);
        }
        if (viewId == R.id.ju16){
            i = new Intent(this, Ju16.class);
            startActivity(i);
        }
        if (viewId == R.id.ju17){
            i = new Intent(this, Ju17.class);
            startActivity(i);
        }
        if (viewId == R.id.ju18){
            i = new Intent(this, Ju18.class);
            startActivity(i);
        }
        if (viewId == R.id.ju19){
            i = new Intent(this, Ju19.class);
            startActivity(i);
        }
        if (viewId == R.id.ju20){
            i = new Intent(this, Ju20.class);
            startActivity(i);
        }
        if (viewId == R.id.ju21){
            i = new Intent(this, Ju21.class);
            startActivity(i);
        }
    }
}
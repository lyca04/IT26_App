package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Oseas extends AppCompatActivity implements View.OnClickListener{
    public CardView os1, os2, os3, os4, os5, os6, os7, os8, os9,  os10, os11, os12, os13, os14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oseas);

        os1 = (CardView) findViewById(R.id.ose1);
        os2 = (CardView) findViewById(R.id.ose2);
        os3 = (CardView) findViewById(R.id.ose3);
        os4 = (CardView) findViewById(R.id.ose4);
        os5 = (CardView) findViewById(R.id.ose5);
        os6 = (CardView) findViewById(R.id.ose6);
        os7 = (CardView) findViewById(R.id.ose7);
        os8 = (CardView) findViewById(R.id.ose8);
        os9 = (CardView) findViewById(R.id.ose9);
        os10 = (CardView) findViewById(R.id.ose10);
        os11 = (CardView) findViewById(R.id.ose11);
        os12 = (CardView) findViewById(R.id.ose12);
        os13 = (CardView) findViewById(R.id.ose13);
        os14 = (CardView) findViewById(R.id.ose14);

        os1.setOnClickListener(this);
        os2.setOnClickListener(this);
        os3.setOnClickListener(this);
        os4.setOnClickListener(this);
        os5.setOnClickListener(this);
        os6.setOnClickListener(this);
        os7.setOnClickListener(this);
        os8.setOnClickListener(this);
        os9.setOnClickListener(this);
        os10.setOnClickListener(this);
        os11.setOnClickListener(this);
        os12.setOnClickListener(this);
        os13.setOnClickListener(this);
        os14.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id. ose1){
            i = new Intent(this, Os1.class);
            startActivity(i);
        }
        if (viewId == R.id. ose2){
            i = new Intent(this, Os2.class);
            startActivity(i);
        }
        if (viewId == R.id. ose3){
            i = new Intent(this, Os3.class);
            startActivity(i);
        }
        if (viewId == R.id. ose4){
            i = new Intent(this, Os4.class);
            startActivity(i);
        }
        if (viewId == R.id. ose5){
            i = new Intent(this, Os5.class);
            startActivity(i);
        }
        if (viewId == R.id. ose6){
            i = new Intent(this, Os6.class);
            startActivity(i);
        }
        if (viewId == R.id. ose7){
            i = new Intent(this, Os7.class);
            startActivity(i);
        }
        if (viewId == R.id. ose8){
            i = new Intent(this, Os8.class);
            startActivity(i);
        }
        if (viewId == R.id. ose9){
            i = new Intent(this, Os9.class);
            startActivity(i);
        }
        if (viewId == R.id. ose10){
            i = new Intent(this, Os10.class);
            startActivity(i);
        }
        if (viewId == R.id. ose11){
            i = new Intent(this, Os11.class);
            startActivity(i);
        }
        if (viewId == R.id. ose12){
            i = new Intent(this, Os12.class);
            startActivity(i);
        }
        if (viewId == R.id. ose13){
            i = new Intent(this, Os13.class);
            startActivity(i);
        }
        if (viewId == R.id. ose14){
            i = new Intent(this, Os14.class);
            startActivity(i);
        }
    }
}
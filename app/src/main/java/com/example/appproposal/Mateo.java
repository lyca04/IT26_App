package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Mateo extends AppCompatActivity implements View.OnClickListener{
    public CardView mat1, mat2, mat3, mat4, mat5, mat6, mat7, mat8, mat9, mat10,
            mat11, mat12, mat13, mat14, mat15, mat16, mat17, mat18, mat19, mat20,
            mat21, mat22, mat23, mat24, mat25, mat26, mat27, mat28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mateo);

        mat1 = (CardView) findViewById(R.id.mat1);
        mat2 = (CardView) findViewById(R.id.mat2);
        mat3 = (CardView) findViewById(R.id.mat3);
        mat4 = (CardView) findViewById(R.id.mat4);
        mat5 = (CardView) findViewById(R.id.mat5);
        mat6 = (CardView) findViewById(R.id.mat6);
        mat7 = (CardView) findViewById(R.id.mat7);
        mat8 = (CardView) findViewById(R.id.mat8);
        mat9 = (CardView) findViewById(R.id.mat9);
        mat10 = (CardView) findViewById(R.id.mat10);
        mat11 = (CardView) findViewById(R.id.mat11);
        mat12 = (CardView) findViewById(R.id.mat12);
        mat13 = (CardView) findViewById(R.id.mat13);
        mat14 = (CardView) findViewById(R.id.mat14);
        mat15 = (CardView) findViewById(R.id.mat15);
        mat16 = (CardView) findViewById(R.id.mat16);
        mat17 = (CardView) findViewById(R.id.mat17);
        mat18 = (CardView) findViewById(R.id.mat18);
        mat19 = (CardView) findViewById(R.id.mat19);
        mat20 = (CardView) findViewById(R.id.mat20);
        mat21 = (CardView) findViewById(R.id.mat21);
        mat22 = (CardView) findViewById(R.id.mat22);
        mat23 = (CardView) findViewById(R.id.mat23);
        mat24 = (CardView) findViewById(R.id.mat24);
        mat25 = (CardView) findViewById(R.id.mat25);
        mat26 = (CardView) findViewById(R.id.mat26);
        mat27 = (CardView) findViewById(R.id.mat27);
        mat28 = (CardView) findViewById(R.id.mat28);

        mat1.setOnClickListener(this);
        mat2.setOnClickListener(this);
        mat3.setOnClickListener(this);
        mat4.setOnClickListener(this);
        mat5.setOnClickListener(this);
        mat6.setOnClickListener(this);
        mat7.setOnClickListener(this);
        mat8.setOnClickListener(this);
        mat9.setOnClickListener(this);
        mat10.setOnClickListener(this);
        mat11.setOnClickListener(this);
        mat12.setOnClickListener(this);
        mat13.setOnClickListener(this);
        mat14.setOnClickListener(this);
        mat15.setOnClickListener(this);
        mat16.setOnClickListener(this);
        mat17.setOnClickListener(this);
        mat18.setOnClickListener(this);
        mat19.setOnClickListener(this);
        mat20.setOnClickListener(this);
        mat21.setOnClickListener(this);
        mat22.setOnClickListener(this);
        mat23.setOnClickListener(this);
        mat24.setOnClickListener(this);
        mat25.setOnClickListener(this);
        mat26.setOnClickListener(this);
        mat27.setOnClickListener(this);
        mat28.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.mat1){
            i = new Intent(this, Mat1.class);
            startActivity(i);
        }
        if (viewId == R.id.mat2){
            i = new Intent(this, Mat2.class);
            startActivity(i);
        }
        if (viewId == R.id.mat3){
            i = new Intent(this, Mat3.class);
            startActivity(i);
        }
        if (viewId == R.id.mat4){
            i = new Intent(this, Mat4.class);
            startActivity(i);
        }
        if (viewId == R.id.mat5){
            i = new Intent(this, Mat5.class);
            startActivity(i);
        }
        if (viewId == R.id.mat6){
            i = new Intent(this, Mat6.class);
            startActivity(i);
        }
        if (viewId == R.id.mat7){
            i = new Intent(this, Mat7.class);
            startActivity(i);
        }
        if (viewId == R.id.mat8){
            i = new Intent(this, Mat8.class);
            startActivity(i);
        }
        if (viewId == R.id.mat9){
            i = new Intent(this, Mat9.class);
            startActivity(i);
        }
        if (viewId == R.id.mat10){
            i = new Intent(this, Mat10.class);
            startActivity(i);
        }
        if (viewId == R.id.mat11){
            i = new Intent(this, Mat11.class);
            startActivity(i);
        }
        if (viewId == R.id.mat12){
            i = new Intent(this, Mat12.class);
            startActivity(i);
        }
        if (viewId == R.id.mat13){
            i = new Intent(this, Mat13.class);
            startActivity(i);
        }
        if (viewId == R.id.mat14){
            i = new Intent(this, Mat14.class);
            startActivity(i);
        }
        if (viewId == R.id.mat15){
            i = new Intent(this, Mat15.class);
            startActivity(i);
        }
        if (viewId == R.id.mat16){
            i = new Intent(this, Mat16.class);
            startActivity(i);
        }
        if (viewId == R.id.mat17){
            i = new Intent(this, Mat17.class);
            startActivity(i);
        }
        if (viewId == R.id.mat18){
            i = new Intent(this, Mat18.class);
            startActivity(i);
        }
        if (viewId == R.id.mat19){
            i = new Intent(this, Mat19.class);
            startActivity(i);
        }
        if (viewId == R.id.mat20){
            i = new Intent(this, Mat20.class);
            startActivity(i);
        }
        if (viewId == R.id.mat21){
            i = new Intent(this, Mat21.class);
            startActivity(i);
        }
        if (viewId == R.id.mat22){
            i = new Intent(this, Mat22.class);
            startActivity(i);
        }
        if (viewId == R.id.mat23){
            i = new Intent(this, Mat23.class);
            startActivity(i);
        }
        if (viewId == R.id.mat24){
            i = new Intent(this, Mat24.class);
            startActivity(i);
        }
        if (viewId == R.id.mat25){
            i = new Intent(this, Mat25.class);
            startActivity(i);
        }
        if (viewId == R.id.mat26){
            i = new Intent(this, Mat26.class);
            startActivity(i);
        }
        if (viewId == R.id.mat27){
            i = new Intent(this, Mat27.class);
            startActivity(i);
        }
        if (viewId == R.id.mat28){
            i = new Intent(this, Mat8.class);
            startActivity(i);
        }
    }
}
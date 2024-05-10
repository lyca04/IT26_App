package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Panultihon extends AppCompatActivity implements View.OnClickListener{
    public CardView pan1, pan2, pan3, pan4, pan5, pan6, pan7, pan8, pan9, pan10,
            pan11, pan12, pan13, pan14, pan15, pan16, pan17, pan18, pan19, pan20,
            pan21, pan22, pan23, pan24, pan25, pan26,pan27, pan28, pan29, pan30,
            pan31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panultihon);

        pan1 = (CardView) findViewById(R.id.pan1);
        pan2 = (CardView) findViewById(R.id.pan2);
        pan3 = (CardView) findViewById(R.id.pan3);
        pan4 = (CardView) findViewById(R.id.pan4);
        pan5 = (CardView) findViewById(R.id.pan5);
        pan6 = (CardView) findViewById(R.id.pan6);
        pan7 = (CardView) findViewById(R.id.pan7);
        pan8 = (CardView) findViewById(R.id.pan8);
        pan9 = (CardView) findViewById(R.id.pan9);
        pan10 = (CardView) findViewById(R.id.pan10);
        pan11 = (CardView) findViewById(R.id.pan11);
        pan12 = (CardView) findViewById(R.id.pan12);
        pan13 = (CardView) findViewById(R.id.pan13);
        pan14 = (CardView) findViewById(R.id.pan14);
        pan15 = (CardView) findViewById(R.id.pan15);
        pan16 = (CardView) findViewById(R.id.pan16);
        pan17 = (CardView) findViewById(R.id.pan17);
        pan18 = (CardView) findViewById(R.id.pan18);
        pan19 = (CardView) findViewById(R.id.pan19);
        pan20 = (CardView) findViewById(R.id.pan20);
        pan21 = (CardView) findViewById(R.id.pan21);
        pan22 = (CardView) findViewById(R.id.pan22);
        pan23 = (CardView) findViewById(R.id.pan23);
        pan24 = (CardView) findViewById(R.id.pan24);
        pan25 = (CardView) findViewById(R.id.pan25);
        pan26 = (CardView) findViewById(R.id.pan26);
        pan27 = (CardView) findViewById(R.id.pan27);
        pan28 = (CardView) findViewById(R.id.pan28);
        pan29 = (CardView) findViewById(R.id.pan29);
        pan30 = (CardView) findViewById(R.id.pan30);
        pan31 = (CardView) findViewById(R.id.pan31);

        pan1.setOnClickListener(this);
        pan2.setOnClickListener(this);
        pan3.setOnClickListener(this);
        pan4.setOnClickListener(this);
        pan5.setOnClickListener(this);
        pan6.setOnClickListener(this);
        pan7.setOnClickListener(this);
        pan8.setOnClickListener(this);
        pan9.setOnClickListener(this);
        pan10.setOnClickListener(this);
        pan11.setOnClickListener(this);
        pan12.setOnClickListener(this);
        pan13.setOnClickListener(this);
        pan14.setOnClickListener(this);
        pan15.setOnClickListener(this);
        pan16.setOnClickListener(this);
        pan17.setOnClickListener(this);
        pan18.setOnClickListener(this);
        pan19.setOnClickListener(this);
        pan20.setOnClickListener(this);
        pan21.setOnClickListener(this);
        pan22.setOnClickListener(this);
        pan23.setOnClickListener(this);
        pan24.setOnClickListener(this);
        pan25.setOnClickListener(this);
        pan26.setOnClickListener(this);
        pan27.setOnClickListener(this);
        pan28.setOnClickListener(this);
        pan29.setOnClickListener(this);
        pan30.setOnClickListener(this);
        pan31.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.pan1){
            i = new Intent(this, Pan1.class);
            startActivity(i);
        }
        if (viewId == R.id.pan2){
            i = new Intent(this, Pan2.class);
            startActivity(i);
        }
        if (viewId == R.id.pan3){
            i = new Intent(this, Pan3.class);
            startActivity(i);
        }
        if (viewId == R.id.pan4){
            i = new Intent(this, Pan4.class);
            startActivity(i);
        }
        if (viewId == R.id.pan5){
            i = new Intent(this, Pan5.class);
            startActivity(i);
        }
        if (viewId == R.id.pan6){
            i = new Intent(this, Pan6.class);
            startActivity(i);
        }
        if (viewId == R.id.pan7){
            i = new Intent(this, Pan7.class);
            startActivity(i);
        }
        if (viewId == R.id.pan8){
            i = new Intent(this, Pan8.class);
            startActivity(i);
        }
        if (viewId == R.id.pan9){
            i = new Intent(this, Pan9.class);
            startActivity(i);
        }
        if (viewId == R.id.pan10){
            i = new Intent(this, Pan10.class);
            startActivity(i);
        }
        if (viewId == R.id.pan11){
            i = new Intent(this, Pan11.class);
            startActivity(i);
        }
        if (viewId == R.id.pan12){
            i = new Intent(this, Pan12.class);
            startActivity(i);
        }
        if (viewId == R.id.pan13){
            i = new Intent(this, Pan13.class);
            startActivity(i);
        }
        if (viewId == R.id.pan14){
            i = new Intent(this, Pan14.class);
            startActivity(i);
        }
        if (viewId == R.id.pan15){
            i = new Intent(this, Pan15.class);
            startActivity(i);
        }
        if (viewId == R.id.pan16){
            i = new Intent(this, Pan16.class);
            startActivity(i);
        }
        if (viewId == R.id.pan17){
            i = new Intent(this, Pan17.class);
            startActivity(i);
        }
        if (viewId == R.id.pan18){
            i = new Intent(this, Pan18.class);
            startActivity(i);
        }
        if (viewId == R.id.pan19){
            i = new Intent(this, Pan19.class);
            startActivity(i);
        }
        if (viewId == R.id.pan20){
            i = new Intent(this, Pan20.class);
            startActivity(i);
        }

        if (viewId == R.id.pan21){
            i = new Intent(this, Pan21.class);
            startActivity(i);
        }
        if (viewId == R.id.pan22){
            i = new Intent(this, Pan22.class);
            startActivity(i);
        }
        if (viewId == R.id.pan23){
            i = new Intent(this, Pan23.class);
            startActivity(i);
        }
        if (viewId == R.id.pan24){
            i = new Intent(this, Pan24.class);
            startActivity(i);
        }
        if (viewId == R.id.pan25){
            i = new Intent(this, Pan25.class);
            startActivity(i);
        }
        if (viewId == R.id.pan26){
            i = new Intent(this, Pan26.class);
            startActivity(i);
        }
        if (viewId == R.id.pan27){
            i = new Intent(this, Pan27.class);
            startActivity(i);
        }
        if (viewId == R.id.pan28){
            i = new Intent(this, Pan28.class);
            startActivity(i);
        }
        if (viewId == R.id.pan29){
            i = new Intent(this, Pan29.class);
            startActivity(i);
        }
        if (viewId == R.id.pan30){
            i = new Intent(this, Pan30.class);
            startActivity(i);
        }

        if (viewId == R.id.pan31){
            i = new Intent(this, Pan31.class);
            startActivity(i);
        }
    }
}
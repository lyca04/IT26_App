package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Deutoronomio extends AppCompatActivity implements View.OnClickListener{
    public CardView deut1, deut2, deut3, deut4, deut5, deut6, deut7, deut8, deut9, deut10,
            deut11, deut12, deut13, deut14, deut15, deut16, deut17, deut18, deut19, deut20,
            deut21, deut22, deut23, deut24, deut25, deut26, deut27, deut28, deut29, deut30,
            deut31, deut32, deut33, deut34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deutoronomio);

        deut1 = (CardView) findViewById(R.id.deut1);
        deut2 = (CardView) findViewById(R.id.deut2);
        deut3 = (CardView) findViewById(R.id.deut3);
        deut4 = (CardView) findViewById(R.id.deut4);
        deut5 = (CardView) findViewById(R.id.deut5);
        deut6 = (CardView) findViewById(R.id.deut6);
        deut7 = (CardView) findViewById(R.id.deut7);
        deut8 = (CardView) findViewById(R.id.deut8);
        deut9 = (CardView) findViewById(R.id.deut9);
        deut10 = (CardView) findViewById(R.id.deut10);
        deut11 = (CardView) findViewById(R.id.deut11);
        deut12 = (CardView) findViewById(R.id.deut12);
        deut13 = (CardView) findViewById(R.id.deut13);
        deut14 = (CardView) findViewById(R.id.deut14);
        deut15 = (CardView) findViewById(R.id.deut15);
        deut16 = (CardView) findViewById(R.id.deut16);
        deut17 = (CardView) findViewById(R.id.deut17);
        deut18 = (CardView) findViewById(R.id.deut18);
        deut19 = (CardView) findViewById(R.id.deut19);
        deut20 = (CardView) findViewById(R.id.deut20);
        deut21 = (CardView) findViewById(R.id.deut21);
        deut22 = (CardView) findViewById(R.id.deut22);
        deut23 = (CardView) findViewById(R.id.deut23);
        deut24 = (CardView) findViewById(R.id.deut24);
        deut25 = (CardView) findViewById(R.id.deut25);
        deut26 = (CardView) findViewById(R.id.deut26);
        deut27 = (CardView) findViewById(R.id.deut27);
        deut28 = (CardView) findViewById(R.id.deut28);
        deut29 = (CardView) findViewById(R.id.deut29);
        deut30 = (CardView) findViewById(R.id.deut30);
        deut31 = (CardView) findViewById(R.id.deut31);
        deut32 = (CardView) findViewById(R.id.deut32);
        deut33 = (CardView) findViewById(R.id.deut33);
        deut34 = (CardView) findViewById(R.id.deut34);

        deut1.setOnClickListener(this);
        deut2.setOnClickListener(this);
        deut3.setOnClickListener(this);
        deut4.setOnClickListener(this);
        deut5.setOnClickListener(this);
        deut6.setOnClickListener(this);
        deut7.setOnClickListener(this);
        deut8.setOnClickListener(this);
        deut9.setOnClickListener(this);
        deut10.setOnClickListener(this);
        deut11.setOnClickListener(this);
        deut12.setOnClickListener(this);
        deut13.setOnClickListener(this);
        deut14.setOnClickListener(this);
        deut15.setOnClickListener(this);
        deut16.setOnClickListener(this);
        deut17.setOnClickListener(this);
        deut18.setOnClickListener(this);
        deut19.setOnClickListener(this);
        deut20.setOnClickListener(this);
        deut21.setOnClickListener(this);
        deut22.setOnClickListener(this);
        deut23.setOnClickListener(this);
        deut24.setOnClickListener(this);
        deut25.setOnClickListener(this);
        deut26.setOnClickListener(this);
        deut27.setOnClickListener(this);
        deut28.setOnClickListener(this);
        deut29.setOnClickListener(this);
        deut30.setOnClickListener(this);
        deut31.setOnClickListener(this);
        deut32.setOnClickListener(this);
        deut33.setOnClickListener(this);
        deut34.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.deut1){
            i = new Intent(this, Deut1.class);
            startActivity(i);
        }
        if (viewId == R.id.deut2){
            i = new Intent(this, Deut2.class);
            startActivity(i);
        }
        if (viewId == R.id.deut3){
            i = new Intent(this, Deut3.class);
            startActivity(i);
        }
        if (viewId == R.id.deut4){
            i = new Intent(this, Deut4.class);
            startActivity(i);
        }
        if (viewId == R.id.deut5){
            i = new Intent(this, Deut5.class);
            startActivity(i);
        }
        if (viewId == R.id.deut6){
            i = new Intent(this, Deut6.class);
            startActivity(i);
        }
        if (viewId == R.id.deut7){
            i = new Intent(this, Deut7.class);
            startActivity(i);
        }
        if (viewId == R.id.deut8){
            i = new Intent(this, Deut8.class);
            startActivity(i);
        }
        if (viewId == R.id.deut9){
            i = new Intent(this, Deut9.class);
            startActivity(i);
        }
        if (viewId == R.id.deut10){
            i = new Intent(this, Deut10.class);
            startActivity(i);
        }
        if (viewId == R.id.deut11){
            i = new Intent(this, Deut11.class);
            startActivity(i);
        }
        if (viewId == R.id.deut12){
            i = new Intent(this, Deut12.class);
            startActivity(i);
        }
        if (viewId == R.id.deut13){
            i = new Intent(this, Deut13.class);
            startActivity(i);
        }
        if (viewId == R.id.deut14){
            i = new Intent(this, Deut14.class);
            startActivity(i);
        }
        if (viewId == R.id.deut15){
            i = new Intent(this, Deut15.class);
            startActivity(i);
        }
        if (viewId == R.id.deut16){
            i = new Intent(this, Deut16.class);
            startActivity(i);
        }
        if (viewId == R.id.deut17){
            i = new Intent(this, Deut17.class);
            startActivity(i);
        }
        if (viewId == R.id.deut18){
            i = new Intent(this, Deut18.class);
            startActivity(i);
        }
        if (viewId == R.id.deut19){
            i = new Intent(this, Deut19.class);
            startActivity(i);
        }
        if (viewId == R.id.deut20){
            i = new Intent(this, Deut20.class);
            startActivity(i);
        }
        if (viewId == R.id.deut21){
            i = new Intent(this, Deut21.class);
            startActivity(i);
        }
        if (viewId == R.id.deut22){
            i = new Intent(this, Deut22.class);
            startActivity(i);
        }
        if (viewId == R.id.deut23){
            i = new Intent(this, Deut23.class);
            startActivity(i);
        }
        if (viewId == R.id.deut24){
            i = new Intent(this, Deut24.class);
            startActivity(i);
        }
        if (viewId == R.id.deut25){
            i = new Intent(this, Deut25.class);
            startActivity(i);
        }
        if (viewId == R.id.deut26){
            i = new Intent(this, Deut26.class);
            startActivity(i);
        }
        if (viewId == R.id.deut27){
            i = new Intent(this, Deut27.class);
            startActivity(i);
        }
        if (viewId == R.id.deut28){
            i = new Intent(this, Deut28.class);
            startActivity(i);
        }
        if (viewId == R.id.deut29){
            i = new Intent(this, Deut29.class);
            startActivity(i);
        }
        if (viewId == R.id.deut30){
            i = new Intent(this, Deut30.class);
            startActivity(i);
        }
        if (viewId == R.id.deut31){
            i = new Intent(this, Deut31.class);
            startActivity(i);
        }
        if (viewId == R.id.deut32){
            i = new Intent(this, Deut32.class);
            startActivity(i);
        }
        if (viewId == R.id.deut33){
            i = new Intent(this, Deut33.class);
            startActivity(i);
        }
        if (viewId == R.id.deut34){
            i = new Intent(this, Deut34.class);
            startActivity(i);
        }
    }
}
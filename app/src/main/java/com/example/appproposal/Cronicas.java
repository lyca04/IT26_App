package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Cronicas extends AppCompatActivity implements View.OnClickListener{
    public CardView cron1_1,cron1_2, cron1_3, cron1_4, cron1_5, cron1_6, cron1_7, cron1_8, cron1_9, cron1_10,
            cron1_11, cron1_12, cron1_13, cron1_14, cron1_15, cron1_16, cron1_17, cron1_18, cron1_19, cron1_20,
            cron1_21, cron1_22, cron1_23, cron1_24, cron1_25, cron1_26, cron1_27, cron1_28, cron1_29,
            cron2_1, cron2_2, cron2_3, cron2_4, cron2_5, cron2_6, cron2_7, cron2_8, cron2_9, cron2_10,
            cron2_11, cron2_12, cron2_13, cron2_14, cron2_15, cron2_16, cron2_17, cron2_18, cron2_19, cron2_20,
            cron2_21, cron2_22, cron2_23, cron2_24, cron2_25, cron2_26, cron2_27, cron2_28, cron2_29, cron2_30,
            cron2_31, cron2_32, cron2_33, cron2_34, cron2_35, cron2_36;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cronicas);

        cron1_1 = (CardView) findViewById(R.id.cron1_1);
        cron1_2 = (CardView) findViewById(R.id.cron1_2);
        cron1_3 = (CardView) findViewById(R.id.cron1_3);
        cron1_4 = (CardView) findViewById(R.id.cron1_4);
        cron1_5 = (CardView) findViewById(R.id.cron1_5);
        cron1_6 = (CardView) findViewById(R.id.cron1_6);
        cron1_7 = (CardView) findViewById(R.id.cron1_7);
        cron1_8 = (CardView) findViewById(R.id.cron1_8);
        cron1_9 = (CardView) findViewById(R.id.cron1_9);
        cron1_10 = (CardView) findViewById(R.id.cron1_10);
        cron1_11 = (CardView) findViewById(R.id.cron1_11);
        cron1_12 = (CardView) findViewById(R.id.cron1_12);
        cron1_13 = (CardView) findViewById(R.id.cron1_13);
        cron1_14 = (CardView) findViewById(R.id.cron1_14);
        cron1_15 = (CardView) findViewById(R.id.cron1_15);
        cron1_16 = (CardView) findViewById(R.id.cron1_16);
        cron1_17 = (CardView) findViewById(R.id.cron1_17);
        cron1_18 = (CardView) findViewById(R.id.cron1_18);
        cron1_19 = (CardView) findViewById(R.id.cron1_19);
        cron1_20 = (CardView) findViewById(R.id.cron1_20);
        cron1_21 = (CardView) findViewById(R.id.cron1_21);
        cron1_22 = (CardView) findViewById(R.id.cron1_22);
        cron1_23 = (CardView) findViewById(R.id.cron1_23);
        cron1_24 = (CardView) findViewById(R.id.cron1_24);
        cron1_25 = (CardView) findViewById(R.id.cron1_25);
        cron1_26 = (CardView) findViewById(R.id.cron1_26);
        cron1_27 = (CardView) findViewById(R.id.cron1_27);
        cron1_28 = (CardView) findViewById(R.id.cron1_28);
        cron1_29 = (CardView) findViewById(R.id.cron1_29);
        cron2_1 = (CardView) findViewById(R.id.cron2_1);
        cron2_2 = (CardView) findViewById(R.id.cron2_2);
        cron2_3 = (CardView) findViewById(R.id.cron2_3);
        cron2_4 = (CardView) findViewById(R.id.cron2_4);
        cron2_5 = (CardView) findViewById(R.id.cron2_5);
        cron2_6 = (CardView) findViewById(R.id.cron2_6);
        cron2_7 = (CardView) findViewById(R.id.cron2_7);
        cron2_8 = (CardView) findViewById(R.id.cron2_8);
        cron2_9 = (CardView) findViewById(R.id.cron2_9);
        cron2_10 = (CardView) findViewById(R.id.cron2_10);
        cron2_11 = (CardView) findViewById(R.id.cron2_11);
        cron2_12 = (CardView) findViewById(R.id.cron2_12);
        cron2_13 = (CardView) findViewById(R.id.cron2_13);
        cron2_14 = (CardView) findViewById(R.id.cron2_14);
        cron2_15 = (CardView) findViewById(R.id.cron2_15);
        cron2_16 = (CardView) findViewById(R.id.cron2_16);
        cron2_17 = (CardView) findViewById(R.id.cron2_17);
        cron2_18 = (CardView) findViewById(R.id.cron2_18);
        cron2_19 = (CardView) findViewById(R.id.cron2_19);
        cron2_20 = (CardView) findViewById(R.id.cron2_20);
        cron2_21 = (CardView) findViewById(R.id.cron2_21);
        cron2_22 = (CardView) findViewById(R.id.cron2_22);
        cron2_23 = (CardView) findViewById(R.id.cron2_23);
        cron2_24 = (CardView) findViewById(R.id.cron2_24);
        cron2_25 = (CardView) findViewById(R.id.cron2_25);
        cron2_26 = (CardView) findViewById(R.id.cron2_26);
        cron2_27 = (CardView) findViewById(R.id.cron2_27);
        cron2_28 = (CardView) findViewById(R.id.cron2_28);
        cron2_29 = (CardView) findViewById(R.id.cron2_29);
        cron2_30 = (CardView) findViewById(R.id.cron2_30);
        cron2_31 = (CardView) findViewById(R.id.cron2_31);
        cron2_32 = (CardView) findViewById(R.id.cron2_32);
        cron2_33 = (CardView) findViewById(R.id.cron2_33);
        cron2_34 = (CardView) findViewById(R.id.cron2_34);
        cron2_35 = (CardView) findViewById(R.id.cron2_35);
        cron2_36 = (CardView) findViewById(R.id.cron2_36);

        cron1_1.setOnClickListener(this);
        cron1_2.setOnClickListener(this);
        cron1_3.setOnClickListener(this);
        cron1_4.setOnClickListener(this);
        cron1_5.setOnClickListener(this);
        cron1_6.setOnClickListener(this);
        cron1_7.setOnClickListener(this);
        cron1_8.setOnClickListener(this);
        cron1_9.setOnClickListener(this);
        cron1_10.setOnClickListener(this);
        cron1_11.setOnClickListener(this);
        cron1_12.setOnClickListener(this);
        cron1_13.setOnClickListener(this);
        cron1_14.setOnClickListener(this);
        cron1_15.setOnClickListener(this);
        cron1_16.setOnClickListener(this);
        cron1_17.setOnClickListener(this);
        cron1_18.setOnClickListener(this);
        cron1_19.setOnClickListener(this);
        cron1_20.setOnClickListener(this);
        cron1_21.setOnClickListener(this);
        cron1_22.setOnClickListener(this);
        cron1_23.setOnClickListener(this);
        cron1_24.setOnClickListener(this);
        cron1_25.setOnClickListener(this);
        cron1_26.setOnClickListener(this);
        cron1_27.setOnClickListener(this);
        cron1_28.setOnClickListener(this);
        cron1_29.setOnClickListener(this);
        cron2_1.setOnClickListener(this);
        cron2_2.setOnClickListener(this);
        cron2_3.setOnClickListener(this);
        cron2_4.setOnClickListener(this);
        cron2_5.setOnClickListener(this);
        cron2_6.setOnClickListener(this);
        cron2_7.setOnClickListener(this);
        cron2_8.setOnClickListener(this);
        cron2_9.setOnClickListener(this);
        cron2_10.setOnClickListener(this);
        cron2_11.setOnClickListener(this);
        cron2_12.setOnClickListener(this);
        cron2_13.setOnClickListener(this);
        cron2_14.setOnClickListener(this);
        cron2_15.setOnClickListener(this);
        cron2_16.setOnClickListener(this);
        cron2_17.setOnClickListener(this);
        cron2_18.setOnClickListener(this);
        cron2_19.setOnClickListener(this);
        cron2_20.setOnClickListener(this);
        cron2_21.setOnClickListener(this);
        cron2_22.setOnClickListener(this);
        cron2_23.setOnClickListener(this);
        cron2_24.setOnClickListener(this);
        cron2_25.setOnClickListener(this);
        cron2_26.setOnClickListener(this);
        cron2_27.setOnClickListener(this);
        cron2_28.setOnClickListener(this);
        cron2_29.setOnClickListener(this);
        cron2_30.setOnClickListener(this);
        cron2_31.setOnClickListener(this);
        cron2_32.setOnClickListener(this);
        cron2_33.setOnClickListener(this);
        cron2_34.setOnClickListener(this);
        cron2_35.setOnClickListener(this);
        cron2_36.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.cron1_1){
            i = new Intent(this, Cron1_1.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_2){
            i = new Intent(this, Cron1_2.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_3){
            i = new Intent(this, Cron1_3.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_4){
            i = new Intent(this, Cron1_4.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_5){
            i = new Intent(this, Cron1_5.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_6){
            i = new Intent(this, Cron1_6.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_7){
            i = new Intent(this, Cron1_7.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_8){
            i = new Intent(this, Cron1_8.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_9){
            i = new Intent(this, Cron1_9.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_10){
            i = new Intent(this, Cron1_10.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_11){
            i = new Intent(this, Cron1_11.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_12){
            i = new Intent(this, Cron1_12.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_13){
            i = new Intent(this, Cron1_13.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_14){
            i = new Intent(this, Cron1_14.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_15){
            i = new Intent(this, Cron1_15.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_16){
            i = new Intent(this, Cron1_16.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_17){
            i = new Intent(this, Cron1_17.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_18){
            i = new Intent(this, Cron1_18.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_19){
            i = new Intent(this, Cron1_19.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_20){
            i = new Intent(this, Cron1_20.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_21){
            i = new Intent(this, Cron1_21.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_22){
            i = new Intent(this, Cron1_22.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_23){
            i = new Intent(this, Cron1_23.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_24){
            i = new Intent(this, Cron1_24.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_25){
            i = new Intent(this, Cron1_25.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_26){
            i = new Intent(this, Cron1_26.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_27){
            i = new Intent(this, Cron1_27.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_28){
            i = new Intent(this, Cron1_28.class);
            startActivity(i);
        }
        if (viewId == R.id.cron1_29){
            i = new Intent(this, Cron1_29.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_1){
            i = new Intent(this, Cron2_1.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_2){
            i = new Intent(this, Cron2_2.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_3){
            i = new Intent(this, Cron2_3.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_4){
            i = new Intent(this, Cron2_4.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_5){
            i = new Intent(this, Cron2_5.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_6){
            i = new Intent(this, Cron2_6.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_7){
            i = new Intent(this, Cron2_7.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_8){
            i = new Intent(this, Cron2_8.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_9){
            i = new Intent(this, Cron2_9.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_10){
            i = new Intent(this, Cron2_10.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_11){
            i = new Intent(this, Cron2_11.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_12){
            i = new Intent(this, Cron2_12.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_13){
            i = new Intent(this, Cron2_13.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_14){
            i = new Intent(this, Cron2_14.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_15){
            i = new Intent(this, Cron2_15.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_16){
            i = new Intent(this, Cron2_16.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_17){
            i = new Intent(this, Cron2_17.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_18){
            i = new Intent(this, Cron2_18.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_19){
            i = new Intent(this, Cron2_19.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_20){
            i = new Intent(this, Cron2_20.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_21){
            i = new Intent(this, Cron2_21.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_22){
            i = new Intent(this, Cron2_22.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_23){
            i = new Intent(this, Cron2_23.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_24){
            i = new Intent(this, Cron2_24.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_25){
            i = new Intent(this, Cron2_25.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_26){
            i = new Intent(this, Cron2_26.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_27){
            i = new Intent(this, Cron2_27.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_28){
            i = new Intent(this, Cron2_28.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_29){
            i = new Intent(this, Cron2_29.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_30){
            i = new Intent(this, Cron2_30.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_31){
            i = new Intent(this, Cron2_31.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_32){
            i = new Intent(this, Cron2_32.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_33){
            i = new Intent(this, Cron2_33.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_34){
            i = new Intent(this, Cron2_34.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_35){
            i = new Intent(this, Cron2_35.class);
            startActivity(i);
        }
        if (viewId == R.id.cron2_36){
            i = new Intent(this, Cron2_36.class);
            startActivity(i);
        }
    }
}
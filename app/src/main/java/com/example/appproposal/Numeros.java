package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Numeros extends AppCompatActivity implements View.OnClickListener{
    public CardView num1, num2, num3, num4, num5, num6, num7, num8, num9, num10,
            num11, num12, num13, num14, num15, num16, num17, num18, num19, num20,
            num21, num22, num23, num24, num25, num26, num27, num28, num29, num30,
            num31, num32, num33, num34, num35, num36;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);

        num1 = (CardView) findViewById(R.id.num1);
        num2 = (CardView) findViewById(R.id.num2);
        num3 = (CardView) findViewById(R.id.num3);
        num4 = (CardView) findViewById(R.id.num4);
        num5 = (CardView) findViewById(R.id.num5);
        num6 = (CardView) findViewById(R.id.num6);
        num7 = (CardView) findViewById(R.id.num7);
        num8 = (CardView) findViewById(R.id.num8);
        num9 = (CardView) findViewById(R.id.num9);
        num10 = (CardView) findViewById(R.id.num10);
        num11 = (CardView) findViewById(R.id.num11);
        num12 = (CardView) findViewById(R.id.num12);
        num13 = (CardView) findViewById(R.id.num13);
        num14 = (CardView) findViewById(R.id.num14);
        num15 = (CardView) findViewById(R.id.num15);
        num16 = (CardView) findViewById(R.id.num16);
        num17 = (CardView) findViewById(R.id.num17);
        num18 = (CardView) findViewById(R.id.num18);
        num19 = (CardView) findViewById(R.id.num19);
        num20 = (CardView) findViewById(R.id.num20);
        num21 = (CardView) findViewById(R.id.num21);
        num22 = (CardView) findViewById(R.id.num22);
        num23 = (CardView) findViewById(R.id.num23);
        num24 = (CardView) findViewById(R.id.num24);
        num25 = (CardView) findViewById(R.id.num25);
        num26 = (CardView) findViewById(R.id.num26);
        num27 = (CardView) findViewById(R.id.num27);
        num28 = (CardView) findViewById(R.id.num28);
        num29 = (CardView) findViewById(R.id.num29);
        num30 = (CardView) findViewById(R.id.num30);
        num31 = (CardView) findViewById(R.id.num31);
        num32 = (CardView) findViewById(R.id.num32);
        num33 = (CardView) findViewById(R.id.num33);
        num34 = (CardView) findViewById(R.id.num34);
        num35 = (CardView) findViewById(R.id.num35);
        num36 = (CardView) findViewById(R.id.num36);

        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        num10.setOnClickListener(this);
        num11.setOnClickListener(this);
        num12.setOnClickListener(this);
        num13.setOnClickListener(this);
        num14.setOnClickListener(this);
        num15.setOnClickListener(this);
        num16.setOnClickListener(this);
        num17.setOnClickListener(this);
        num18.setOnClickListener(this);
        num19.setOnClickListener(this);
        num20.setOnClickListener(this);
        num21.setOnClickListener(this);
        num22.setOnClickListener(this);
        num23.setOnClickListener(this);
        num24.setOnClickListener(this);
        num25.setOnClickListener(this);
        num26.setOnClickListener(this);
        num27.setOnClickListener(this);
        num28.setOnClickListener(this);
        num29.setOnClickListener(this);
        num30.setOnClickListener(this);
        num31.setOnClickListener(this);
        num32.setOnClickListener(this);
        num33.setOnClickListener(this);
        num34.setOnClickListener(this);
        num35.setOnClickListener(this);
        num36.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.num1){
            i = new Intent(this, Num1.class);
            startActivity(i);
        }
        if (viewId == R.id.num2){
            i = new Intent(this, Num2.class);
            startActivity(i);
        }
        if (viewId == R.id.num3){
            i = new Intent(this, Num3.class);
            startActivity(i);
        }
        if (viewId == R.id.num4){
            i = new Intent(this, Num4.class);
            startActivity(i);
        }
        if (viewId == R.id.num5){
            i = new Intent(this, Num5.class);
            startActivity(i);
        }
        if (viewId == R.id.num6){
            i = new Intent(this, Num6.class);
            startActivity(i);
        }
        if (viewId == R.id.num7){
            i = new Intent(this, Num7.class);
            startActivity(i);
        }
        if (viewId == R.id.num8){
            i = new Intent(this, Num8.class);
            startActivity(i);
        }
        if (viewId == R.id.num9){
            i = new Intent(this, Num9.class);
            startActivity(i);
        }
        if (viewId == R.id.num10){
            i = new Intent(this, Num10.class);
            startActivity(i);
        }
        if (viewId == R.id.num11){
            i = new Intent(this, Num11.class);
            startActivity(i);
        }
        if (viewId == R.id.num12){
            i = new Intent(this, Num12.class);
            startActivity(i);
        }
        if (viewId == R.id.num13){
            i = new Intent(this, Num13.class);
            startActivity(i);
        }
        if (viewId == R.id.num14){
            i = new Intent(this, Num14.class);
            startActivity(i);
        }
        if (viewId == R.id.num15){
            i = new Intent(this, Num15.class);
            startActivity(i);
        }
        if (viewId == R.id.num16){
            i = new Intent(this, Num16.class);
            startActivity(i);
        }
        if (viewId == R.id.num17){
            i = new Intent(this, Num17.class);
            startActivity(i);
        }
        if (viewId == R.id.num18){
            i = new Intent(this, Num18.class);
            startActivity(i);
        }
        if (viewId == R.id.num19){
            i = new Intent(this, Num19.class);
            startActivity(i);
        }
        if (viewId == R.id.num20){
            i = new Intent(this, Num20.class);
            startActivity(i);
        }
        if (viewId == R.id.num21){
            i = new Intent(this, Num21.class);
            startActivity(i);
        }
        if (viewId == R.id.num22){
            i = new Intent(this, Num22.class);
            startActivity(i);
        }
        if (viewId == R.id.num23){
            i = new Intent(this, Num23.class);
            startActivity(i);
        }
        if (viewId == R.id.num24){
            i = new Intent(this, Num24.class);
            startActivity(i);
        }
        if (viewId == R.id.num25){
            i = new Intent(this, Num25.class);
            startActivity(i);
        }
        if (viewId == R.id.num26){
            i = new Intent(this, Num26.class);
            startActivity(i);
        }
        if (viewId == R.id.num27){
            i = new Intent(this, Num27.class);
            startActivity(i);
        }
        if (viewId == R.id.num28){
            i = new Intent(this, Num28.class);
            startActivity(i);
        }
        if (viewId == R.id.num29){
            i = new Intent(this, Num29.class);
            startActivity(i);
        }
        if (viewId == R.id.num30){
            i = new Intent(this, Num30.class);
            startActivity(i);
        }
        if (viewId == R.id.num31){
            i = new Intent(this, Num31.class);
            startActivity(i);
        }
        if (viewId == R.id.num32){
            i = new Intent(this, Num32.class);
            startActivity(i);
        }
        if (viewId == R.id.num33){
            i = new Intent(this, Num33.class);
            startActivity(i);
        }
        if (viewId == R.id.num34){
            i = new Intent(this, Num34.class);
            startActivity(i);
        }
        if (viewId == R.id.num35){
            i = new Intent(this, Num35.class);
            startActivity(i);
        }
        if (viewId == R.id.num36){
            i = new Intent(this, Num36.class);
            startActivity(i);
        }
    }
}
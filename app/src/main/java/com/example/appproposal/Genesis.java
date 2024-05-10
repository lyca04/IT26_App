package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Genesis extends AppCompatActivity implements View.OnClickListener{
    public CardView gen1, gen2, gen3, gen4, gen5, gen6, gen7, gen8, gen9, gen10,
    gen11, gen12, gen13, gen14, gen15, gen16, gen17, gen18, gen19, gen20,
    gen21, gen22, gen23, gen24, gen25, gen26, gen27, gen28, gen29, gen30,
    gen31, gen32, gen33, gen34, gen35, gen36, gen37, gen38, gen39, gen40,
    gen41, gen42, gen43, gen44, gen45, gen46, gen47, gen48, gen49, gen50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genesis);

        gen1 = (CardView) findViewById(R.id.gen1);
        gen2 = (CardView) findViewById(R.id.gen2);
        gen3 = (CardView) findViewById(R.id.gen3);
        gen4 = (CardView) findViewById(R.id.gen4);
        gen5 = (CardView) findViewById(R.id.gen5);
        gen6 = (CardView) findViewById(R.id.gen6);
        gen7 = (CardView) findViewById(R.id.gen7);
        gen8 = (CardView) findViewById(R.id.gen8);
        gen9 = (CardView) findViewById(R.id.gen9);
        gen10 = (CardView) findViewById(R.id.gen10);
        gen11 = (CardView) findViewById(R.id.gen11);
        gen12 = (CardView) findViewById(R.id.gen12);
        gen13 = (CardView) findViewById(R.id.gen13);
        gen14 = (CardView) findViewById(R.id.gen14);
        gen15 = (CardView) findViewById(R.id.gen15);
        gen16 = (CardView) findViewById(R.id.gen16);
        gen17 = (CardView) findViewById(R.id.gen17);
        gen18 = (CardView) findViewById(R.id.gen18);
        gen19 = (CardView) findViewById(R.id.gen19);
        gen20 = (CardView) findViewById(R.id.gen20);
        gen21 = (CardView) findViewById(R.id.gen21);
        gen22 = (CardView) findViewById(R.id.gen22);
        gen23 = (CardView) findViewById(R.id.gen23);
        gen24 = (CardView) findViewById(R.id.gen24);
        gen25 = (CardView) findViewById(R.id.gen25);
        gen26 = (CardView) findViewById(R.id.gen26);
        gen27 = (CardView) findViewById(R.id.gen27);
        gen28 = (CardView) findViewById(R.id.gen28);
        gen29 = (CardView) findViewById(R.id.gen29);
        gen30 = (CardView) findViewById(R.id.gen30);
        gen31 = (CardView) findViewById(R.id.gen31);
        gen32 = (CardView) findViewById(R.id.gen32);
        gen33 = (CardView) findViewById(R.id.gen33);
        gen34 = (CardView) findViewById(R.id.gen34);
        gen35 = (CardView) findViewById(R.id.gen35);
        gen36 = (CardView) findViewById(R.id.gen36);
        gen37 = (CardView) findViewById(R.id.gen37);
        gen38 = (CardView) findViewById(R.id.gen38);
        gen39 = (CardView) findViewById(R.id.gen39);
        gen40 = (CardView) findViewById(R.id.gen40);
        gen41 = (CardView) findViewById(R.id.gen41);
        gen42 = (CardView) findViewById(R.id.gen42);
        gen43 = (CardView) findViewById(R.id.gen43);
        gen44 = (CardView) findViewById(R.id.gen44);
        gen45 = (CardView) findViewById(R.id.gen45);
        gen46 = (CardView) findViewById(R.id.gen46);
        gen47 = (CardView) findViewById(R.id.gen47);
        gen48 = (CardView) findViewById(R.id.gen48);
        gen49 = (CardView) findViewById(R.id.gen49);
        gen50 = (CardView) findViewById(R.id.gen50);

        gen1.setOnClickListener(this);
        gen2.setOnClickListener(this);
        gen3.setOnClickListener(this);
        gen4.setOnClickListener(this);
        gen5.setOnClickListener(this);
        gen6.setOnClickListener(this);
        gen7.setOnClickListener(this);
        gen8.setOnClickListener(this);
        gen9.setOnClickListener(this);
        gen10.setOnClickListener(this);
        gen11.setOnClickListener(this);
        gen12.setOnClickListener(this);
        gen13.setOnClickListener(this);
        gen14.setOnClickListener(this);
        gen15.setOnClickListener(this);
        gen16.setOnClickListener(this);
        gen17.setOnClickListener(this);
        gen18.setOnClickListener(this);
        gen19.setOnClickListener(this);
        gen20.setOnClickListener(this);
        gen21.setOnClickListener(this);
        gen22.setOnClickListener(this);
        gen23.setOnClickListener(this);
        gen24.setOnClickListener(this);
        gen25.setOnClickListener(this);
        gen26.setOnClickListener(this);
        gen27.setOnClickListener(this);
        gen28.setOnClickListener(this);
        gen29.setOnClickListener(this);
        gen30.setOnClickListener(this);
        gen31.setOnClickListener(this);
        gen32.setOnClickListener(this);
        gen33.setOnClickListener(this);
        gen34.setOnClickListener(this);
        gen35.setOnClickListener(this);
        gen36.setOnClickListener(this);
        gen37.setOnClickListener(this);
        gen38.setOnClickListener(this);
        gen39.setOnClickListener(this);
        gen40.setOnClickListener(this);
        gen41.setOnClickListener(this);
        gen42.setOnClickListener(this);
        gen43.setOnClickListener(this);
        gen44.setOnClickListener(this);
        gen45.setOnClickListener(this);
        gen46.setOnClickListener(this);
        gen47.setOnClickListener(this);
        gen48.setOnClickListener(this);
        gen49.setOnClickListener(this);
        gen50.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.gen1){
            i = new Intent(this, Gen1.class);
            startActivity(i);
        }
        if (viewId == R.id.gen2){
            i = new Intent(this, Gen2.class);
            startActivity(i);
        }
        if (viewId == R.id.gen3){
            i = new Intent(this, Gen3.class);
            startActivity(i);
        }
        if (viewId == R.id.gen4){
            i = new Intent(this, Gen4.class);
            startActivity(i);
        }
        if (viewId == R.id.gen5){
            i = new Intent(this, Gen5.class);
            startActivity(i);
        }
        if (viewId == R.id.gen6){
            i = new Intent(this, Gen6.class);
            startActivity(i);
        }
        if (viewId == R.id.gen7){
            i = new Intent(this, Gen7.class);
            startActivity(i);
        }
        if (viewId == R.id.gen8){
            i = new Intent(this, Gen8.class);
            startActivity(i);
        }
        if (viewId == R.id.gen9){
            i = new Intent(this, Gen9.class);
            startActivity(i);
        }
        if (viewId == R.id.gen10){
            i = new Intent(this, Gen10.class);
            startActivity(i);
        }
        if (viewId == R.id.gen11){
            i = new Intent(this, Gen11.class);
            startActivity(i);
        }
        if (viewId == R.id.gen12){
            i = new Intent(this, Gen12.class);
            startActivity(i);
        }
        if (viewId == R.id.gen13){
            i = new Intent(this, Gen13.class);
            startActivity(i);
        }
        if (viewId == R.id.gen14){
            i = new Intent(this, Gen14.class);
            startActivity(i);
        }
        if (viewId == R.id.gen15){
            i = new Intent(this, Gen15.class);
            startActivity(i);
        }
        if (viewId == R.id.gen16){
            i = new Intent(this, Gen16.class);
            startActivity(i);
        }
        if (viewId == R.id.gen17){
            i = new Intent(this, Gen17.class);
            startActivity(i);
        }
        if (viewId == R.id.gen18){
            i = new Intent(this, Gen18.class);
            startActivity(i);
        }
        if (viewId == R.id.gen19){
            i = new Intent(this, Gen19.class);
            startActivity(i);
        }
        if (viewId == R.id.gen20){
            i = new Intent(this, Gen20.class);
            startActivity(i);
        }
        if (viewId == R.id.gen21){
            i = new Intent(this, Gen21.class);
            startActivity(i);
        }
        if (viewId == R.id.gen22){
            i = new Intent(this, Gen22.class);
            startActivity(i);
        }
        if (viewId == R.id.gen23){
            i = new Intent(this, Gen23.class);
            startActivity(i);
        }
        if (viewId == R.id.gen24){
            i = new Intent(this, Gen24.class);
            startActivity(i);
        }
        if (viewId == R.id.gen25){
            i = new Intent(this, Gen25.class);
            startActivity(i);
        }
        if (viewId == R.id.gen26){
            i = new Intent(this, Gen26.class);
            startActivity(i);
        }
        if (viewId == R.id.gen27){
            i = new Intent(this, Gen27.class);
            startActivity(i);
        }
        if (viewId == R.id.gen28){
            i = new Intent(this, Gen28.class);
            startActivity(i);
        }
        if (viewId == R.id.gen29){
            i = new Intent(this, Gen29.class);
            startActivity(i);
        }
        if (viewId == R.id.gen30){
            i = new Intent(this, Gen30.class);
            startActivity(i);
        }
        if (viewId == R.id.gen31){
            i = new Intent(this, Gen31.class);
            startActivity(i);
        }
        if (viewId == R.id.gen32){
            i = new Intent(this, Gen32.class);
            startActivity(i);
        }
        if (viewId == R.id.gen33){
            i = new Intent(this, Gen33.class);
            startActivity(i);
        }
        if (viewId == R.id.gen34){
            i = new Intent(this, Gen34.class);
            startActivity(i);
        }
        if (viewId == R.id.gen35){
            i = new Intent(this, Gen35.class);
            startActivity(i);
        }
        if (viewId == R.id.gen36){
            i = new Intent(this, Gen36.class);
            startActivity(i);
        }
        if (viewId == R.id.gen37){
            i = new Intent(this, Gen37.class);
            startActivity(i);
        }
        if (viewId == R.id.gen38){
            i = new Intent(this, Gen38.class);
            startActivity(i);
        }
        if (viewId == R.id.gen39){
            i = new Intent(this, Gen39.class);
            startActivity(i);
        }
        if (viewId == R.id.gen40){
            i = new Intent(this, Gen40.class);
            startActivity(i);
        }
        if (viewId == R.id.gen41){
            i = new Intent(this, Gen41.class);
            startActivity(i);
        }
        if (viewId == R.id.gen42){
            i = new Intent(this, Gen42.class);
            startActivity(i);
        }
        if (viewId == R.id.gen43){
            i = new Intent(this, Gen43.class);
            startActivity(i);
        }
        if (viewId == R.id.gen44){
            i = new Intent(this, Gen44.class);
            startActivity(i);
        }
        if (viewId == R.id.gen45){
            i = new Intent(this, Gen45.class);
            startActivity(i);
        }
        if (viewId == R.id.gen46){
            i = new Intent(this, Gen46.class);
            startActivity(i);
        }
        if (viewId == R.id.gen47){
            i = new Intent(this, Gen47.class);
            startActivity(i);
        }
        if (viewId == R.id.gen48){
            i = new Intent(this, Gen48.class);
            startActivity(i);
        }
        if (viewId == R.id.gen49){
            i = new Intent(this, Gen49.class);
            startActivity(i);
        }
        if (viewId == R.id.gen50){
            i = new Intent(this, Gen50.class);
            startActivity(i);
        }

    }
}
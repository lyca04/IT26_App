package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Job extends AppCompatActivity implements View.OnClickListener{
    public CardView job1, job2, job3, job4, job5, job6, job7, job8, job9, job10,
            job11, job12, job13, job14, job15, job16, job17, job18, job19, job20,
            job21, job22, job23, job24, job25, job26, job27, job28, job29, job30,
            job31, job32, job33, job34, job35, job36, job37, job38, job39, job40,
            job41, job42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);

        job1 = (CardView) findViewById(R.id.job1);
        job2 = (CardView) findViewById(R.id.job2);
        job3 = (CardView) findViewById(R.id.job3);
        job4 = (CardView) findViewById(R.id.job4);
        job5 = (CardView) findViewById(R.id.job5);
        job6 = (CardView) findViewById(R.id.job6);
        job7 = (CardView) findViewById(R.id.job7);
        job8 = (CardView) findViewById(R.id.job8);
        job9 = (CardView) findViewById(R.id.job9);
        job10 = (CardView) findViewById(R.id.job10);
        job11 = (CardView) findViewById(R.id.job11);
        job12 = (CardView) findViewById(R.id.job12);
        job13 = (CardView) findViewById(R.id.job13);
        job14 = (CardView) findViewById(R.id.job14);
        job15 = (CardView) findViewById(R.id.job15);
        job16 = (CardView) findViewById(R.id.job16);
        job17 = (CardView) findViewById(R.id.job17);
        job18 = (CardView) findViewById(R.id.job18);
        job19 = (CardView) findViewById(R.id.job19);
        job20 = (CardView) findViewById(R.id.job20);
        job21 = (CardView) findViewById(R.id.job21);
        job22 = (CardView) findViewById(R.id.job22);
        job23 = (CardView) findViewById(R.id.job23);
        job24 = (CardView) findViewById(R.id.job24);
        job25 = (CardView) findViewById(R.id.job25);
        job26 = (CardView) findViewById(R.id.job26);
        job27 = (CardView) findViewById(R.id.job27);
        job28 = (CardView) findViewById(R.id.job28);
        job29 = (CardView) findViewById(R.id.job29);
        job30 = (CardView) findViewById(R.id.job30);
        job31 = (CardView) findViewById(R.id.job31);
        job32 = (CardView) findViewById(R.id.job32);
        job33 = (CardView) findViewById(R.id.job33);
        job34 = (CardView) findViewById(R.id.job34);
        job35 = (CardView) findViewById(R.id.job35);
        job36 = (CardView) findViewById(R.id.job36);
        job37 = (CardView) findViewById(R.id.job37);
        job38 = (CardView) findViewById(R.id.job38);
        job39 = (CardView) findViewById(R.id.job39);
        job40 = (CardView) findViewById(R.id.job40);
        job41 = (CardView) findViewById(R.id.job41);
        job42 = (CardView) findViewById(R.id.job42);

        job1.setOnClickListener(this);
        job2.setOnClickListener(this);
        job3.setOnClickListener(this);
        job4.setOnClickListener(this);
        job5.setOnClickListener(this);
        job6.setOnClickListener(this);
        job7.setOnClickListener(this);
        job8.setOnClickListener(this);
        job9.setOnClickListener(this);
        job10.setOnClickListener(this);
        job11.setOnClickListener(this);
        job12.setOnClickListener(this);
        job13.setOnClickListener(this);
        job14.setOnClickListener(this);
        job15.setOnClickListener(this);
        job16.setOnClickListener(this);
        job17.setOnClickListener(this);
        job18.setOnClickListener(this);
        job19.setOnClickListener(this);
        job20.setOnClickListener(this);
        job21.setOnClickListener(this);
        job22.setOnClickListener(this);
        job23.setOnClickListener(this);
        job24.setOnClickListener(this);
        job25.setOnClickListener(this);
        job26.setOnClickListener(this);
        job27.setOnClickListener(this);
        job28.setOnClickListener(this);
        job29.setOnClickListener(this);
        job30.setOnClickListener(this);
        job31.setOnClickListener(this);
        job32.setOnClickListener(this);
        job33.setOnClickListener(this);
        job34.setOnClickListener(this);
        job35.setOnClickListener(this);
        job36.setOnClickListener(this);
        job37.setOnClickListener(this);
        job38.setOnClickListener(this);
        job39.setOnClickListener(this);
        job40.setOnClickListener(this);
        job41.setOnClickListener(this);
        job42.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.job1){
            i = new Intent(this, Job1.class);
            startActivity(i);
        }
        if (viewId == R.id.job2){
            i = new Intent(this, Job2.class);
            startActivity(i);
        }
        if (viewId == R.id.job3){
            i = new Intent(this, Job3.class);
            startActivity(i);
        }
        if (viewId == R.id.job4){
            i = new Intent(this, Job4.class);
            startActivity(i);
        }
        if (viewId == R.id.job5){
            i = new Intent(this, Job5.class);
            startActivity(i);
        }
        if (viewId == R.id.job6){
            i = new Intent(this, Job6.class);
            startActivity(i);
        }
        if (viewId == R.id.job7){
            i = new Intent(this, Job7.class);
            startActivity(i);
        }
        if (viewId == R.id.job8){
            i = new Intent(this, Job8.class);
            startActivity(i);
        }
        if (viewId == R.id.job9){
            i = new Intent(this, Job9.class);
            startActivity(i);
        }
        if (viewId == R.id.job10){
            i = new Intent(this, Job10.class);
            startActivity(i);
        }
        if (viewId == R.id.job11){
            i = new Intent(this, Job11.class);
            startActivity(i);
        }
        if (viewId == R.id.job12){
            i = new Intent(this, Job12.class);
            startActivity(i);
        }
        if (viewId == R.id.job13){
            i = new Intent(this, Job13.class);
            startActivity(i);
        }
        if (viewId == R.id.job14){
            i = new Intent(this, Job14.class);
            startActivity(i);
        }
        if (viewId == R.id.job15){
            i = new Intent(this, Job15.class);
            startActivity(i);
        }
        if (viewId == R.id.job16){
            i = new Intent(this, Job16.class);
            startActivity(i);
        }
        if (viewId == R.id.job17){
            i = new Intent(this, Job17.class);
            startActivity(i);
        }
        if (viewId == R.id.job18){
            i = new Intent(this, Job18.class);
            startActivity(i);
        }
        if (viewId == R.id.job19){
            i = new Intent(this, Job19.class);
            startActivity(i);
        }
        if (viewId == R.id.job20){
            i = new Intent(this, Job20.class);
            startActivity(i);
        }

        if (viewId == R.id.job21){
            i = new Intent(this, Job21.class);
            startActivity(i);
        }
        if (viewId == R.id.job22){
            i = new Intent(this, Job22.class);
            startActivity(i);
        }
        if (viewId == R.id.job23){
            i = new Intent(this, Job23.class);
            startActivity(i);
        }
        if (viewId == R.id.job24){
            i = new Intent(this, Job24.class);
            startActivity(i);
        }
        if (viewId == R.id.job25){
            i = new Intent(this, Job25.class);
            startActivity(i);
        }
        if (viewId == R.id.job26){
            i = new Intent(this, Job26.class);
            startActivity(i);
        }
        if (viewId == R.id.job27){
            i = new Intent(this, Job27.class);
            startActivity(i);
        }
        if (viewId == R.id.job28){
            i = new Intent(this, Job28.class);
            startActivity(i);
        }
        if (viewId == R.id.job29){
            i = new Intent(this, Job29.class);
            startActivity(i);
        }
        if (viewId == R.id.job30){
            i = new Intent(this, Job30.class);
            startActivity(i);
        }

        if (viewId == R.id.job31){
            i = new Intent(this, Job31.class);
            startActivity(i);
        }
        if (viewId == R.id.job32){
            i = new Intent(this, Job32.class);
            startActivity(i);
        }
        if (viewId == R.id.job33){
            i = new Intent(this, Job33.class);
            startActivity(i);
        }
        if (viewId == R.id.job34){
            i = new Intent(this, Job34.class);
            startActivity(i);
        }
        if (viewId == R.id.job35){
            i = new Intent(this, Job35.class);
            startActivity(i);
        }
        if (viewId == R.id.job36){
            i = new Intent(this, Job36.class);
            startActivity(i);
        }
        if (viewId == R.id.job37){
            i = new Intent(this, Job37.class);
            startActivity(i);
        }
        if (viewId == R.id.job38){
            i = new Intent(this, Job38.class);
            startActivity(i);
        }
        if (viewId == R.id.job39){
            i = new Intent(this, Job39.class);
            startActivity(i);
        }
        if (viewId == R.id.job40){
            i = new Intent(this, Job40.class);
            startActivity(i);
        }
        if (viewId == R.id.job41){
            i = new Intent(this, Job41.class);
            startActivity(i);
        }
        if (viewId == R.id.job42){
            i = new Intent(this, Job42.class);
            startActivity(i);
        }

    }
}
package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Salmo extends AppCompatActivity implements View.OnClickListener{
    public CardView sal1, sal2, sal3, sal4, sal5, sal6, sal7, sal8, sal9, sal10,
            sal11, sal12, sal13, sal14, sal15, sal16, sal17, sal18, sal19, sal20,
            sal21, sal22, sal23, sal24, sal25, sal26, sal27, sal28, sal29, sal30,
            sal31, sal32, sal33, sal34, sal35, sal36, sal37, sal38, sal39, sal40,
            sal41, sal42, sal43, sal44, sal45, sal46, sal47, sal48, sal49, sal50,
            sal51, sal52, sal53, sal54, sal55, sal56, sal57, sal58, sal59, sal60,
            sal61, sal62, sal63, sal64, sal65, sal66, sal67, sal68, sal69, sal70,
            sal71, sal72, sal73, sal74, sal75, sal76, sal77, sal78, sal79, sal80,
            sal81, sal82, sal83, sal84, sal85, sal86, sal87, sal88, sal89, sal90,
            sal91, sal92, sal93, sal94, sal95, sal96, sal97, sal98, sal99, sal100,
            sal101, sal102, sal103, sal104, sal105, sal106, sal107, sal108, sal109, sal110,
            sal111, sal112, sal113, sal114, sal115, sal116, sal117, sal118, sal119, sal120,
            sal121, sal122, sal123, sal124, sal125, sal126, sal127, sal128, sal129, sal130,
            sal131, sal132, sal133, sal134, sal135, sal136, sal137, sal138, sal139, sal140,
            sal141, sal142, sal143, sal144, sal145, sal146, sal147, sal148, sal149, sal150;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salmo);

        sal1 = (CardView) findViewById(R.id.sal1);
        sal2 = (CardView) findViewById(R.id.sal2);
        sal3 = (CardView) findViewById(R.id.sal3);
        sal4 = (CardView) findViewById(R.id.sal4);
        sal5 = (CardView) findViewById(R.id.sal5);
        sal6 = (CardView) findViewById(R.id.sal6);
        sal7 = (CardView) findViewById(R.id.sal7);
        sal8 = (CardView) findViewById(R.id.sal8);
        sal9 = (CardView) findViewById(R.id.sal9);
        sal10 = (CardView) findViewById(R.id.sal10);
        sal11 = (CardView) findViewById(R.id.sal11);
        sal12 = (CardView) findViewById(R.id.sal12);
        sal13 = (CardView) findViewById(R.id.sal13);
        sal14 = (CardView) findViewById(R.id.sal14);
        sal15 = (CardView) findViewById(R.id.sal15);
        sal16 = (CardView) findViewById(R.id.sal16);
        sal17 = (CardView) findViewById(R.id.sal17);
        sal18 = (CardView) findViewById(R.id.sal18);
        sal19 = (CardView) findViewById(R.id.sal19);
        sal20 = (CardView) findViewById(R.id.sal20);
        sal21 = (CardView) findViewById(R.id.sal21);
        sal22 = (CardView) findViewById(R.id.sal22);
        sal23 = (CardView) findViewById(R.id.sal23);
        sal24 = (CardView) findViewById(R.id.sal24);
        sal25 = (CardView) findViewById(R.id.sal25);
        sal26 = (CardView) findViewById(R.id.sal26);
        sal27 = (CardView) findViewById(R.id.sal27);
        sal28 = (CardView) findViewById(R.id.sal28);
        sal29 = (CardView) findViewById(R.id.sal29);
        sal30 = (CardView) findViewById(R.id.sal30);
        sal31 = (CardView) findViewById(R.id.sal31);
        sal32 = (CardView) findViewById(R.id.sal32);
        sal33 = (CardView) findViewById(R.id.sal33);
        sal34 = (CardView) findViewById(R.id.sal34);
        sal35 = (CardView) findViewById(R.id.sal35);
        sal36 = (CardView) findViewById(R.id.sal36);
        sal37 = (CardView) findViewById(R.id.sal37);
        sal38 = (CardView) findViewById(R.id.sal38);
        sal39 = (CardView) findViewById(R.id.sal39);
        sal40 = (CardView) findViewById(R.id.sal40);
        sal41 = (CardView) findViewById(R.id.sal41);
        sal42 = (CardView) findViewById(R.id.sal42);
        sal43 = (CardView) findViewById(R.id.sal43);
        sal44 = (CardView) findViewById(R.id.sal44);
        sal45 = (CardView) findViewById(R.id.sal45);
        sal46 = (CardView) findViewById(R.id.sal46);
        sal47 = (CardView) findViewById(R.id.sal47);
        sal48 = (CardView) findViewById(R.id.sal48);
        sal49 = (CardView) findViewById(R.id.sal49);
        sal50 = (CardView) findViewById(R.id.sal50);
        sal51 = (CardView) findViewById(R.id.sal51);
        sal52 = (CardView) findViewById(R.id.sal52);
        sal53 = (CardView) findViewById(R.id.sal53);
        sal54 = (CardView) findViewById(R.id.sal54);
        sal55 = (CardView) findViewById(R.id.sal55);
        sal56 = (CardView) findViewById(R.id.sal56);
        sal57 = (CardView) findViewById(R.id.sal57);
        sal58 = (CardView) findViewById(R.id.sal58);
        sal59 = (CardView) findViewById(R.id.sal59);
        sal60 = (CardView) findViewById(R.id.sal60);
        sal61 = (CardView) findViewById(R.id.sal61);
        sal62 = (CardView) findViewById(R.id.sal62);
        sal63 = (CardView) findViewById(R.id.sal63);
        sal64 = (CardView) findViewById(R.id.sal64);
        sal65 = (CardView) findViewById(R.id.sal65);
        sal66 = (CardView) findViewById(R.id.sal66);
        sal67 = (CardView) findViewById(R.id.sal67);
        sal68 = (CardView) findViewById(R.id.sal68);
        sal69 = (CardView) findViewById(R.id.sal69);
        sal70 = (CardView) findViewById(R.id.sal70);
        sal71 = (CardView) findViewById(R.id.sal71);
        sal72 = (CardView) findViewById(R.id.sal72);
        sal73 = (CardView) findViewById(R.id.sal73);
        sal74 = (CardView) findViewById(R.id.sal74);
        sal75 = (CardView) findViewById(R.id.sal75);
        sal76 = (CardView) findViewById(R.id.sal76);
        sal77 = (CardView) findViewById(R.id.sal77);
        sal78 = (CardView) findViewById(R.id.sal78);
        sal79 = (CardView) findViewById(R.id.sal79);
        sal80 = (CardView) findViewById(R.id.sal80);
        sal81 = (CardView) findViewById(R.id.sal81);
        sal82 = (CardView) findViewById(R.id.sal82);
        sal83 = (CardView) findViewById(R.id.sal83);
        sal84 = (CardView) findViewById(R.id.sal84);
        sal85 = (CardView) findViewById(R.id.sal85);
        sal86 = (CardView) findViewById(R.id.sal86);
        sal87 = (CardView) findViewById(R.id.sal87);
        sal88 = (CardView) findViewById(R.id.sal88);
        sal89 = (CardView) findViewById(R.id.sal89);
        sal90 = (CardView) findViewById(R.id.sal90);
        sal91 = (CardView) findViewById(R.id.sal91);
        sal92 = (CardView) findViewById(R.id.sal92);
        sal93 = (CardView) findViewById(R.id.sal93);
        sal94 = (CardView) findViewById(R.id.sal94);
        sal95 = (CardView) findViewById(R.id.sal95);
        sal96 = (CardView) findViewById(R.id.sal96);
        sal97 = (CardView) findViewById(R.id.sal97);
        sal98 = (CardView) findViewById(R.id.sal98);
        sal99 = (CardView) findViewById(R.id.sal99);
        sal100 = (CardView) findViewById(R.id.sal100);
        sal101 = (CardView) findViewById(R.id.sal101);
        sal102 = (CardView) findViewById(R.id.sal102);
        sal103 = (CardView) findViewById(R.id.sal103);
        sal104 = (CardView) findViewById(R.id.sal104);
        sal105 = (CardView) findViewById(R.id.sal105);
        sal106 = (CardView) findViewById(R.id.sal106);
        sal107 = (CardView) findViewById(R.id.sal107);
        sal108 = (CardView) findViewById(R.id.sal108);
        sal109 = (CardView) findViewById(R.id.sal109);
        sal110 = (CardView) findViewById(R.id.sal110);
        sal111 = (CardView) findViewById(R.id.sal111);
        sal112 = (CardView) findViewById(R.id.sal112);
        sal113 = (CardView) findViewById(R.id.sal113);
        sal114 = (CardView) findViewById(R.id.sal114);
        sal115 = (CardView) findViewById(R.id.sal115);
        sal116 = (CardView) findViewById(R.id.sal116);
        sal117 = (CardView) findViewById(R.id.sal117);
        sal118 = (CardView) findViewById(R.id.sal118);
        sal119 = (CardView) findViewById(R.id.sal119);
        sal120 = (CardView) findViewById(R.id.sal120);
        sal121 = (CardView) findViewById(R.id.sal121);
        sal122 = (CardView) findViewById(R.id.sal122);
        sal123 = (CardView) findViewById(R.id.sal123);
        sal124 = (CardView) findViewById(R.id.sal124);
        sal125 = (CardView) findViewById(R.id.sal125);
        sal126 = (CardView) findViewById(R.id.sal126);
        sal127 = (CardView) findViewById(R.id.sal127);
        sal128 = (CardView) findViewById(R.id.sal128);
        sal129 = (CardView) findViewById(R.id.sal129);
        sal130 = (CardView) findViewById(R.id.sal130);
        sal131 = (CardView) findViewById(R.id.sal131);
        sal132 = (CardView) findViewById(R.id.sal132);
        sal133 = (CardView) findViewById(R.id.sal133);
        sal134 = (CardView) findViewById(R.id.sal134);
        sal135 = (CardView) findViewById(R.id.sal135);
        sal136 = (CardView) findViewById(R.id.sal136);
        sal137 = (CardView) findViewById(R.id.sal137);
        sal138 = (CardView) findViewById(R.id.sal138);
        sal139 = (CardView) findViewById(R.id.sal139);
        sal140 = (CardView) findViewById(R.id.sal140);
        sal141 = (CardView) findViewById(R.id.sal141);
        sal142 = (CardView) findViewById(R.id.sal142);
        sal143 = (CardView) findViewById(R.id.sal143);
        sal144 = (CardView) findViewById(R.id.sal144);
        sal145 = (CardView) findViewById(R.id.sal145);
        sal146 = (CardView) findViewById(R.id.sal146);
        sal147 = (CardView) findViewById(R.id.sal147);
        sal148 = (CardView) findViewById(R.id.sal148);
        sal149 = (CardView) findViewById(R.id.sal149);
        sal150 = (CardView) findViewById(R.id.sal150);

        sal1.setOnClickListener(this);
        sal2.setOnClickListener(this);
        sal3.setOnClickListener(this);
        sal4.setOnClickListener(this);
        sal5.setOnClickListener(this);
        sal6.setOnClickListener(this);
        sal7.setOnClickListener(this);
        sal8.setOnClickListener(this);
        sal9.setOnClickListener(this);
        sal10.setOnClickListener(this);
        sal11.setOnClickListener(this);
        sal12.setOnClickListener(this);
        sal13.setOnClickListener(this);
        sal14.setOnClickListener(this);
        sal15.setOnClickListener(this);
        sal16.setOnClickListener(this);
        sal17.setOnClickListener(this);
        sal18.setOnClickListener(this);
        sal19.setOnClickListener(this);
        sal20.setOnClickListener(this);
        sal21.setOnClickListener(this);
        sal22.setOnClickListener(this);
        sal23.setOnClickListener(this);
        sal24.setOnClickListener(this);
        sal25.setOnClickListener(this);
        sal26.setOnClickListener(this);
        sal27.setOnClickListener(this);
        sal28.setOnClickListener(this);
        sal29.setOnClickListener(this);
        sal30.setOnClickListener(this);
        sal31.setOnClickListener(this);
        sal32.setOnClickListener(this);
        sal33.setOnClickListener(this);
        sal34.setOnClickListener(this);
        sal35.setOnClickListener(this);
        sal36.setOnClickListener(this);
        sal37.setOnClickListener(this);
        sal38.setOnClickListener(this);
        sal39.setOnClickListener(this);
        sal40.setOnClickListener(this);
        sal41.setOnClickListener(this);
        sal42.setOnClickListener(this);
        sal43.setOnClickListener(this);
        sal44.setOnClickListener(this);
        sal45.setOnClickListener(this);
        sal46.setOnClickListener(this);
        sal47.setOnClickListener(this);
        sal48.setOnClickListener(this);
        sal49.setOnClickListener(this);
        sal50.setOnClickListener(this);
        sal51.setOnClickListener(this);
        sal52.setOnClickListener(this);
        sal53.setOnClickListener(this);
        sal54.setOnClickListener(this);
        sal55.setOnClickListener(this);
        sal56.setOnClickListener(this);
        sal57.setOnClickListener(this);
        sal58.setOnClickListener(this);
        sal59.setOnClickListener(this);
        sal60.setOnClickListener(this);
        sal61.setOnClickListener(this);
        sal62.setOnClickListener(this);
        sal63.setOnClickListener(this);
        sal64.setOnClickListener(this);
        sal65.setOnClickListener(this);
        sal66.setOnClickListener(this);
        sal67.setOnClickListener(this);
        sal68.setOnClickListener(this);
        sal69.setOnClickListener(this);
        sal70.setOnClickListener(this);
        sal71.setOnClickListener(this);
        sal72.setOnClickListener(this);
        sal73.setOnClickListener(this);
        sal74.setOnClickListener(this);
        sal75.setOnClickListener(this);
        sal76.setOnClickListener(this);
        sal77.setOnClickListener(this);
        sal78.setOnClickListener(this);
        sal79.setOnClickListener(this);
        sal80.setOnClickListener(this);
        sal81.setOnClickListener(this);
        sal82.setOnClickListener(this);
        sal83.setOnClickListener(this);
        sal84.setOnClickListener(this);
        sal85.setOnClickListener(this);
        sal86.setOnClickListener(this);
        sal87.setOnClickListener(this);
        sal88.setOnClickListener(this);
        sal89.setOnClickListener(this);
        sal90.setOnClickListener(this);
        sal91.setOnClickListener(this);
        sal92.setOnClickListener(this);
        sal93.setOnClickListener(this);
        sal94.setOnClickListener(this);
        sal95.setOnClickListener(this);
        sal96.setOnClickListener(this);
        sal97.setOnClickListener(this);
        sal98.setOnClickListener(this);
        sal99.setOnClickListener(this);
        sal100.setOnClickListener(this);
        sal101.setOnClickListener(this);
        sal102.setOnClickListener(this);
        sal103.setOnClickListener(this);
        sal104.setOnClickListener(this);
        sal105.setOnClickListener(this);
        sal106.setOnClickListener(this);
        sal107.setOnClickListener(this);
        sal108.setOnClickListener(this);
        sal109.setOnClickListener(this);
        sal110.setOnClickListener(this);
        sal111.setOnClickListener(this);
        sal112.setOnClickListener(this);
        sal113.setOnClickListener(this);
        sal114.setOnClickListener(this);
        sal115.setOnClickListener(this);
        sal116.setOnClickListener(this);
        sal117.setOnClickListener(this);
        sal118.setOnClickListener(this);
        sal119.setOnClickListener(this);
        sal120.setOnClickListener(this);
        sal121.setOnClickListener(this);
        sal122.setOnClickListener(this);
        sal123.setOnClickListener(this);
        sal124.setOnClickListener(this);
        sal125.setOnClickListener(this);
        sal126.setOnClickListener(this);
        sal127.setOnClickListener(this);
        sal128.setOnClickListener(this);
        sal129.setOnClickListener(this);
        sal130.setOnClickListener(this);
        sal131.setOnClickListener(this);
        sal132.setOnClickListener(this);
        sal133.setOnClickListener(this);
        sal134.setOnClickListener(this);
        sal135.setOnClickListener(this);
        sal136.setOnClickListener(this);
        sal137.setOnClickListener(this);
        sal138.setOnClickListener(this);
        sal139.setOnClickListener(this);
        sal140.setOnClickListener(this);
        sal141.setOnClickListener(this);
        sal142.setOnClickListener(this);
        sal143.setOnClickListener(this);
        sal144.setOnClickListener(this);
        sal145.setOnClickListener(this);
        sal146.setOnClickListener(this);
        sal147.setOnClickListener(this);
        sal148.setOnClickListener(this);
        sal149.setOnClickListener(this);
        sal150.setOnClickListener(this);

    }
    @Override
    public  void onClick(View view) {
        Intent i;

        int viewId = view.getId();

        if (viewId == R.id.sal1){
            i = new Intent(this, Sal1.class);
            startActivity(i);
        }
        if (viewId == R.id.sal2){
            i = new Intent(this, Sal2.class);
            startActivity(i);
        }
        if (viewId == R.id.sal3){
            i = new Intent(this, Sal3.class);
            startActivity(i);
        }
        if (viewId == R.id.sal4){
            i = new Intent(this, Sal4.class);
            startActivity(i);
        }
        if (viewId == R.id.sal5){
            i = new Intent(this, Sal5.class);
            startActivity(i);
        }
        if (viewId == R.id.sal6){
            i = new Intent(this, Sal6.class);
            startActivity(i);
        }
        if (viewId == R.id.sal7){
            i = new Intent(this, Sal7.class);
            startActivity(i);
        }
        if (viewId == R.id.sal8){
            i = new Intent(this, Sal8.class);
            startActivity(i);
        }
        if (viewId == R.id.sal9){
            i = new Intent(this, Sal9.class);
            startActivity(i);
        }
        if (viewId == R.id.sal10){
            i = new Intent(this, Sal10.class);
            startActivity(i);
        }
        if (viewId == R.id.sal11){
            i = new Intent(this, Sal11.class);
            startActivity(i);
        }
        if (viewId == R.id.sal12){
            i = new Intent(this, Sal12.class);
            startActivity(i);
        }
        if (viewId == R.id.sal13){
            i = new Intent(this, Sal13.class);
            startActivity(i);
        }
        if (viewId == R.id.sal14){
            i = new Intent(this, Sal14.class);
            startActivity(i);
        }
        if (viewId == R.id.sal15){
            i = new Intent(this, Sal15.class);
            startActivity(i);
        }
        if (viewId == R.id.sal16){
            i = new Intent(this, Sal16.class);
            startActivity(i);
        }
        if (viewId == R.id.sal17){
            i = new Intent(this, Sal17.class);
            startActivity(i);
        }
        if (viewId == R.id.sal18){
            i = new Intent(this, Sal18.class);
            startActivity(i);
        }
        if (viewId == R.id.sal19){
            i = new Intent(this, Sal19.class);
            startActivity(i);
        }
        if (viewId == R.id.sal20){
            i = new Intent(this, Sal20.class);
            startActivity(i);
        }
        if (viewId == R.id.sal21){
            i = new Intent(this, Sal21.class);
            startActivity(i);
        }
        if (viewId == R.id.sal22){
            i = new Intent(this, Sal22.class);
            startActivity(i);
        }
        if (viewId == R.id.sal23){
            i = new Intent(this, Sal23.class);
            startActivity(i);
        }
        if (viewId == R.id.sal24){
            i = new Intent(this, Sal24.class);
            startActivity(i);
        }
        if (viewId == R.id.sal25){
            i = new Intent(this, Sal25.class);
            startActivity(i);
        }
        if (viewId == R.id.sal26){
            i = new Intent(this, Sal26.class);
            startActivity(i);
        }
        if (viewId == R.id.sal27){
            i = new Intent(this, Sal27.class);
            startActivity(i);
        }
        if (viewId == R.id.sal28){
            i = new Intent(this, Sal28.class);
            startActivity(i);
        }
        if (viewId == R.id.sal29){
            i = new Intent(this, Sal29.class);
            startActivity(i);
        }
        if (viewId == R.id.sal30){
            i = new Intent(this, Sal30.class);
            startActivity(i);
        }
        if (viewId == R.id.sal31){
            i = new Intent(this, Sal31.class);
            startActivity(i);
        }
        if (viewId == R.id.sal32){
            i = new Intent(this, Sal32.class);
            startActivity(i);
        }
        if (viewId == R.id.sal33){
            i = new Intent(this, Sal33.class);
            startActivity(i);
        }
        if (viewId == R.id.sal34){
            i = new Intent(this, Sal34.class);
            startActivity(i);
        }
        if (viewId == R.id.sal35){
            i = new Intent(this, Sal35.class);
            startActivity(i);
        }
        if (viewId == R.id.sal36){
            i = new Intent(this, Sal36.class);
            startActivity(i);
        }
        if (viewId == R.id.sal37){
            i = new Intent(this, Sal37.class);
            startActivity(i);
        }
        if (viewId == R.id.sal38){
            i = new Intent(this, Sal38.class);
            startActivity(i);
        }
        if (viewId == R.id.sal39){
            i = new Intent(this, Sal39.class);
            startActivity(i);
        }
        if (viewId == R.id.sal40){
            i = new Intent(this, Sal40.class);
            startActivity(i);
        }
        if (viewId == R.id.sal41){
            i = new Intent(this, Sal41.class);
            startActivity(i);
        }
        if (viewId == R.id.sal42){
            i = new Intent(this, Sal42.class);
            startActivity(i);
        }
        if (viewId == R.id.sal43){
            i = new Intent(this, Sal43.class);
            startActivity(i);
        }
        if (viewId == R.id.sal44){
            i = new Intent(this, Sal44.class);
            startActivity(i);
        }
        if (viewId == R.id.sal45){
            i = new Intent(this, Sal45.class);
            startActivity(i);
        }
        if (viewId == R.id.sal46){
            i = new Intent(this, Sal46.class);
            startActivity(i);
        }
        if (viewId == R.id.sal47){
            i = new Intent(this, Sal47.class);
            startActivity(i);
        }
        if (viewId == R.id.sal48){
            i = new Intent(this, Sal48.class);
            startActivity(i);
        }
        if (viewId == R.id.sal49){
            i = new Intent(this, Sal49.class);
            startActivity(i);
        }
        if (viewId == R.id.sal50){
            i = new Intent(this, Sal50.class);
            startActivity(i);
        }
        if (viewId == R.id.sal51){
            i = new Intent(this, Sal51.class);
            startActivity(i);
        }
        if (viewId == R.id.sal52){
            i = new Intent(this, Sal52.class);
            startActivity(i);
        }
        if (viewId == R.id.sal53){
            i = new Intent(this, Sal53.class);
            startActivity(i);
        }
        if (viewId == R.id.sal54){
            i = new Intent(this, Sal54.class);
            startActivity(i);
        }
        if (viewId == R.id.sal55){
            i = new Intent(this, Sal55.class);
            startActivity(i);
        }
        if (viewId == R.id.sal56){
            i = new Intent(this, Sal56.class);
            startActivity(i);
        }
        if (viewId == R.id.sal57){
            i = new Intent(this, Sal57.class);
            startActivity(i);
        }
        if (viewId == R.id.sal58){
            i = new Intent(this, Sal58.class);
            startActivity(i);
        }
        if (viewId == R.id.sal59){
            i = new Intent(this, Sal59.class);
            startActivity(i);
        }
        if (viewId == R.id.sal60){
            i = new Intent(this, Sal60.class);
            startActivity(i);
        }
        if (viewId == R.id.sal61){
            i = new Intent(this, Sal61.class);
            startActivity(i);
        }
        if (viewId == R.id.sal62){
            i = new Intent(this, Sal62.class);
            startActivity(i);
        }
        if (viewId == R.id.sal63){
            i = new Intent(this, Sal63.class);
            startActivity(i);
        }
        if (viewId == R.id.sal64){
            i = new Intent(this, Sal64.class);
            startActivity(i);
        }
        if (viewId == R.id.sal65){
            i = new Intent(this, Sal65.class);
            startActivity(i);
        }
        if (viewId == R.id.sal66){
            i = new Intent(this, Sal66.class);
            startActivity(i);
        }
        if (viewId == R.id.sal67){
            i = new Intent(this, Sal67.class);
            startActivity(i);
        }
        if (viewId == R.id.sal68){
            i = new Intent(this, Sal68.class);
            startActivity(i);
        }
        if (viewId == R.id.sal69){
            i = new Intent(this, Sal69.class);
            startActivity(i);
        }
        if (viewId == R.id.sal70){
            i = new Intent(this, Sal70.class);
            startActivity(i);
        }
        if (viewId == R.id.sal71){
            i = new Intent(this, Sal71.class);
            startActivity(i);
        }
        if (viewId == R.id.sal72){
            i = new Intent(this, Sal72.class);
            startActivity(i);
        }
        if (viewId == R.id.sal73){
            i = new Intent(this, Sal73.class);
            startActivity(i);
        }
        if (viewId == R.id.sal74){
            i = new Intent(this, Sal74.class);
            startActivity(i);
        }
        if (viewId == R.id.sal75){
            i = new Intent(this, Sal75.class);
            startActivity(i);
        }
        if (viewId == R.id.sal76){
            i = new Intent(this, Sal76.class);
            startActivity(i);
        }
        if (viewId == R.id.sal77){
            i = new Intent(this, Sal77.class);
            startActivity(i);
        }
        if (viewId == R.id.sal78){
            i = new Intent(this, Sal78.class);
            startActivity(i);
        }
        if (viewId == R.id.sal79){
            i = new Intent(this, Sal79.class);
            startActivity(i);
        }
        if (viewId == R.id.sal80){
            i = new Intent(this, Sal80.class);
            startActivity(i);
        }
        if (viewId == R.id.sal81){
            i = new Intent(this, Sal81.class);
            startActivity(i);
        }
        if (viewId == R.id.sal82){
            i = new Intent(this, Sal82.class);
            startActivity(i);
        }
        if (viewId == R.id.sal83){
            i = new Intent(this, Sal83.class);
            startActivity(i);
        }
        if (viewId == R.id.sal84){
            i = new Intent(this, Sal84.class);
            startActivity(i);
        }
        if (viewId == R.id.sal85){
            i = new Intent(this, Sal85.class);
            startActivity(i);
        }
        if (viewId == R.id.sal86){
            i = new Intent(this, Sal86.class);
            startActivity(i);
        }
        if (viewId == R.id.sal87){
            i = new Intent(this, Sal87.class);
            startActivity(i);
        }
        if (viewId == R.id.sal88){
            i = new Intent(this, Sal88.class);
            startActivity(i);
        }
        if (viewId == R.id.sal89){
            i = new Intent(this, Sal89.class);
            startActivity(i);
        }
        if (viewId == R.id.sal90){
            i = new Intent(this, Sal90.class);
            startActivity(i);
        }
        if (viewId == R.id.sal91){
            i = new Intent(this, Sal91.class);
            startActivity(i);
        }
        if (viewId == R.id.sal92){
            i = new Intent(this, Sal92.class);
            startActivity(i);
        }
        if (viewId == R.id.sal93){
            i = new Intent(this, Sal93.class);
            startActivity(i);
        }
        if (viewId == R.id.sal94){
            i = new Intent(this, Sal94.class);
            startActivity(i);
        }
        if (viewId == R.id.sal95){
            i = new Intent(this, Sal95.class);
            startActivity(i);
        }
        if (viewId == R.id.sal96){
            i = new Intent(this, Sal96.class);
            startActivity(i);
        }
        if (viewId == R.id.sal97){
            i = new Intent(this, Sal97.class);
            startActivity(i);
        }
        if (viewId == R.id.sal98){
            i = new Intent(this, Sal98.class);
            startActivity(i);
        }
        if (viewId == R.id.sal99){
            i = new Intent(this, Sal99.class);
            startActivity(i);
        }
        if (viewId == R.id.sal100){
            i = new Intent(this, Sal100.class);
            startActivity(i);
        }
        if (viewId == R.id.sal101){
            i = new Intent(this, Sal101.class);
            startActivity(i);
        }
        if (viewId == R.id.sal102){
            i = new Intent(this, Sal102.class);
            startActivity(i);
        }
        if (viewId == R.id.sal103){
            i = new Intent(this, Sal103.class);
            startActivity(i);
        }
        if (viewId == R.id.sal104){
            i = new Intent(this, Sal104.class);
            startActivity(i);
        }
        if (viewId == R.id.sal105){
            i = new Intent(this, Sal105.class);
            startActivity(i);
        }
        if (viewId == R.id.sal106){
            i = new Intent(this, Sal106.class);
            startActivity(i);
        }
        if (viewId == R.id.sal107){
            i = new Intent(this, Sal107.class);
            startActivity(i);
        }
        if (viewId == R.id.sal108){
            i = new Intent(this, Sal108.class);
            startActivity(i);
        }
        if (viewId == R.id.sal109){
            i = new Intent(this, Sal109.class);
            startActivity(i);
        }
        if (viewId == R.id.sal110){
            i = new Intent(this, Sal110.class);
            startActivity(i);
        }
        if (viewId == R.id.sal111){
            i = new Intent(this, Sal111.class);
            startActivity(i);
        }
        if (viewId == R.id.sal112){
            i = new Intent(this, Sal112.class);
            startActivity(i);
        }
        if (viewId == R.id.sal113){
            i = new Intent(this, Sal113.class);
            startActivity(i);
        }
        if (viewId == R.id.sal114){
            i = new Intent(this, Sal114.class);
            startActivity(i);
        }
        if (viewId == R.id.sal115){
            i = new Intent(this, Sal115.class);
            startActivity(i);
        }
        if (viewId == R.id.sal116){
            i = new Intent(this, Sal116.class);
            startActivity(i);
        }
        if (viewId == R.id.sal117){
            i = new Intent(this, Sal117.class);
            startActivity(i);
        }
        if (viewId == R.id.sal118){
            i = new Intent(this, Sal118.class);
            startActivity(i);
        }
        if (viewId == R.id.sal119){
            i = new Intent(this, Sal119.class);
            startActivity(i);
        }
        if (viewId == R.id.sal120){
            i = new Intent(this, Sal120.class);
            startActivity(i);
        }
        if (viewId == R.id.sal121){
            i = new Intent(this, Sal121.class);
            startActivity(i);
        }
        if (viewId == R.id.sal122){
            i = new Intent(this, Sal122.class);
            startActivity(i);
        }
        if (viewId == R.id.sal123){
            i = new Intent(this, Sal123.class);
            startActivity(i);
        }
        if (viewId == R.id.sal124){
            i = new Intent(this, Sal124.class);
            startActivity(i);
        }
        if (viewId == R.id.sal125){
            i = new Intent(this, Sal125.class);
            startActivity(i);
        }
        if (viewId == R.id.sal126){
            i = new Intent(this, Sal126.class);
            startActivity(i);
        }
        if (viewId == R.id.sal127){
            i = new Intent(this, Sal127.class);
            startActivity(i);
        }
        if (viewId == R.id.sal128){
            i = new Intent(this, Sal128.class);
            startActivity(i);
        }
        if (viewId == R.id.sal129){
            i = new Intent(this, Sal129.class);
            startActivity(i);
        }
        if (viewId == R.id.sal130){
            i = new Intent(this, Sal130.class);
            startActivity(i);
        }
        if (viewId == R.id.sal131){
            i = new Intent(this, Sal131.class);
            startActivity(i);
        }
        if (viewId == R.id.sal132){
            i = new Intent(this, Sal132.class);
            startActivity(i);
        }
        if (viewId == R.id.sal133){
            i = new Intent(this, Sal133.class);
            startActivity(i);
        }
        if (viewId == R.id.sal134){
            i = new Intent(this, Sal134.class);
            startActivity(i);
        }
        if (viewId == R.id.sal135){
            i = new Intent(this, Sal135.class);
            startActivity(i);
        }
        if (viewId == R.id.sal136){
            i = new Intent(this, Sal136.class);
            startActivity(i);
        }
        if (viewId == R.id.sal137){
            i = new Intent(this, Sal137.class);
            startActivity(i);
        }
        if (viewId == R.id.sal138){
            i = new Intent(this, Sal138.class);
            startActivity(i);
        }
        if (viewId == R.id.sal139){
            i = new Intent(this, Sal139.class);
            startActivity(i);
        }
        if (viewId == R.id.sal140){
            i = new Intent(this, Sal140.class);
            startActivity(i);
        }
        if (viewId == R.id.sal141){
            i = new Intent(this, Sal141.class);
            startActivity(i);
        }
        if (viewId == R.id.sal142){
            i = new Intent(this, Sal142.class);
            startActivity(i);
        }
        if (viewId == R.id.sal143){
            i = new Intent(this, Sal143.class);
            startActivity(i);
        }
        if (viewId == R.id.sal144){
            i = new Intent(this, Sal144.class);
            startActivity(i);
        }
        if (viewId == R.id.sal145){
            i = new Intent(this, Sal145.class);
            startActivity(i);
        }
        if (viewId == R.id.sal146){
            i = new Intent(this, Sal146.class);
            startActivity(i);
        }
        if (viewId == R.id.sal147){
            i = new Intent(this, Sal147.class);
            startActivity(i);
        }
        if (viewId == R.id.sal148){
            i = new Intent(this, Sal148.class);
            startActivity(i);
        }
        if (viewId == R.id.sal149){
            i = new Intent(this, Sal149.class);
            startActivity(i);
        }
        if (viewId == R.id.sal150){
            i = new Intent(this, Sal150.class);
            startActivity(i);
        }

    }
}
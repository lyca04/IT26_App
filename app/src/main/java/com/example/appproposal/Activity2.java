package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

import java.util.Calendar;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        final DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);

        findViewById(R.id.imageView1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { drawerLayout.openDrawer(GravityCompat.START);}
        });

        //use this code if you have a custom icon
        NavigationView navigationView = findViewById(R.id.navigaton_view);
        navigationView.setItemIconTintList(null);

        //Navigation Side Drawer
        NavController navController = Navigation.findNavController(this, R.id.navHostFragment);
        NavigationUI.setupWithNavController(navigationView, navController);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_side, menu); // Replace 'your_menu' with your actual menu resource name
        setDateIcon(menu);
        Log.d("onCreateOptionsMenu", "Menu inflated");
        return true;
    }

    private void setDateIcon(Menu menu) {
        String date = String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        Drawable dateDrawable = generateDateDrawable(this, date);

        MenuItem todayItem = menu.findItem(R.id.nav_today); // Replace 'R.id.nav_today' with the correct ID from your menu

        if (todayItem != null) {
            Drawable calendarIcon = ContextCompat.getDrawable(this, R.drawable.baseline_calendar_today_24);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{calendarIcon, dateDrawable});
            layerDrawable.setLayerInset(1, 36, 36, 0, 0);  // Adjust these values as needed

            todayItem.setIcon(layerDrawable);

            // Log statements for debugging
            Log.d("setDateIcon", "setIcon called for nav_today");
        } else {
            Log.d("setDateIcon", "nav_today item not found");
        }
    }


    // Method to generate date drawable
    public Drawable generateDateDrawable(Context context, String date) {
        // Define paint attributes
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        paint.setTextSize(40); // Adjust the text size as needed
        paint.setTextAlign(Paint.Align.CENTER);

        // Define bitmap size
        int width = 100; // Adjust the width as needed
        int height = 100; // Adjust the height as needed

        // Create a bitmap and canvas to draw on
        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);

        // Draw the text on the canvas
        float x = width / 2;
        float y = (height / 2) - ((paint.descent() + paint.ascent()) / 2);
        canvas.drawText(date, x, y, paint);

        // Log the dimensions of the bitmap
        Log.d("generateDateDrawable", "Bitmap dimensions: " + bitmap.getWidth() + "x" + bitmap.getHeight());

        // Convert the bitmap to a drawable
        return new BitmapDrawable(context.getResources(), bitmap);
    }

}
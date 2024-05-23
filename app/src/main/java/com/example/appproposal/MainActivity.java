package com.example.appproposal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView dateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateTextView = (TextView) findViewById(R.id.date_bg);
        // Set the current date to the TextView
        setCurrentDate();


        button = (Button) findViewById(R.id.amen);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openActivity2();
                button.setEnabled(false);

                // Call finish() para sa pag-back sa previous activity
                finish();
            }
        });
    }

    private void setCurrentDate() {
        // Get the current date
        Date date = new Date();
        // Format the date as desired
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault());
        String formattedDate = dateFormat.format(date);
        // Set the formatted date to the TextView
        dateTextView.setText(formattedDate);
    }

    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

}
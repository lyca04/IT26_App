package com.example.appproposal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Adddevotion extends AppCompatActivity {

    private EditText verseEditText, opinionEditText, applicationEditText, prayerEditText;
    private Button saveDevotionButton;
    private DatabaseReference databaseReference;
    private String devotionId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddevotion);

        verseEditText = findViewById(R.id.verseEditText);
        opinionEditText = findViewById(R.id.opinionEditText);
        applicationEditText = findViewById(R.id.applicationEditText);
        prayerEditText = findViewById(R.id.prayerEditText);
        saveDevotionButton = findViewById(R.id.saveDevotionButton);

        // Initialize Firebase database reference
        databaseReference = FirebaseDatabase.getInstance().getReference("devotion");

        devotionId = getIntent().getStringExtra("devotionId");
        if(devotionId != null) {
            verseEditText.setText(getIntent().getStringExtra("verse"));
            opinionEditText.setText(getIntent().getStringExtra("opinion"));
            applicationEditText.setText(getIntent().getStringExtra("application"));
            prayerEditText.setText(getIntent().getStringExtra("prayer"));
            saveDevotionButton.setText("Update Devotion");
        }

        saveDevotionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveNote();
            }
        });
    }

    private void saveNote() {
        String verse = verseEditText.getText().toString().trim();
        String opinion = opinionEditText.getText().toString().trim();
        String application = applicationEditText.getText().toString().trim();
        String prayer = prayerEditText.getText().toString().trim();

        if (verse.isEmpty() || opinion.isEmpty() || application.isEmpty() || prayer.isEmpty()) {
            Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show();
            return;
        }
        if(devotionId == null){
            devotionId = databaseReference.push().getKey();
        }
        DevotionModel devotionModel = new DevotionModel(devotionId, verse, opinion, application, prayer);
        databaseReference.child(devotionId).setValue(devotionModel);

        Toast.makeText(this,devotionId != null ? "Devotion updated" : "Note saved", Toast.LENGTH_SHORT).show();
        finish();
    }
}

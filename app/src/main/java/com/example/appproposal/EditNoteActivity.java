package com.example.appproposal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EditNoteActivity extends AppCompatActivity {

    private EditText verseEditText, opinionEditText, applicationEditText, prayerEditText;
    private Button updateNoteButton;
    private DatabaseReference databaseReference;
    private String noteId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);

        verseEditText = findViewById(R.id.verseEditText);
        opinionEditText = findViewById(R.id.opinionEditText);
        applicationEditText = findViewById(R.id.applicationEditText);
        prayerEditText = findViewById(R.id.prayerEditText);
        updateNoteButton = findViewById(R.id.updateNoteButton);

        // Initialize Firebase database reference
        databaseReference = FirebaseDatabase.getInstance().getReference("note");

        // Get data from intent
        noteId = getIntent().getStringExtra("noteId");
        String verse = getIntent().getStringExtra("verse");
        String opinion = getIntent().getStringExtra("opinion");
        String application = getIntent().getStringExtra("application");
        String prayer = getIntent().getStringExtra("prayer");

        // Set the data to EditTexts
        verseEditText.setText(verse);
        opinionEditText.setText(opinion);
        applicationEditText.setText(application);
        prayerEditText.setText(prayer);

        updateNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateNote();
            }
        });
    }

    private void updateNote() {
        String verse = verseEditText.getText().toString().trim();
        String opinion = opinionEditText.getText().toString().trim();
        String application = applicationEditText.getText().toString().trim();
        String prayer = prayerEditText.getText().toString().trim();

        if (verse.isEmpty() || opinion.isEmpty() || application.isEmpty() || prayer.isEmpty()) {
            Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        NoteModel noteModel = new NoteModel(noteId, verse, opinion, application, prayer);
        databaseReference.child(noteId).setValue(noteModel);

        Toast.makeText(this, "Note updated", Toast.LENGTH_SHORT).show();
        finish();
    }
}

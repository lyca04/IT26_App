package com.example.appproposal;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Addnote extends AppCompatActivity {

    private EditText dateEditText, titleEditText, contextEditText;
    private Button saveNoteButton;
    private DatabaseReference databaseReference;
    private String noteId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnote);

        dateEditText = findViewById(R.id.dateEditText);
        titleEditText = findViewById(R.id.titleEditText);
        contextEditText = findViewById(R.id.contextEditText);
        saveNoteButton = findViewById(R.id.saveNoteButton);

        // Initialize Firebase database reference
        databaseReference = FirebaseDatabase.getInstance().getReference("note");

        // Get noteId from intent if it's an update operation
        noteId = getIntent().getStringExtra("noteId");
        if (noteId != null) {
            // Prepopulate fields if updating a note
            dateEditText.setText(getIntent().getStringExtra("date"));
            titleEditText.setText(getIntent().getStringExtra("title"));
            contextEditText.setText(getIntent().getStringExtra("context"));
            saveNoteButton.setText("Update Note");
        }

        saveNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveNote();
            }
        });
    }

    private void saveNote() {
        String date = dateEditText.getText().toString().trim();
        String title = titleEditText.getText().toString().trim();
        String context = contextEditText.getText().toString().trim();

        if (date.isEmpty() || title.isEmpty() || context.isEmpty()) {
            Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        if (noteId == null) {
            // Add new note
            noteId = databaseReference.push().getKey();
        }
        NoteModel noteModel = new NoteModel(noteId, date, title, context);
        databaseReference.child(noteId).setValue(noteModel);

        Toast.makeText(this, noteId != null ? "Note updated" : "Note saved", Toast.LENGTH_SHORT).show();
        finish();
    }
}

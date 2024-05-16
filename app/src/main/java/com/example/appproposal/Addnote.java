package com.example.appproposal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Addnote extends AppCompatActivity {

    private EditText verseEditText, noteEditText;
    private Button saveNoteButton;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnote);

        verseEditText = findViewById(R.id.verseEditText);
        noteEditText = findViewById(R.id.noteEditText);
        saveNoteButton = findViewById(R.id.saveNoteButton);

        // Initialize Firebase database reference
        databaseReference = FirebaseDatabase.getInstance().getReference("note");

        saveNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveNote();
            }
        });
    }

    private void saveNote() {
        String verse = verseEditText.getText().toString().trim();
        String note = noteEditText.getText().toString().trim();

        if (verse.isEmpty() || note.isEmpty()) {
            Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        String noteId = databaseReference.push().getKey();
        NoteModel noteModel = new NoteModel(noteId, verse, note);
        databaseReference.child(noteId).setValue(noteModel);

        Toast.makeText(this, "Note saved", Toast.LENGTH_SHORT).show();
        finish();
    }
}

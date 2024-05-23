package com.example.appproposal;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link About#newInstance} factory method to
 * create an instance of this fragment.
 */
public class About extends Fragment {

    private ImageView note;
    private LinearLayout notesContainer;
    private DatabaseReference databaseReference;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public About() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment About.
     */
    // TODO: Rename and change types and number of parameters
    public static About newInstance(String param1, String param2) {
        About fragment = new About();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        notesContainer = view.findViewById(R.id.notesContainer);
        note = view.findViewById(R.id.note);

        // Initialize Firebase database reference
        databaseReference = FirebaseDatabase.getInstance().getReference("note");

        // Fetch and display notes
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                notesContainer.removeAllViews(); // Clear previous views
                for (DataSnapshot noteSnapshot : dataSnapshot.getChildren()) {
                    NoteModel note = noteSnapshot.getValue(NoteModel.class);
                    if (note != null) {
                        addNoteView(note);
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Handle possible errors
                Toast.makeText(getActivity(), "Database Error: " + databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("AboutFragment", "Note ImageView clicked!");
                Intent intent = new Intent(getActivity(), Addnote.class);
                startActivity(intent);
            }
        });

        return view;
    }

    private void addNoteView(NoteModel note) {
        View noteView = getLayoutInflater().inflate(R.layout.note_item, null);

        TextView dateTextView = noteView.findViewById(R.id.dateTextView);
        TextView titleTextView = noteView.findViewById(R.id.titleTextView);
        TextView contextTextView = noteView.findViewById(R.id.contextTextView);
        Button updateButton = noteView.findViewById(R.id.updateButton);
        Button deleteButton = noteView.findViewById(R.id.deleteButton);

        dateTextView.setText("Date: " + note.getDate());
        titleTextView.setText("Title: " + note.getTitle());
        contextTextView.setText("Context: " + note.getContext());

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Addnote.class);
                intent.putExtra("noteId", note.getId());
                intent.putExtra("date", note.getDate());
                intent.putExtra("title", note.getTitle());
                intent.putExtra("context", note.getContext());
                startActivity(intent);
            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseReference.child(note.getId()).removeValue();
                Toast.makeText(getActivity(), "Note deleted", Toast.LENGTH_SHORT).show();
            }
        });

        notesContainer.addView(noteView);
    }
}

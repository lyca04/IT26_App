package com.example.appproposal;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.List;

public class About extends Fragment {

    private RecyclerView recyclerView;
    private NoteAdapter noteAdapter;
    private List<NoteModel> notesList;
    private DatabaseReference databaseReference;
    private ImageView addnote;

    public About() {
        // Required empty public constructor
    }

    public static About newInstance(String param1, String param2) {
        About fragment = new About();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        addnote = view.findViewById(R.id.addnote);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        notesList = new ArrayList<>();
        noteAdapter = new NoteAdapter(getActivity(), notesList);
        recyclerView.setAdapter(noteAdapter);

        // Initialize Firebase database reference
        databaseReference = FirebaseDatabase.getInstance().getReference("note");

        // Fetch and display notes
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                notesList.clear();
                for (DataSnapshot noteSnapshot : dataSnapshot.getChildren()) {
                    NoteModel note = noteSnapshot.getValue(NoteModel.class);
                    if (note != null) {
                        notesList.add(note);
                    }
                }
                noteAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Handle possible errors
            }
        });

        addnote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Addnote.class);
                startActivity(intent);
            }
        });

        return view;
    }
}

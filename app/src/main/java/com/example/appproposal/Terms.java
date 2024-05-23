package com.example.appproposal;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
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
public class Terms extends Fragment {

    private ImageView adddevotion;

    private LinearLayout devotionContainer;

    private DatabaseReference databaseReference;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Terms() {
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
    public static Terms newInstance(String param1, String param2) {
        Terms fragment = new Terms();
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
        View view = inflater.inflate(R.layout.fragment_terms, container, false);
        devotionContainer = view.findViewById(R.id.devotionContainer);
        adddevotion = view.findViewById(R.id.add_devotion);

        // Initialize Firebase database reference
        databaseReference = FirebaseDatabase.getInstance().getReference("devotion");

        // Fetch and display notes
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                devotionContainer.removeAllViews(); // clear previous views
                for (DataSnapshot noteSnapshot : dataSnapshot.getChildren()) {
                    DevotionModel devotion = noteSnapshot.getValue(DevotionModel.class);
                    if (devotion != null) {
                        addDevotionView(devotion);
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Handle possible errors
            }
        });

        adddevotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Adddevotion.class);
                startActivity(intent);
            }
        });

        return view;
    }

    private void addDevotionView(DevotionModel devotion) {
        View devotionView = getLayoutInflater().inflate(R.layout.devotion_item, null);

        TextView verseTextView = devotionView.findViewById(R.id.verseTextView);
        TextView opinionTextView = devotionView.findViewById(R.id.opinionTextView);
        TextView applicationTextView = devotionView.findViewById(R.id.applicationTextView);
        TextView prayerTextView = devotionView.findViewById(R.id.prayerTextView);
        Button updateButton_dev = devotionView.findViewById(R.id.updateButton_dev);
        Button deleteButton_dev = devotionView.findViewById(R.id.deleteButton_dev);

        verseTextView.setText("Scripture: " + devotion.getVerse());
        opinionTextView.setText("Opinion: " + devotion.getOpinion());
        applicationTextView.setText("Application: " + devotion.getApplication());
        prayerTextView.setText("Prayer: " + devotion.getPrayer());

        updateButton_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Adddevotion.class);
                intent.putExtra("devotionId", devotion.getId());
                intent.putExtra("verse", devotion.getVerse());
                intent.putExtra("opinion", devotion.getOpinion());
                intent.putExtra("application", devotion.getApplication());
                intent.putExtra("prayer", devotion.getPrayer());
                startActivity(intent);
            }
        });

        deleteButton_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseReference.child(devotion.getId()).removeValue();
                Toast.makeText(getActivity(), "Devotion deleted", Toast.LENGTH_SHORT).show();
            }
        });

        devotionContainer.addView(devotionView);
    }
}

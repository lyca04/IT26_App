package com.example.appproposal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class TodayFragment extends Fragment {

    private ImageView imageView;
    private TextView verse, verseNum, pray1, pray2, pray3;
    private DatabaseReference mDatabase;
    private static final String TAG = "TodayFragment";

    public TodayFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_today, container, false);
        imageView = view.findViewById(R.id.imageView);
        verse = view.findViewById(R.id.verse);
        verseNum = view.findViewById(R.id.verse_num);
        pray1 = view.findViewById(R.id.pray1);
        pray2 = view.findViewById(R.id.pray2);
        pray3 = view.findViewById(R.id.pray3);
        Button button = view.findViewById(R.id.today_devotion);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getParentFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                MeFragment targetFragment = new MeFragment();
                fragmentTransaction.replace(R.id.drawer_layout, targetFragment);
                fragmentTransaction.addToBackStack(null); // Optional: Adds transaction to the back stack
                fragmentTransaction.commit();
            }
        });

        fetchDataAndRandomize();
        return view;
    }

    private void fetchDataAndRandomize() {
        SharedPreferences sharedPreferences = getActivity().getPreferences(Context.MODE_PRIVATE);
        long lastUpdate = sharedPreferences.getLong("lastUpdate", 0);
        long currentTime = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lastUpdate);
        int lastDay = calendar.get(Calendar.DAY_OF_YEAR);

        calendar.setTimeInMillis(currentTime);
        int currentDay = calendar.get(Calendar.DAY_OF_YEAR);

        Log.d(TAG, "Last Update Day: " + lastDay + ", Current Day: " + currentDay);

        if (lastDay != currentDay) {
            Log.d(TAG, "Fetching new data from Firebase...");
            mDatabase.child("dailyContent").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    if (dataSnapshot.exists()) {
                        List<DataSnapshot> contentList = new ArrayList<>();
                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                            contentList.add(snapshot);
                        }

                        if (!contentList.isEmpty()) {
                            Random random = new Random();
                            int randomIndex = random.nextInt(contentList.size());
                            DataSnapshot randomData = contentList.get(randomIndex);

                            String verseText = randomData.child("verse").getValue(String.class);
                            String verseNumText = randomData.child("verse_num").getValue(String.class);
                            String pray1Text = randomData.child("pray1").getValue(String.class);
                            String pray2Text = randomData.child("pray2").getValue(String.class);
                            String pray3Text = randomData.child("pray3").getValue(String.class);

                            Log.d(TAG, "Randomized Data: " + randomData.getValue());

                            if (isAdded()) {

                                verse.setText(verseText);
                                verseNum.setText(verseNumText);
                                pray1.setText(pray1Text);
                                pray2.setText(pray2Text);
                                pray3.setText(pray3Text);
                            }

                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putLong("lastUpdate", currentTime);
                            editor.apply();
                        }
                    }
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    Log.e(TAG, "Failed to read data from Firebase", databaseError.toException());
                }
            });
        } else {
            Log.d(TAG, "Data already up-to-date for today.");
            // Load cached data or do nothing
        }
    }
}
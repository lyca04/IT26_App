package com.example.appproposal;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SettingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SettingFragment extends Fragment {

    private Switch morningSwitch;
    private Switch eveningSwitch;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SettingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SettingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SettingFragment newInstance(String param1, String param2) {
        SettingFragment fragment = new SettingFragment();
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
        View view = inflater.inflate(R.layout.fragment_setting, container, false);

        TextView openfile = view.findViewById(R.id.openfile);
        openfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SettingTerms.class);
                startActivity(intent);
            }
        });

        TextView openabout = view.findViewById(R.id.openabout);
        openabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SettingAbout.class);
                startActivity(intent);
            }
        });

        morningSwitch = view.findViewById(R.id.switch1);
        eveningSwitch = view.findViewById(R.id.switch2);

        morningSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                AlarmUtils.setMorningAlarm(getContext());
                Toast.makeText(getContext(), "Morning prayer alarm set", Toast.LENGTH_SHORT).show();
            } else {
                AlarmUtils.cancelMorningAlarm(getContext());
                Toast.makeText(getContext(), "Morning prayer alarm canceled", Toast.LENGTH_SHORT).show();
            }
        });

        eveningSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                AlarmUtils.setEveningAlarm(getContext());
                Toast.makeText(getContext(), "Night prayer alarm set", Toast.LENGTH_SHORT).show();
            } else {
                AlarmUtils.cancelEveningAlarm(getContext());
                Toast.makeText(getContext(), "Night prayer alarm canceled", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
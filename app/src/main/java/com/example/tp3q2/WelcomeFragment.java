package com.example.tp3q2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class WelcomeFragment extends Fragment {
     LinearLayout welcom;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview= inflater.inflate(R.layout.fragment_welcome,container,false);
//      welcom= rootview.findViewById(R.id.welcom_layout);
//      welcom.setBackground();
      return rootview;
    }
}
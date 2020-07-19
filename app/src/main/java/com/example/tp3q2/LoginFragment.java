package com.example.tp3q2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class LoginFragment extends Fragment {
    private EditText txtlogin;
    private EditText txtpassword;
    private Button connect;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View  rootview = inflater.inflate(R.layout.fragment_login, container, true);
//        txtlogin =rootview.findViewById(R.id.txtlogin);
//        txtpassword =rootview.findViewById(R.id.txtpassword);
//        connect =rootview.findViewById(R.id.tvconnect);
      return rootview;
    }
}
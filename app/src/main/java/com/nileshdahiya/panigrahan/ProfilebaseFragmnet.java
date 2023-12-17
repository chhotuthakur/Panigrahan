package com.nileshdahiya.panigrahan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ProfilebaseFragmnet extends Fragment {
    


    public ProfilebaseFragmnet() {
        // Required empty public constructor
    }


    public static ProfilebaseFragmnet newInstance(String param1, String param2) {
        ProfilebaseFragmnet fragment = new ProfilebaseFragmnet();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragme
        // t
        View v =  inflater.inflate(R.layout.fragment_profilebase, container, false);



        return v;
    }


}
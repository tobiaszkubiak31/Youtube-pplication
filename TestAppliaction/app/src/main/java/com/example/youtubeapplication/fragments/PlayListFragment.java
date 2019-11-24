package com.example.youtubeapplication.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.youtubeapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlayListFragment extends Fragment {


    public PlayListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_play_listfragment, container, false);
    }

}

package com.example.youtubeapplication.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.youtubeapplication.R;
import com.example.youtubeapplication.adapters.VideoPostAdapter;
import com.example.youtubeapplication.models.YoutubeDataModel;

import java.util.ArrayList;

/**
 Fragment that displaying a channel
 Fragment gives us dynamic chanes in views in activity
 */
public class ChannelFragment extends Fragment {
    private RecyclerView mList_videos = null;
    private VideoPostAdapter adapter = null;
    private ArrayList<YoutubeDataModel> mListData = null;

    public ChannelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_channel, container, false);
        mList_videos = (RecyclerView) getView().findViewById(R.id.mList_videos);
        initList();

        return view;
    }

    private void initList() {
        //:todo download list
        mListData = new ArrayList<>();
        mList_videos.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new VideoPostAdapter(getActivity(),mListData);
        mList_videos.setAdapter(adapter);
    }


}

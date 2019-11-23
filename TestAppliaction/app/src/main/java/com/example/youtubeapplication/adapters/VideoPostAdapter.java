package com.example.youtubeapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubeapplication.R;
import com.example.youtubeapplication.models.YoutubeDataModel;

import java.util.ArrayList;

public class VideoPostAdapter extends RecyclerView.Adapter<VideoPostAdapter.YoutubePostHolder> {
    private ArrayList<YoutubeDataModel> dataSet;
    private Context mContext = null;

    @Override
    public YoutubePostHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //whatis going on?
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.youtube_post_layout,parent,false);
        YoutubePostHolder postHolder = new YoutubePostHolder(view);
        return postHolder;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public VideoPostAdapter(Context mContext,ArrayList<YoutubeDataModel> dataSet) {
        this.mContext = mContext;
        this.dataSet = dataSet;
    }

    @Override
    public void onBindViewHolder(YoutubePostHolder holder, int position) {

    }

    public static class YoutubePostHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle;
        TextView textViewDes;
        TextView textViewDate;
        ImageView ImageThumb;

        public YoutubePostHolder(View itemView) {
            super(itemView);
            this.textViewTitle = (TextView) itemView.findViewById(R.id.textViewTitle);
            this.textViewDes = (TextView) itemView.findViewById(R.id.textViewDes);
            this.textViewDate = (TextView) itemView.findViewById(R.id.textViewDate);
            this.ImageThumb = (ImageView) itemView.findViewById(R.id.ImageThumb);

        }
    }
}

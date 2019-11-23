package com.example.youtubeapplication.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VideoPostAdapter extends RecyclerView.Adapter<YoutubePostHolder> {
    @NonNull
    @Override
    public YoutubePostHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onBindViewHolder(@NonNull YoutubePostHolder holder, int position) {

    }

    public static class YoutubePostHolder extends RecyclerView.ViewHolder {
        TextView textVewTitle;

        public YoutubePostHolder(View itemView, TextView textVewTitle) {
            super(itemView);
            this.textVewTitle = textVewTitle;
        }
    }
}

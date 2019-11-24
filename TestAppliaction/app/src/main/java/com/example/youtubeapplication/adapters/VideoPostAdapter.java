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

import org.w3c.dom.Text;

import java.util.ArrayList;

/*
Creating RecyclerView for auto update scrollable list!
RecyclerView create view at the initializtion and if we scroll list,
the new views wont be created but they will be updated with new data!
For this functionalitty is responisble  onBindViewHolder
https://stackoverflow.com/questions/37523308/when-onbindviewholder-is-called-and-how-it-works
 */

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

    //
    @Override
    public void onBindViewHolder(YoutubePostHolder holder, int position) {
        TextView textViewTitle = holder.textViewTitle;
        TextView textViewDes = holder.textViewDes;
        TextView textViewDate = holder.textViewDate;
        ImageView ImageThumb= holder.ImageThumb;

        YoutubeDataModel object = dataSet.get(position);

        textViewTitle.setText(object.getTitle());
        textViewDes.setText(object.getDescription());
        textViewDate.setText(object.getPublishedAt());

        //TODO: image download from url



    }

    /*
    Object that contains our data about single view for example references
    to Textview views
     */
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

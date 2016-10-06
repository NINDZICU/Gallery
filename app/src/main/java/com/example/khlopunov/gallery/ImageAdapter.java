package com.example.khlopunov.gallery;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Admin on 03.10.2016.
 */

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {
    private ArrayList<Integer> pictures;
    private Context context;
    public OnItemClick listener;

    public ImageAdapter(Context context, ArrayList<Integer> pictures) {
        this.pictures = pictures;
        this.context = context;
    }

    @Override
    public ImageAdapter.ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ImageAdapter.ImageViewHolder holder, final int position) {
        holder.img.setImageDrawable(context.getResources().getDrawable(pictures.get(position)));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnItemClick(pictures.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        ImageView img;

        public ImageViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.iv_img);
        }
    }

    public void setListener(OnItemClick listener) {
        this.listener = listener;
    }
}


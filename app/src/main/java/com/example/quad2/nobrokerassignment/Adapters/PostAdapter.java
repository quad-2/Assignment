package com.example.quad2.nobrokerassignment.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quad2.nobrokerassignment.Model.Datum;
import com.example.quad2.nobrokerassignment.Model.ImagesMap;
import com.example.quad2.nobrokerassignment.Model.Photo;
import com.example.quad2.nobrokerassignment.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quad2 on 17/1/17.
 */

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private Context context;
    private List<Datum> datumList = new ArrayList<>();
    private static final String IMAGE_BASE_URL = "http://d3snwcirvb4r88.cloudfront.net/images/";

    public PostAdapter(Context context, List<Datum> datumList) {
        this.context = context;
        this.datumList = datumList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_property, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Datum datum = datumList.get(position);
        ImagesMap imagesMap = new ImagesMap();
        for (Photo photo : datum.getPhotos()){
            if (photo.isDisplayPic())
                imagesMap = photo.getImagesMap();
        }

        if (datum != null) {

            holder.sizeView.setText(datum.getPropertySize() + " Sq.ft");
            holder.rentView.setText("Rs " + datum.getRent());

            if (datum.getFurnishingDesc().equalsIgnoreCase("Semi")) {
                holder.furnishedView.setText("Semi Furnished");
            } else if (datum.getFurnishingDesc().equalsIgnoreCase("Full")) {
                holder.furnishedView.setText("Full Furnished");
            } else if (datum.getFurnishingDesc().equalsIgnoreCase("No")) {
                holder.furnishedView.setText("Not Furnished");
            }

            if (datum.getBathroom() == 1) {
                holder.bathroomView.setText(datum.getBathroom() + " Bathroom");
            } else {
                holder.bathroomView.setText(datum.getBathroom() + " Bathrooms");
            }

            if (imagesMap !=null){
                Picasso.with(context)
                        .load(IMAGE_BASE_URL+ datum.getId()+"/"+imagesMap.getLarge())
                        .fit()
                        .placeholder(R.drawable.ic_image_grey600_48dp)
                        .into(holder.postImage);
            }

            if (datum.getPropertyTitle()!=null){
                holder.postDetail1View.setText(datum.getPropertyTitle());
            }
            if (datum.getSecondaryTitle()!= null){
                holder.postDetail2View.setText(datum.getSecondaryTitle());
            }
        }
    }

    @Override
    public int getItemCount() {
        return datumList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView postDetail1View;
        TextView postDetail2View;
        TextView rentView;
        TextView furnishedView;
        TextView bathroomView;
        TextView sizeView;
        ImageView postImage;

        public ViewHolder(View itemView) {
            super(itemView);
            postDetail1View = (TextView) itemView.findViewById(R.id.postDetail_1);
            postDetail2View = (TextView) itemView.findViewById(R.id.postDetail_2);
            rentView = (TextView) itemView.findViewById(R.id.rent);
            furnishedView = (TextView) itemView.findViewById(R.id.furnish);
            bathroomView = (TextView) itemView.findViewById(R.id.bathroom);
            sizeView = (TextView) itemView.findViewById(R.id.propertySize);
            postImage = (ImageView) itemView.findViewById(R.id.property_image);
        }
    }
}

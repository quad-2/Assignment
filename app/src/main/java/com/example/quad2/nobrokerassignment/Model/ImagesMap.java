
package com.example.quad2.nobrokerassignment.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImagesMap {

    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("original")
    @Expose
    private String original;
    @SerializedName("large")
    @Expose
    private String large;
    @SerializedName("medium")
    @Expose
    private String medium;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImagesMap() {
    }

    /**
     * 
     * @param thumbnail
     * @param original
     * @param medium
     * @param large
     */
    public ImagesMap(String thumbnail, String original, String large, String medium) {
        super();
        this.thumbnail = thumbnail;
        this.original = original;
        this.large = large;
        this.medium = medium;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    @Override
    public String toString() {
        return "ImagesMap{" +
                "thumbnail='" + thumbnail + '\'' +
                ", original='" + original + '\'' +
                ", large='" + large + '\'' +
                ", medium='" + medium + '\'' +
                '}';
    }
}

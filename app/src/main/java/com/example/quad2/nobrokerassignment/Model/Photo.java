
package com.example.quad2.nobrokerassignment.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("imagesMap")
    @Expose
    private ImagesMap imagesMap;
    @SerializedName("displayPic")
    @Expose
    private boolean displayPic;

    public Photo() {
    }


    public Photo(String title, String name, ImagesMap imagesMap, boolean displayPic) {
        super();
        this.title = title;
        this.name = name;
        this.imagesMap = imagesMap;
        this.displayPic = displayPic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImagesMap getImagesMap() {
        return imagesMap;
    }

    public void setImagesMap(ImagesMap imagesMap) {
        this.imagesMap = imagesMap;
    }

    public boolean isDisplayPic() {
        return displayPic;
    }

    public void setDisplayPic(boolean displayPic) {
        this.displayPic = displayPic;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", imagesMap=" + imagesMap +
                ", displayPic=" + displayPic +
                '}';
    }
}


package com.example.quad2.nobrokerassignment.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Score {

    @SerializedName("lifestyle")
    @Expose
    private double lifestyle;
    @SerializedName("transit")
    @Expose
    private double transit;
    @SerializedName("lastUpdatedDate")
    @Expose
    private long lastUpdatedDate;


    public Score() {
    }

    public Score(double lifestyle, double transit, long lastUpdatedDate) {
        super();
        this.lifestyle = lifestyle;
        this.transit = transit;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public double getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(double lifestyle) {
        this.lifestyle = lifestyle;
    }

    public double getTransit() {
        return transit;
    }

    public void setTransit(double transit) {
        this.transit = transit;
    }

    public long getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(long lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @Override
    public String toString() {
        return "Score{" +
                "lifestyle=" + lifestyle +
                ", transit=" + transit +
                ", lastUpdatedDate=" + lastUpdatedDate +
                '}';
    }
}

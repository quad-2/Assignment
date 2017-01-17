
package com.example.quad2.nobrokerassignment.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OtherParams {

    @SerializedName("count")
    @Expose
    private long count;
    @SerializedName("region_id")
    @Expose
    private String regionId;
    @SerializedName("topPropertyId")
    @Expose
    private Object topPropertyId;
    @SerializedName("searchToken")
    @Expose
    private Object searchToken;
    @SerializedName("total_count")
    @Expose
    private long totalCount;
    @SerializedName("city")
    @Expose
    private String city;


    public OtherParams() {
    }

    public OtherParams(long count, String regionId, Object topPropertyId, Object searchToken, long totalCount, String city) {
        super();
        this.count = count;
        this.regionId = regionId;
        this.topPropertyId = topPropertyId;
        this.searchToken = searchToken;
        this.totalCount = totalCount;
        this.city = city;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Object getTopPropertyId() {
        return topPropertyId;
    }

    public void setTopPropertyId(Object topPropertyId) {
        this.topPropertyId = topPropertyId;
    }

    public Object getSearchToken() {
        return searchToken;
    }

    public void setSearchToken(Object searchToken) {
        this.searchToken = searchToken;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "OtherParams{" +
                "count=" + count +
                ", regionId='" + regionId + '\'' +
                ", topPropertyId=" + topPropertyId +
                ", searchToken=" + searchToken +
                ", totalCount=" + totalCount +
                ", city='" + city + '\'' +
                '}';
    }
}

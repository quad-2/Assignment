package com.example.quad2.nobrokerassignment.RetrofitInterface;

import com.example.quad2.nobrokerassignment.Model.ResponseBody;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by quad2 on 16/1/17.
 */

public interface DataAPI {

    @GET("region/ChIJLfyY2E4UrjsRVq4AjI7zgRY/?lat_lng=12.9279232,77.6271078&rent=0,500000&travelTime=30")
    Call<ResponseBody> getPosts(@Query("pageNo") int pageNumber, @Query("type") String type,
                                @Query("buildingType") String buildingType, @Query("furnishing") String furnishing);
}

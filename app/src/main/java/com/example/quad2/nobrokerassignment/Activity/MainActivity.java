package com.example.quad2.nobrokerassignment.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.quad2.nobrokerassignment.Adapters.EndlessRecyclerViewScrollListener;
import com.example.quad2.nobrokerassignment.Adapters.PostAdapter;
import com.example.quad2.nobrokerassignment.Model.Datum;
import com.example.quad2.nobrokerassignment.Model.ResponseBody;
import com.example.quad2.nobrokerassignment.R;
import com.example.quad2.nobrokerassignment.RetrofitInterface.DataAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "http://www.nobroker.in/api/v1/property/filter/";
    private final int REQUEST_CODE = 20;

    private RecyclerView postsRV;
    private ProgressDialog dialog;
    private List<Datum> datumList = new ArrayList<>();
    private PostAdapter postAdapter;
    private EndlessRecyclerViewScrollListener scrollListener;

    private String buildingType;
    private String furnishing;
    private String type;
    private int pageNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        postsRV = (RecyclerView) findViewById(R.id.posts_rv);
        dialog = new ProgressDialog(MainActivity.this);
        dialog.setMessage("Loading!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.filter_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.filter:
                Intent intent = new Intent(MainActivity.this, FilterActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // REQUEST_CODE is defined above
        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
            Bundle bundle = data.getExtras();
            if (bundle != null) {
                buildingType = bundle.getString("buildingPara");
                type = bundle.getString("typePara");
                furnishing = bundle.getString("furnishPara");
            }
            Log.d("log2", type + "***"+ buildingType+"***"+furnishing);
            pageNumber = 1;
            datumList.clear();
            getData(pageNumber, type, buildingType, furnishing);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        pageNumber = 1;
        datumList.clear();
        getData(pageNumber, type, buildingType, furnishing);
    }

    public void setPostAdapter() {
        postAdapter = new PostAdapter(MainActivity.this, datumList);
        LinearLayoutManager llm = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        postsRV.setLayoutManager(llm);
        postsRV.setAdapter(postAdapter);
        scrollListener = new EndlessRecyclerViewScrollListener(llm) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                ++pageNumber;
                loadNextPage(pageNumber);
            }
        };
        postsRV.addOnScrollListener(scrollListener);
        postAdapter.notifyDataSetChanged();
    }

    public void getData(int pageNumber, String type, String buildingType, String furnishing) {
        dialog.show();
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        okHttpClient.readTimeout(15, TimeUnit.SECONDS);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient.build())
                .build();

        DataAPI dataAPI = retrofit.create(DataAPI.class);
        Call<ResponseBody> call = dataAPI.getPosts(pageNumber, type, buildingType, furnishing);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                ResponseBody responseBody = response.body();
                try {
                    Log.d("log1", responseBody.toString());
                    datumList.addAll(responseBody.getData());
                    dialog.dismiss();
                    setPostAdapter();
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                t.printStackTrace();
                dialog.dismiss();
            }
        });
    }

    public void loadNextPage(int number) {
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        okHttpClient.readTimeout(15, TimeUnit.SECONDS);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient.build())
                .build();

        DataAPI dataAPI = retrofit.create(DataAPI.class);
        Call<ResponseBody> call = dataAPI.getPosts(number, type, buildingType, furnishing);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                ResponseBody responseBody = response.body();
                try {
                    Log.d("log1", responseBody.toString());
                    datumList.addAll(responseBody.getData());
                    postAdapter.notifyDataSetChanged();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}

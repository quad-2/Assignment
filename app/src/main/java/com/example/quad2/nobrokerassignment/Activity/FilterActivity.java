package com.example.quad2.nobrokerassignment.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.quad2.nobrokerassignment.R;

public class FilterActivity extends AppCompatActivity {

    private CheckBox bhk2;
    private CheckBox bhk3;
    private CheckBox bhk4;
    private CheckBox apType;
    private CheckBox ihType;
    private CheckBox ifType;
    private CheckBox semiFurnish;
    private CheckBox fullFurnish;
    private Button applyButton;

    private String bhkParameter;
    private String buildingTypeParameter;
    private String furnishParameter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        setView();
    }

    public void setView() {
        bhk2 = (CheckBox) findViewById(R.id.bhk2);
        bhk3 = (CheckBox) findViewById(R.id.bhk3);
        bhk4 = (CheckBox) findViewById(R.id.bhk4);
        apType = (CheckBox) findViewById(R.id.ap_type);
        ihType = (CheckBox) findViewById(R.id.ih_type);
        ifType = (CheckBox) findViewById(R.id.if_type);
        semiFurnish = (CheckBox) findViewById(R.id.semi_furnish);
        fullFurnish = (CheckBox) findViewById(R.id.full_furnish);
        applyButton = (Button) findViewById(R.id.apply_filter);

        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setReturnParameter();
                Intent resultData = new Intent();
                resultData.putExtra("typePara", bhkParameter);
                resultData.putExtra("buildingPara", buildingTypeParameter);
                resultData.putExtra("furnishPara", furnishParameter);
                setResult(RESULT_OK, resultData);
                finish();
            }
        });
    }

    public void setReturnParameter(){

        if (bhk2.isChecked() && bhk3.isChecked() && bhk4.isChecked()) {
            bhkParameter = "BHK3/BHK4/BHK2";
        } else if (bhk3.isChecked() && bhk4.isChecked() && !bhk2.isChecked()) {
            bhkParameter = "BHK3/BHK4";
        } else if (bhk3.isChecked() && !bhk4.isChecked() && bhk2.isChecked()) {
            bhkParameter = "BHK3/BHK2";
        } else if (!bhk3.isChecked() && bhk4.isChecked() && bhk2.isChecked()) {
            bhkParameter = "BHK4/BHK2";
        } else if (bhk3.isChecked() && !bhk4.isChecked() && !bhk2.isChecked()) {
            bhkParameter = "BHK3";
        } else if (!bhk3.isChecked() && bhk4.isChecked() && !bhk2.isChecked()) {
            bhkParameter = "BHK4";
        } else if (!bhk3.isChecked() && !bhk4.isChecked() && bhk2.isChecked()) {
            bhkParameter = "BHK2";
        }

        if (apType.isChecked() && ihType.isChecked() && ifType.isChecked()) {
            buildingTypeParameter = "AP/IH/IF";
        } else if (apType.isChecked() && ihType.isChecked() && !ifType.isChecked()) {
            buildingTypeParameter = "AP/IH";
        } else if (apType.isChecked() && !ihType.isChecked() && ifType.isChecked()) {
            buildingTypeParameter = "AP/IF";
        } else if (!apType.isChecked() && ihType.isChecked() && ifType.isChecked()) {
            buildingTypeParameter = "IH/IF";
        } else if (apType.isChecked() && !ihType.isChecked() && !ifType.isChecked()) {
            buildingTypeParameter = "AP";
        } else if (!apType.isChecked() && ihType.isChecked() && !ifType.isChecked()) {
            buildingTypeParameter = "IH";
        } else if (!apType.isChecked() && !ihType.isChecked() && ifType.isChecked()) {
            buildingTypeParameter = "IF";
        }

        if (semiFurnish.isChecked() && fullFurnish.isChecked()){
            furnishParameter = "FULLY_FURNISHED/SEMI_FURNISHED";
        }else if (semiFurnish.isChecked() && !fullFurnish.isChecked()){
            furnishParameter = "SEMI_FURNISHED";
        }else if (!semiFurnish.isChecked() && fullFurnish.isChecked()){
            furnishParameter = "FULLY_FURNISHED";
        }
    }

}

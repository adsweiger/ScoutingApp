package com.example.adsweiger.scoutingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("comment", "Hello");
    }
    public void onButtonClick(View view) {
        setContentView(R.layout.activity_team_info);
    }
    public void onButton2Click(View view) {
        setContentView(R.layout.activity_team_points);
    }
    public void onButton3Click(View view) {
        setContentView(R.layout.activity_matches);
    }
}

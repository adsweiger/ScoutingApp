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
        Log.i("comment", "Point A Reached");
        // Reaches point A but not B, must be an issue with the line below.
        setContentView(R.layout.activity_team_info);
        Log.i("comment", "Point B Reached");
    }
    public void onButton2Click(View view) {
        setContentView(R.layout.activity_team_points);
    }
    public void onButton3Click(View view) {
        setContentView(R.layout.activity_matches);
    }
}

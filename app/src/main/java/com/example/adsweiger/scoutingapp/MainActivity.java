package com.example.adsweiger.scoutingapp;

import android.content.Intent;
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
        Intent next = new Intent(this, TeamInfo.class);
        startActivity(next);
        Log.i("comment", "Point B Reached");
    }
    public void onButton2Click(View view) {
        Intent next = new Intent(this, Matches.class);
        startActivity(next);
    }
    public void onButton3Click(View view) {
        Intent next = new Intent(this, TeamPoints.class);
        startActivity(next);
    }
}

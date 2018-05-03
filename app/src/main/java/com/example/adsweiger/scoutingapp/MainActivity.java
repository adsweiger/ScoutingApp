package com.example.adsweiger.scoutingapp;

import android.app.Fragment;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        Intent next = new Intent(this, TeamPoints.class);
        startActivity(next);
    }
    public void onButton3Click(View view) {
        Intent next = new Intent(this, Matches.class);
        startActivity(next);
    }
    public static class Home extends Fragment {
        private static final String TAG = "Home";

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.activity_main, container, false);
        }
    }
}

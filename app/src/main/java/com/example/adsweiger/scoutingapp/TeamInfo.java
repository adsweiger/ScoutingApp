package com.example.adsweiger.scoutingapp;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.drm.DrmStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TeamInfo extends AppCompatActivity {
    TextView teamName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("comment", "Point C Reached");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_info);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        teamName = findViewById(R.id.textView13);
        Log.i("stop", "Stopped before if statement");
        if (b != null) {
            Log.i("stuff", "Bundle not null");
            String getName = (String) b.get("name of team");
            teamName.setText(getName);
        }
    }

    public void onBackClick(View view) {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
    public void onEditClick(View view) {
        Intent editTeamInfo = new Intent(this, BarrierScreen.class);
        startActivity(editTeamInfo);
    }
    public void onAddClick(View view) {
        Intent addTeamInfo = new Intent(this, AddTeamInfo.class);
        startActivity(addTeamInfo);
    }
}
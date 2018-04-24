package com.example.adsweiger.scoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BarrierScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_team_info);
    }

    public void backToTeamInfo(View view) {
        Intent backToTeamInfo = new Intent(this, TeamInfo.class);
        startActivity(backToTeamInfo);
    }
}
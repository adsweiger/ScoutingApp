package com.example.adsweiger.scoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class TeamInfo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("comment", "Point C Reached");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_info);
        Bundle b = getIntent().getExtras();
        if (b == null) {
            Log.i("stuff", "Null bundle");
            return;
        }
        final TextView teamName = findViewById(R.id.NameOfTeam);
        Log.i("stuff", "Bundle not null");
        String getName = b.getString("name of team");
        teamName.setText(getName);
        final TextView teamNumber = findViewById(R.id.TeamNumber);
        String getTeamNumber = b.getString("team number");
        teamNumber.setText(getTeamNumber);
        final TextView teamAutoPlan = findViewById(R.id.AutoCapability);
        String getTeamAutoPlan = b.getString("auto capability");
        teamAutoPlan.setText(getTeamAutoPlan);
        final TextView teamTelePlan = findViewById(R.id.TeleopPlan);
        String getTeamTelePlan = b.getString("plan for teleop");
        teamTelePlan.setText(getTeamTelePlan);
        final TextView teamEndGamePlan = findViewById(R.id.EndGamePlan);
        String getTeamEndGamePlan = b.getString("plan for endgame");
        teamEndGamePlan.setText(getTeamEndGamePlan);
        final TextView teamOtherInfo = findViewById(R.id.OtherInfo);
        String getTeamOtherInfo = b.getString("other team information");
        teamOtherInfo.setText(getTeamOtherInfo);

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
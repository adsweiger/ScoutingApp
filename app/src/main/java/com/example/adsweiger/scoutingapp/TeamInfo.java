package com.example.adsweiger.scoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class TeamInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("comment", "Point C Reached");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_info);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        TextView teamName = new TextView;
        if(b != null)
        {
            String getName = b.get("name of team");
            teamName
        }
    }

    public void onBackClick(View view) {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
    public void editTeamInfo(View view) {
        Intent editTeamInfo = new Intent(this, BarrierScreen.class);
        startActivity(editTeamInfo);
    }
    public void addTeamInfo(View view) {
        Intent addTeamInfo = new Intent(this, AddTeamInfo.class);
        startActivity(addTeamInfo);
    }
}

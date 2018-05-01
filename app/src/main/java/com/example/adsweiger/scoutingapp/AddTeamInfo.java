package com.example.adsweiger.scoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddTeamInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_team_info);
    }

    public void onBackClick(View view) {

    }
    public void saveWhenDone(View view)
    {
        Intent saveTeamName = new Intent(this, TeamInfo.class);
        final EditText editText = findViewById(R.id.editText);
        saveTeamName.putExtra("name of team", editText.getText().toString());
        startActivity(saveTeamName);
    }
}
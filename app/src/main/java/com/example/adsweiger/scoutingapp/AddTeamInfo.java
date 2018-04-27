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
        Intent back = new Intent(this, TeamInfo.class);
        startActivity(back);
    }
    public void saveWhenDone(View view)
    {
        EditText editText = findViewById(R.id.editText);
        Intent saveTeamName = new Intent(this, TeamInfo.class);
        saveTeamName.putExtra("name of team", editText.getText());
        startActivity(saveTeamName);
        Intent back = new Intent(this, TeamInfo.class);
        startActivity(back);
    }
}

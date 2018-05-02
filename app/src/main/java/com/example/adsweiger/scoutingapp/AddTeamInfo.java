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
        Intent saveTeamInfo = new Intent(this, TeamInfo.class);
        final EditText editText = findViewById(R.id.editText);
        saveTeamInfo.putExtra("name of team", editText.getText().toString());
        final EditText editText2 = findViewById(R.id.editText2);
        saveTeamInfo.putExtra("team number", editText2.getText().toString());
        final EditText editText3 = findViewById(R.id.editText3);
        saveTeamInfo.putExtra("auto capability", editText3.getText().toString());
        final EditText editText4 = findViewById(R.id.editText4);
        saveTeamInfo.putExtra("plan for teleop", editText4.getText().toString());
        final EditText editText5 = findViewById(R.id.editText5);
        saveTeamInfo.putExtra("plan for endgame", editText5.getText().toString());
        final EditText editText6 = findViewById(R.id.editText6);
        saveTeamInfo.putExtra("other team information", editText6.getText().toString());
        startActivity(saveTeamInfo);
    }
}
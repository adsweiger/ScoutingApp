package com.example.adsweiger.scoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Matches extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches);
        Bundle b = getIntent().getExtras();
        if (b == null) {
            Log.i("stuff", "Null bundle");
            return;
        }
        final TextView redOne = findViewById(R.id.RedTeam1);
        String getRedOne = b.getString("red one");
        redOne.setText(getRedOne);
        final TextView redTwo = findViewById(R.id.RedTeam2);
        String getRedTwo = b.getString("red two");
        redTwo.setText(getRedTwo);
        final TextView blueOne = findViewById(R.id.BlueTeam1);
        String getBlueOne = b.getString("blue one");
        blueOne.setText(getBlueOne);
        final TextView blueTwo = findViewById(R.id.BlueTeam2);
        String getBlueTwo = b.getString("blue two");
        blueTwo.setText(getBlueTwo);
        final TextView matchNumber = findViewById(R.id.MatchNumber);
        Integer getMatchNumber = b.getInt("match number");
        matchNumber.setText(Integer.toString(getMatchNumber));
        final TextView redOnePoints = findViewById(R.id.Red1Points);
        Integer getRedOnePoints = b.getInt("red one points");
        redOnePoints.setText(Integer.toString(getRedOnePoints));
        final TextView redTwoPoints = findViewById(R.id.Red2Points);
        Integer getRedTwoPoints = b.getInt("red two points");
        redTwoPoints.setText(Integer.toString(getRedTwoPoints));
        final TextView blueOnePoints = findViewById(R.id.Blue1Points);
        Integer getBlueOnePoints = b.getInt("blue one points");
        blueOnePoints.setText(Integer.toString(getBlueOnePoints));
        final TextView blueTwoPoints = findViewById(R.id.Blue2Points);
        Integer getBlueTwoPoints = b.getInt("blue two points");
        blueTwoPoints.setText(Integer.toString(getBlueTwoPoints));
    }
    public void onBackClick(View view) {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
    public void onAddClick(View view) {
        Intent add = new Intent(this, AddMatches.class);
        startActivity(add);
    }
}

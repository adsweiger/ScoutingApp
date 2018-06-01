package com.example.adsweiger.scoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;

public class TeamInfo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DatabaseReference myTeamName = FirebaseDatabase.getInstance().getReference();
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

        myTeamName.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Map<String, Object> map = (Map<String, Object>) dataSnapshot.getValue();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    Log.d("checkpoint", "Value is: " + value);
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("checkpoint", "Failed to read value.", error.toException());
            }
        });
    }

    public void onBackClick(View view) {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }

    public void onAddClick(View view) {
        Intent addTeamInfo = new Intent(this, AddTeamInfo.class);
        startActivity(addTeamInfo);
    }

}
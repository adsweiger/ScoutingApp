package com.example.adsweiger.scoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;

public class AddTeamInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_team_info);
    }

    public void saveWhenDone(View view)
    {

        Team data1 = new Team();
        data1.setNumber(123);
        data1.setPoints(11);
        newTeamName.setValue(data1);

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
        DatabaseReference newTeamName = FirebaseDatabase.getInstance().getReference();
        newTeamName.child("Team Name").setValue(editText.getText().toString());
        DatabaseReference newTeamNumber = FirebaseDatabase.getInstance().getReference();
        newTeamNumber.child("Team Number").setValue(editText2.getText().toString());
        DatabaseReference newAutoCap = FirebaseDatabase.getInstance().getReference();
        newAutoCap.child("Auto Capabilitiy").setValue(editText3.getText().toString());
        DatabaseReference newPlanForTele = FirebaseDatabase.getInstance().getReference();
        newPlanForTele.child("TeleOp Plan").setValue(editText4.getText().toString());
        DatabaseReference newPlanForEnd = FirebaseDatabase.getInstance().getReference();
        newPlanForEnd.child("Endgame Plan").setValue(editText5.getText().toString());
        DatabaseReference newOtherInfo = FirebaseDatabase.getInstance().getReference();
        newOtherInfo.child("Other Information").setValue(editText6.getText().toString());
        TeamStorage newTeam = new TeamStorage(newTeamName.toString(), newTeamNumber.toString(), newAutoCap.toString(), newPlanForTele.toString(), newPlanForEnd.toString(), newOtherInfo.toString());
        Log.i("Comment: ", newTeam.toString());
        newTeamName.addValueEventListener(new ValueEventListener() {
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
}
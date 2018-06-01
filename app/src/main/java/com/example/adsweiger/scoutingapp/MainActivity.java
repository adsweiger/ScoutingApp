package com.example.adsweiger.scoutingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.LogWriter;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.StorageReference;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("comment", "Hello");
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.push().setValue("Hey boss.");
        // Read from the database
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Map<String, Object> map = (Map<String, Object>) dataSnapshot.getValue();
                for(Map.Entry<String, Object> entry : map.entrySet())
                {
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

    public void onButtonClick(View view) {
        Log.i("comment", "Point A Reached");
        // Reaches point A but not B, must be an issue with the line below.
        Intent next = new Intent(this, TeamInfo.class);
        startActivity(next);
        Log.i("comment", "Point B Reached");
    }

    public void onButton2Click(View view) {
        Intent next = new Intent(this, TeamPoints.class);
        startActivity(next);
    }

    public void onButton3Click(View view) {
        Intent next = new Intent(this, Matches.class);
        startActivity(next);
    }
}
package com.example.adsweiger.scoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class AddMatches extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_matches);
    }
    public void onDoneClick(View view) {
        //Intent done = new Intent(this, Matches.class);
        Intent saveMatches = new Intent(this, Matches.class);
        final EditText redOne = findViewById(R.id.editText8);
        saveMatches.putExtra("red one", redOne.getText().toString());
        final EditText redTwo = findViewById(R.id.editText9);
        saveMatches.putExtra("red two", redTwo.getText().toString());
        final EditText blueOne = findViewById(R.id.editText10);
        saveMatches.putExtra("blue one", blueOne.getText().toString());
        final EditText blueTwo = findViewById(R.id.editText11);
        saveMatches.putExtra("blue two", blueTwo.getText().toString());
        final EditText matchNumber = findViewById(R.id.editText7);
        saveMatches.putExtra("match number", Integer.parseInt(matchNumber.getText().toString()));
        final EditText redOnePoints = findViewById(R.id.editText12);
        saveMatches.putExtra("red one points", Integer.parseInt(redOnePoints.getText().toString()));
        final EditText redTwoPoints = findViewById(R.id.editText13);
        saveMatches.putExtra("red two points", Integer.parseInt(redTwoPoints.getText().toString()));
        final EditText blueOnePoints = findViewById(R.id.editText14);
        saveMatches.putExtra("blue one points", Integer.parseInt(blueOnePoints.getText().toString()));
        final EditText blueTwoPoints = findViewById(R.id.editText15);
        saveMatches.putExtra("blue two points", Integer.parseInt(blueTwoPoints.getText().toString()));
        startActivity(saveMatches);
        //startActivity(done);
        DatabaseReference newRedOne = FirebaseDatabase.getInstance().getReference();
        newRedOne.push().setValue(redOne.getText().toString());
        DatabaseReference newRedTwo = FirebaseDatabase.getInstance().getReference();
        newRedTwo.push().setValue(redTwo.getText().toString());
        DatabaseReference newBlueOne = FirebaseDatabase.getInstance().getReference();
        newBlueOne.push().setValue(blueOne.getText().toString());
        DatabaseReference newBlueTwo = FirebaseDatabase.getInstance().getReference();
        newBlueTwo.push().setValue(blueTwo.getText().toString());
        DatabaseReference newMatch = FirebaseDatabase.getInstance().getReference();
        newMatch.push().setValue(matchNumber.getText());
        DatabaseReference newRedOnePoints = FirebaseDatabase.getInstance().getReference();
        newRedOnePoints.push().setValue(redOnePoints.getText());
        DatabaseReference newRedTwoPoints = FirebaseDatabase.getInstance().getReference();
        newRedTwoPoints.push().setValue(redTwoPoints.getText());
        DatabaseReference newBlueOnePoints = FirebaseDatabase.getInstance().getReference();
        newBlueOnePoints.push().setValue(blueOnePoints.getText());
        DatabaseReference newBlueTwoPoints = FirebaseDatabase.getInstance().getReference();
        newBlueTwoPoints.push().setValue(blueTwoPoints.getText());
        }
}

package com.example.adsweiger.scoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AddMatches extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_matches);
        if (b == null) {
            Log.i("stuff", "Null bundle");
            return;
        }
        final TextView redOne = findViewById(R.id.RedTeam1);
        String getRedOne = b.getString("red one");
        redOne.setText(getRedOne);
    }
    public void onDoneClick(View view) {
        Intent done = new Intent(this, Matches.class);
        startActivity(done);
    }
}

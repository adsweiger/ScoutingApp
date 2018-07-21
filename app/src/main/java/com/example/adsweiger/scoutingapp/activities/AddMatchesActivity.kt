package com.example.adsweiger.scoutingapp.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.adsweiger.scoutingapp.MatchKeys
import com.example.adsweiger.scoutingapp.R
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_add_matches.*

class AddMatchesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_matches)
    }

    fun onDoneClick(view: View) {
        //Intent done = new Intent(this, MatchesActivity.class);
        val saveMatches = Intent(this, MatchesActivity::class.java)
        val databaseRef = FirebaseDatabase.getInstance().reference
        saveMatches.putExtra(MatchKeys.redOneNumber, redOneNumber.text.toString())
        saveMatches.putExtra(MatchKeys.redOnePoints, redOnePoints.text.toString())
        saveMatches.putExtra(MatchKeys.redTwoNumber, redTwoNumber.text.toString())
        saveMatches.putExtra(MatchKeys.redTwoPoints, redTwoPoints.text.toString())
        saveMatches.putExtra(MatchKeys.blueOneNumber, blueOneNumber.text.toString())
        saveMatches.putExtra(MatchKeys.blueOnePoints, blueOnePoints.text.toString())
        saveMatches.putExtra(MatchKeys.blueTwoNumber, blueTwoNumber.text.toString())
        saveMatches.putExtra(MatchKeys.blueTwoPoints, blueTwoPoints.text.toString())
        saveMatches.putExtra(MatchKeys.matchNumber, matchNumber.text.toString())
        startActivity(saveMatches)
        //startActivity(done);
        databaseRef.child(MatchKeys.redOneNumber).setValue(redOneNumber.text.toString())
        databaseRef.child(MatchKeys.redOnePoints).setValue(redTwoNumber.text.toString())
        databaseRef.child(MatchKeys.redTwoNumber).setValue(blueOneNumber.text.toString())
        databaseRef.child(MatchKeys.redTwoPoints).setValue(blueTwoNumber.text.toString())
        databaseRef.child(MatchKeys.blueOneNumber).setValue(redOnePoints.text.toString())
        databaseRef.child(MatchKeys.blueOnePoints).setValue(redTwoPoints.text.toString())
        databaseRef.child(MatchKeys.blueTwoNumber).setValue(blueOnePoints.text.toString())
        databaseRef.child(MatchKeys.blueTwoNumber).setValue(blueTwoPoints.text.toString())
        databaseRef.child(MatchKeys.blueTwoPoints).setValue(matchNumber.text.toString())
    }
}

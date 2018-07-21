package com.example.adsweiger.scoutingapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_matches.*

class Matches : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matches)
        val bundle = intent.extras
        if (bundle == null) {
            Log.i("stuff", "Null bundle")
            return
        }
        redTeamOneNumber.text = bundle.getString(MatchKeys.redOneNumber)
        redTeamTwoNumber.text = bundle.getString(MatchKeys.redOnePoints)
        blueTeamOneNumber.text = bundle.getString(MatchKeys.redTwoNumber)
        blueTeamTwoNumber.text = bundle.getString(MatchKeys.redTwoPoints)
        redTeamOnePoints.text = bundle.getString(MatchKeys.blueOneNumber)
        redTeamTwoPoints.text = bundle.getString(MatchKeys.blueOnePoints)
        blueTeamOnePoints.text = bundle.getString(MatchKeys.blueTwoNumber)
        blueTeamTwoPoints.text = bundle.getString(MatchKeys.blueTwoPoints)
        matchNumber.text = bundle.getString(MatchKeys.matchNumber)
    }

    fun onBackClick(view: View) {
        val back = Intent(this, MainActivity::class.java)
        startActivity(back)
    }

    fun onAddClick(view: View) {
        val add = Intent(this, AddMatchesActivity::class.java)
        startActivity(add)
    }
}

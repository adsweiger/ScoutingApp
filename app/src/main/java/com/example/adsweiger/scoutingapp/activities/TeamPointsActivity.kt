package com.example.adsweiger.scoutingapp.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.adsweiger.scoutingapp.R

class TeamPointsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_points)
    }

    fun onBackClick(view: View) {
        val back = Intent(this, MainActivity::class.java)
        startActivity(back)
    }
}

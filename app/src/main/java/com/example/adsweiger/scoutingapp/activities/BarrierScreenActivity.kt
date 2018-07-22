package com.example.adsweiger.scoutingapp.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.adsweiger.scoutingapp.R

class BarrierScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_team)
    }

    fun backToTeamInfo(view: View) {
        val backToTeamInfo = Intent(this, TeamsActivity::class.java)
        startActivity(backToTeamInfo)
    }
}
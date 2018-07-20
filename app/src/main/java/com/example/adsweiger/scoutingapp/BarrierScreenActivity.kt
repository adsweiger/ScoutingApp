package com.example.adsweiger.scoutingapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class BarrierScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_team_info)
    }

    fun backToTeamInfo(view: View) {
        val backToTeamInfo = Intent(this, TeamInfoActivity::class.java)
        startActivity(backToTeamInfo)
    }
}
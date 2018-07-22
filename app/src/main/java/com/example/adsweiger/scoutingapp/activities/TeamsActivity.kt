package com.example.adsweiger.scoutingapp.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.example.adsweiger.scoutingapp.R
import com.example.adsweiger.scoutingapp.TeamInfoKeys
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_teams.*


class TeamsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myTeamName = FirebaseDatabase.getInstance().reference
        Log.i("comment", "Point C Reached")
        setContentView(R.layout.activity_teams)
        val bundle = intent.extras
        if (bundle == null) {
            Log.i("stuff", "Null bundle")
            return
        }
        Log.i("stuff", "Bundle not null")

        teamNameText.text = bundle.getString(TeamInfoKeys.name)
        teamNumberText.text = bundle.getString(TeamInfoKeys.number)
        teamAutoCapabilityText.text = bundle.getString(TeamInfoKeys.autoCapability)
        teamTeleopPlanText.text = bundle.getString(TeamInfoKeys.teleopPlan)
        teamEndGamePlanText.text = bundle.getString(TeamInfoKeys.endGamePlan)
        teamOtherInfoText.text = bundle.getString(TeamInfoKeys.otherInfo)

        myTeamName.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val map = dataSnapshot.value as Map<String, Any>?
                for ((key, value) in map!!) {
                    Log.d("checkpoint", "Value is: $value")
                }
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w("checkpoint", "Failed to read value.", error.toException())
            }
        })
    }

    fun onBackClick(view: View) {
        val back = Intent(this, MainActivity::class.java)
        startActivity(back)
    }

    fun onAddClick(view: View) {
        val addTeamInfo = Intent(this, AddTeamActivity::class.java)
        startActivity(addTeamInfo)
    }
}
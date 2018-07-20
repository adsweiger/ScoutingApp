package com.example.adsweiger.scoutingapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_add_team_info.*

class AddTeamInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_team_info)
    }

    fun saveWhenDone(view: View) {
        val saveTeamInfo = Intent(this, TeamInfoActivity::class.java)
        saveTeamInfo.putExtra(TeamInfoKeys.name, teamName.text.toString())
        saveTeamInfo.putExtra(TeamInfoKeys.number, teamNumber.text.toString())
        saveTeamInfo.putExtra(TeamInfoKeys.autoCapability, teamAutoCapability.text.toString())
        saveTeamInfo.putExtra(TeamInfoKeys.teleopPlan, teamTeleopPlan.text.toString())
        saveTeamInfo.putExtra(TeamInfoKeys.endGamePlan, teamEndGamePlan.text.toString())
        saveTeamInfo.putExtra(TeamInfoKeys.otherInfo, teamOtherInfo.text.toString())
        startActivity(saveTeamInfo)
        val dataBase = FirebaseDatabase.getInstance().reference
        dataBase.child(TeamInfoKeys.name).setValue(teamName.text.toString())
        dataBase.child(TeamInfoKeys.number).setValue(teamNumber.text.toString())
        dataBase.child(TeamInfoKeys.autoCapability).setValue(teamAutoCapability.text.toString())
        dataBase.child(TeamInfoKeys.teleopPlan).setValue(teamTeleopPlan.text.toString())
        dataBase.child(TeamInfoKeys.endGamePlan).setValue(teamEndGamePlan.text.toString())
        dataBase.child(TeamInfoKeys.otherInfo).setValue(teamOtherInfo.text.toString())
        val newTeam = TeamInfo(teamName.text.toString(), teamNumber.text.toString(), teamAutoCapability.text.toString(), teamTeleopPlan.text.toString(), teamEndGamePlan.text.toString(), teamOtherInfo.text.toString())
        Log.i("Comment: ", newTeam.toString())
        dataBase.addValueEventListener(object : ValueEventListener {
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
}
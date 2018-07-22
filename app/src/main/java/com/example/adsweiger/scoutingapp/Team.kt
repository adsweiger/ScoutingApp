package com.example.adsweiger.scoutingapp

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Team(val name: String, val number: String, val autoCapability: String, val telePlan: String, val endGamePlan: String, val otherInfo: String) {
    companion object : ArrayList<Team>() {
//        fun find(key: String): Team {
//            forEach {
//                if(it.name.contains(key) || it.number.contains(key)) {
//
//                }
//            }
//        }
    }

    init {
        Team.add(this)
    }

    var database: FirebaseDatabase? = null
    var ref: DatabaseReference? = null
    var teams: Map<String, Team> = HashMap()

    fun toMap(): Map<String, Any> {
        return mapOf(
                TeamInfoKeys.name to name,
                TeamInfoKeys.number to number,
                TeamInfoKeys.autoCapability to autoCapability,
                TeamInfoKeys.teleopPlan to telePlan,
                TeamInfoKeys.endGamePlan to endGamePlan,
                TeamInfoKeys.otherInfo to otherInfo
        )
    }

    inner class Points(val autoPoints: Int, val teleopPoints: Int, endGamePoints: Int) {
    }
}
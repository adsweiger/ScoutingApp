package com.example.adsweiger.scoutingapp

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.util.*

class TeamInfo(val teamName: String, val teamNumber: String, val autoCapability: String, val telePlan: String, val endGamePlan: String, val otherInfo: String) {
    internal var database: FirebaseDatabase? = null
    internal var ref: DatabaseReference? = null
    internal var teams: Map<String, TeamInfo> = HashMap()

    fun toMap(): Map<String, Any> {
        return mapOf(
                TeamInfoKeys.name to teamName,
                TeamInfoKeys.number to teamNumber,
                TeamInfoKeys.autoCapability to autoCapability,
                TeamInfoKeys.teleopPlan to telePlan,
                TeamInfoKeys.endGamePlan to endGamePlan,
                TeamInfoKeys.otherInfo to otherInfo
        )
    }
}
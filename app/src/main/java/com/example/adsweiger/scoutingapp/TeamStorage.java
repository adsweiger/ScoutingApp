package com.example.adsweiger.scoutingapp;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class TeamStorage {
    FirebaseDatabase database;
    DatabaseReference ref;

    public String teamName;
    public String teamNumber;
    public String autoCapability;
    public String telePlan;
    public String endGamePlan;
    public String otherInfo;
    Map<String, TeamStorage> teams = new HashMap<>();

    public TeamStorage() {

    }

    public TeamStorage(String teamName, String teamNumber, String autoCapability, String telePlan, String endGamePlan, String otherInfo) {
        this.teamName = teamName;
        this.teamNumber = teamNumber;
        this.autoCapability = autoCapability;
        this.telePlan = telePlan;
        this.endGamePlan = endGamePlan;
        this.otherInfo = otherInfo;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("teamName", teamName);
        result.put("teamNumber", teamNumber);
        result.put("autoCapability", autoCapability);
        result.put("telePlan", telePlan);
        result.put("endGamePlan", endGamePlan);
        result.put("otherInfo", otherInfo);

        return result;
    }
}
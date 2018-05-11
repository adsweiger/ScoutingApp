package com.example.adsweiger.scoutingapp;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TeamStorage
{
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();
}

/*
// OUT OF ORDER
import java.util.HashMap;
import java.util.Map;

public class TeamStorage
{
    final FirebaseDatabase database;
        DatabaseReference ref;

    public String teamName;
    public String teamNumber;
    public String autoCapability;
    public String telePlan;
    public String endGamePlan;
    public String otherInfo;

    public TeamStorage(String teamName, String teamNumber, String autoCapability, String telePlan, String endGamePlan, String otherInfo)
    {
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("");
   }

    DatabaseReference teamRef = ref.child("teams");

    Map<String, TeamStorage> teams = new HashMap<>();
    teams.put("Lost in Time", new TeamStorage("4324","Unknown","Unknown","Unknown","Unknown"));

    teamRef.setValueAsync(teams);
*/
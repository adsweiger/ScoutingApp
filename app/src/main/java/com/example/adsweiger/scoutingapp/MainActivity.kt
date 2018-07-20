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

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("comment", "Hello")
        val mDatabase = FirebaseDatabase.getInstance().reference
        mDatabase.push().setValue("Hey boss.")
        // Read from the database
        mDatabase.addValueEventListener(object : ValueEventListener {
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

    fun onButtonClick(view: View) {
        Log.i("comment", "Point A Reached")
        // Reaches point A but not B, must be an issue with the line below.
        val next = Intent(this, TeamInfoActivity::class.java)
        startActivity(next)
        Log.i("comment", "Point B Reached")
    }

    fun onButton2Click(view: View) {
        val next = Intent(this, TeamPointsActivity::class.java)
        startActivity(next)
    }

    fun onButton3Click(view: View) {
        val next = Intent(this, Matches::class.java)
        startActivity(next)
    }
}
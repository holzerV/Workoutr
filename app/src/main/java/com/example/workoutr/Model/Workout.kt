package com.example.workoutr.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "workout_table")
data class Workout (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val length: Int,
    val date: String
)

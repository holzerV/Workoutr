package com.example.workoutr.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercise_table")
data class Exercise(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val workoutId: Int,
    val name: String,
    val reps: Int,
    val sets: Int,
    val rest: Int,
    val type: String
)
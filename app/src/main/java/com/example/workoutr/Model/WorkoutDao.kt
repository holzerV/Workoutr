package com.example.workoutr.Model

import androidx.room.*

@Dao
interface WorkoutDao {
    @Insert
    fun insert(workout: Workout)

    @Update
    fun update(workout: Workout)

    @Delete
    fun delete(workout: Workout)

    @Query("SELECT * FROM workout_table ORDER BY id")
    fun getAllWorkouts()
}
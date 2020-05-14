package com.example.workoutr.Model

import androidx.room.*

@Dao
interface ExerciseDao {

    @Insert
    fun insert(exercise: Exercise)

    @Update
    fun update(exercise: Exercise)

    @Delete
    fun delete(exercise: Exercise)

    @Query("SELECT * FROM exercise_table ORDER BY id")
    fun getAllExercises()

    @Query("SELECT * FROM exercise_table WHERE workoutId = :workoutId")
    fun getExerciseByWorkout(workoutId: Int)
}
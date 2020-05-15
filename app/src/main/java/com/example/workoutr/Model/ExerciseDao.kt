package com.example.workoutr.Model

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ExerciseDao {

    @Insert
    suspend fun insert(exercise: Exercise)

    @Update
    suspend fun update(exercise: Exercise)

    @Delete
    suspend fun delete(exercise: Exercise)

    @Query("SELECT * FROM exercise_table ORDER BY id")
    fun getAllExercises(): LiveData<List<Exercise>>

    @Query("SELECT * FROM exercise_table WHERE workoutId = :workoutId")
    fun getExerciseByWorkout(workoutId: Int): LiveData<List<Exercise>>
}
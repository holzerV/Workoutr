package com.example.workoutr.Model

import androidx.lifecycle.LiveData

class ExerciseRepository(private val exerciseDao: ExerciseDao) {
    val allExercises = exerciseDao.getAllExercises()

    suspend fun insert(exercise: Exercise) {
        exerciseDao.insert(exercise)
    }

    suspend fun update(exercise: Exercise) {
        exerciseDao.update(exercise)
    }

    suspend fun delete(exercise: Exercise) {
        exerciseDao.delete(exercise)
    }

    fun getExerciseByWorkout(workoutId: Int): LiveData<List<Exercise>> {
        return exerciseDao.getExerciseByWorkout(workoutId)
    }

}
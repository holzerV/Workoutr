package com.example.workoutr.Model

class WorkoutRepository(private val workoutDao: WorkoutDao) {
    val allWorkouts = workoutDao.getAllWorkouts()

    suspend fun insert(workout: Workout) {
        workoutDao.insert(workout)
    }

    suspend fun update(workout: Workout) {
        workoutDao.update(workout)
    }

    suspend fun delete(workout: Workout) {
        workoutDao.delete(workout)
    }
}
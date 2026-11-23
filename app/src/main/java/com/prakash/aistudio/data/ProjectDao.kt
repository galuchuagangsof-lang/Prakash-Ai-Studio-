package com.prakash.aistudio.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ProjectDao {
    @Query("SELECT * FROM projects ORDER BY createdAt DESC")
    fun all(): Flow<List<Project>>

    @Insert
    suspend fun insert(p: Project): Long

    @Delete
    suspend fun delete(p: Project)

    @Query("SELECT COUNT(*) FROM projects WHERE createdAt >= :since")
    suspend fun countSince(since: Long): Int
}

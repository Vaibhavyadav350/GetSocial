package com.vaibhavintech.getsocial

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {

    @Insert
    suspend fun insert(note: Note)
    @Delete
    suspend fun delete(note:Note)
    @Query("Select * from Notes_Table order by id")
    fun getAllNotes(): LiveData<List<Note>>
}
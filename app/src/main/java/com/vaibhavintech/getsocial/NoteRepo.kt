package com.vaibhavintech.getsocial

import androidx.lifecycle.LiveData

class NoteRepo(private val noteDao : NoteDao) {
    val allNotes: LiveData<List<Note>> = noteDao.getAllNotes()
}
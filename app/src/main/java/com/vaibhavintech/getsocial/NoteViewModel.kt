package com.vaibhavintech.getsocial

import android.app.Application
import androidx.lifecycle.*
import kotlinx.coroutines.launch

class NoteViewModel (application: Application) : AndroidViewModel(application) {

    val allNotes : LiveData<List<Note>>
    init{
        val dao=NoteDatabase.getDatabase(application).NoteDao()
        val repo= NoteRepo(dao)
        allNotes= repo.allNotes
    }
}
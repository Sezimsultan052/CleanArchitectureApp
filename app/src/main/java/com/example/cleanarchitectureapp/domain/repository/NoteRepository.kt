package com.example.cleanarchitectureapp.domain.repository

import com.example.cleanarchitectureapp.domain.model.Note

interface NoteRepository {

    fun addNote(note: Note)

    fun deleteLastNote()
}
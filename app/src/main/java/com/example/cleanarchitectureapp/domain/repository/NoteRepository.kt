package com.example.cleanarchitectureapp.domain.repository

import com.example.cleanarchitectureapp.core.Resource
import com.example.cleanarchitectureapp.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun addNote(note: Note): Flow<Resource<Unit>>

    fun deleteNote(note: Note): Flow<Resource<Unit>>

    fun getAllNotes(): Flow<Resource<List<Note>>>

}
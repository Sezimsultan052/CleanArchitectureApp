package com.example.domain.domain.repository

import com.example.domain.domain.model.Note
import kotlinx.coroutines.flow.Flow
import com.example.core.core.Resource

interface NoteRepository {

    fun addNote(note: Note): Flow<Resource<Unit>>

    fun deleteNote(note: Note): Flow<Resource<Unit>>

    fun getAllNotes(): Flow<Resource<List<Note>>>

}
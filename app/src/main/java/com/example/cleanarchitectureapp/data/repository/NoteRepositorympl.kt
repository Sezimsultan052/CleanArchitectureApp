package com.example.cleanarchitectureapp.data.repository

import android.util.Log
import com.example.cleanarchitectureapp.core.Resource
import com.example.cleanarchitectureapp.data.base.BaseRepository
import com.example.cleanarchitectureapp.data.mapper.NoteMapper
import com.example.cleanarchitectureapp.data.room.NoteDao
import com.example.cleanarchitectureapp.domain.model.Note
import com.example.cleanarchitectureapp.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

 class NoteRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao
) : NoteRepository, BaseRepository() {

    private val noteMapper = NoteMapper()

    override fun addNote(note: Note): Flow<Resource<Unit>> = doRequest {
        Log.e("TAG", "addNote: $note" )
        noteDao.addNote(noteMapper.toNoteEntity(note))
    }

    override fun deleteNote(note: Note): Flow<Resource<Unit>> = doRequest {
        noteDao.deleteNote(noteMapper.toNoteEntity(note))
    }

    override fun getAllNotes(): Flow<Resource<List<Note>>> = doRequest {
        noteDao.getAllNotes().map { entity -> noteMapper.toNote(entity) }
    }
}
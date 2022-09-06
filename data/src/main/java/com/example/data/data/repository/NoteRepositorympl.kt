package com.example.data.data.repository

import android.util.Log
import com.example.core.core.Resource
import com.example.data.data.base.BaseRepository
import com.example.data.data.mapper.NoteMapper
import com.example.data.data.room.NoteDao
import com.example.domain.domain.model.Note
import com.example.domain.domain.repository.NoteRepository
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
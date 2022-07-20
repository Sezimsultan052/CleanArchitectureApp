package com.example.cleanarchitectureapp.data.repository

import androidx.lifecycle.MutableLiveData
import com.example.cleanarchitectureapp.data.mapper.NoteMapper
import com.example.cleanarchitectureapp.data.model.NoteDto
import com.example.cleanarchitectureapp.domain.model.Note
import com.example.cleanarchitectureapp.domain.repository.NoteRepository

class NoteRepositorympl : NoteRepository {

    private val noteMapper = NoteMapper()
    val liveData = MutableLiveData<ArrayList<NoteDto>>()
    private var notes = arrayListOf<NoteDto>()

    override fun addNote(note: Note) {
        notes.add(noteMapper.toNoteDto(note))
        liveData.value = notes
    }

    override fun deleteLastNote() {
        notes.removeLast()
        liveData.value = notes
    }

    //delete

}
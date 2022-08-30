package com.example.cleanarchitectureapp.data.mapper

import com.example.cleanarchitectureapp.data.model.NoteEntity
import com.example.cleanarchitectureapp.domain.model.Note

class NoteMapper {

    fun toNote(note: NoteEntity) = Note(
        id = note.id,
        title = note.title,
        text = note.text
    )

    fun toNoteEntity(note: Note) = NoteEntity(
        id = note.id,
        title = note.title,
        text = note.text
    )


}
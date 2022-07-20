package com.example.cleanarchitectureapp.data.mapper

import com.example.cleanarchitectureapp.data.model.NoteDto
import com.example.cleanarchitectureapp.domain.model.Note

class NoteMapper {

    fun toNote(note: NoteDto) = Note (
        title = note.title,
        text = note.text
            )

    fun toNoteDto(note: Note) = NoteDto (
        title = note.title,
        text = note.text
    )


}
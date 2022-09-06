package com.example.data.data.mapper

import com.example.data.data.model.NoteEntity
import com.example.domain.domain.model.Note

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
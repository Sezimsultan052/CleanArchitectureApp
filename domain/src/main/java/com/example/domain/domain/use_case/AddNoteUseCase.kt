package com.example.domain.domain.use_case

import com.example.domain.domain.model.Note
import com.example.domain.domain.repository.NoteRepository
import javax.inject.Inject

class AddNoteUseCase @Inject constructor(private val noteRepository: NoteRepository) {

    fun addNote(note: Note) = noteRepository.addNote(note)

}
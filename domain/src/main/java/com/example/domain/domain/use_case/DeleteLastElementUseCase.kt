package com.example.domain.domain.use_case

import com.example.domain.domain.model.Note
import com.example.domain.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteLastNoteUseCase @Inject constructor(private val noteRepository: NoteRepository) {

    fun deleteNote(note: Note) = noteRepository.deleteNote(note)
}
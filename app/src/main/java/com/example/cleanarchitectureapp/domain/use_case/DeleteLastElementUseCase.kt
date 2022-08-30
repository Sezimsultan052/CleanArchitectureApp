package com.example.cleanarchitectureapp.domain.use_case

import com.example.cleanarchitectureapp.domain.model.Note
import com.example.cleanarchitectureapp.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteLastNoteUseCase @Inject constructor(private val noteRepository: NoteRepository) {

    fun deleteNote(note: Note) = noteRepository.deleteNote(note)
}
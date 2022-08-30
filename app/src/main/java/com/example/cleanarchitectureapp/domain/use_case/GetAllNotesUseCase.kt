package com.example.cleanarchitectureapp.domain.use_case

import com.example.cleanarchitectureapp.domain.repository.NoteRepository
import javax.inject.Inject

class GetAllNotesUseCase @Inject constructor(private val noteRepository: NoteRepository) {

    fun getAllNotes() = noteRepository.getAllNotes()

}
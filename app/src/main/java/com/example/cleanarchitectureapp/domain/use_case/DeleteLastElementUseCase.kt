package com.example.cleanarchitectureapp.domain.use_case

import com.example.cleanarchitectureapp.domain.model.Note
import com.example.cleanarchitectureapp.domain.repository.NoteRepository

class DeleteLastElementUseCase(private val noteRepository: NoteRepository) {

    fun deleteLastNote(){
        noteRepository.deleteLastNote()
    }

}
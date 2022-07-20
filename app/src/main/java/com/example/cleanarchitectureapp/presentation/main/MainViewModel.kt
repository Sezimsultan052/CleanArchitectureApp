package com.example.cleanarchitectureapp.presentation.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cleanarchitectureapp.data.repository.NoteRepositorympl
import com.example.cleanarchitectureapp.domain.model.Note
import com.example.cleanarchitectureapp.domain.repository.NoteRepository
import com.example.cleanarchitectureapp.domain.use_case.AddNoteUseCase
import com.example.cleanarchitectureapp.domain.use_case.DeleteLastElementUseCase

class MainViewModel: ViewModel() {
    private val repository = NoteRepositorympl()
    private val addNoteUseCase = AddNoteUseCase(repository)
    private val deleteLastElementUseCase = DeleteLastElementUseCase(repository)

    //принцип чего-то ----> УЗНАТЬ
//    private val _liveData = MutableLiveData<List<Note>>()
//    val liveData = _liveData as LiveData<List<Note>>

    val liveData = repository.liveData

    fun addNote(note:Note){
        addNoteUseCase.addNote(note)

    }

    fun deleteLastNote(){
        deleteLastElementUseCase.deleteLastNote()
    }


}
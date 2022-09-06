package com.example.cleanarchitectureapp.presentation.ui.main

import android.util.Log
import com.example.core.core.BaseViewModel
import com.example.core.core.UIState
import com.example.domain.domain.model.Note
import com.example.domain.domain.use_case.AddNoteUseCase
import com.example.domain.domain.use_case.DeleteLastNoteUseCase
import com.example.domain.domain.use_case.GetAllNotesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val addNoteUseCase: AddNoteUseCase,
    private val deleteLastNoteUseCase: DeleteLastNoteUseCase,
    private val getAllNotesUseCase: GetAllNotesUseCase
) : BaseViewModel() {

    private val _notesState = MutableStateFlow<UIState<List<Note>>>(UIState.Loading())
    val notesState = _notesState.asStateFlow()

    private val _noteState = MutableStateFlow<UIState<Unit>>(UIState.Loading())
    val noteState = _noteState.asStateFlow()

    private val _deleteNoteState = MutableStateFlow<UIState<Unit>>(UIState.Loading())
    val deleteNoteState = _deleteNoteState.asStateFlow()

    fun addNote(note: Note) {
        addNoteUseCase.addNote(note).getData(
            { error ->
                _noteState.value = UIState.Error(error ?: "something")
            },
            {
                _noteState.value = UIState.Loading()
            },
            { data ->
                if (data != null) {
                    _noteState.value = UIState.Success(data)
                }
            }
        )
    }

    fun getAllNotes() {
        getAllNotesUseCase.getAllNotes().getData(
            { error ->
                _notesState.value = UIState.Error(error ?: "something")
            },
            {
                _notesState.value = UIState.Loading()
            },
            { data ->
                Log.e("TAG", "getAllNotes: $data" )
                if (data != null) {
                    _notesState.value = UIState.Success(data)
                }
            }
        )
    }

    fun deleteLastNote(note: Note) {
        deleteLastNoteUseCase.deleteNote(note).getData(
            { error ->
                _deleteNoteState.value = UIState.Error(error ?: "something")
            },
            {
                _deleteNoteState.value = UIState.Loading()
            },
            { data ->
                if (data != null) {
                    _deleteNoteState.value = UIState.Success(data)
                }
            }
        )
    }
}
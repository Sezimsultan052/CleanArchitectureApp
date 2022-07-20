package com.example.cleanarchitectureapp.data.model

import com.example.cleanarchitectureapp.domain.model.Note

data class NoteDto(
    val title: String?= null,
    val text: String?= null
)
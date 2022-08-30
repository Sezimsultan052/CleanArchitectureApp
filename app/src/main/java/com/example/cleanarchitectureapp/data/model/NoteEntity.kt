package com.example.cleanarchitectureapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String? = null,
    val text: String? = null
)
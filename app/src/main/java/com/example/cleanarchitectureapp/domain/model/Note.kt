package com.example.cleanarchitectureapp.domain.model

import java.io.Serializable

data class Note(
    val id: Int = ID,
    val title: String? = null,
    val text: String? = null
):Serializable {
    companion object{
        const val ID = 0
    }
}

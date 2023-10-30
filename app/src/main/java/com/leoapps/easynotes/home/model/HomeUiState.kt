package com.leoapps.easynotes.home.model

data class HomeUiState(
    val notes: List<Note> = emptyList()
) {
    data class Note(
        val id: Long,
        val text: String
    )
}
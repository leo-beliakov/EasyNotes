package com.leoapps.easynotes.home.model

import androidx.compose.ui.graphics.Color

data class HomeUiState(
    val notes: List<Note> = emptyList()
) {
    data class Note(
        val id: Long,
        val title: String,
        val text: String,
        val dateText: String,
        val color: Color
    )
}
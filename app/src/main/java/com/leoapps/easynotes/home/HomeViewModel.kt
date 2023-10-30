package com.leoapps.easynotes.home

import androidx.lifecycle.ViewModel
import com.leoapps.easynotes.home.model.HomeUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class HomeViewModel : ViewModel() {

    private val _state = MutableStateFlow(HomeUiState())
    val state = _state.asStateFlow()

    init {
        // read notes from the db
        _state.update { it.copy(notes = getFakeNotes()) }
    }

    private fun getFakeNotes(): List<HomeUiState.Note> {
        return listOf(
            HomeUiState.Note(id = 1L, text = "Buy groceries"),
            HomeUiState.Note(id = 2L, text = "Call mom"),
            HomeUiState.Note(id = 3L, text = "Prepare presentation for work"),
            HomeUiState.Note(id = 4L, text = "Schedule dentist appointment"),
            HomeUiState.Note(id = 5L, text = "Clean the house"),
            HomeUiState.Note(id = 6L, text = "Finish reading the book"),
            HomeUiState.Note(id = 7L, text = "Water the plants"),
            HomeUiState.Note(id = 8L, text = "Workout for 30 minutes"),
            HomeUiState.Note(id = 9L, text = "Check emails"),
            HomeUiState.Note(id = 10L, text = "Plan the weekend trip")
        )
    }
}
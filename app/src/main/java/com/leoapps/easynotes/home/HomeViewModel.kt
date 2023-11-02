package com.leoapps.easynotes.home

import androidx.lifecycle.ViewModel
import com.leoapps.easynotes.home.model.HomeUiState
import com.leoapps.easynotes.ui.theme.color1
import com.leoapps.easynotes.ui.theme.color2
import com.leoapps.easynotes.ui.theme.color3
import com.leoapps.easynotes.ui.theme.color4
import com.leoapps.easynotes.ui.theme.color5
import com.leoapps.easynotes.ui.theme.color6
import com.leoapps.easynotes.ui.theme.color7
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
            HomeUiState.Note(
                id = 1L,
                title = "Groceries",
                text = "Need to buy milk, eggs, and bread",
                dateText = "May 01, 2023",
                color = color1
            ),
            HomeUiState.Note(
                id = 2L,
                title = "Mom",
                text = "Call mom and ask about her health",
                dateText = "May 02, 2023",
                color = color2
            ),
            HomeUiState.Note(
                id = 3L,
                title = "Work",
                text = "Prepare the monthly report presentation",
                dateText = "May 03, 2023",
                color = color3
            ),
            HomeUiState.Note(
                id = 4L,
                title = "Dentist",
                text = "Schedule a check-up appointment",
                dateText = "May 04, 2023",
                color = color4
            ),
            HomeUiState.Note(
                id = 5L,
                title = "Cleaning",
                text = "Deep clean the living room",
                dateText = "May 05, 2023",
                color = color5
            ),
            HomeUiState.Note(
                id = 6L,
                title = "Reading",
                text = "Finish the last chapter of the book",
                dateText = "May 06, 2023",
                color = color6
            ),
            HomeUiState.Note(
                id = 7L,
                title = "Plants",
                text = "Water the indoor plants",
                dateText = "May 07, 2023",
                color = color7
            ),
            HomeUiState.Note(
                id = 8L,
                title = "Exercise",
                text = "Do a 30-minute HIIT workout",
                dateText = "May 08, 2023",
                color = color1
            ),
            HomeUiState.Note(
                id = 9L,
                title = "Emails",
                text = "Reply to pending emails",
                dateText = "May 09, 2023",
                color = color2
            ),
            HomeUiState.Note(
                id = 10L,
                title = "Trip",
                text = "Plan the details for the weekend trip",
                dateText = "May 10, 2023",
                color = color3
            )
        )
    }
}
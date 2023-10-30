package com.leoapps.easynotes.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.leoapps.easynotes.home.model.HomeUiState
import com.leoapps.easynotes.ui.theme.EasyNotesTheme

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = HomeViewModel(),
) {

    val state by viewModel.state.collectAsStateWithLifecycle()

    HomeScreen(
        state = state
    )
}

@Composable
private fun HomeScreen(
    state: HomeUiState
) {
    EasyNotesTheme {
        Text(
            text = "Hello",
        )
    }
}
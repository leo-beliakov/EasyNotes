package com.leoapps.easynotes.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.leoapps.easynotes.home.composables.HomeContent
import com.leoapps.easynotes.home.composables.HomeFAB
import com.leoapps.easynotes.home.composables.HomeTopBar
import com.leoapps.easynotes.home.model.HomeUiState
import com.leoapps.easynotes.ui.theme.background

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = HomeViewModel(),
) {

    val state by viewModel.state.collectAsStateWithLifecycle()

    HomeScreen(
        state = state
    )
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
private fun HomeScreen(
    state: HomeUiState
) {
    val scrollBehavior = pinnedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        containerColor = background, // todo should be in the theme
        topBar = {
            HomeTopBar(
                scrollBehavior = scrollBehavior
            )
        },
        floatingActionButton = {
            HomeFAB(
                onAddClicked = {}
            )
        },
        content = { paddings ->
            HomeContent(
                state = state,
                modifier = Modifier.padding(paddings)
            )
        }
    )
}


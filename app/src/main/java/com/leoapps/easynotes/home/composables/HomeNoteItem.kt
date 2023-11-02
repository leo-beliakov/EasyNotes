package com.leoapps.easynotes.home.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.leoapps.easynotes.home.model.HomeUiState

@Composable
fun HomeNoteItem(
    note: HomeUiState.Note
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier
            .background(note.color, RoundedCornerShape(8.dp))
            .height(320.dp)
            .padding(16.dp)
    ) {
        Text(
            text = note.title,
            fontSize = 16.sp,
            color = Color.Black
        )
        Text(
            text = note.text,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            color = Color.DarkGray
        )
    }
}
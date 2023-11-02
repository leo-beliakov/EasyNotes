package com.leoapps.easynotes.home.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.leoapps.easynotes.ui.theme.clickableBackground

@Composable
fun HomeFAB(onAddClicked: () -> Unit) {
    IconButton(
        onClick = onAddClicked,
        modifier = Modifier
            .size(56.dp)
            .background(
                color = clickableBackground,
                shape = CircleShape
            )
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            tint = Color.White,
            contentDescription = "Add note"
        )
    }
}
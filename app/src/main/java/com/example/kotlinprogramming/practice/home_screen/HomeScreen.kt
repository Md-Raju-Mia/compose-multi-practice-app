package com.example.kotlinprogramming.practice.home_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.kotlinprogramming.R


@Composable
fun HomeScreen(
    onHappyBirthdayClick: () -> Unit,
    onComposableArticleClick: () -> Unit,
    onTaskManagerClick: () -> Unit,
    onComposeQuadrantClick: () -> Unit,
    onDiceRollerClick: () -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Practice Apps",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        AppLauncherCard(
            title = stringResource(R.string.happy_birthday_app_text),
            onClick = onHappyBirthdayClick
        )

        AppLauncherCard(
            title = stringResource(R.string.title_jetpack_compose_tutorial),
            onClick = onComposableArticleClick
        )

        AppLauncherCard(
            title = stringResource(R.string.task_manager_app_text),
            onClick = onTaskManagerClick
        )

        AppLauncherCard(
            title = stringResource(R.string.compose_quadrant_app_text),
            onClick = onComposeQuadrantClick
        )

        AppLauncherCard(
            title = stringResource(R.string.dice_roller_app_text),
            onClick = onDiceRollerClick
        )
    }
}

@Composable
fun AppLauncherCard(
    title: String,
    onClick: () -> Unit
) {
    ElevatedCard(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(24.dp),
            style = MaterialTheme.typography.titleMedium
        )
    }
}

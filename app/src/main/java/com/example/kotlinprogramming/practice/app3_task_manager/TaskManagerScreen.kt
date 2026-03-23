package com.example.kotlinprogramming.practice.app3_task_manager

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinprogramming.R
import com.example.kotlinprogramming.ui.theme.KotlinProgrammingTheme

@Composable
fun TaskManagerApp() {
    TaskManagerScreen(
        imagePainter = painterResource(R.drawable.ic_task_completed),
        title = stringResource(R.string.all_tasks_completed_text),
        description = stringResource(R.string.nice_work_text),
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .safeDrawingPadding()
    )
}

@Composable
private fun TaskManagerScreen(
    imagePainter: Painter,
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = imagePainter,
            contentDescription = null,
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = description,
            fontSize = 16.sp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun TaskCompletedPreview() {
    KotlinProgrammingTheme {
        TaskManagerApp()
    }
}


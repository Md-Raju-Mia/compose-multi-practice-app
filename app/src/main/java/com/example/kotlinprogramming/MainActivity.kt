package com.example.kotlinprogramming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.kotlinprogramming.practice.app1_happy_birthday.GreetingImage
import com.example.kotlinprogramming.practice.app2_compose_article.ComposeArticleApp
import com.example.kotlinprogramming.practice.app3_task_manager.TaskManagerApp
import com.example.kotlinprogramming.practice.app4_compose_quadrant.ComposeQuadrantApp
import com.example.kotlinprogramming.practice.app6_business_card_app.BusinessCardApp
import com.example.kotlinprogramming.practice.app7_diceroller.DiceRollerApp
import com.example.kotlinprogramming.practice.app7_diceroller.DiceWithButtonAndImage
import com.example.kotlinprogramming.practice.home_screen.HomeScreen
import com.example.kotlinprogramming.practice.home_screen.PracticeScreen
import com.example.kotlinprogramming.ui.theme.KotlinProgrammingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinProgrammingTheme {
                var currentScreen by remember { mutableStateOf(PracticeScreen.HOME) }

                // Handle system back button
                if (currentScreen != PracticeScreen.HOME) {
                    BackHandler {
                        currentScreen = PracticeScreen.HOME
                    }
                }

                when (currentScreen) {
                    PracticeScreen.HOME -> HomeScreen(
                        onHappyBirthdayClick = {
                            currentScreen = PracticeScreen.HAPPY_BIRTHDAY
                        },
                        onComposableArticleClick = {
                            currentScreen = PracticeScreen.COMPOSE_ARTICLE
                        },
                        onTaskManagerClick = {
                            currentScreen = PracticeScreen.TASK_MANAGER
                        },
                        onComposeQuadrantClick = {
                            currentScreen = PracticeScreen.COMPOSE_QUADRANT
                        },
                        onBusinessCardClick = {
                            currentScreen = PracticeScreen.BUSINESS_CARD
                        },
                        onDiceRollerClick = {
                            currentScreen = PracticeScreen.DICE_ROLLER
                        }
                    )

                    PracticeScreen.HAPPY_BIRTHDAY -> {
                        GreetingImage(
                            message = getString(R.string.happy_birthday_sam_text),
                            from = getString(R.string.from_emma_text),
                            modifier = Modifier.fillMaxSize()
                        )
                    }

                    PracticeScreen.COMPOSE_ARTICLE -> {
                        ComposeArticleApp()
                    }

                    PracticeScreen.TASK_MANAGER -> {
                        TaskManagerApp()
                    }
                    PracticeScreen.COMPOSE_QUADRANT -> {
                        ComposeQuadrantApp()
                    }
                    PracticeScreen.BUSINESS_CARD -> {
                        Surface(
                            modifier = Modifier.fillMaxSize(),
                            color = Color(0xFFD2E8D4)
                        ) {
                            BusinessCardApp(
                                modifier = Modifier.safeDrawingPadding()
                            )
                        }
                    }
                    
                    PracticeScreen.DICE_ROLLER -> {
                        DiceRollerApp()
                    }
                }
            }
        }
    }
}

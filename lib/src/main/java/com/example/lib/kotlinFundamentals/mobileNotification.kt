package com.example.lib.kotlinFundamentals

fun main(){
    val morningNotification = 51
    val eveningNotificaiton = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotificaiton)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("You have $numberOfMessages notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}
package org.example.lesson_5

import java.time.Year

fun main() {
    println("Введите год рождения: ")
    val userDate = readln().toInt()
    val userAge = Year.now().value - userDate

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Show limited content"
    } else {
        "Back to main screen"
    }
    println(resultText)
}
const val AGE_OF_MAJORITY = 18
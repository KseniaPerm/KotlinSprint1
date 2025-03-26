package org.example.lesson_1_10.lesson_6

import kotlin.random.Random

fun main() {
    val winNumber = Random.nextInt(1, 9)
    var numberOfAttempts = 5

    while (numberOfAttempts > 0) {
        println("Введите  число от 1 до 9  ")
        val userNumber = readln().toInt()
        if (userNumber == winNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            numberOfAttempts--
            println("Число не угадано, оставшееся количество попыток $numberOfAttempts")
        }
    }
    println("Было загадано число $winNumber")
}

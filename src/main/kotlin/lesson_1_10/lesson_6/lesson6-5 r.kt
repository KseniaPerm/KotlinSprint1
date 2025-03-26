package org.example.lesson_1_10.lesson_6

import kotlin.random.Random

fun main() {
    var numberOfAttempts = 3
    while (numberOfAttempts > 0) {
        val number1 = Random.nextInt(1, 9)
        val number2 = Random.nextInt(1, 9)

        println("Докажите, что вы не бот.У вас три попытки.")

        println("Решите пример $number1 + $number2, и введите ответ ниже: ")
        val userSumm = readln().toInt()
        if (userSumm == number1 + number2) {
            println("Добро пожаловать!")
            return
        } else {
            numberOfAttempts--
            println("Неверно!")
        }
    }
    println("Доступ запрещен! ")
}
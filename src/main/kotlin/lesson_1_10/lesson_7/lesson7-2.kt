package org.example.lesson_1_10.lesson_7

import kotlin.random.Random

fun main() {
    while (true) {
        val randomNumber = Random.nextInt(1000, 9999)
        println("Ваш код авторизации $randomNumber")

        println("Введите код авторизации: ")
        val authorizationCode = readln().toInt()
        if (randomNumber == authorizationCode) {
            println("Приветствую!")
            return
        } else {
            println("Код введен неверно! Введите верный код ")
        }
    }
}
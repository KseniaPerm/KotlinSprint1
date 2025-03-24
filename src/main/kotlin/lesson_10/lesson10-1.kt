package org.example.lesson_10

import kotlin.random.Random

fun main() {
    val rollUser = rollOfDice()
    printThrowRoll("Пользователь", rollUser)

    val rollComputer = rollOfDice()
    printThrowRoll("Компьютер", rollComputer)

  if (rollComputer > rollUser) {
        println()
        println("Победила машина")
    } else if (rollComputer < rollUser) {
        println()
        println("Победило человечество")
    } else {
        println("Победила дружба ")
    }
}

fun rollOfDice() {
    Random.nextInt(1,6)
}

fun printThrowRoll(player: String, throwRoll: Int) {
    println("Бросок $player.\nНа кубиках выпало значение $throwRoll")
}
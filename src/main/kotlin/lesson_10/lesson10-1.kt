package org.example.lesson_10

import kotlin.random.Random

fun main() {
    val rollUser = rollOfDice()
    printUserThrow(rollUser)
    val rollComputer = rollOfDice()
    printComputerThrow(rollComputer)
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

fun rollOfDice(): Int {
    return Random.nextInt(1, 6)
}

fun printUserThrow(rollUser: Int) {
    println("Бросок пользователя : ")
    println("На кубиках выпало значение $rollUser")
}

fun printComputerThrow(rollComputer: Int) {
    println("Бросок компьютера : ")
    println("На кубиках выпало значение $rollComputer")
}
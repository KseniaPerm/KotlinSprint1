package org.example.lesson_10

fun main() {
    var userWin = 0
    do {
        val rollUser = rollOfDices()
        printThrowRolls("Пользователь", rollUser)

        val rollComputer = rollOfDices()
        printThrowRolls("Компьютер", rollComputer)

        if (rollComputer > rollUser) {
            println()
            println("Победила машина")
        } else if (rollComputer < rollUser) {
            println()
            println("Победило человечество")
            userWin++
        } else {
            println("Победила дружба ")
        }
        println("Хотите бросить кубики еще раз? ")
        val answer = readln()
    } while (answer.equals("да", ignoreCase = true))
    println("Вы выиграли партий - $userWin ")
}

fun rollOfDices(): Int {
    return (1..6).random()
}

fun printThrowRolls(player: String, throwRoll: Int) {
    println("Бросок $player.\nНа кубиках выпало значение $throwRoll")
}
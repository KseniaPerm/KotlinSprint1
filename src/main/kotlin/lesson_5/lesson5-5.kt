package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val winningNumbers = mutableListOf<Int>()
    winningNumbers.add(Random.nextInt(0, 42))
    winningNumbers.add(Random.nextInt(0, 42))
    winningNumbers.add(Random.nextInt(0, 42))
    val userNumbers = mutableListOf<Int>()

    println("Введите три числа от 0 до 42 .Введите первое число : ")

    val userNumber1 = readln().toInt()
    userNumbers.add(userNumber1)

    println("Введите второе число : ")

    val userNumber2 = readln().toInt()
    userNumbers.add(userNumber2)

    println("Введите третье число: ")

    val userNumber3 = readln().toInt()
    userNumbers.add(userNumber3)

    println("Ваши введеные числа : $userNumbers")
    val compare = userNumbers.intersect(winningNumbers.toSet()).size
    when (compare) {
        3 -> println("Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали все числа и выиграли джекпот!")
        0 -> println("Вы не угадали ни одного числа.")
    }

    println("Выигрышные числа : $winningNumbers")
}





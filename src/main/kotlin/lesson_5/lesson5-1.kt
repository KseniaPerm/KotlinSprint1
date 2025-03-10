package org.example.lesson_5

fun main() {
    val number1 = 5
    val number2 = 5
    val sum = number1 + number2
    println("Докажите, что вы не бот. Решите пример $number1 + $number2, и введите ответ ниже :  ")

    val answer = readln().toInt()
    if (answer == sum) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен!")
    }
}
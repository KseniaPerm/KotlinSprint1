package org.example.lesson_5

fun main() {
    println("Докажите, что вы не бот. Решите пример 5 + 5, и введите ответ ниже :  ")

    val answer = readlnOrNull()!!.toInt()
    if (answer == 10) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен!")
    }
}
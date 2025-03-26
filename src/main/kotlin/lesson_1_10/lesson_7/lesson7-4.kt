package org.example.lesson_1_10.lesson_7


fun main() {
    println("Введите количество секунд, которое нужно засечь : ")
    var seconds = readln().toInt()
    for (i in 1..seconds) {
        println("Осталось секунд  ${seconds--} ")
        Thread.sleep(1000)
    }
    println()
    println("Время вышло")
}
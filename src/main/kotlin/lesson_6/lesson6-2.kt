package org.example.lesson_6

fun main() {
    println("Введите количество секунд, которое нужно засечь : ")
    var seconds = readln().toInt()
    val seconds1 = seconds
    while (seconds > 0) {
        println("Прошло ${seconds--} секунд")
        Thread.sleep(1000)
    }
    println()
    println("Прошло $seconds1 секунд")
}
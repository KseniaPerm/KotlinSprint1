package org.example.lesson_1_10.lesson_6

fun main() {
    println("Введите количество секунд, которое нужно засечь : ")
    val seconds = readln().toInt()
    Thread.sleep(1000)
    println("Прошло $seconds секунд")
}


package org.example.lesson_10

import kotlin.random.Random

fun main() {
    println("Введите длину пароля : ")
    val length = readln().toInt()
    val password = getPasswordForUser(length)
    println(password)
}

fun getPasswordForUser(length: Int): String {
    val range1 = (' '..'/').toList()
    val range2 = ('0'..'9').toList()
    var password = ""
    for (i in 0 until length) {
        if (i % 2 == 0) {
            val figure = range1[Random.nextInt(range1.size)]
            password += figure
        } else {
            val char = range2[Random.nextInt(range2.size)]
            password += char
        }
    }
    return password
}
package org.example.lesson_7

import kotlin.random.Random

fun main() {
    val range1 = ('1'..'9').toList()
    val range2 = ('a'..'z').toList()
    var password = " "

    for (i in 1..6) {
        if (i % 2 == 0) {
            val figure = range1[Random.nextInt(range1.size)]
            password += figure
        } else {
            val cymbol = range2[Random.nextInt(range2.size)]
            password += cymbol
        }
    }
    println(password)
}
package org.example.lesson_16

class Cube {
    private val number = (1..6).random()

    fun rollOfCube() {
        println(number)

    }
}

fun main() {
    Cube().rollOfCube()
}
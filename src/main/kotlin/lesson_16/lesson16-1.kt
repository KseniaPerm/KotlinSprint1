package org.example.lesson_16

class Cube {
    private val number = (1..6).random()

    fun rollOfCube(): Int {
        println(number)
        return number
    }
}

fun main() {
    Cube().rollOfCube()
}
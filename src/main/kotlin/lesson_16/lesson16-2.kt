package org.example.lesson_16

import kotlin.math.pow

private const val PI = 3.14

class Circle(
    private val radius: Double,
) {
    fun calculateTheCircumference(): Double {
        val circumferenceLength = 2 * (PI * radius)
        return circumferenceLength
    }

    fun calculateAreaOfCircle(): Double {
        val areaOfCircle = PI * (radius.pow(2.00))
        return areaOfCircle
    }
}

fun main() {
    val circle = Circle(3.00)
    println("Площадь круга: ${circle.calculateAreaOfCircle()}")
    println("Длина окружности: ${circle.calculateTheCircumference()}")
}
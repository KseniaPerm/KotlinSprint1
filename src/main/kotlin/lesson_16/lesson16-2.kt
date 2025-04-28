package org.example.lesson_16

private const val PI = 3.14

class Circle(
    private val r: Double,
) {
    fun circumferenceLength() {
        val c = (PI * r) + (PI * r)
        println("Длина окружности равна $c")
    }

    fun areaOfCircle() {
        val s = PI * (r * r)
        println("Площадь круга равна $s")
    }
}

fun main() {
    val circle = Circle(3.00)
    circle.areaOfCircle()
    circle.circumferenceLength()
}
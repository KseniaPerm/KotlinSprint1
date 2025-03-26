package org.example.lesson_1_10.lesson_4

fun main() {
    val weight1 = 20
    val volume1 = 80
    val weight2 = 50
    val volume2 = 100
    println("Груз с весом $weight1 кг и объемом $volume1 л соответствует категории 'Average': ${(weight1 > WEIGHT) && (weight1 <= WEIGHT_HIGH) && (volume1 < VOLUME)}")
    println("Груз с весом $weight2 кг и объемом $volume2 л соответствует категории 'Average': ${(weight2 > WEIGHT) && (weight2 <= WEIGHT_HIGH) && (volume2 < VOLUME)}")
}
const val WEIGHT = 35
const val WEIGHT_HIGH = 100
const val VOLUME = 100
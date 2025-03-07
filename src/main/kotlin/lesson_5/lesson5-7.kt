package org.example.lesson_5

fun main() {
    println("Введите расстояние поездки в километрах :")
    val distance = readln().toDouble()

    println("Введите расход топлива на 100 км в литрах :")
    val expenditure = readln().toDouble()

    println("Введите цену за литр топлива: ")
    val price = readln().toDouble()

    val fullFuel = (distance * expenditure) / KM_TO_LITRE
    val totalCost = fullFuel * price
    println("Общее количество необходимого топлива : ${"%.2f".format(fullFuel)}")
    println()
    println("Итоговая стоимость поездки : ${"%.2f".format(totalCost)}")
}
const val KM_TO_LITRE = 100





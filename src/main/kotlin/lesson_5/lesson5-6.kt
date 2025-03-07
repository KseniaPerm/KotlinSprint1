package org.example.lesson_5

import kotlin.math.pow

fun main() {
    println("Введите ваш вес :")
    val weight = readln().toDouble()
    println("Введите ваш рост в сантиметрах :")
    val height = readln().toDouble()
    val heightMetre = height / HIGH_METRE
    val imt = weight / (heightMetre.pow(2))

    when {
        imt < 18.5 -> println("Недостаточная масса тела")
        imt < 25 -> println("Нормальная масса тела")
        imt < 30 -> println("Избыточная масса тела")
        else -> println("Ожирение")
    }
    println("Ваш индекс массы тела : ${"%.3f".format(imt)}")
}

const val HIGH_METRE = 100




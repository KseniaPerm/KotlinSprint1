package org.example.lesson_1_10.lesson_8

fun main() {
    println("Введите количество и названия ингредиентов : ")
    val arrayOfIngredients = Array(readln().toInt()) { readln() }
    println("Ингредиенты : ${arrayOfIngredients.joinToString()}")
}
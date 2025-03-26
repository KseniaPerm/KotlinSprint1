package org.example.lesson_1_10.lesson_9

fun main() {
    println("Введите пять названий блюд, через запятую с пробелом : ")
    val userIngredient = readln()
    val listOfIngredients = userIngredient.split(' ')
    listOfIngredients.sorted().forEach {
        println(it)
    }
}
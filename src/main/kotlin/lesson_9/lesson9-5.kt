package org.example.lesson_9

fun main() {
    println("Введите пять ингредиентов: ")
    val ingredientsSet = mutableSetOf<String>()
    for (i in 1..5) {
        val ingredient = readln()
        ingredientsSet.add(ingredient)
    }
    val ingredientsSet1 = (ingredientsSet.sorted()).joinToString().replaceFirstChar { it.uppercase() }
    println(ingredientsSet1)
}
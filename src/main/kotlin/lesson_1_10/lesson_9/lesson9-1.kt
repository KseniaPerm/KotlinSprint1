package org.example.lesson_1_10.lesson_9

fun main() {
    val listOfIngredients: List<String> = listOf("лист салата", "помидор", "соус", "сыр", "креветки", "соль", "перец")
    println("В рецепте есть следующие ингредиенты: $listOfIngredients")
    println()
    listOfIngredients.forEach { ingredient: String ->
        println(ingredient)
    }
}
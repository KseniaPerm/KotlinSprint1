package org.example.lesson_8


fun main() {
    val arrayOfIngredients: Array<String> =
        arrayOf("лист салата", "помидор", "соус", "сыр", "креветки", "соль", "перец")

    println("Введите интересующий  ингредиент: ")
    val ingredient = readln()
    if (ingredient in arrayOfIngredients) {
        println("Ингредиент $ingredient есть в рецепте")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
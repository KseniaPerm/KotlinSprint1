package org.example.lesson_1_10.lesson_9

fun main() {
    val listOfIngredients: MutableList<String> = mutableListOf("мука", "вода", "соль")
    println("В рецепте есть базовые ингредиенты: $listOfIngredients")
    println("Желаете добавить еще? Введите да/нет ")
    val ingredient = readln()

    if (ingredient.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить? ")
    } else {
        return
    }
    val newIngredient = readln()
    listOfIngredients.add(newIngredient)
    println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients ")
}
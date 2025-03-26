package org.example.lesson_1_10.lesson_8


fun main() {
    val arrayOfIngredients: Array<String> =
        arrayOf("лист салата", "помидор", "соус", "сыр", "креветки", "соль", "перец")

    println("Введите интересующий  ингредиент: ")
    val ingredient = readln()
    for (i in arrayOfIngredients) {
        if (i == ingredient) {
            println("Ингредиент $ingredient в списке есть")
            return
        }
    }
    println("Такого ингредиента  в рецепте нет")
}
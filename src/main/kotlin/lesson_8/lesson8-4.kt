package org.example.lesson_8

fun main() {
    val arrayOfIngredients: Array<String> =
        arrayOf("лист салата", "помидор", "соус", "сыр", "креветки", "соль", "перец")
    for (i in arrayOfIngredients) {
        println("Ингредиент ${arrayOfIngredients.indexOf(i) + 1} : $i")
    }
    println()
    println("Введите ингредиент, который необходимо заменить:  ")
    val ingredient = readln()
    val one = arrayOfIngredients.indexOf(ingredient)

    if (ingredient !in arrayOfIngredients) {
        println("Ингредиента нет в списке")
    } else {
        println("Введите ингредиент, который нужно добавить: ")
        val userIngredient = readln()
        arrayOfIngredients[one] = userIngredient
    }
    println("Готово, вы сохранили следующий список:")
    for (i in arrayOfIngredients) {
        println("${arrayOfIngredients.indexOf(i) + 1} : $i")
    }
}
package org.example.lesson_8


fun main() {


    println("Введите количество ингредиентов: ")
    val numberOfIngredients = readln().toInt()

    var arrayOfIngredients = arrayOf<String>()
    for (i in 0..<numberOfIngredients) {
        println("Введите название ингредиента: ")
        arrayOfIngredients = arrayOf(readln())
    }
    println(arrayOfIngredients.joinToString(","))
}















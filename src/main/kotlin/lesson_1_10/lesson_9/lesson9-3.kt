package org.example.lesson_1_10.lesson_9

fun main() {
    println("Рассчитаем, сколько нужно  ингредиентов для разного количества порций омлета :  ")
    println()
    val listOfIngredients: MutableList<Int> = mutableListOf(2, 50, 15)
    println("Введите количество порций:")
    val userCount = readln().toInt()
    val listOfIngredients2 = listOfIngredients.map {
        it * userCount
    }
    println(
        """На количество порций $userCount, вам понадобится :
Яиц ${listOfIngredients2[0]}
Молока ${listOfIngredients2[1]}
Масла ${listOfIngredients2[2]}
""".trimIndent()
    )
}






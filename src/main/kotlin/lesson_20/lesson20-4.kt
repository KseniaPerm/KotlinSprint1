package org.example.lesson_20

fun main() {
    val listOfEFruits = listOf("Груша", "Яблоко", "Банан", "Апельсин", "Лимон")
    val lambdaList: List<() -> String> = listOfEFruits.map { str -> { str } }
    lambdaList.forEach { lambda ->
        println("Нажат элемент : ${lambda()}")
    }

    lambdaList.forEachIndexed { index, lambda ->
        if (index % 2 == 0)
            println("Нажат элемент  ${lambda()}")
    }
}
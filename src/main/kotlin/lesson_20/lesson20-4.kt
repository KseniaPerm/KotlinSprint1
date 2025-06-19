package org.example.lesson_20

fun main() {
    val listOfFruits = listOf("Груша", "Яблоко", "Банан", "Апельсин", "Лимон")
    val lambdaList: List<() -> Unit> = listOfFruits.map { fruit ->
        { println("Нажат элемент $fruit") }
    }

    lambdaList.forEachIndexed { index, fruit ->
        if (index % 2 == 1)
            fruit()
    }
}
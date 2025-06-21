package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {
    this.filter { it % 2 == 0 }.sum()
    return sum()
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 28)
    val sum = numbers.evenNumbersSum()
    println("Сумма всех четных чисел в списке : $sum ")
}
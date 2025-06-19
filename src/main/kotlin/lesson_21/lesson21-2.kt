package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {
    var sum = 0
    for (number in this) {
        if (number % 2 == 0)
            sum += number
    }
    return sum
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 28)
    val sum = numbers.evenNumbersSum()
    println("Сумма всех четных чисел в списке : $sum ")
}
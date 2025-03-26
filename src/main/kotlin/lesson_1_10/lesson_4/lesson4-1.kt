package org.example.lesson_1_10.lesson_4

fun main() {
    val reserveForToday = 13
    val reserveForTomorrow = 9
    val comparisonResult : Boolean = reserveForToday < NUMBER_OF_TABLES
    val comparisonResult2 : Boolean = reserveForTomorrow < NUMBER_OF_TABLES
    println("Доступность столиков на сегодня: $comparisonResult\nДоступность столиков на завтра: $comparisonResult2")
}
const val NUMBER_OF_TABLES = 13
package org.example.lesson_4

fun main() {
    val dayOfWorkout = 5
    val exerciseArmsAndPress: Boolean = (dayOfWorkout % 2) != 0
    val exerciseLegsAndBack: Boolean = (dayOfWorkout % 2) == 0

    val comparisonResult = """
        Упражнения для рук: $exerciseArmsAndPress
        Упражнения для ног: $exerciseLegsAndBack
        Упражнения для спины: $exerciseLegsAndBack
        Упражнения для пресса: $exerciseArmsAndPress
    """.trimIndent()
    println(comparisonResult)
}



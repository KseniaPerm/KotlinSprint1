package org.example.lesson_4

fun main() {
    val dayOfWorkout = 5
    val exercise: Boolean = (dayOfWorkout % 2) == 0
    val comparisonResult = """
        Упражнения для рук: ${!exercise}
        Упражнения для ног: $exercise
        Упражнения для спины: $exercise
        Упражнения для пресса: ${!exercise}
    """.trimIndent()
    println(comparisonResult)
}



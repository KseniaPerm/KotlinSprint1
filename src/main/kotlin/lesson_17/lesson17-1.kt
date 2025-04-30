package org.example.lesson_17

class QuizElement(
    private var question: String,
    var answer: String,
) {
    val question1
        get() = question

    var answer1 = " "
        get() = field
        set(value) {
            field = answer
        }
}

fun main() {
    val quiz = QuizElement("Сколько месяцев в году?", "12 месяцев")
    println(quiz.question1)
    println(quiz.answer)
}
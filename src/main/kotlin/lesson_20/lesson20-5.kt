package org.example.lesson_20

class Robot {
    private var modifier: (String) -> String = { it }
    private val listOfPhrases = listOf(
        "Сочиняй мечты", "Не переживай, переживешь", "Если не складывается - вычитай",
        "Сейчас самое время", "Ни дня мимо жизни"
    )

    fun say() {
        val phrase = listOfPhrases.random()
        println(modifier(phrase))
    }

    fun setModifier(phrase: (String) -> String) {
        modifier = phrase
    }
}

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { phrase -> phrase.reversed() }
    robot.say()
}
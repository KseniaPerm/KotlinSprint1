package org.example.lesson_20

class Robot {

    fun say() {
        val listOfPhrases = listOf(
            "Сочиняй мечты", "Не переживай, переживешь", "Если не складывается - вычитай",
            "Сейчас самое время", "Ни дня мимо жизни"
        )
        val phrase = listOfPhrases.random()
        println(phrase)
    }

    fun setModifier(phrase: String) {
        val modifier: ((String) -> String) = { phrase.reversed() }
    }
}

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier(robot.say().toString())
}
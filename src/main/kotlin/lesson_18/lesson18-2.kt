package org.example.lesson_18

open class Dice {
    open fun getRollOfDice() = 0

    class FourDiceFaces(private val numberOfDice: Int = 4) : Dice() {
        override fun getRollOfDice(): Int {
            val number = (1..numberOfDice).random()
            println("На кубике выпало: $number")
            return number
        }
    }

    class SixDiceFaces(private val numberOfDice: Int = 6) : Dice() {
        override fun getRollOfDice(): Int {
            val number = (1..numberOfDice).random()
            println("На кубике выпало: $number")
            return number
        }
    }

    class EightDiceFaces(private val numberOfDice: Int = 8) : Dice() {
        override fun getRollOfDice(): Int {
            val number = (1..numberOfDice).random()
            println("На кубике выпало: $number")
            return number
        }
    }
}

fun main() {
    val fourDiceFaces = Dice.FourDiceFaces()
    fourDiceFaces.getRollOfDice()
    val sixDiceFaces = Dice.SixDiceFaces()
    sixDiceFaces.getRollOfDice()
    val eightDiceFaces = Dice.EightDiceFaces()
    eightDiceFaces.getRollOfDice()
    println()

    val dice: List<Dice> = listOf(fourDiceFaces, sixDiceFaces, eightDiceFaces)
    for (i in dice) {
        i.getRollOfDice()
    }
}
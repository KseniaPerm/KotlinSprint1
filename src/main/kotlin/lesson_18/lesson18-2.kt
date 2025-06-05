package org.example.lesson_18

abstract class Dice {
    abstract val numberOfDice: Int

    open fun getRollOfDice(): Int {
        val number = (1..numberOfDice).random()
        println("На кубике выпало: $number")
        return number
    }
}

class FourDiceFaces(override val numberOfDice: Int) : Dice()

class SixDiceFaces(override val numberOfDice: Int) : Dice()


class EightDiceFaces(override val numberOfDice: Int) : Dice()


fun main() {
    val fourDiceFaces = FourDiceFaces(4)
    fourDiceFaces.getRollOfDice()
    val sixDiceFaces = SixDiceFaces(6)
    sixDiceFaces.getRollOfDice()
    val eightDiceFaces = EightDiceFaces(8)
    eightDiceFaces.getRollOfDice()
    println()

   val dice: List<Dice> = listOf(fourDiceFaces, sixDiceFaces, eightDiceFaces)
    dice.forEach { i -> i.getRollOfDice() }
    }
package org.example.lesson_4

fun main() {
    val serviceAbility = readlnOrNull().toBoolean()
    val numberOfCrew = readlnOrNull()!!.toInt()
    val numberOfBox = readlnOrNull()!!.toInt()
    val weatherConditions = readlnOrNull()!!.toBoolean()

    val goSailing: Boolean = (!serviceAbility) && (numberOfCrew in NUMBER_OF_CREW_LOW..NUMBER_OF_CREW_HIGH) &&
            (numberOfBox > NUMBER_OF_BOX) && (weatherConditions) || (serviceAbility) &&
            (numberOfCrew == RECOMMENDED_CREW) && (weatherConditions) &&
            (numberOfBox >= NUMBER_OF_BOX)

    println(goSailing)
}

const val NUMBER_OF_CREW_LOW = 55
const val NUMBER_OF_CREW_HIGH = 70
const val NUMBER_OF_BOX = 50
const val RECOMMENDED_CREW = 70






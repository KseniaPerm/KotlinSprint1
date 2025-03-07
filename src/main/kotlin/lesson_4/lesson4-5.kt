package org.example.lesson_4

fun main() {
    println("Введите количество человек в экипаже: ")
    val numberOfCrew = readln().toInt()
    println("Введите количество ящиков провизии: ")
    val numberOfBox = readln().toInt()
    println("Введите информацию по благоприятности метеоусловий (true/false): ")
    val weatherConditions = readln()

    val goSailing: Boolean = (!SERVICE_ABILITY) && (numberOfCrew in NUMBER_OF_CREW_LOW..NUMBER_OF_CREW_HIGH) &&
            (numberOfBox > NUMBER_OF_BOX) && (weatherConditions == WEATHER_CONDITIONS.toString()) || (SERVICE_ABILITY) &&
            (numberOfCrew == RECOMMENDED_CREW) && (weatherConditions == WEATHER_CONDITIONS.toString()) &&
            (numberOfBox >= NUMBER_OF_BOX)
    println(goSailing)
}

const val NUMBER_OF_CREW_LOW = 55
const val NUMBER_OF_CREW_HIGH = 70
const val NUMBER_OF_BOX = 50
const val RECOMMENDED_CREW = 70
const val SERVICE_ABILITY = false
const val WEATHER_CONDITIONS = true
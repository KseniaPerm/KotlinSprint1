package org.example.lesson_1_10.lesson_4

fun main() {
    val weatherIsSunny: Boolean = true
    val tentIsOpen: Boolean = true
    val airHumidity: Int = 20
    val seasonIsNotWinter: Boolean = false
    val comparisonResult: Boolean = (weatherIsSunny == org.example.lesson_1_10.lesson_4.WEATHER_IS_SUNNY) &&
            (tentIsOpen == org.example.lesson_1_10.lesson_4.TENT_IS_OPEN) && (airHumidity == org.example.lesson_1_10.lesson_4.AIR_HUMIDITY) &&
            (seasonIsNotWinter == org.example.lesson_1_10.lesson_4.SEASON_IS_NOT_WINTER)

    println("Благоприятные ли условия сейчас для роста бобовых? $comparisonResult")
}

const val WEATHER_IS_SUNNY = true
const val TENT_IS_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON_IS_NOT_WINTER = true
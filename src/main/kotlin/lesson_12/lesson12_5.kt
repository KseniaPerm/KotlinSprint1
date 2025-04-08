package org.example.lesson_12

import kotlin.random.Random

class WeatherDayAverage(_dayTemperature: Int, _nightTemperature: Int, _precipitation: Boolean) {
    val dayTemperature = _dayTemperature - TEMPERATURE_IN_KELVIN
    val nightTemperature = _nightTemperature - TEMPERATURE_IN_KELVIN
    val precipitation: Boolean = _precipitation
}

fun main() {
    val listOfDays = mutableListOf<WeatherDayAverage>()
    for (i in 1..30) {
        val day = Random.nextInt(300, 350)
        val night = Random.nextInt(280, 310)
        val isPrecipitation = Random.nextBoolean()
        listOfDays.add(WeatherDayAverage(day, night, isPrecipitation))
    }
    val dayTemperatures = listOfDays.map { it.dayTemperature }
    val nightTemperatures = listOfDays.map { it.nightTemperature }
    val precipitationsTrue = listOfDays.count { it.precipitation }
    val averageDay = dayTemperatures.average().toInt()
    val averageNight = nightTemperatures.average().toInt()

    println("Средняя дневная температура $averageDay")
    println("Средняя ночная температура $averageNight")
    println("Количество дней с осадками $precipitationsTrue")
}

const val TEMPERATURE_IN_KELVIN = 273
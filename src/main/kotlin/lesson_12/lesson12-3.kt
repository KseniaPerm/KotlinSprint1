package org.example.lesson_12

class WeatherDays {
    val dayTemperature: Int = 306
    val nightTemperature: Int = 289
    val precipitation: Boolean = false

    fun printInfo() {
        println("Температура днем : ${dayTemperature - KELVIN_TEMPERATURE}°С")
        println("Температура ночью: ${nightTemperature - KELVIN_TEMPERATURE}°С")
        if (precipitation) {
            println("Осадков не ожидается")
        } else {
            println("ожидаются осадки")
        }
    }
}

fun main() {
    val weatherDays = WeatherDays()
    weatherDays.printInfo()
}

const val KELVIN_TEMPERATURE = 273
package org.example.lesson_12

class WeatherDays(_dayTemperature: Int, _nightTemperature: Int, _precipitation: Boolean) {
    val dayTemperature = _dayTemperature - KELVIN_TEMPERATURE
    val nightTemperature = _nightTemperature - KELVIN_TEMPERATURE
    val precipitation: Boolean = _precipitation

    fun printInfo() {
        println("Температура днем : $dayTemperature°С")
        println("Температура ночью: $nightTemperature°С")
        if (precipitation) {
            println("Осадков не ожидается")
        } else {
            println("Ожидаются осадки")
        }
    }
}

fun main() {
    val weatherDays = WeatherDays(306, 289, true)
    weatherDays.printInfo()
}

const val KELVIN_TEMPERATURE = 273
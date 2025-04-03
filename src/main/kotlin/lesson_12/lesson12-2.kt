package org.example.lesson_12

class WeatherForDays(_dayTemperature: Int, _nightTemperature: Int, _precipitation: Boolean) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var precipitation: Boolean = _precipitation

    fun printInfo() {
        println("Температура днем : $dayTemperature")
        println("Температура ночью: $nightTemperature")
        if (precipitation) {
            println("Осадков не ожидается")
        } else {
            println("ожидаются осадки")
        }
    }
}

fun main() {
    val weatherForDays = WeatherForDays(28, 26, false)
    weatherForDays.printInfo()
}
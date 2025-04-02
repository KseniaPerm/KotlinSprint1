package org.example.lesson_12

class WeatherForDay {
    var dayTemperature = 24
    var nightTemperature = 20
    var precipitation: Boolean = false

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
    val weatherForDay1 = WeatherForDay()
    weatherForDay1.dayTemperature = 26
    weatherForDay1.nightTemperature = 22
    weatherForDay1.precipitation = true

    val weatherForDay2 = WeatherForDay()
    weatherForDay2.dayTemperature = 36
    weatherForDay2.nightTemperature = 29
    weatherForDay2.precipitation = false
    weatherForDay1.printInfo()
    weatherForDay2.printInfo()
}
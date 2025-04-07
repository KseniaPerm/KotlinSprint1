package org.example.lesson_12

class WeatherDay(_dayTemperature: Int, _nightTemperature: Int, _precipitation: Boolean) {
    val dayTemperature = _dayTemperature - KELVIN_TEMPERATURES
    val nightTemperature = _nightTemperature - KELVIN_TEMPERATURES
    val precipitation: Boolean = _precipitation

    var _goForWalk = true

    constructor(
        _dayTemperature: Int,
        _nightTemperature: Int,
        _precipitation: Boolean,
        _goForWalk: Boolean,
    ) : this(_dayTemperature, _nightTemperature, _precipitation) {
        this._goForWalk = _goForWalk
    }

    init {
        printInfo()
    }

    fun printInfo() {
        println("Температура днем : $dayTemperature°С")
        println("Температура ночью: $nightTemperature°С")
        if (precipitation) {
            println("Осадков не ожидается")
        } else {
            println("Ожидаются осадки")
        }
        if (_goForWalk) {
            println("Выйти на прогулку")
        } else {
            println("Пропустить прогулку")
        }
    }
}

fun main() {
    val weatherDay = WeatherDay(306, 289, _precipitation = true, _goForWalk = true)

}

const val KELVIN_TEMPERATURES = 273
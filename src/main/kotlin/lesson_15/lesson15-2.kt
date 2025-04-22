package org.example.lesson_15

abstract class WeatherStationStats {
    abstract val day: Int
    abstract fun printInfo()
}

class Temperature(override val day: Int, var temperature: Int) : WeatherStationStats() {

    override fun printInfo() {
        println("Температура воздуха в день  $day - $temperature градусов")
    }
}

class PrecipitationAmount(override val day: Int, var precipitationAmount: Int) : WeatherStationStats() {

    override fun printInfo() {
        println("Количество осадков в день  $day - $precipitationAmount сантиметров")
    }
}

class WeatherServer {
    val listOfTemperature = mutableListOf<Temperature>()
    val listOfPrecipitationAmount = mutableListOf<PrecipitationAmount>()

    fun addTemperature(day: Int, temperature: Int) {
        listOfTemperature.add(Temperature(day, temperature))
    }

    fun addPrecipitation(day: Int, precipitationAmount: Int) {
        listOfPrecipitationAmount.add(PrecipitationAmount(precipitationAmount, day))
    }

    fun sendMessage(day: Int) {
        val temperature = listOfTemperature.find { it.day == day }
        val precipitationAmount = listOfPrecipitationAmount.find { it.day == day }
        println("${temperature?.printInfo()},${precipitationAmount?.printInfo()}")
    }
}

fun main() {
    val weather = WeatherServer()
    weather.addTemperature(3, 18)
    weather.addPrecipitation(3, 3)
    weather.sendMessage(3)
}
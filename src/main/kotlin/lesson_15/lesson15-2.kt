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
    fun sendMessage(weatherStationStats: WeatherStationStats) {
        weatherStationStats.printInfo()
    }
}

fun main() {
    val temperature = Temperature(1, 26)
    val precipitationAmount = PrecipitationAmount(1, 3)
    val weatherServer = WeatherServer()
    weatherServer.sendMessage(temperature)
    weatherServer.sendMessage(precipitationAmount)
}
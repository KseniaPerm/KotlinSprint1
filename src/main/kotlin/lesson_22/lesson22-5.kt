package org.example.lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val place: String,
    val placeDescription: String,
    val date: LocalDateTime,
    val distance: Double,
) {
    override fun toString(): String {
        return "Информация:\nНазвание места: $place\nОписание места: $placeDescription\nДата и время: $date\nРасстояние: $distance в световых годах"
    }
}

fun main() {
    val journey = GalacticGuide(
        "Звезда Проксима Центавра",
        "В 270 тысяч раз дальше, чем от Солнца до Земли и примерно в 6600 раз дальше, чем от Солнца до Плутона.",
        LocalDateTime.of(2024, 12, 10, 15, 40),
        4.2
    )
    println(journey.toString())
    val (place, placeDescription, date, distance) = journey
    println(place)
}
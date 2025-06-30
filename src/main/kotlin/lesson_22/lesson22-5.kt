package org.example.lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val place: String,
    val placeDescription: String,
    val date: LocalDateTime,
    val distance: Double,
)

fun main() {
    val journey1 = GalacticGuide(
        "Звезда Проксима Центавра",
        "В 270 тысяч раз дальше, чем от Солнца до Земли и примерно в 6600 раз дальше, чем от Солнца до Плутона.",
        LocalDateTime.of(2024, 12, 10, 15, 40),4.2
    )
    val journeyPlace = journey1.component1()
    println(journeyPlace)
}
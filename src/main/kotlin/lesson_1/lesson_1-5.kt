package org.example.lesson_1

fun main() {
    val seconds: Short = 6_480
    val hour = seconds / SECONDS_IN_HOUR
    val minute = (seconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val secondRest = seconds % SECONDS_IN_MINUTE
    println(hour)
    println(minute)
    println(secondRest)
    println(String.format("%02d:%02d:%02d",hour, minute, secondRest))
}
    const val SECONDS_IN_MINUTE = 60
    const val SECONDS_IN_HOUR = 3_600


package org.example.lesson_1

fun main() {
    val seconds: Short = 6480

    val hour = seconds / 3600
    val minute = (seconds % 3600) / 60
    val secondRest = seconds % 60
    println(hour)
    println(minute)
    println(secondRest)
    println(String.format("%02d:%02d:%02d",hour, minute, secondRest))







}
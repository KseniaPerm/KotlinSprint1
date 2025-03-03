package org.example.lesson_1

fun main() {
    val year = 1961
    var hour = 9
    var minute = 7
    val fullHour: String = "0$hour"
    val fullMinute:String = "0$minute"

    println(year)
    println(fullHour)
    println(fullMinute)

    hour = 10
    minute = 55
    print(fullHour)
    print(":")
    print(fullMinute)
   // println("$hour:$minute")
}
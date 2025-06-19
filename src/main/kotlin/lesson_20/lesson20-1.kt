package org.example.lesson_20

fun main() {
    val userName = "Ксю"
    val greeting: () -> String = {
        "С наступающим Новым Годом, $userName"
    }
    println(greeting())
}
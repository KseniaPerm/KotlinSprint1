package org.example.lesson_20

fun main() {
    val userName = "Ксю"
    val greeting: () -> Unit
    greeting = { println("С наступающим Новым Годом, $userName") }
    greeting()
}
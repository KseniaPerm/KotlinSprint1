package org.example.lesson_7


fun main() {
    val range1 = ('1'..'9') + ('a'..'z') + ('A'..'Z')
    val password = StringBuilder(5)
    for (i in 0..5) {
        val randomChars = range1.random()
        password.append(randomChars)
    }
    println(password)
}


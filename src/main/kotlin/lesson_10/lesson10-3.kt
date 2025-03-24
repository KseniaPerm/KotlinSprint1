package org.example.lesson_10

fun main() {
    println("Введите длину пароля : ")
    val length = readln().toInt()
    getPasswordForUser(length)
}

fun getPasswordForUser(length: Int) {
    val numbers = '0'..'9'
    val chars = listOf(':', '!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/')
    val password = mutableListOf<Char>()
    for (i in 1..length) {
        if (length % 2 == 0) {
            password.add(numbers.random())

        } else {
            password.add(chars.random())

        }
        password.shuffle()
        println(password.joinToString(""))
    }
}
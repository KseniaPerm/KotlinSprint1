package org.example.lesson_10

const val USERNAME = "Ksenia"
const val PASSWORD = "123pass"

fun main() {
    println("Введите логин: ")
    val username = readln()
    println("Введите пароль: ")
    val password = readln()
    val token = getAndCompareToken(username, password)
    getCart(token)
}

fun generateToken(): String {
    val chars = ('A'..'z') + ('0'..'9')
    return (1..32)
        .map { chars.random() }
        .joinToString("")
}

fun getAndCompareToken(username: String, password: String): String? {
    return if (username == USERNAME && password == PASSWORD) generateToken() else {
        null
    }
}

fun getCart(token: String?): Unit? {
    val listOfProducts = listOf("Джинсы", "Свитер", "Лонгслив")
    return if (token != null) {
        println(listOfProducts.joinToString())
    } else {
        null
    }
}
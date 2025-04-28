package org.example.lesson_16

class User(
    private val login: String,
    private val password: String,
) {
    fun userPassword(inputPassword: String) {
        if (inputPassword == password) {
            println("Пароль введен верно")
        } else {
            println("Пароли не совпадают")
        }
    }
}

fun main() {
    val user = User("Ксю", "Привет")
    println("Введите пароль: ")
    val inputPassword = readln()
    user.userPassword(inputPassword)
}
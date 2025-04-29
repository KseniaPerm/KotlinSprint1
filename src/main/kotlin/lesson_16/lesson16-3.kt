package org.example.lesson_16

class User(
    private val login: String,
    private val password: String,
) {
    fun getValidate(inputPassword: String): Boolean {

        return inputPassword == this.password
    }
}

fun main() {
    val user = User("Ксю", "Привет")
    println("Введите пароль: ")
    val inputPassword = readln()
    val validate = user.getValidate(inputPassword)
    if (validate) {
        println("Пароль введен верно")
    } else {
        println("Пароли не совпадают")
    }
}
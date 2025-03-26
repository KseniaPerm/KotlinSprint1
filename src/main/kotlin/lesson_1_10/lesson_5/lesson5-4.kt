package org.example.lesson_1_10.lesson_5

fun main() {
    val name = "Zaphod"
    val password = "PanGalactic"

    println("Приветствую вас на борту корабля \"Heart of Gold\"\nВведите ваше имя пользователя: ")

    val userName = readlnOrNull().toString()
    if (userName == name) {
        println("Введите пароль")
        val passwordUser = readlnOrNull().toString()
        if (passwordUser == password)
            println("Пользователь $name, вам разрешено входить на борт корабля \"Heart of gold\"")
        else if (passwordUser != password) {
            println("Пароль введен неверно!")
        }
    } else {
        println("Необходимо зарегестрироваться и закончить процесс тут")
    }
}

package org.example.lesson_1_10.lesson_10

fun main() {
    if (checkStringLength(getLogin()) && checkStringLength(getPassword())) {
        println("Приветствую!")

    } else {
        println("Логин или пароль недостаточно длинные ")
    }
}

fun getLogin(): String {
    println("Введите логин: ")
    return readln()
}

fun getPassword(): String {
    println("Введите пароль: ")
    return readln()
}

fun checkStringLength(input: String?): Boolean {
    return (input?.length ?: 0) >= MIN_LENGTH
}

const val MIN_LENGTH = 4
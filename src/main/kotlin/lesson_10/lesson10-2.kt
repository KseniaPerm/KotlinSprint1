package org.example.lesson_10

fun main() {
    if (lengthValidation(getLogin()) && lengthValidation(getPassword())) {
        println("Приветствую!")

    } else {
        println("Логин или пароль недостаточно длинные ")
    }
}

fun getLogin(): String? {
    println("Введите логин: ")
    return readln()
}

fun getPassword(): String? {
    println("Введите пароль: ")
    return readln()
}

fun lengthValidation(input: String?): Boolean {
    return input!!.length >= 4
}
package org.example.lesson_6

fun main() {

    println("Для регистрации введите ваше имя пользователя: ")
    val name = readln()
    println("Введите пароль в цифрах: ")
    val password = readln().toInt()

    println("Данные сохранены")
    println()
    println("Для входа в систему введите ваш логин: ")

    while (true) {
        println("Введите логин : ")
        val userName1 = readln()
        println("Введите пароль в цифрах : ")
        val password1 = readln().toInt()

        if (userName1 == name && password1 == password) {
            println("Вы успешно вошли в систему")
            break
        } else {
            println("неверный логин или пароль ")
            println()
        }
    }
}




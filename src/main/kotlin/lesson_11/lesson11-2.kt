package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: Boolean = false,
) {
    fun printUserInformation() {
        println("Информация о пользователе: ")
        println(id)
        println(login)
        println(password)
        println(mail)
        println(bio)
    }

    fun enteringData() {
        println("Введите данные для bio : true/false:")
        val bio1 = readln()
        if (bio1 == "true") {
            bio = true
        }
    }

    fun changeUserPassword(newPassword: String) {
        println("Введите текущий пароль: ")
        val inputPassword = readln()
        if (inputPassword == password) {
            password = newPassword
            println("Пароль изменен на $newPassword")
        } else {
            println("Пароли не совпадают")
        }
    }
}

fun main() {
    user1.printUserInformation()
    user1.enteringData()
    println("Введите новый пароль: ")
    val newPassword = readln()
    user1.changeUserPassword(newPassword)
    user1.printUserInformation()
}

val user1 = User2(
    id = 1,
    login = "Kseniya",
    password = "123pass",
    mail = "K.E.Permyakova@yandex.ru",
)
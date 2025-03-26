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

    fun changeUserPassword() {
        println("Введите текущий пароль: ")
        val input = readln()
        if (input == password) {
            println("Введите новый пароль: ")
            password = readln()
            println("Пароль изменен на $password")
        } else {
            println("Пароли не совпадают")
        }
    }
}

fun main() {
    val user1 = User2(
        id = 1,
        login = "Kseniya",
        password = "123pass",
        mail = "K.E.Permyakova@yandex.ru",
    )
    user1.printUserInformation()
    user1.enteringData()
    user1.changeUserPassword()
    user1.printUserInformation()
}
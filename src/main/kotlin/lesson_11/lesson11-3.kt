package org.example.lesson_11

class Room(
    val cover: String,
    var title: String,
    var user: String,
    var listOfUsers: MutableList<String>,
    var userStatus: String,
) {
    fun printRoomInformation() {
        println("Информация о комнате: ")
        println(cover)
        println(title)
        println(listOfUsers.joinToString())
    }

    fun printUserInformation() {
        println("Информация о пользователе: ")
        println(user)
        println(userStatus)
    }

    fun addUser() {
        println("Введите имя участника: ")
        val userName = readln()
        listOfUsers.add(userName)
        println("Участник $userName добавлен в список ")
    }

    fun updateStatus() {
        println("Введите новый статус: разговаривает, микрофон выключен, пользователь заглушен")
        val newUserStatus = readln()
        userStatus = newUserStatus
    }
}

fun main() {

    user3.printRoomInformation()
    user3.printUserInformation()
    user3.addUser()
    user3.updateStatus()
    user3.printUserInformation()
}
val user3 = Room(
    cover = "women",
    title = "women's secrets",
    user = "Ксения",
    listOfUsers = mutableListOf("Ксения", "Оксана", "Екатерина"),
    userStatus = "пользователь заглушен",
)
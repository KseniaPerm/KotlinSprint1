package org.example.lesson_11

class User(
    val userName: String,
    var userStatus: String,
    val profilePicture: String,
) {
    fun printUserInformation() {
        println("Информация о пользователе: ")
        println(userName)
        println(userStatus)
        println(profilePicture)
    }

}

class Room(
    val cover: String,
    var title: String,
    var listOfUsers: MutableList<String> = mutableListOf(),
) {
    fun printRoomInformation() {
        println("Информация о комнате: ")
        println(cover)
        println(title)
        println(listOfUsers.joinToString())
    }

    fun addUser(userName: String, userNameNew: String) {
        if (listOfUsers.equals(userName)) {
            println("Участник уже зарагестрирован")
        } else {
            listOfUsers.add(userNameNew)
            println("Участник $userNameNew добавлен в список")
        }
    }

    fun updateStatus(userName: String, newStatus: String) {
        if (user.userName == userName) {
            user.userStatus = newStatus
            println("Статус обновлен на $newStatus")
        }
    }
}

fun main() {
    room.printRoomInformation()
    user.printUserInformation()
    println("Введите имя участника:")
    val userName = readln()
    println("Введите новый статус: разговаривает/ микрофон выключен / пользователь заглушен")
    val newStatus = readln()
    room.updateStatus(userName, newStatus)
    user.printUserInformation()
    println("Добавьте нового пользователя. Введите имя: ")
    val userNameNew = readln()
    room.addUser(userName, userNameNew)
    room.printRoomInformation()
}

val room = Room(
    cover = "women",
    title = "women's secrets",
    listOfUsers = mutableListOf("Ксения", "Оксана", "Екатерина"),
)
val user = User(
    userName = "Ксения",
    userStatus = "пользователь заглушен",
    profilePicture = "рисунок",
)
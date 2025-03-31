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

    fun updateStatus(user: String, newStatus: String) {
        if (user == userName) {
            userStatus = newStatus
            println("Статус обновлен на $newStatus")
        }
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

    fun addUser(user: String) {
        if (user in listOfUsers) {
            println("Участник уже зарагестрирован")
        } else {
            listOfUsers.add(user)
            println("Участник $user добавлен в список")
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
    user.updateStatus(userName, newStatus)
    user.printUserInformation()
    println("Добавьте нового пользователя. Введите имя: ")
    val user = readln()
    room.addUser(user)
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
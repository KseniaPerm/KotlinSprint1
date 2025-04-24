package org.example.lesson_15

abstract class Users {
    abstract val userName: String
    abstract val userType: String
    abstract fun addMessage(message: String, id: Int)
    abstract fun deleteMassage(id: Int)
}

class ForumUsers(override val userName: String, override val userType: String = "Пользователь") : Users() {
    val listOfMessages: MutableList<Message> = mutableListOf()
    override fun addMessage(message: String, id: Int) {
        listOfMessages.add(Message(id, userType, userName, message))
        println("$userType-$userName : $message")
    }

    override fun deleteMassage(id: Int) {
        println("Удалять сообщения могут только админы")
    }
}

class Message(
    var id: Int,
    val userType: String,
    val userName: String,
    val message: String,
)

class ForumAdmins(override val userName: String, override val userType: String = "Админ") : Users() {
    val listOfMessages: MutableList<Message> = mutableListOf()
    override fun addMessage(message: String, id: Int) {

        listOfMessages.add(Message(id, userType, userName, message))
        println("$userType- $message")
    }

    override fun deleteMassage(id: Int) {
        val message = listOfMessages.find { it.id == id }
        listOfMessages.remove(message)
        println("Сообщение удалено")
    }
}

fun main() {
    val user1 = ForumUsers("Стас", "Пользователь")
    val admin = ForumAdmins("Катя", "Админ")
    user1.addMessage("Привет всем!", 1)
    admin.addMessage("Удаляю", 2)
    user1.addMessage("Нельзя удалять мое сообщение", 1)
    user1.deleteMassage(2)
    admin.deleteMassage(1)
}
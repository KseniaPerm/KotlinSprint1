package org.example.lesson_11

class MemberOfForum(
    var userId: Int = 0,
    var userName: String? = " ",
)

class MemberOfForumBuilder {
    var userId: Int = 0
    var userName: String = " "

    fun setUserId(userId: Int) = apply { this.userId = userId }
    fun setUserName(userName: String) = apply { this.userName = userName }
    fun build() = MemberOfForum()
}

class ForumMessages(
    val authorId: Int = 0,
    val message: String = " ",
)

class ForumMessagesBuilder {
    var authorId: Int = 0
    var message: String = " "

    fun setAuthorId(authorId: Int) = apply { this.authorId = authorId }
    fun setMessage(message: String) = apply { this.message = message }
    fun build() = ForumMessages()
}

class Forum {
    var userId: Int = 0
    var listOfMessages: MutableList<ForumMessages> = mutableListOf()
    val listOfUsers: MutableList<MemberOfForum> = mutableListOf()

    fun createNewUser(name: String): MemberOfForum {
        val newUser = MemberOfForumBuilder()
            .setUserName(name)
            .setUserId(userId)
            .build()
        listOfUsers.add(newUser)
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String) {
        if (this.userId == authorId) {
            val newMessage = ForumMessagesBuilder()
                .setAuthorId(authorId)
                .setMessage(message)
                .build()
            listOfMessages.add(newMessage)
        } else {
            println("Такого пользователя нет ")
        }
    }
    //fun printThread(message: String) {
    //}
}

fun main() {
    val forum = Forum()
    println("Введите имя пользователя: ")
    val newUserName = readln()
    val user1 = forum.createNewUser(newUserName)
    println("Введите сообщение : ")
    val message1 = readln()
    forum.createNewMessage(user1.userId, message1)
    println("Введите имя пользователя: ")
    val newUserName1 = readln()
    val user2 = forum.createNewUser(newUserName1)
    println("Введите сообщение: ")
    val message2 = readln()
    forum.createNewMessage(user2.userId, message2)
}
package org.example.lesson_11

class MemberOfForumBuilder {
    var userId: Int = 0
    var userName: String = " "

    fun setUserId(userId: Int?) = apply {
        if (userId != null) {
            this.userId = userId
        }
    }

    fun setUserName(userName: String) = apply { this.userName = userName }
    fun build() = this
}

class ForumMessagesBuilder {
    var authorId: Int = 1
    var message: String = " "

    fun setAuthorId(authorId: Int) = apply { this.authorId = authorId }
    fun setMessage(message: String) = apply { this.message = message }
    fun build() = this
}

class Forum {
    var generateId: Int = 0
    var listOfMessages: MutableList<ForumMessagesBuilder> = mutableListOf()
    val listOfUsers: MutableList<MemberOfForumBuilder> = mutableListOf()

    fun createNewUser(name: String): MemberOfForumBuilder {
        val newUser = MemberOfForumBuilder()
            .setUserName(name)
            .setUserId(generateId + 1)
            .build()
        listOfUsers.add(newUser)
        generateId++
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String) {
        if (this.generateId == authorId) {
            val newMessage = ForumMessagesBuilder()
                .setAuthorId(authorId)
                .setMessage(message)
                .build()
            listOfMessages.add(newMessage)
        } else {
            println("Такого пользователя нет ")
        }
    }

    fun printThread() {
        println(listOfMessages.joinToString())
    }
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
    forum.printThread()
}
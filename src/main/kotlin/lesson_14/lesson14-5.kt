package org.example.lesson_14

class Chat {
    val listOfMessages: MutableList<Message> = mutableListOf()
    val listOfChildMessages: MutableList<ChildMessage> = mutableListOf()
    var idCounter = 0

    fun addMessage(userName: String, message: String) {
        listOfMessages.add(Message(userName, idCounter++, message))
    }

    fun addThreadMessage(userName: String, message: String, parentMessageId: Int) {
        listOfChildMessages.add(ChildMessage(userName, idCounter++, message, parentMessageId))
    }

    fun printChat() {
        val childGroupBy = listOfChildMessages.groupBy { it.parentMessageId }
        for (message in listOfMessages) {
            println("${message.userName} : ${message.message}")
            val childMessages = childGroupBy[message.messageId]
            if (childMessages != null) {
                for (child in childMessages) {
                    println("\t${child.userName} : ${child.message}")
                }
            }
        }
    }
}

open class Message(
    val userName: String = " ",
    val messageId: Int = 0,
    val message: String = " "
)

class ChildMessage(
    userName: String = " ",
    messageId: Int = 0,
    message: String = " ",
    val parentMessageId: Int
) : Message(userName, messageId, message)

fun main() {
    val chat = Chat()
    chat.addMessage("Ксю", " Как дела?")
    chat.addThreadMessage("Катя", "Привет", 2)

    chat.addMessage("Павел", "Все отлично")
    chat.addThreadMessage("Ксю", "Что отлично?", 2)
    chat.printChat()
}
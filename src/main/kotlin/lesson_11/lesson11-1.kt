package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)

fun main() {
    val user1: User = User(
        id = 1,
        login = "Kseniya",
        password = "123pass",
        mail = "K.E.Permyakova@yandex.ru",
    )
    val user2: User = User(
        id = 2,
        login = "Ekaterina",
        password = "124pass",
        mail = "Ekaterina@mail.ru",
    )
    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.mail)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.mail)
}
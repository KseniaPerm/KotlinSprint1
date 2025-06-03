package org.example.lesson_17

class Users(login: String, password: String) {
    private val password1 = password
    var password: Any
        get() = ("*").repeat(password1.length)
        set(value) {
            println("Вы не можете изменить пароль!")
        }
    private val login1 = login
    var login: String = ""
        get() {
            val field1 = field
            return field1
        }
        set(value) {
            field = value
            println("Успешная смена логина")
        }
}

fun main() {
    val user = Users("ksu", "Love")
    user.password = "Ky"
    println("Пароль: ${user.password}")
    user.login = "Kate"
    println("Логин: ${user.login}")
}
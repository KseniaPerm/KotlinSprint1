package org.example.lesson_13

class PhoneBookOfNumbers(
    val name: String? = null,
    val phoneNumber: Long?,
    val company: String? = null,
)

fun main() {
    println("Введите номер телефона: ")
    val phoneNumberInput = readln()
    try {
        val phoneNumber1 = phoneNumberInput.toLong()
        println("Номер сохранен")
    } catch (e: Exception) {
        println("Ошибка, необходимо ввести номер телефона")
    }
}
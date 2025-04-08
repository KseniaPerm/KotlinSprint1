package org.example.lesson_13

class PhoneDirectories(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {

    fun printInfo() {
        println("Имя : $name\nНомер : $phoneNumber\nКомпания: ${company ?: "не указано"}")
    }
}

fun main() {
    val phoneDirectories = PhoneDirectories("Pavel", 89999999999, null)
    val phoneDirectories1 = PhoneDirectories("Ksu", 8999999998, "Cat")
    phoneDirectories.printInfo()
    phoneDirectories1.printInfo()
}
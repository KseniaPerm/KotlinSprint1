package org.example.lesson_13

class PhoneDirectory(
    val name: String,
    val phoneNumber: Long,
    val company: String?
)

fun main() {
    val phoneDirectory = PhoneDirectory("Pavel", 89999999999, null)
    println(phoneDirectory.name)
    println(phoneDirectory.phoneNumber)
    println(phoneDirectory.company)
}
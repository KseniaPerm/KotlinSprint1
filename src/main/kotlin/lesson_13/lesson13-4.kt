package org.example.lesson_13

class PhoneBooks(
    val name: String? = null,
    val phoneNumber: Long?,
    val company: String? = null,
) {
    fun printInfo() {
        println("Имя : $name\nНомер : $phoneNumber\nКомпания: $company")
    }
}

fun main() {
    val listOfNumbers = mutableListOf<PhoneBooks>()
    println("Введите имя: ")
    val name1 = readln()
    println("Введите номер телефона:")
    val number = readln().toLongOrNull()
    if (number == null) {
        println("Номер не введен")
        return
    }
    println("Введите компанию: ")
    var company = readln()
    if (company.isEmpty()) {
        company = null.toString()
    }
    val phoneContact = PhoneBooks(name1, number, company)
    listOfNumbers.add(phoneContact)
    phoneContact.printInfo()
}
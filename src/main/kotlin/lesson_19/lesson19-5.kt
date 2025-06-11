package org.example.lesson_19

class Person(val name: String, val gender: String)

enum class Gender(val gender: String) {
    MALE("Мужской"),
    FEMALE("Женский"),
}

fun main() {
    val personList = mutableListOf<Person>()
    while (personList.size < 5) {
        println("Введите данные для картотеки латинскими буквами: Имя ")
        val name = readln()
        println("Введите данные для картотеки латинскими буквами, как указано ниже: ")
        for (i in Gender.entries) {
            println(i)
        }
        val gender = readln()
        personList.add(Person(name, gender))
        val person = Person(name, gender)
    }
    println("Введены данные")
    for (person in personList) {
        println("Имя: ${person.name}: Пол ${person.gender}")
    }
}
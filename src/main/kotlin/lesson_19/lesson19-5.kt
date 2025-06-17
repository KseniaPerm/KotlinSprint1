package org.example.lesson_19

import java.util.*

class Person(val name: String, val gender: Gender)

enum class Gender {
    MALE,
    FEMALE,
}

fun main() {
    val personList = mutableListOf<Person>()
    while (personList.size < 5) {
        println("Введите данные для картотеки латинскими буквами: Имя ")
        val name = readln()
        println("Введите данные для картотеки латинскими буквами, как указано ниже: ")
        println(Gender.entries).toString()
        val genderInput = readln().uppercase(Locale.getDefault())
        val gender = when (genderInput) {
            "MALE" -> Gender.MALE
            "FEMALE" -> Gender.FEMALE
            else -> {
                println("Некорректный ввод")
                continue
            }
        }
        personList += Person(name, gender)
        println("Добавлен человек. Имя: $name, Пол: ${gender.name}")
    }
    println("Введены данные: ")
    for ((index, person) in personList.withIndex()) {
        println("${index + 1}. Имя: ${person.name}, Пол: ${person.gender}")
    }
}
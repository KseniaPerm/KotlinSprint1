package org.example.lesson_22

data class Student(val name: String, val age: Int, val city: String)

fun main() {
    val student = Student("Ксения", 36, "Екатеринбург")
    val (name, age, city) = student
    println("Имя: $name\nВозраст: $age\nГород: $city")
}
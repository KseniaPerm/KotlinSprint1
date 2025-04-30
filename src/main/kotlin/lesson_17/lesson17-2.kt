package org.example.lesson_17

class Ship(private val name: String, val averageSpeed: Int, val homePort: String) {
    fun getName(): String {
        return name
    }

    fun changeName(newName: String) {
        println("Название корабля менять нельзя!")
    }
}

fun main() {
    val ship = Ship("Лолита", 60, "Сочи")
    println("Название корабля: ${ship.getName()}")
    println("Средняя скорость корабля: ${ship.averageSpeed}")
    println("Порт приписки корабля: ${ship.homePort}")
    ship.changeName("Летний")
}
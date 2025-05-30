package org.example.lesson_17

class Ship(
    name: String,
    val averageSpeed: Int,
    val homePort: String,
) {
    private var name1 = name
    var name
        get() = name1
        set(value) {
            println("Название корабля менять нельзя!")
        }
}

fun main() {
    val ship = Ship("Лолита", 60, "Сочи")
    println("Название корабля: ${ship.name}")
    ship.name = "Ленин"
    println("Название корабля: ${ship.name}")
}
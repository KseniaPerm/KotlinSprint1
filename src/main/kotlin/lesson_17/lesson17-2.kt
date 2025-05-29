package org.example.lesson_17

class Ship {
    var name: String = "Лолита"
        set(value) {
            if (value != name)
                println("Название корабля менять нельзя!")
            field = name
        }

    val averageSpeed = 60
    val homePort = "Сочи"
}

fun main() {
    val ship = Ship()
    println(ship.name)
    ship.name = "Ленин"
    println(ship.name)
}
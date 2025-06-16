package org.example.lesson_19

class SpaceShip {

    fun takeOff() {
        println("Корабль взлетает.")
        //TODO добавить реализацию метода
    }

    fun shooting() {
        println("Корабль отстреливается от астероида.")
    }

    fun landing() {
        println("Корабль приземляется.")
        TODO("Добавить дополнительную логику")
    }
}

fun main() {
    val spaceShip = SpaceShip()
    spaceShip.takeOff()
    spaceShip.shooting()
    spaceShip.landing()
}
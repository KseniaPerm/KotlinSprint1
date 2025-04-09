package org.example.lesson_14

open class MainLiner(
    val name: String,
    val speed: Int,
    val capacity: Int,
) {
    fun readyToGo() {
        println("${name}: Выход на воду разрешен")
    }

    fun runSystemDiagnostic() {
        println("${name}: Запущена диагностика систем управления")
    }
}

class CargoShip(
    name: String,
    speed: Int,
    val loadCapacity: Int,
) : MainLiner(name, speed, capacity = 100) {

    fun checkShipWorkload() {
        println("${name}: Проверка загруженности корабля")
    }
}

class Icebreaker(
    name: String,
    speed: Int,
    val breaksIce: Boolean = true,
) : MainLiner(name, speed, capacity = 50) {

    fun checkBreaksIceSystem() {
        println("${name}: Проверка системы ледопроходимости")
    }
}

fun main() {
    val liner = MainLiner("Serenity", 400, 1200)
    liner.runSystemDiagnostic()
    liner.readyToGo()
    println("Скорость: ${liner.speed}")
    println("Вместительность: ${liner.capacity}")
    println()

    val cargoShip = CargoShip("Cargo111", 200, 100_000)
    cargoShip.runSystemDiagnostic()
    cargoShip.readyToGo()
    println("Скорость: ${cargoShip.speed}")
    println("Грузоподъемность: ${cargoShip.loadCapacity}")
    cargoShip.checkShipWorkload()
    println()

    val icebreaker = Icebreaker("Ermak", 200)
    icebreaker.runSystemDiagnostic()
    icebreaker.readyToGo()
    println("Скорость: ${icebreaker.speed}")
    icebreaker.checkBreaksIceSystem()
    println(icebreaker.breaksIce)
}
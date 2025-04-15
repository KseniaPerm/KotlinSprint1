package org.example.lesson_14

open class MainLinerFirst(
    val name: String,
    val speed: Int,
    val capacity: Int,
    val loading: Boolean = true,
) {
    fun readyToGo() {
        println("${name}: Выход на воду разрешен")
    }

    fun runSystemDiagnostic() {
        println("${name}: Запущена диагностика систем управления")
    }

    fun loadMainLinerFirst() {
        println("Возможность погрузки: $loading")
        println("${name}: Способ погрузки -  выдвижение горизонтального трапа со шкафута")
    }
}

class CargoShipBear(
    name: String,
    speed: Int,
    val loadCapacity: Int,
) : MainLinerFirst(name, speed, capacity = 100, true) {

    fun checkShipWorkload() {
        println("${name}: Проверка загруженности корабля")
    }

    fun loadCargoShipBear() {
        println("Возможность погрузки: $loading")
        println("${name}: Способ погрузки - Активация погрузочного крана")
    }
}

class IcebreakerLenin(
    name: String,
    speed: Int,
    val breaksIce: Boolean = true,
) : MainLinerFirst(name, speed, capacity = 50, true) {

    fun checkBreaksIceSystem() {
        println("${name}: Проверка системы ледопроходимости")
    }

    fun loadIcebreakerLenin() {
        println("Возможность погрузки: $loading")
        println("${name}: Способ погрузки - Открытие ворот со стороны кормы.")
    }
}

fun main() {
    val liner = MainLinerFirst("Serenity", 400, 1200)
    liner.runSystemDiagnostic()
    liner.readyToGo()
    println("Скорость: ${liner.speed}")
    println("Вместительность: ${liner.capacity}")
    liner.loadMainLinerFirst()
    println()

    val cargoShip = CargoShipBear("Cargo111", 200, 100_000)
    cargoShip.runSystemDiagnostic()
    cargoShip.readyToGo()
    println("Скорость: ${cargoShip.speed}")
    println("Грузоподъемность: ${cargoShip.loadCapacity}")
    cargoShip.checkShipWorkload()
    cargoShip.loadCargoShipBear()
    println()

    val icebreaker = IcebreakerLenin("Ermak", 200)
    icebreaker.runSystemDiagnostic()
    icebreaker.checkBreaksIceSystem()
    icebreaker.readyToGo()
    println("Скорость: ${icebreaker.speed}")
    println("Колет лед: ${icebreaker.breaksIce}")
    icebreaker.loadIcebreakerLenin()
}
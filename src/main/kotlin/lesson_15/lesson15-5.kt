package org.example.lesson_15

const val HUMAN_CAPACITY_PASSENGERS = 3
const val HUMAN_CAPACITY_TRUCKS = 1
const val CARGO_WEIGHT = 2000

abstract class Cars {
    abstract val name: String
    abstract val humanCapacity: Int
}

interface Movable {
    fun carsMovement() {
        println("Автомобиль готов к отправке")
    }
}

interface ToTransportCargo {
    val name: String
    val cargoWeight: Int
    fun cargoMovement(cargoWeight: Int) {
        if (cargoWeight > CARGO_WEIGHT) {
            println("Грузовой автомобиль  вмещает только $CARGO_WEIGHT кг")
        } else {
            println("В автомобиле ${this.name}  ${this.cargoWeight} кг")
        }
    }
}

interface ToTransportPassengers {
    val name: String
    val humanCapacity: Int
    fun passengersMovement(humanCapacity: Int) {
        if (humanCapacity > HUMAN_CAPACITY_TRUCKS) {
            println("Грузовой автомобиль  вмещает только $HUMAN_CAPACITY_TRUCKS человек")
        } else {
            println("В автомобиле ${this.name} человек: ${this.humanCapacity}")
        }
    }
}


class Trucks(
    override val name: String,
    override val humanCapacity: Int,
    override val cargoWeight: Int,
) :
    Cars(), ToTransportPassengers, ToTransportCargo, Movable {
    override fun carsMovement() {
        println("Автомобиль $name готов к отправке")
    }
}

class PassengerCars(
    override val name: String,
    override val humanCapacity: Int,
) : Cars(), ToTransportPassengers, Movable {
    override fun carsMovement() {
        println("Автомобиль $name готов к отправке")
    }

    override fun passengersMovement(humanCapacity: Int) {
        if (humanCapacity > HUMAN_CAPACITY_PASSENGERS) {
            println("Легковой автомобиль  вмещает только $HUMAN_CAPACITY_PASSENGERS человек")
        } else {
            println("В автомобиле ${this.name} человек: ${this.humanCapacity}")
        }
    }
}

fun main() {
    val car1 = PassengerCars("Опель", 2)
    val truck1 = Trucks("Камаз", 1, 2000)
    val car2 = PassengerCars("Форд", 1)
    val truck2 = Trucks("Газель", 1, 2000)
    val truck3 = Trucks("Лада", 1, 2000)
    car1.carsMovement()
    car1.passengersMovement(2)
    car2.carsMovement()
    car2.passengersMovement(1)
    truck1.carsMovement()
    truck1.cargoMovement(2000)
    truck1.passengersMovement(1)
    truck2.carsMovement()
    truck2.cargoMovement(2000)
    truck2.passengersMovement(1)
    truck3.carsMovement()
    truck3.cargoMovement(2000)
    truck3.passengersMovement(1)
}
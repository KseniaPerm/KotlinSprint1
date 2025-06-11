package org.example.lesson_19

fun main() {
    val tank = Tank()
    tank.getArming(Cartridges.BLUE)
    tank.shoot()
    tank.getArming(Cartridges.GREEN)
    tank.shoot()
    tank.getArming(Cartridges.RED)
    tank.shoot()
}

enum class Cartridges(val impactForce: Int) {
    BLUE(5),
    GREEN(10),
    RED(20);

    fun getCartridgesName() = when (this) {
        BLUE -> "Синий"
        GREEN -> "Зеленый"
        RED -> "Красный"
    }
}

class Tank {
    private var currentWeapons: Cartridges? = null
    fun getArming(cartridge: Cartridges) {
        currentWeapons = cartridge
        println("Танк заряжен патроном: ${cartridge.getCartridgesName()}")
    }

    fun shoot() {
        if (currentWeapons == null) {
            println("Танк не заряжен")
        } else {
            println("Нанесенный урон: ${currentWeapons!!.impactForce}")
        }
    }
}
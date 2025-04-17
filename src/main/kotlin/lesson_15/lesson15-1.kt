package org.example.lesson_15

interface MovableFlyingCreatures {
    fun flyingMovement() {
        println("Метод передвижения - полет")
    }

    fun methodOfFlying()
}

interface MovableSwimmingCreatures {
    fun swimmingMovement() {
        println("Метод передвижения - плавание")
    }

    fun methodOfSwimming()
}

abstract class Creatures : MovableFlyingCreatures, MovableSwimmingCreatures {
    abstract val name: String
    abstract fun methodOfMovement()
}

class Swimmers(override val name: String) : Creatures() {
    override fun methodOfMovement() {
        println("Существо $name - плавает")
    }

    override fun methodOfFlying() {
        println("$name летать не может")
        println()
    }

    override fun methodOfSwimming() {
        println("Приготовить плавники и плыть")
    }
}

class Flyers(override val name: String) : Creatures() {
    override fun methodOfMovement() {
        println("Существо $name - летает")
    }

    override fun methodOfFlying() {
        println("Распахнуть крылья и взлететь")
    }

    override fun methodOfSwimming() {
        println("$name плавает на поверхности")
        println()
    }
}

fun main() {
    val swimmer = Swimmers("Карась")
    swimmer.methodOfMovement()
    swimmer.swimmingMovement()
    swimmer.methodOfSwimming()
    swimmer.methodOfFlying()
    val flyerSeagull = Flyers("Чайка")
    flyerSeagull.methodOfMovement()
    flyerSeagull.methodOfFlying()
    flyerSeagull.flyingMovement()
    flyerSeagull.methodOfSwimming()
    val flyerDuck = Flyers("Утка")
    flyerDuck.methodOfMovement()
    flyerDuck.methodOfFlying()
    flyerDuck.flyingMovement()
    flyerDuck.methodOfSwimming()
}
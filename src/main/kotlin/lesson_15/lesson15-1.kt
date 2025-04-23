package org.example.lesson_15

interface Flyable {
    fun flyMovement() {
        println("Метод передвижения - полет")
    }
}

interface SuitableForSwimming {
    fun swimmingMovement()
}

class CrucianCarp(val name: String) : SuitableForSwimming {
    override fun swimmingMovement() {
        println("$name- метод передвижения - плавание")
    }
}


class Seagull(val name: String) : Flyable, SuitableForSwimming {
    override fun flyMovement() {
        println("$name- метод передвижения - полет.")
    }

    override fun swimmingMovement() {
        println("$name Может плавать по поверхности воды")
    }
}

class Duck(val name: String) : Flyable, SuitableForSwimming {
    override fun flyMovement() {
        println("$name- метод передвижения - полет.")
    }

    override fun swimmingMovement() {
        println("$name Может плавать по поверхности воды")
    }
}

fun main() {
    val crucianCarp = CrucianCarp("Карп")
    crucianCarp.swimmingMovement()

    val seagull = Seagull("Чайка")
    seagull.flyMovement()
    seagull.swimmingMovement()

    val duck = Duck("Утка")
    duck.flyMovement()
    duck.swimmingMovement()
}
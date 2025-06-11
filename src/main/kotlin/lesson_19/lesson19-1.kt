package org.example.lesson_19

fun main() {
    val namesOfFish = listOf(Fish.GUPPY, Fish.ANGELFISH, Fish.GOLDFISH, Fish.SIAMESE_FIGHTING_FISH)
    println("В аквариум можно добавить следующих рыб: ")
    for (i in namesOfFish) {
        println(i.nameFish)
    }
    Thread.sleep(1000)
}

enum class Fish(var nameFish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Сколярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
}
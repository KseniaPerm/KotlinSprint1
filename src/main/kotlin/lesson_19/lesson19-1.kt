package org.example.lesson_19

fun main() {
    val namesOfFish = listOf(101, 102, 103, 104)
    println("В аквариум можно добавить следующих рыб: ")
    for (i in namesOfFish) {
        when (i) {
            Fish.GUPPY.id -> setName(Fish.GUPPY)
            Fish.ANGELFISH.id -> setName(Fish.ANGELFISH)
            Fish.GOLDFISH.id -> setName(Fish.GOLDFISH)
            Fish.SIAMESE_FIGHTING_FISH.id -> setName(Fish.SIAMESE_FIGHTING_FISH)
        }
        Thread.sleep(100)
    }
}

enum class Fish(val id: Int) {
    GUPPY(101) {
        override fun getNaneDescription(): String {
            return "Гуппи"
        }
    },
    ANGELFISH(102) {
        override fun getNaneDescription(): String {
            return "Скалярия"
        }
    },
    GOLDFISH(103) {
        override fun getNaneDescription(): String {
            return "Золотая рыбка"
        }
    },
    SIAMESE_FIGHTING_FISH(104) {
        override fun getNaneDescription(): String {
            return "Петушок"
        }
    };

    abstract fun getNaneDescription(): String
}

fun setName(name: Fish) {
    when (name) {
        Fish.GUPPY -> println("Гуппи")
        Fish.ANGELFISH -> println("Скалярия")
        Fish.GOLDFISH -> println("Золотая рыбка")
        Fish.SIAMESE_FIGHTING_FISH -> println("Петушок")
    }
}
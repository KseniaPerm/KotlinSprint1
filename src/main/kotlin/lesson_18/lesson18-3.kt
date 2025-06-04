package org.example.lesson_18

open class Animals {
    open fun getFoodIntake() = ""
}

class Cat(val name: String) : Animals() {
    override fun getFoodIntake(): String {
        return "$name -> ест рыбу"
    }
}

class Dog(val name: String) : Animals() {
    override fun getFoodIntake(): String {
        return "$name -> ест кости"
    }
}

class Fox(val name: String) : Animals() {
    override fun getFoodIntake(): String {
        return "$name -> ест ягоды"
    }
}

fun main() {
    val cat = Cat("Муська")

    val dog = Dog("Стрелка")

    val fox = Fox("Алиса")

    println(cat.getFoodIntake())
    println(dog.getFoodIntake())
    println(fox.getFoodIntake())

    val list: List<Animals> = listOf(cat, dog, fox)
    for (i in list) {
        println(i.getFoodIntake())
    }
}
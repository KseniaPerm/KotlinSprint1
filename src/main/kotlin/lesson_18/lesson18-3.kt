package org.example.lesson_18

abstract class Animals {
    abstract fun getFoodIntake(): String
    open fun sleep() = "Может спать"
}

class Cat(val name: String) : Animals() {
    override fun getFoodIntake(): String = "$name -> ест рыбу"
}

class Dog(val name: String) : Animals() {
    override fun getFoodIntake(): String = "$name -> ест кости"
}


class Fox(val name: String) : Animals() {
    override fun getFoodIntake(): String = "$name -> ест ягоды"
}

fun main() {
    val cat = Cat("Муська")

    val dog = Dog("Стрелка")

    val fox = Fox("Алиса")

    println(cat.getFoodIntake())
    println(cat.sleep())
    println(dog.getFoodIntake())
    println(dog.sleep())
    println(fox.getFoodIntake())
    println(fox.sleep())

    val list: List<Animals> = listOf(cat, dog, fox)
    for (i in list) {
        println(i.getFoodIntake())
    }
}
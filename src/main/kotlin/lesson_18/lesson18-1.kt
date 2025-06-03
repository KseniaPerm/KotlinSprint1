package org.example.lesson_18

class Orders(val orderNumber: Int) {
    fun printInfo(

        nameOfItem: String,
    ) {
        println("Заказан товар: $nameOfItem")
    }

    fun printInfo(
        nameOfItem: List<String>,
    ) {
        println("Заказаны товары: ${nameOfItem.joinToString()}")
    }
}

fun main() {
    val order = Orders(1)
    order.printInfo(
        "Рюкзак походный"
    )
    order.printInfo(listOf("Рюкзак походный", "Газовый баллон", "Палатка"))
    val order2 = Orders(2)
    order2.printInfo("Котелок")
    order2.printInfo(listOf("Котелок", "Кастрюля", "Чайник"))
}
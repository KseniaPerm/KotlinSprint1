package org.example.lesson_19

fun main() {
    val categories = listOf(Category.CLOTHING, Category.STATIONERY, Category.MISC)
    println("Категории товаров в онлайн магазине: ")
    for (i in categories) {
        println(i.getCategoryName())
    }
    Thread.sleep(1000)

    val jeans = OnlineStore("Джинсы", 1, Category.CLOTHING)
    jeans.getProductInformation()

    val pencil = OnlineStore("Карандаш", 2, Category.STATIONERY)
    pencil.getProductInformation()
}

enum class Category(val nameCategory: String) {
    CLOTHING("Одежда"),
    STATIONERY("Канцелярские принадлежности"),
    MISC("Разное");

    open fun getCategoryName() = when (this) {
        CLOTHING -> "Одежда"
        STATIONERY -> "Канцелярские товары"
        MISC -> "Разное"
    }
}

class OnlineStore(val name: String, private val id: Int, private val category: Category) {
    fun getProductInformation() {
        println("Название товара: $name, ID товара: $id , Категория: ${category.getCategoryName()}")
    }
}
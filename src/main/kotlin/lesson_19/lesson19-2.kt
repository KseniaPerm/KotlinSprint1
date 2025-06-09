package org.example.lesson_19

fun main() {
    val categories = listOf(101, 102, 103)
    println("Категории товаров в онлайн магазине: ")
    for (i in categories) {
        when (i) {
            Category.CLOTHES.id -> setCategory(Category.CLOTHES)
            Category.OFFICE_SUPPLIES.id -> setCategory(Category.OFFICE_SUPPLIES)
            Category.DIFFERENT.id -> setCategory(Category.DIFFERENT)
        }
        Thread.sleep(1000)
    }
    val jeans = OnlineStore("Джинсы", 1,"Одежда")
    jeans.getProductInformation()

    val pencil = OnlineStore("Карандаш", 2, "Канцелярские принадлежности")
    pencil.getProductInformation()
}

enum class Category(val id: Int) {
    CLOTHES(101) {
        override fun getCategoryName(): String {
            return "Одежда"
        }
    },
    OFFICE_SUPPLIES(102) {
        override fun getCategoryName(): String {
            return "Канцелярские принадлежности"
        }
    },
    DIFFERENT(103) {
        override fun getCategoryName(): String {
            return "Разное"
        }
    };

    abstract fun getCategoryName(): String
}

fun setCategory(category: Category) {
    when (category) {
        Category.CLOTHES -> println("Одежда")
        Category.OFFICE_SUPPLIES -> println("Канцелярские товары")
        Category.DIFFERENT -> println("Разное")
    }
}

class OnlineStore(val name: String, val id: Int, val category: String) {
    fun getProductInformation() {
        println("Название товара: $name, ID товара: $id , Категория: $category")
    }
}
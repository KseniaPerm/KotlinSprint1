package org.example.lesson_15

abstract class Store {
    abstract val name: String
    abstract val quantity: Int
    abstract fun searchAccessories(input: String)
}

interface Search {
    fun searchThings()
}

class Tools(
    override val name: String,
    override val quantity: Int,
    val listOfAccessories: MutableList<Accessories> = mutableListOf(),
) : Store(), Search {
    override fun searchAccessories(input: String) {
        println("Выполняется поиск: $input")
    }

    override fun searchThings() {
        if (listOfAccessories.isEmpty()) {
            println("Сопутствующих товаров нет")
        } else {
            val listOfAccessoriesNames = listOfAccessories.joinToString { it.name }
            for (i in listOfAccessories) {
                println("Сопутствующие товары:  $name: $listOfAccessoriesNames, количество ${i.quantity}")
            }
        }
    }
}

class Accessories(override val name: String, override val quantity: Int) : Store() {
    override fun searchAccessories(input: String) {
        println("Выполняется поиск аксессуаров: $input")
    }
}

fun main() {
    val accessories = Accessories("Струна", 3)
    val tool = Tools("Гитара", 4, mutableListOf(accessories))
    tool.searchAccessories("Гитара")
    tool.searchThings()
    accessories.searchAccessories("Струна")
}
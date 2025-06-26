package org.example.lesson_22

class SadBook(val name: String, private val author: String) {
    override fun toString(): String {
        return "(name = '$name', author = '$author')"
    }
}

data class FunBook(val name: String, val author: String)

fun main() {
    val sadBook = SadBook("Му-му", "Иван Тургенев")
    val funBook = FunBook("Робинзон Крузо", "Даниэль Дефо")
    println(sadBook)
    // при выводе объекта обычного класса, переопределили функцию toString(), поэтому вывод нас устраивает.
    // Иначе выводился бы стандартный вид — имя класса и хэш.
    println(funBook)
    // при выводе в консоль объекта дата класса, доп.манипуляций не нужно, просто печатаем через println() название объекта
}
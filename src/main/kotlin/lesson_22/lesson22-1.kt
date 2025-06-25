package org.example.lesson_22

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)

fun main() {
    val regularBook = RegularBook("Джейн Эйр", "Шарлотта Бронте")
    val regularBook1 = RegularBook("Джейн Эйр", "Шарлотта Бронте")
    val dataBook = DataBook("Джейн Эйр", "Шарлотта Бронте")
    val dataBook1 = DataBook("Джейн Эйр", "Шарлотта Бронте")
    println(regularBook.equals(dataBook))
    //при сравнении обычных классов будет false, т.к сравниваются ссылки на объекты памяти, а не значения
    println(regularBook == regularBook1)
    // при сравнении обычных классов будет false, т.к сравниваются ссылки на объекты памяти, а не значения
    println(dataBook == dataBook1)
    // дата класс сравнивает проиницилизированные данные, поэтому true
    println(regularBook.equals(dataBook1))
    //при сравнении обычных классов будет false, т.к сравниваются ссылки на объекты памяти, а не значения
}
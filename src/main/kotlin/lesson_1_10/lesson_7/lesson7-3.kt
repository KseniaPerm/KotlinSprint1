package org.example.lesson_1_10.lesson_7


fun main() {
    //первый вариант решения
    println("Введите число: ")
    val numberUser = readln().toInt()
    for (i in 0..numberUser step 2) {
        println(i)
        /*  //второй вариант решени
                println("Введите число: ")
                val numberUser = readln().toInt()
                for (i in 0..numberUser) {
                    if (i % 2 == 0) {
                        println(i)
                    }*/
    }
}
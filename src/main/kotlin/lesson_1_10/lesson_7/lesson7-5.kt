package org.example.lesson_1_10.lesson_7


fun main() {
    val range1 = ('1'..'9')
    val range2 = ('A'..'Z')
    val range3 = ('a'..'z')
    val password = mutableListOf<Char>()
    password.add(range1.random())
    password.add(range2.random())
    password.add(range3.random())
    println("Введите длину пароля: ")
    val length = readln().toInt()
    val allRanges = range1 + range2 + range3

    for (i in 3..<length) {
        password.add(allRanges.random())
    }
    password.shuffle()
    println(password.joinToString(""))
}
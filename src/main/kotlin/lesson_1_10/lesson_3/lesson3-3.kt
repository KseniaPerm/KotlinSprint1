package org.example.lesson_1_10.lesson_3

fun main() {
    val number = 5
    val multiplication ="""
        $number * 1 = $number
        $number * 2 = ${number * 2}
        $number * 3 = ${number * 3}
        $number * 4 = ${number * 4}
        $number * 5 = ${number * 5}
        $number * 6 = ${number * 6}
        $number * 7 = ${number * 7}
        $number * 8 = ${number * 8}
        $number * 9 = ${number * 9}      
        
    """.trimIndent()
    println(multiplication)
}
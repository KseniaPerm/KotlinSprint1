package org.example.lesson_5

fun main() {
    val number1 = 41
    val number2 = 15

    println("Введите два числа от 0 до 42 .Введите первое число : ")

    val userNumber1 = readln().toInt()

    println("Введите второе число : ")

    val userNumber2 = readln().toInt()
    val correctNumber1 = (userNumber1 == number1) || (userNumber1 == number2)
    val correctNumber2 = (userNumber2 == number1) || (userNumber2 == number2)
    if (correctNumber1 && correctNumber2) {
        println("Поздравляем, вы выиграли главный приз!")
    } else if (correctNumber1) {
        println("Вы выиграли утешительный приз!")
    } else if (correctNumber2) {
        println("вы выиграли утешительный приз")
    } else {
        println("Неудача!")
    }
    println()
    println("Нужные числа для победы были : $number1 и $number2")
}
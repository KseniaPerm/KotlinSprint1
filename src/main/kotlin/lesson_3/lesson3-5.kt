package org.example.lesson_3

fun main() {
    val playersMove = "D2-D4;0"

    val playersMoveList: List<String> = playersMove.split("-", ";")
    val moveFrom = playersMoveList[0]
    val moveTo = playersMoveList[1]
    val move = playersMoveList[2]

    println(moveFrom)
    println(moveTo)
    println(move)
}

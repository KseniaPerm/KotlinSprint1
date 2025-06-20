package org.example.lesson_21

class Player(val name: String, var currentHealth: Int, val maxHealth: Int = 100)

fun Player.isHealthy(): Boolean {
    val isHealthy = currentHealth == maxHealth
    return isHealthy
}

fun main() {
    val player = Player("Игрок улитка", 40)
    val player1 = Player("Дно", 100)
    println("Здоровье игрока ${player.name} равно максимальному: ${player.isHealthy()}")
    println("Здоровье игрока ${player1.name} равно максимальному: ${player1.isHealthy()}")
}
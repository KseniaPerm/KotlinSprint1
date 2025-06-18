package org.example.lesson_20

class Player(val name: String, val hasKey: Boolean)

fun main() {
    val player = Player("Медуза", true)
    val door = { player: Player ->
        if (player.hasKey)
            "${player.name} - открыл дверь"
        else
            "Дверь заперта"
    }
    val player1 = Player("Дно", false)
    println(door(player))
    println(door(player1))
}
package org.example.lesson_20

class Players(val name: String, val isHavingKey: Boolean)

fun main() {
    val player = Players("Медуза", true)
    val door: (Players) -> String
    door = { player: Players ->
        if (player.isHavingKey)
            "${player.name} - открыл дверь"
        else
            "Дверь заперта"
    }
    println(door(player))
}
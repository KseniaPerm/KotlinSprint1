package org.example.lesson_20

class Player(val name: String, var currentHealth: Int, val maxHealth: Int = 100)

fun main() {
    val player1 = Player("Игрок Улитка", 60)
    val healingPotion: (Player) -> Unit
    healingPotion = { player: Player ->
        println(
            "${player.name} - Здоровье игрока c ${player.currentHealth}" +
                    " - восстановлено до ${player.maxHealth}"

        )
        player.currentHealth = player.maxHealth
    }
    healingPotion(player1)
}
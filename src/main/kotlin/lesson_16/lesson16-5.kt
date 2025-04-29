package org.example.lesson_16

class Player(
    val name: String,
    private var health: Int = 100,
    private var impactForce: Int,
) {
    private fun measureHealth(newHealth: Int) {
        health = newHealth
        if (health <= 0) {
            println("Смерть")
            impactForce = 0
        }
    }

    fun takingDamage(impactForce: Int) {
        health -= impactForce
        println("Нанесен урон здоровью $name с силой урона $impactForce. Уровень здоровья $health")
        measureHealth(health)
    }

    fun treatHealth(impactForce: Int) {
        if (health > 0) {
            health += impactForce
            println("Лечение оказано $name. Уровень здоровья $health")
            measureHealth(health)
        } else {
            println("Лечение не оказано.Игрок $name мертв")
        }
    }
}

fun main() {
    val player1 = Player("Игрок1", 100, 20)
    player1.takingDamage(20)
    player1.treatHealth(20)
    player1.takingDamage(100)
    player1.treatHealth(20)
}
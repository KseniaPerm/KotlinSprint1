package org.example.lesson_16

class Orders(
    private val numberOfOrder: Int,
    private var statusOfOrder: String = "Принята",
) {
    private fun changeStatus(newStatus: String) {
        statusOfOrder = newStatus
    }

    fun sendMessage(newStatus: String) {
        println("Заявка на изменение статуса отправлена")
        changeStatus(newStatus)
    }

    fun getStatus() = statusOfOrder
}

fun main() {
    val order = Orders(23, "Принята")
    order.sendMessage("Готовится")
    println(order.getStatus())
    order.sendMessage("Доставляется")
    println(order.getStatus())
}
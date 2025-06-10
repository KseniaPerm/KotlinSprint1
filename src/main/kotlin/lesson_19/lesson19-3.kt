package org.example.lesson_19

fun main() {
    val actions = listOf(ShipActions.TAKE_OFF, ShipActions.LANDING, ShipActions.SHOOT_BACK, ShipActions.ERROR)
    for (i in actions) {
        setAction(i)
    }
}

enum class ShipActions(val actionName: String) {
    TAKE_OFF("взлетать"),
    LANDING("приземляться"),
    SHOOT_BACK("отстреливаться от астероида"),
    ERROR("Ошибка"),
}

fun setAction(action: ShipActions) {
    when (action) {
        ShipActions.TAKE_OFF -> println("взлетать")
           // TODO("нужна дополнительная логика()")
        ShipActions.LANDING -> println("приземляться")
        ShipActions.SHOOT_BACK -> println("отстреливаться от астероида")
        ShipActions.ERROR -> {throw NotImplementedError()}
    }
}
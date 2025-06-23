package org.example.lesson_21

fun Map<String, Int>.maxCategory(): Map.Entry<String, Int> {
    val map: Map<String, Int> = mapOf("Бег" to 10, "Стрельба" to 20, "Отжимания" to 30)
    val maxSkill = map.maxBy { it.value }
    return maxSkill

}

fun main() {
    val map: Map<String, Int> = mapOf("Бег" to 10, "Стрельба" to 20, "Отжимания" to 30)
    println(map.maxCategory())
}
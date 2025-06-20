package org.example.lesson_21

fun main() {
    val text = "Hello"
    val numberOfVowels = text.vowelCount()
    println("Количество гласных в строке: $numberOfVowels")
}

fun String.vowelCount(): Int {
    val vowels = "aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ"
    var count = 0
    for (char in this) {
        if (char in vowels) {
            count++
        }
    }
    return count
}
package org.example.lesson_21

import java.io.File

fun main() {
    val wordsFile: File = File("words.txt")
    wordsFile.createNewFile()
    wordsFile.writeText("HeLLo, My Friend")
    println(wordsFile.readText())
    wordsFile.write("HeLLo ")
    println(wordsFile.readText())
    wordsFile.write("NICE To meet you ")
    println(wordsFile.readText())
}

fun File.write(text: String) {
    val originalContent = this.readText()
    val newContent = text + originalContent
    return this.writeText(newContent.lowercase())
}
package org.example.lesson_17

class Folder(
    private val name: String,
    private val numberOfFiles: Int,
    private var isSecret: Boolean = true,
) {
    val name1 : String = name
        get() = if (!isSecret) field else "Скрытая папка"
    val numberOfFiles1: Int = 12
        get() = if (!isSecret) field else 0
}

fun main() {
    val folder = Folder("Школа 1",12, true)
    println("Папка: ${folder.name1}")
    println("Количество файлов: ${folder.numberOfFiles1}")
}
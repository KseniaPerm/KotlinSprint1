package org.example.lesson_17

class Folder(
    private var isSecret: Boolean = true,
) {
    private val name2 = "Скрытая строка"

    var name = "Школа 1"
        get() = if (isSecret) field else name2
    val numberOfFiles: Int = 12
        get() = if (isSecret) field else 0
}

fun main() {
    val folder = Folder(true)
    println("Папка: ${folder.name}")
    println("Количество файлов: ${folder.numberOfFiles}")
}
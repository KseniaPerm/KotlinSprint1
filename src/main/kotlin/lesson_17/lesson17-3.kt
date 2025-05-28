package org.example.lesson_17

class Folder(
    private var isSecret: Boolean,
) {
    val name: String
        get() = if (isSecret) {
            "Скрытая папака"
        } else {
            "Школа 1"
        }
    val numberOfFiles: Int
        get() = if (isSecret) {
            0
        } else {
            12
        }
}

fun main() {
    val folder = Folder(false)
    println("Папка: ${folder.name}")
    println("Количество файлов: ${folder.numberOfFiles}")
}
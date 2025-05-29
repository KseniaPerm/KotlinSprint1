package org.example.lesson_17

class Folder(
    private var isSecret: Boolean = true,
) {
    val name2 = "Скрытая строка"

    var name = "Школа 1"
        get() = if (isSecret) field else name2
        set(value) {
            field = value
            println("Папка: $name}")
        }
    val numberOfFiles: Int = 12
        get() = if (isSecret) field else 0
}

fun main() {
    val folder = Folder(false)
    println("Папка: ${folder.name}")
    println("Количество файлов: ${folder.numberOfFiles}")
}
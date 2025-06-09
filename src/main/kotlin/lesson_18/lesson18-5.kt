package org.example.lesson_18

open class Screen {
    open fun draw(x: Int, y: Int, figure: String): String {
        return println("Нарисована фигура $figure, в координатах $x и $y").toString()
    }
    open fun draw(x: Float, y: Float, figure: String): String {
        return println("Нарисована фигура $figure, в координатах $x и $y").toString()
    }
}

fun main() {
    val square = Screen()
    square.draw(5, 5, "Квадрат")
    square.draw(7.5F, 8.6f, "Квадрат")

    val circle = Screen()
    circle.draw(3,3,"Круг")
    circle.draw(3.3F, 4.2F,"Круг")

    val point = Screen()
    point.draw(1,1,"Точка")
    point.draw(0.5F, 0.6F,"Точка")
}
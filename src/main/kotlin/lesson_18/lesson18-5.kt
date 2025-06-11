package org.example.lesson_18

class Screen {
    fun draw(x: Int, y: Int): String {
        return "Нарисован квадрат, в координатах $x и $y"
    }

    fun draw(x: Float, y: Float): String {
        return "Нарисован квадрат, в координатах $x и $y"
    }

    fun drawCircle(x: Int, y: Int): String {
        return "Нарисован круг, в координатах $x и $y"
    }

    fun drawCircle(x: Float, y: Float): String {
        return "Нарисован круг, в координатах $x и $y"
    }

    fun drawPoint(x: Int, y: Int): String {
        return "Нарисована точка, в координатах $x и $y"
    }

    fun drawPoint(x: Float, y: Float): String {
        return "Нарисована точка, в координатах $x и $y"
    }
}

fun main() {
    val screen = Screen()
    println(screen.draw(3, 4))
    println(screen.draw(3.5F, 6.4F))
    println(screen.drawCircle(6, 8))
    println(screen.drawCircle(6.4F, 8.8F))
    println(screen.drawPoint(7, 3))
    println(screen.drawPoint(6.3F, 9.2F))
}
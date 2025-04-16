package org.example.lesson_14

abstract class Figure(
    open val name: String,
    open val color: String,
) {
    abstract fun calculateSquare(): Double

    abstract fun calculatePerimeter(): Double
}

class Circle(
    override val name: String,
    override val color: String,
    val circleRadius: Double,
) : Figure(name, color) {

    override fun calculateSquare(): Double {
        val square = PI * (circleRadius * circleRadius)
        return square

    }

    override fun calculatePerimeter(): Double {
        val circlePerimeter = CIRCLE_PERIMETER * circleRadius
        return circlePerimeter
    }
}

class Rectangle(
    override val name: String,
    override val color: String,
    val width: Double,
    val height: Double,
) : Figure(name, color) {
    override fun calculatePerimeter(): Double {
        val perimeter = (width + height) + (width + height)
        return perimeter
    }

    override fun calculateSquare(): Double {
        val squareRectangle = width * height
        return squareRectangle
    }
}

fun main() {
    val listOfFigures = mutableListOf<Figure>()
    val circle1 = Circle("круг1", "черный", 12.00)
    listOfFigures.add(circle1)
    circle1.calculateSquare()
    val circle2 = Circle("круг2", "белый", 13.00)
    listOfFigures.add(circle2)
    circle2.calculatePerimeter()

    val rectangle1 = Rectangle("прямоугольник1", "белый", 5.00, 4.00)
    listOfFigures.add(rectangle1)
    rectangle1.calculatePerimeter()
    val rectangle2 = Rectangle("прямоугольник2", "черный", 4.00, 8.00)
    listOfFigures.add(rectangle2)
    rectangle2.calculateSquare()
    var blackPerimeter = 0.00
    var whiteSquare = 0.00
    for (i in listOfFigures) {
        when (i.color) {
            "черный" -> {
                blackPerimeter += i.calculatePerimeter()
            }

            "белый" -> {
                whiteSquare += i.calculateSquare()
            }
        }
    }
    println("Сумма периметров черных фигур равна: $blackPerimeter")
    println("Сумма площадей всех белых фигур равна: $whiteSquare")
}

const val PI = 3.14
const val CIRCLE_PERIMETER = 2 * PI
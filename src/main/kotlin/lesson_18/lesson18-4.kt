package org.example.lesson_18

open class Parcel {
    open fun calculateSurfaceArea(): Double = 0.00
}

open class RectangularParcel(private val length: Double, private val width: Double, private val height: Double) :
    Parcel() {
    override fun calculateSurfaceArea(): Double {
        val square = 2.00 * (length * width + length * height + width * height)
        return square
    }
}
class ParcelCube(cubeFace: Double) : RectangularParcel(cubeFace, cubeFace, cubeFace)


fun main() {
    val rectangularParcel = RectangularParcel(26.00, 17.00, 8.00)
    println("Площадь поверхности посылки: ${rectangularParcel.calculateSurfaceArea()}")

    val parcelCube = ParcelCube(8.00)
    println("Площадь поверхности посылки: ${parcelCube.calculateSurfaceArea()}")
}
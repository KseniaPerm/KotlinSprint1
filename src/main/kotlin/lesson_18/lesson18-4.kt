package org.example.lesson_18

open class Parcel {
    open fun parcelSurfaceArea() = 0
}

class ParcelS(private val length: Int, private val width: Int, private val height: Int) : Parcel() {
    override fun parcelSurfaceArea(): Int {
        val square = 2 * (length * width + length * height + width * height)
        println("Площадь поверхности посылки:")
        return square
    }
}

class ParcelCube(private val cubeFace: Int) : Parcel() {
    override fun parcelSurfaceArea(): Int {
        val square = 6 * (cubeFace * cubeFace)
        println("Площадь поверхности посылки:")
        return square
    }
}

fun main() {
    val parcelS = ParcelS(26, 17, 8)
    println(parcelS.parcelSurfaceArea())

    val parcelCube = ParcelCube(8)
    println(parcelCube.parcelSurfaceArea())
}
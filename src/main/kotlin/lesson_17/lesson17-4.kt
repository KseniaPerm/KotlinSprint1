package org.example.lesson_17

class Parcel(private val parcelNumber: Int, currentLocation: String) {
    var movementCounter: Int = 0
        private set
    var currentLocation1: String = currentLocation
        set(value) {
            if (field != value) {
                movementCounter++
                field = value
            }
        }
}

fun main() {
    val parcel = Parcel(12345, "Екатеринбург")
    println(parcel.currentLocation1)
    println(parcel.movementCounter)
    parcel.currentLocation1 = "Пермь"
    println(parcel.currentLocation1)
    println(parcel.movementCounter)
    parcel.currentLocation1 = "Москва"
    println(parcel.currentLocation1)
    println(parcel.movementCounter)
    parcel.currentLocation1 = "Москва"
    println(parcel.currentLocation1)
    println(parcel.movementCounter)
}
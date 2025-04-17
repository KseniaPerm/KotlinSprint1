package org.example.lesson_14

open class CelestialBodies(
    val name: String,
    val atmosphere: Boolean = true,
    val landing: Boolean = true,
) {
    fun identification() {
        println("Обнаружено небесное тело")
    }
}

class Planets(
    name: String,
    atmosphere: Boolean = true,
    landing: Boolean = true,
    val isHavingSatellite: Boolean = true,
    val listOfSatellites: MutableList<Satellites> = mutableListOf()

) : CelestialBodies(name, atmosphere, landing) {
    fun printInfo() {
        println(
            "Название планеты: $name\nНаличие спутника: $isHavingSatellite\nНаличие атмосферы: $atmosphere\n" +
                    "Возможность высадки: $landing"
        )
        if (listOfSatellites.isEmpty()) {
            println("Спутников нет")
        } else {
            val satellitesNames = listOfSatellites.joinToString { it.name }
            println("Спутники планеты $name: $satellitesNames")

        }
    }
}

class Satellites(
    name: String,
    atmosphere: Boolean = true,
    landing: Boolean = true,
    ) : CelestialBodies(name, atmosphere, landing) {
    fun printInfo() {
        println("Название спутника: $name\nНаличие атмосферы: $atmosphere\nВозможность высадки: $landing")
    }
}

fun main() {

    val oberone = Satellites("Оберон", false, false)
    val titania = Satellites("Титания", false, false)
    val uranus = Planets("Уран", false, false, true, mutableListOf(oberone, titania))
    uranus.identification()
    uranus.printInfo()
    oberone.printInfo()
    titania.printInfo()
}
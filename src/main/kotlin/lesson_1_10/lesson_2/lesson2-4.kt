package org.example.lesson_1_10.lesson_2

fun main() {
   val crystalOre = 7.00
   val ironOre = 11.00
   val buff = 20.00
   val buffCrystal = ((crystalOre / TOTAL_PERCENT) * buff)
   val buffIronOre = ((ironOre / TOTAL_PERCENT) * buff)
   println(buffCrystal.toInt())
   println(buffIronOre.toInt())
}
const val TOTAL_PERCENT = 100
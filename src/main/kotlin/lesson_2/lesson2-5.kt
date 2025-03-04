package org.example.lesson_2

import kotlin.math.pow

fun main() {
   val depositAmount = 70_000
   val percent = 0.167
   val period = 20
   val compoundInterest = depositAmount * ((COMPOUND_INTEREST + percent).pow(period))
   println(String.format("%.3f",compoundInterest))
}
const val COMPOUND_INTEREST = 1

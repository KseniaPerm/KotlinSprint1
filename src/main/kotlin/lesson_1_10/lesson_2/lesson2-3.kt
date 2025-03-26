package org.example.lesson_1_10.lesson_2

fun main() {
   val timeToMove = 457
   val timeDepartureHour = 9
   val timeDepartureMinute = 39
   val hourInTrip = (timeToMove / MINUTES_IN_HOUR)
   val minuteInTrip = timeToMove % MINUTES_IN_HOUR
   val arrivalTimeHour = timeDepartureHour + hourInTrip + ((timeDepartureMinute + minuteInTrip) / MINUTES_IN_HOUR)
   val arrivalTimeMinute = (timeDepartureMinute + minuteInTrip) % MINUTES_IN_HOUR
   println("$arrivalTimeHour:$arrivalTimeMinute")
}
const val MINUTES_IN_HOUR = 60

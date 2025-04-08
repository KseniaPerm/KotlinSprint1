package org.example.lesson_13

class PhoneBook(
    val name: String? = null,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {
    val listOfNumbers = mutableListOf<PhoneBook>()
    listOfNumbers.add(PhoneBook("Pavel", 89222212122, "BuyAndSell"))
    listOfNumbers.add(PhoneBook("Ksu", 892222121123, null))
    listOfNumbers.add(PhoneBook("Kate", 892222121124, null))
    listOfNumbers.add(PhoneBook("Vasiliy", 89222212125, "CoffeeTeam"))
    listOfNumbers.add(PhoneBook("Olga", 89222212126, "null"))

    val listOfCompanies = listOfNumbers.mapNotNull { it.company }
    println(listOfCompanies)
}





package org.example.lesson_11

class Category(
    val id: Int,
    val name: String,
) {}

class Recipe(
    val id: Int,
    val name: String,
    val ingredients: String,
    val preparing: String,
    val portion: Int,
    val inFavourites: Boolean,
) {}

class Ingredient(
    val id: Int,
    val name: String,
    val ingredientQuantity: Int,
) {}

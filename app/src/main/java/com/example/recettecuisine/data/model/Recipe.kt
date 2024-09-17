package com.example.recettecuisine.data.model
import android.graphics.Bitmap

data class Recipe( //Recette
    val id: Int,
    val title: String,
    val description: String,
    val nbr_peoples: Int, //Number of peoples made for
    val photos: List<Bitmap>,
    val time: Int, //Time in minute
    val steps: List<Step>, //Step
    val ingredients: List<Ingredient>,
    val categories: List<Category>, //Vegetable, meat, drink, ...
    val tags: List<String>
)

package com.example.recettecuisine.data.model
import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipes")
data class Recipe( //Recette
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
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

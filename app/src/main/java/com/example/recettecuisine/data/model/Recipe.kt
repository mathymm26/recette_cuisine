package com.example.recettecuisine.data.model
import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipes")
data class Recipe( //Recette
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    var title: String = "",
    var description: String = "",
    var nbr_peoples: Int = 1, //Number of peoples made for
    var photos: List<ByteArray> = emptyList(),
    var time: Int = 1, //Time in minute
    var steps: List<Step> = emptyList(), //Step
    var ingredients: List<Ingredient> = emptyList(),
    var categories: List<Category> = emptyList(), //Vegetable, meat, drink, ...
    var tags: String = "",
    var season : Season = Season.WINTER
)

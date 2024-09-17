package com.example.recettecuisine.data.model
import android.graphics.Bitmap

data class Ingredient(
    val quantity: Float,
    val name: String,
    val unit: String,
    val photos: List<Bitmap>,
    val ingredient_state: List<String>, //Hache, decoupee, cuit, emince, ...
    val category : Category
)

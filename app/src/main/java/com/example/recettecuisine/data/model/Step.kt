package com.example.recettecuisine.data.model
import android.graphics.Bitmap

data class Step(
    val description: String,
    val photos: List<Bitmap>,
    val ingredients: List<Ingredient>,
    val time: Int, //In minute
    val step_done: Boolean
)

package com.example.recettecuisine.data.local.dao

import androidx.room.TypeConverter
import com.example.recettecuisine.data.model.Category
import com.example.recettecuisine.data.model.Ingredient
import com.example.recettecuisine.data.model.Season
import com.example.recettecuisine.data.model.Step
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converter {

    // Convertir List<byte[]> en une chaîne JSON pour la stocker dans la base de données
    @TypeConverter
    fun fromByteArrayList(photos: List<ByteArray>): String {
        return Gson().toJson(photos)
    }

    // Convertir une chaîne JSON en List<byte[]> pour la récupérer de la base de données
    @TypeConverter
    fun toByteArrayList(photosString: String): List<ByteArray> {
        val type = object : TypeToken<List<ByteArray>>() {}.type
        return Gson().fromJson(photosString, type)
    }

    @TypeConverter
    fun fromStepList(steps: List<Step>): String {
        return Gson().toJson(steps)
    }

    @TypeConverter
    fun toStepList(stepsString: String): List<Step> {
        val type = object : TypeToken<List<Step>>() {}.type
        return Gson().fromJson(stepsString, type)
    }

    @TypeConverter
    fun toIngredientList(ingredientsString: String): List<Ingredient> {
        val type = object : TypeToken<List<Ingredient>>() {}.type
        return Gson().fromJson(ingredientsString, type)
    }

    @TypeConverter
    fun fromIngredientList(ingredients: List<Ingredient>): String {
        return Gson().toJson(ingredients)
    }

    @TypeConverter
    fun fromCategoryList(categories: List<Category>): String {
        return Gson().toJson(categories)
    }

    @TypeConverter
    fun toCategoryList(categoriesString: String): List<Category> {
        val type = object : TypeToken<List<Category>>() {}.type
        return Gson().fromJson(categoriesString, type)
    }

    @TypeConverter
    fun fromSeason(season: Season): String {
        return season.name
    }

    @TypeConverter
    fun toSeason(season: String): Season {
        return Season.valueOf(season)
    }
}
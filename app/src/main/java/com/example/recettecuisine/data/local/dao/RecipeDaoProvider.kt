package com.example.recettecuisine.data.local.dao

import android.content.Context
import com.example.recettecuisine.data.local.database.AppDatabase

object RecipeDaoProvider {
    fun getDaoInstance(context: Context): RecipeDao {
        val database = AppDatabase.getDatabase(context)
        return database.recipeDao()
    }
}
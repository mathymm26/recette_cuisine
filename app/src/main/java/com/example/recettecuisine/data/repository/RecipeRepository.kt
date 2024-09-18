package com.example.recettecuisine.data.repository

import androidx.lifecycle.LiveData
import com.example.recettecuisine.data.local.dao.RecipeDao
import com.example.recettecuisine.data.model.Recipe

class RecipeRepository(private val recipeDao: RecipeDao)
{
    suspend fun get_recipes(): List<Recipe> { return recipeDao.getAllRecipes() }
    suspend fun add_recipe(recipe: Recipe) { recipeDao.insert(recipe) }
}
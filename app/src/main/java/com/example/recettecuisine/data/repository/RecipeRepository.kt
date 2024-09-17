package com.example.recettecuisine.data.repository

import androidx.lifecycle.LiveData
import com.example.recettecuisine.data.local.dao.RecipeDao
import com.example.recettecuisine.data.model.Recipe

class RecipeRepository(private val recipeDao: RecipeDao)
{
    fun get_recipes(): LiveData<List<Recipe>> = RecipeDao.getAllRecipes()
    fun add_recipe(recipe: Recipe) = RecipeDao.insert(recipe)
}
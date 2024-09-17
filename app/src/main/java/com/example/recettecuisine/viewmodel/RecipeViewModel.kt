package com.example.recettecuisine.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recettecuisine.data.local.dao.RecipeDao
import com.example.recettecuisine.data.model.Recipe
import com.example.recettecuisine.data.repository.RecipeRepository
import kotlinx.coroutines.launch

class RecipeViewModel(private val recipeDao: RecipeDao) : ViewModel() {

    fun addRecipe(recipe: Recipe) {
        viewModelScope.launch {
            recipeDao.insert(recipe)
        }
    }

    fun getAllRecipes() {
        viewModelScope.launch {
            val recipes = recipeDao.getAllRecipes()
            // Traitez la liste des recettes ici
        }
    }
}
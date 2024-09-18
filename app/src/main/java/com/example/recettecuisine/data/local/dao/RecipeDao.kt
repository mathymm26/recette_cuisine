package com.example.recettecuisine.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.lifecycle.LiveData
import com.example.recettecuisine.data.model.Recipe

@Dao
interface RecipeDao {

    @Insert
    suspend fun insert(recipe: Recipe)

    @Update
    suspend fun update(recipe: Recipe)

    @Query("DELETE FROM recipes WHERE id = :id")
    suspend fun deleteById(id: Int): Int

    @Query("SELECT * FROM recipes")
    suspend fun getAllRecipes(): List<Recipe>

    @Query("SELECT * FROM recipes WHERE id = :id")
    suspend fun getRecipeById(id: Int): Recipe?

}

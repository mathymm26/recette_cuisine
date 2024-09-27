package com.example.recettecuisine.ui.recette

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.recettecuisine.R
import com.example.recettecuisine.data.model.Recipe
import com.example.recettecuisine.databinding.ActivityRecipeBinding
import com.example.recettecuisine.viewmodel.RecipeViewModel

class RecipeActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityRecipeBinding
    private val recipeViewModel: RecipeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRecipeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setSupportActionBar(binding.toolbar)

        //val navController = findNavController(R.id.nav_host_fragment_content_activity_recipe)
        val button_create_recipe = findViewById<Button>(R.id.button_create)
        val textfield_description = findViewById<EditText>(R.id.textfield_description)
        val textfield_name = findViewById<EditText>(R.id.textfield_recipe)
        //appBarConfiguration = AppBarConfiguration(navController.graph)
        //setupActionBarWithNavController(navController, appBarConfiguration)
        /*
        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .setAnchorView(R.id.fab).show()
        }*/

        button_create_recipe.setOnClickListener{
            //Adding new recipe
            val recipe = Recipe(
                title = textfield_name.toString(), description = textfield_description.toString()
            )
            recipeViewModel.addRecipe(recipe)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_activity_recipe)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}
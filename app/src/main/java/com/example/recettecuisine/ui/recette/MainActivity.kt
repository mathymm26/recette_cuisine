package com.example.recettecuisine.ui.recette

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.viewModels
import androidx.navigation.ui.AppBarConfiguration
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.recettecuisine.R
import com.example.recettecuisine.data.local.dao.RecipeDaoProvider
import com.example.recettecuisine.databinding.ActivityMainBinding
import com.example.recettecuisine.viewmodel.RecipeViewModel
import com.example.recettecuisine.viewmodel.RecipeViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private val recipeViewModel: RecipeViewModel by viewModels {
        RecipeViewModelFactory(RecipeDaoProvider.getDaoInstance(this))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val button_recipe = findViewById<Button>(R.id.button_recipe)
        val button_ingredient = findViewById<Button>(R.id.button_ingredient)
        //val button_recipe = findViewById<Button>(R.id.button_recipe)
        //val button_recipe = findViewById<Button>(R.id.button_recipe)

        button_recipe.setOnClickListener{
            val intent = Intent(this, RecipeActivity::class.java)
            startActivity(intent)
        }

        val layout = findViewById<LinearLayout>(R.id.layoud_recipes)
        lifecycleScope.launchWhenStarted {/*
            recipeViewModel.recipes.collect { recipes ->
                // Effacer les anciens boutons pour mettre à jour la liste
                layout.removeAllViews()

                // Créer un bouton personnalisé pour chaque recette dans la liste
                for (recipe in recipes) {
                    val customButton = CustomButton(this@MainActivity).apply {
                        // Configurer le bouton avec les données de la recette
                        setupButton(recipe.title, recipe.description)

                        // Définir une action sur le clic
                        setOnClickListener {
                            // Action personnalisée pour chaque bouton
                            Toast.makeText(this@MainActivity, "Clicked: ${recipe.title}", Toast.LENGTH_SHORT).show()
                        }
                    }

                    // Ajouter chaque bouton au LinearLayout
                    linearLayout.addView(customButton)*/
        }
    }
}

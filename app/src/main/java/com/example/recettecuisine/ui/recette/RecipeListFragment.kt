package com.example.recettecuisine.ui.recette

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.recettecuisine.databinding.FragmentRecipeListBinding
import com.example.recettecuisine.viewmodel.RecipeViewModel

class RecipeListFragment : Fragment() {

    private lateinit var viewModel: RecipeViewModel
    private var _binding: FragmentRecipeListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRecipeListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       // val addButton: Button = view.findViewById(R.id.add_recipe_button)
        //val recipeTitleEditText: EditText = view.findViewById(R.id.recipe_title)
        /*
        addButton.setOnClickListener {
            val title = recipeTitleEditText.text.toString()
            if (title.isNotEmpty()) {
                val newRecipe = Recipe(title = title, ingredients = "Example ingredients")
                recipeViewModel.addRecipe(newRecipe) // Appeler la méthode d'ajout de recette
            }
        }*/
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
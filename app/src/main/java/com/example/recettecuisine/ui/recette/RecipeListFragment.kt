package com.example.recettecuisine.ui.recette

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.recettecuisine.R
import com.example.recettecuisine.databinding.FragmentRecipeListBinding

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

        val addButton: Button = view.findViewById(R.id.create_recipe_button)
        val recipeTitleEditText: EditText = view.findViewById(R.id.recipeTitle)

        addButton.setOnClickListener {
            val title = recipeTitleEditText.text.toString()
            if (title.isNotEmpty()) {
                //val newRecipe = Recipe(title = title)
                //viewModel.addRecipe(newRecipe)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
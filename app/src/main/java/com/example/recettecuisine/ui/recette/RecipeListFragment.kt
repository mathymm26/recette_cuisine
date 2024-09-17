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
        viewModel = ViewModelProvider(this).get(RecipeViewModel::class.java)

        viewModel.recipes.observe(viewLifecycleOwner, { recipes ->

        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
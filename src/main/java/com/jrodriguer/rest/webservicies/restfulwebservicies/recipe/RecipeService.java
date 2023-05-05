package com.jrodriguer.rest.webservicies.restfulwebservicies.recipe;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RecipeService {
	
	private final RecipeRepository recipeRepository;
	
	public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
	
	public List<Recipe> getAllRecipes() {
		return recipeRepository.findAll();
	}

	public Recipe getRecipeById(Long id) {
		return recipeRepository.findById(id).orElse(null);
	}

	public Recipe saveRecipe(Recipe recipe) {
		return recipeRepository.save(recipe);
	}

	public void deleteRecipeById(Long id) {
		recipeRepository.deleteById(id);
	}

}

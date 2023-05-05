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
		// TODO Auto-generated method stub
		return null;
	}

	public Recipe getRecipeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Recipe saveRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteRecipeById(Long id) {
		// TODO Auto-generated method stub
		
	}

}

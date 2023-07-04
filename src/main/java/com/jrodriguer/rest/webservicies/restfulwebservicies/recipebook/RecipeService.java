package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.beans.Recipe;

@Service
public class RecipeService {

	private final RecipeSpringDataJpaRepository recipeSpringDataJpaRepository;

	public RecipeService(RecipeSpringDataJpaRepository recipeSpringDataJpaRepository) {
		this.recipeSpringDataJpaRepository = recipeSpringDataJpaRepository;
	}

	public List<Recipe> getAllRecipes() {
		return recipeSpringDataJpaRepository.findAll();
	}

	public Recipe retriveRecipe(Long id) {
		return recipeSpringDataJpaRepository.findById(id).orElse(null);
	}

	public Recipe saveRecipe(Recipe recipe) {
		return recipeSpringDataJpaRepository.save(recipe);
	}

	public void deleteRecipe(Long id) {
		recipeSpringDataJpaRepository.deleteById(id);
	}

}

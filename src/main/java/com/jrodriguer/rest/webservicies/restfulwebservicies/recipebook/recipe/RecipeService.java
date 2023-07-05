package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.recipe;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.ingredient.Ingredient;
import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.ingredient.IngredientSpringDataJpaRepository;

@Service
public class RecipeService {

	private final RecipeSpringDataJpaRepository recipeSpringDataJpaRepository;

	private final IngredientSpringDataJpaRepository ingredientSpringDataJpaRepository;

	public RecipeService(RecipeSpringDataJpaRepository recipeSpringDataJpaRepository,
			IngredientSpringDataJpaRepository ingredientSpringDataJpaRepository) {
		this.recipeSpringDataJpaRepository = recipeSpringDataJpaRepository;
		this.ingredientSpringDataJpaRepository = ingredientSpringDataJpaRepository;
	}

	public List<Recipe> getAllRecipes() {
		return recipeSpringDataJpaRepository.findAll();
	}

	public Recipe retriveRecipe(Integer id) {
		return recipeSpringDataJpaRepository.findById(id).orElse(null);
	}

	public Recipe saveRecipe(Recipe recipe) {
		return recipeSpringDataJpaRepository.save(recipe);
	}

	public void deleteRecipe(Integer id) {
		recipeSpringDataJpaRepository.deleteById(id);
	}

	public List<Ingredient> retriveIngredientsForRecipe() {
		return ingredientSpringDataJpaRepository.findAll();
	}

}

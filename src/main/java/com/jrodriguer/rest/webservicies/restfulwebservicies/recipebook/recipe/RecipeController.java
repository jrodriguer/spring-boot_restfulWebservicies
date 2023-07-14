package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.recipe;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @GetMapping("/{id}")
    public Recipe retriveRecipe(@PathVariable Integer id) {
        Recipe recipe = recipeService.retriveRecipe(id);

        if (recipe == null) {
            throw new RecipeNotFoundException("id:" + id);
        }

        return recipe;
    
    }

    @PostMapping
    public Recipe saveRecipe(@RequestBody Recipe recipe) {
        return recipeService.saveRecipe(recipe);
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Integer id) {
        recipeService.deleteRecipe(id);
    }

    // @GetMapping("/{id}/ingredients")
    // public List<Ingredient> retrievePostsForUser(@PathVariable int id) {
    // Optional<Recipe> recipe = userRepository.findById(id);

    // if (recipe.isEmpty())
    // throw new RecipeNotFoundException("id:" + id);

    // return recipe.get().getIngredients();

    // }
}

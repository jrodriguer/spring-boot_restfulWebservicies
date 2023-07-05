package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.RecipeService;
import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.beans.Recipe;

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
        return recipeService.retriveRecipe(id);
    }

    @PostMapping
    public Recipe saveRecipe(@RequestBody Recipe recipe) {
        return recipeService.saveRecipe(recipe);
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Integer id) {
        recipeService.deleteRecipe(id);
    }
}

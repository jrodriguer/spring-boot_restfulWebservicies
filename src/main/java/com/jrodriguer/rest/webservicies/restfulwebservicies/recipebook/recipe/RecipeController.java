package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.recipe;

import java.util.List;
import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    private MessageSource messageSource;

    public RecipeController(RecipeService recipeService, MessageSource messageSource) {
        this.recipeService = recipeService;
        this.messageSource = messageSource;
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
    public Recipe saveRecipe(@Valid @RequestBody Recipe recipe) {
        return recipeService.saveRecipe(recipe);
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Integer id) {
        recipeService.deleteRecipe(id);
    }

    @GetMapping("recipe-internationalized")
    public String recipeInternationalized() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("test.internationalized.message", null, "Default Message", locale);
    }
}

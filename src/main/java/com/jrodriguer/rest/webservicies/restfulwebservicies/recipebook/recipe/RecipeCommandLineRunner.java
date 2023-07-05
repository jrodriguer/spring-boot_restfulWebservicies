package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.ingredient.Ingredient;
import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.ingredient.IngredientSpringDataJpaRepository;

@Component
public class RecipeCommandLineRunner implements CommandLineRunner {

  @Autowired
  private RecipeSpringDataJpaRepository repository;

  @Autowired
  private IngredientSpringDataJpaRepository ingredient;

  @Override
  public void run(String... args) throws Exception {
    repository.save(new Recipe(1, "tortilla", "tortilla de patatas"));
    repository.save(new Recipe(2, "gazpacho", "summer drink"));
    ingredient.save(new Ingredient(1, "patatoes", 2));
    ingredient.save(new Ingredient(1, "eggs", 3));
  }

}

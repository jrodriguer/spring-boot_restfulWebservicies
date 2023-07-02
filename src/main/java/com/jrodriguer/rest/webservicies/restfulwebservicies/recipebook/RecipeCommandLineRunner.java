package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.models.Ingredient;
import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.models.Recipe;

@Component
public class RecipeCommandLineRunner implements CommandLineRunner {

  @Autowired
  private RecipeSpringDataJpaRepository repository;

  @Override
  public void run(String... args) throws Exception {
    repository.save(new Recipe(1, "tortilla", "tortilla de patatas"));
    repository.save(new Recipe(2, "gazpacho", "summer drink"));
    repository.save(new Ingredient(1, "patata", 2));
  }

}

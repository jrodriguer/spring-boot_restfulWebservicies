package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.model.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}

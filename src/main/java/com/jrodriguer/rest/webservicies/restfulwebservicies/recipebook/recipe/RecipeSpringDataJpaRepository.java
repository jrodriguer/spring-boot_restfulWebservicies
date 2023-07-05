package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeSpringDataJpaRepository extends JpaRepository<Recipe, Integer> {
}

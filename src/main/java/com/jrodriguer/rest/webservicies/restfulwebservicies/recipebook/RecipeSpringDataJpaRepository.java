package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.models.Recipe;

@Repository
public interface RecipeSpringDataJpaRepository extends JpaRepository<Recipe, Long> {
}

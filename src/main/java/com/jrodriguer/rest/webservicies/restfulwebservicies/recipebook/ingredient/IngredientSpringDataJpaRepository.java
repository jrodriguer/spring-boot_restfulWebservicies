package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientSpringDataJpaRepository extends JpaRepository<Ingredient, Integer> {
}

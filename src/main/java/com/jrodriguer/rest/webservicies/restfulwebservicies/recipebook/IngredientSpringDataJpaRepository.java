package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.beans.Ingredient;

@Repository
public interface IngredientSpringDataJpaRepository extends JpaRepository<Ingredient, Integer> {
}
